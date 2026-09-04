package example.falsepositives.fixed;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableSampleAutoConfiguration
class ImportingConfiguration {
}

@Component
class ImportedAutoConfigurationCases {
  // For some reason works even with Spring
  ImportedAutoConfigurationCases(ImportedService service) { // -> This was a false positive before imported auto-configuration models were loaded.
  }
}
