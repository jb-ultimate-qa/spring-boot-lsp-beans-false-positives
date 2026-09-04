package example.falsepositives.fixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

interface ProfileMessage {
  String text();
}

@Configuration
class ProfileConfiguration {
  @Bean("groupProfileMessage")
  @Profile("local-group")
  ProfileMessage groupProfileMessage() {
    return () -> "local";
  }
}

@Component
class ProfileCases {
  ProfileCases(
    @Qualifier("groupProfileMessage") ProfileMessage message // -> This was a false positive before Boot profile groups were loaded.
  ) {
  }
}
