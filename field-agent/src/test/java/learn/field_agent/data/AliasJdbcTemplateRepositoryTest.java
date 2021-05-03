package learn.field_agent.data;
import learn.field_agent.models.Alias;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class AliasJdbcTemplateRepositoryTest {

    @Autowired
    AliasJdbcTemplateRepository repository;

    @Autowired
    KnownGoodState knownGoodState;

    @BeforeEach
    void setup() {
        knownGoodState.set();
    }

    @Test
    void shouldAdd() {
        Alias alias = makeAlias();
        Alias actual = repository.add(alias);
        assertNotNull(actual);
        assertEquals(1, actual.getAgentId());
    }

    private Alias makeAlias(){
        Alias alias = new Alias();
        alias.setName("James Bond");
        alias.setAgentId(1);
        return alias;
    }

    @Test
    void shouldFindByAgentId() {
        List<Alias> actual = repository.findByAgentId(1);
        assertEquals("James Bond", actual.get(0).getName());
    }
}