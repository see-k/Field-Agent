package learn.field_agent.domain;

import learn.field_agent.data.SecurityClearanceRepository;
import learn.field_agent.models.SecurityClearance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)

class SecurityClearanceServiceTest {

    @Autowired
    SecurityClearanceService service;

    @MockBean
    SecurityClearanceRepository repository;

    SecurityClearance makeSecurityClearance(){
        SecurityClearance securityClearance = new SecurityClearance();
        securityClearance.setSecurityClearanceId(1);
        securityClearance.setName("Fela");
        return securityClearance;
    }


    @Test
    void findAll() {
    }

    @Test
    void shouldFindById() {
        SecurityClearance expected = makeSecurityClearance();
        when(repository.findById((1))).thenReturn(expected);
        SecurityClearance actual = service.findById(1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAdd() {
        SecurityClearance expected = new SecurityClearance();
        expected.setName("Service Test");
        Result<SecurityClearance> result = service.add(expected);
        assertEquals(ResultType.SUCCESS, result.getType());
    }


    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }
}
