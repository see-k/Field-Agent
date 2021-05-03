package learn.field_agent.domain;

import learn.field_agent.data.AliasRepository;
import learn.field_agent.models.Alias;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AliasService {
    private final AliasRepository repository;

    public AliasService(AliasRepository repository) {
        this.repository = repository;
    }
    
    public List<Alias> findById(int agentId) {
        return repository.findByAgentId(agentId);
    }

    private Result<Alias> validate(Alias alias){
        Result<Alias> result = new Result<>();

        if(Validations.isNullOrBlank(alias.getName())){
            result.addMessage("Name is required", ResultType.INVALID);
        }

        if(alias.getPersona() == null || alias.getPersona().equals("")) {
            List<Alias> aliases = findById(alias.getAgentId());
            for(Alias thisAlias : aliases){
                if(thisAlias.getName().equals(alias.getName()) ||
                        thisAlias.getPersona().equals(alias.getPersona())) {
                    result.addMessage("Persona must be assigned for all duplicate names", ResultType.INVALID);
                }
            }

        }
        return result;
    }


    public Result<Alias> add(Alias alias){
        Result<Alias> result = validate(alias);

        if(!result.isSuccess()){
            return result;
        }

        if(alias.getAliasId() != 0) {
            result.addMessage("aliasId could not be set for 'add' " +
                    "operation", ResultType.INVALID);
            return result;
        }

        alias = repository.add(alias);
        result.setPayload(alias);
        return result;
    }

    public Result<Alias> update(Alias alias){
        Result<Alias> result = validate(alias);

        if(!result.isSuccess()){
            return result;
        }

        if(alias.getAliasId() <= 0) {
            result.addMessage("aliasId must be set for 'update'" +
                    "operation", ResultType.INVALID);
        }

        if(!repository.update(alias)){
            String msg = String.format("aliasId %s" +
                    " not found", alias.getAliasId());
            result.addMessage(msg, ResultType.NOT_FOUND);
        }

        return result;
    }

    public boolean deleteById(int aliasId) {
        return repository.deleteById(aliasId);
    }


}
