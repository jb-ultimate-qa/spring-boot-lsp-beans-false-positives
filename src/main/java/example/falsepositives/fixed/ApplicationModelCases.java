package example.falsepositives.fixed;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationModelCases {
  private final SampleProperties properties;
  private final ApplicationArguments arguments;
  private final ObjectMapper objectMapper;
  private final RestTemplateBuilder restTemplateBuilder;
  private final JdbcTemplate jdbcTemplate;
  private final CacheManager cacheManager;

  public ApplicationModelCases(
    SampleProperties properties, // -> This was a false positive before the Boot configuration property model was loaded.
    ApplicationArguments arguments, // -> This was a false positive before the Boot implicit bean provider was loaded.
    ObjectMapper objectMapper, // -> This was a false positive before Boot auto-configuration models were loaded.
    RestTemplateBuilder restTemplateBuilder, // -> This was a false positive before Boot auto-configuration models were loaded.
    JdbcTemplate jdbcTemplate, // -> This was a false positive before data source conditions and auto-configuration were loaded.
    CacheManager cacheManager // -> This was a false positive before the caching model was loaded.
  ) {
    this.properties = properties;
    this.arguments = arguments;
    this.objectMapper = objectMapper;
    this.restTemplateBuilder = restTemplateBuilder;
    this.jdbcTemplate = jdbcTemplate;
    this.cacheManager = cacheManager;
  }

  public String summary() {
    return properties.message() + arguments.getSourceArgs().length + objectMapper + restTemplateBuilder + jdbcTemplate + cacheManager;
  }
}
