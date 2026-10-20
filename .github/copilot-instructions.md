# Java Project Coding Instructions

Follow these rules in all Java code changes:

- Methods must have a single responsibility.
- Use meaningful and descriptive names for classes, methods, variables, and parameters.
- Do not leave unresolved TODO or FIXME comments in code.
- Do not keep commented-out code.
- Do not use hardcoded values for business rules, configuration, or magic numbers; use constants, enums, configuration properties, or helper methods instead.
- Remove unused imports, variables, fields, methods, and dead code.
- Follow standard Java coding conventions and project style consistently.
- Keep code clean, readable, and maintainable.
- Maintain proper separation of concerns:
  - Controller should handle HTTP concerns only.
  - Service should contain business logic.
  - Repository should handle persistence/data access.
- Do not put business logic inside controllers.
- Do not bypass repository or service layers.
- Avoid unnecessary coupling between components.
- Follow SOLID principles reasonably and keep design understandable and maintainable.
- Ensure changes align with the existing architecture and project patterns.
- Ensure the correct service owns the relevant functionality.
- Keep API and event contracts backward compatible unless a breaking change is explicitly approved.
- Use dependency injection and framework-supported patterns where appropriate.
- Keep classes focused and avoid unnecessary complexity.
- Use clear, consistent package structure and naming.
- Validate inputs and handle errors appropriately.
- Write or update tests when changing behavior.
- Prefer explicit, readable implementations over clever or overly condensed code.
- Avoid unnecessary imports and unused code.
- Maintain code coverage above 80% for affected functionality where feasible.

## Review checklist before completion

- Each method does one thing.
- Names clearly reflect purpose.
- No TODO, FIXME, or commented-out code.
- No magic numbers or hardcoded values.
- No unnecessary imports or unused variables.
- Java conventions are respected.
- Architecture remains Controller → Service → Repository.
- Coupling is minimal and justified.
- SOLID principles are reasonably followed.
- Behavior is aligned with current architecture and service boundaries.
- API/event contracts remain backward compatible.
- Code is production-ready, maintainable, and testable.
