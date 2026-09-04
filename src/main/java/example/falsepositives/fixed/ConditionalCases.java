package example.falsepositives.fixed;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

interface EnabledService {
}

@Configuration
class ConditionalConfiguration {
  @Bean
  @ConditionalOnProperty(name = "sample.feature.enabled", havingValue = "true")
  EnabledService enabledService() {
    return new EnabledService() {
    };
  }

    @Bean
  @ConditionalOnProperty(name = "sample.feature.enabled1", havingValue = "true")
  EnabledService enabledService1() {
    return new EnabledService() {
    };
  }
}

@Component
class ConditionalCases {
  ConditionalCases(EnabledService service) { // -> This was a false positive before Boot conditions read application.properties.
  }
}
