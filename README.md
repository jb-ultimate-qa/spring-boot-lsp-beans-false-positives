# Project for testing beans false positives for Core SpringJavaInjectionPointsAutowiringInspection
# false positives should be fixed after adding sb to lsp

This project shows the model behavior after the language server loads the Spring Boot core descriptor.

The `fixed` package contains valid injection points that should have no Spring autowiring diagnostic.

The sample covers application discovery, auto-configuration, configuration properties, implicit beans, profiles, conditions, caching, Actuator, and Boot tests.

