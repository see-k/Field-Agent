package learn.field_agent.domain;
import learn.field_agent.data.SecurityClearanceJdbcTemplateRepository;
import learn.field_agent.data.SecurityClearanceRepository;
import learn.field_agent.models.SecurityClearance;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SecurityClearanceService {
    private final SecurityClearanceRepository repository;

    public SecurityClearanceService(SecurityClearanceRepository repository) {
        this.repository = repository;
    }

    public List<SecurityClearance> findAll(){ return repository.findAll(); }

    public SecurityClearance findById(int securityClearanceId) {
        return repository.findById(securityClearanceId);
    }

    private Result<SecurityClearance> validate(SecurityClearance securityClearance){
        Result<SecurityClearance> result = new Result<>();
        if(securityClearance == null){
            result.addMessage("security clearance cannot be empty", ResultType.INVALID);
            return result;
        }

        if(Validations.isNullOrBlank(securityClearance.getName())){
            result.addMessage("Name is required", ResultType.INVALID);
        }

        SecurityClearance securityClearances = findAll().stream()
                .filter(i->i.getName().equals(securityClearance.getName()))
                .findFirst()
                .orElse(null);

        if(securityClearances != null) {
            result.addMessage("Name already exists", ResultType.INVALID);
        }

        return result;
    }

    public Result<SecurityClearance> add(SecurityClearance securityClearance){
        Result<SecurityClearance> result = validate(securityClearance);

        if(!result.isSuccess()){
            return result;
        }

        if(securityClearance.getSecurityClearanceId() != 0) {
            result.addMessage("securityClearanceId could not be set for 'add' " +
                    "operation", ResultType.INVALID);
            return result;
        }

        securityClearance = repository.add(securityClearance);
        result.setPayload(securityClearance);
        return result;
    }

    public Result<SecurityClearance> update(SecurityClearance securityClearance){
        Result<SecurityClearance> result = validate(securityClearance);

        if(!result.isSuccess()){
            return result;
        }

        if(securityClearance.getSecurityClearanceId() <= 0) {
            result.addMessage("securityClearanceId must be set for 'update'" +
                    "operation", ResultType.INVALID);
        }

        if(!repository.update(securityClearance)){
            String msg = String.format("securityClearanceId %s" +
                    " not found", securityClearance.getSecurityClearanceId());
            result.addMessage(msg, ResultType.NOT_FOUND);
        }

        return result;
    }

    public boolean deleteById(int securityClearanceId) {
        return repository.deleteById(securityClearanceId);
    }

}
