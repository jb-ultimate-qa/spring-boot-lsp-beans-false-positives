package example.falsepositives.fixed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class MockBeanCaseTest {
  @MockBean
  ProfileMessage profileMessage;

  @Autowired
  MockBeanCaseTest(ProfileMessage profileMessage) { // -> This was a false positive before the Boot mock bean provider was loaded.
  }

  @Test
  void contextLoads() {
  }
}
