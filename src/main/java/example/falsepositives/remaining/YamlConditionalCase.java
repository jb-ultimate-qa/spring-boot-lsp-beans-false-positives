package example.falsepositives.remaining;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

interface YamlEnabledService {
}

@Configuration
class YamlConditionalConfiguration {
  @Bean
  @ConditionalOnProperty(name = "sample.yaml.enabled", havingValue = "true")
  YamlEnabledService yamlEnabledService() {
    return new YamlEnabledService() {
    };
  }
}

@Component
class YamlConditionalCase {
  YamlConditionalCase(YamlEnabledService service) { // -> Here we still have a false positive because the LSP plugin does not load the YAML contributor.
  }
}
