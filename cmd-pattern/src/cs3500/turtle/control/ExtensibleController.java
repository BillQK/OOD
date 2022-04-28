package cs3500.turtle.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Function;

import cs3500.turtle.control.commands.Move;
import cs3500.turtle.control.commands.Square;
import cs3500.turtle.control.commands.Trace;
import cs3500.turtle.control.commands.Turn;
import cs3500.turtle.tracingmodel.Line;
import cs3500.turtle.tracingmodel.SmarterTurtle;
import cs3500.turtle.tracingmodel.TracingTurtleModel;

/**
 * A console controller for turtle graphics, using the command design pattern and a Map to replace
 * switch statement.
 */
public class ExtensibleController {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    TracingTurtleModel m = new SmarterTurtle();
    Stack<TracingTurtleCommand> commands = new Stack<>();

    Map<String, Function<Scanner, TracingTurtleCommand>> knownCommands = new HashMap<>();
    knownCommands.put("move", s -> new Move(s.nextDouble()));
    knownCommands.put("turn", (Scanner s) -> { return new Turn(s.nextDouble()); });
    knownCommands.put("trace", (Scanner s) -> { return new Trace(s.nextDouble()); });
    knownCommands.put("square", (Scanner s) -> { return new Square(s.nextDouble()); });
    knownCommands.put("show", s -> model -> model.getLines().forEach(System.out::println));
    while (scan.hasNext()) {
      TracingTurtleCommand c;
      String in = scan.next();
      if (in.equalsIgnoreCase("q") || in.equalsIgnoreCase("quit")) {
        return;
      }
      Function<Scanner, TracingTurtleCommand> cmd = knownCommands.get(in);
      if (cmd == null) {
        System.out.println("Command not found: " + in);
      } else {
        c = cmd.apply(scan);
        commands.add(c);
        c.go(m);
      }
    }
  }
}
