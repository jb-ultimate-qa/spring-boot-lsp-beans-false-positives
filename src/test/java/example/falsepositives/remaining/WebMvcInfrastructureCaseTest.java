package example.falsepositives.remaining;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class WebMvcInfrastructureCaseTest {
  @Autowired
  MockMvc mockMvc; // -> Here we still have a false positive for a Boot test infrastructure bean.

  @Test
  void contextLoads() {
  }
}
