package example.falsepositives;

import example.falsepositives.fixed.SampleProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableConfigurationProperties(SampleProperties.class)
@SpringBootApplication
public class FalsePositivesApplication {
  final
  CacheManager cacheManager;

    public FalsePositivesApplication(CacheManager cacheManager) {// -> Here there was a false positive for the cache infrastructure bean.
        this.cacheManager = cacheManager;
    }

    public static void main(String[] args) {
    SpringApplication.run(FalsePositivesApplication.class, args);
  }
}
