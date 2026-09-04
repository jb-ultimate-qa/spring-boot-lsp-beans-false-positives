package example.falsepositives.fixed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RandomPortInfrastructureCaseTest {
  @Autowired
  TestRestTemplate restTemplate; // -> Here we still have a false positive for a Boot test infrastructure bean.

  @Test
  void contextLoads() {
  }
}
