# Spring Boot false positive examples

This project shows the model behavior after the language server loads the Spring Boot core descriptor.

The `fixed` package contains valid injection points that should have no Spring autowiring diagnostic.

The `remaining` package contains valid injection points that the current language server can still report.

The sample covers application discovery, auto-configuration, configuration properties, implicit beans, profiles, conditions, caching, Actuator, and Boot tests.

Import the Maven project before you request diagnostics.
