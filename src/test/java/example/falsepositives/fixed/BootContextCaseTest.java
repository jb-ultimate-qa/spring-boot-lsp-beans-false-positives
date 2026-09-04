package example.falsepositives.fixed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootContextCaseTest {
  @Autowired
  BootContextCaseTest(
    SampleProperties properties, // -> This was a false positive before the Boot test context and configuration property models were loaded.
    ApplicationArguments arguments // -> This was a false positive before the Boot test context and implicit beans were loaded.
  ) {
  }

  @Test
  void contextLoads() {
  }
}
