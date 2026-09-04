package example.falsepositives.fixed;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sample")
public record SampleProperties(String message) {
}
