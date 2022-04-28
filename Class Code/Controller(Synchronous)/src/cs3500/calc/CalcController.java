package cs3500.calc;

import java.io.IOException;

public interface CalcController {
  void go() throws IOException;
}

/**
 * SOlID
 * S : Single Responsibility, one type, on job.
 * O : Open/closed, open for extension, closed for modification.
 * L : Liskov Substitution, subtype substitutable for super type.
 * I : Interface Segregation, break up interface into smaller units of functionality.
 * D : Dependency inversion, depend on interface in both external (test cases) and internal.
 */