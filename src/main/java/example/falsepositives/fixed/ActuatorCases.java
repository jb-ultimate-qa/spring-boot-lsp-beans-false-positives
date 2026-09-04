package example.falsepositives.fixed;

import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.stereotype.Component;

@Component
class ActuatorCases {
  ActuatorCases(HealthEndpoint healthEndpoint) { // -> This was a false positive before the Actuator management model was loaded.
  }
}
