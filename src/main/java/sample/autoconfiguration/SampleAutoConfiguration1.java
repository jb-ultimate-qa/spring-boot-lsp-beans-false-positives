package sample.autoconfiguration;

import example.falsepositives.fixed.ImportedService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleAutoConfiguration1 {
  @Bean
  ImportedService importedService() {
    return new ImportedService() {
    };
  }
}