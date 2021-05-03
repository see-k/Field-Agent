package learn.field_agent.controllers;
import com.mysql.cj.PreparedQuery;
import learn.field_agent.domain.AliasService;
import learn.field_agent.domain.Result;
import learn.field_agent.domain.ResultType;
import learn.field_agent.models.Alias;
import learn.field_agent.models.SecurityClearance;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/api/alias")
public class AliasController {
    private final AliasService service;

    public AliasController(AliasService service) {
        this.service = service;
    }

    @GetMapping("/{agentId}")
    public List<Alias> findById(@PathVariable int agentId) {
        return service.findById(agentId);
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody Alias alias){
        Result<Alias> result = service.add(alias);
        if(result.isSuccess()) {
            return new ResponseEntity<>(result.getPayload(),  HttpStatus.CREATED);
        }
        return ErrorResponse.build(result);
    }

    @PutMapping("/{aliasId}")
    public ResponseEntity<Void> update(@PathVariable int aliasId, @RequestBody Alias alias){

        if (aliasId != alias.getAliasId()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        try {
            Result<Alias> result = service.update(alias);
            /*
            if (result.isSuccess()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }*/

            if (result.getType() == ResultType.INVALID) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            } else if (result.getType() == ResultType.NOT_FOUND) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        //return ErrorResponse.build(result);
    }

    @DeleteMapping("/{aliasId}")
    public ResponseEntity<Void> deleteById(@PathVariable int aliasId) {
        if (service.deleteById(aliasId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
