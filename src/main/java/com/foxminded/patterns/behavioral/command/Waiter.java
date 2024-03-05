package com.foxminded.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Waiter {

  private Map<String, Command> commands;

  {
    commands = new HashMap<>();
    commands.put("Margo", new MargoCommand());
    commands.put("Fungi", new FungiCommand());
    commands.put("Marinara", new MarinaraCommand());
  }

  public Command getCommand(String name) {
    if (commands.get(name) != null) {
      return commands.get(name);
    }
    System.out.println("I dont know that Pizza, sorry. Try Marinara");
    return new UnknownCommand();
  }
}
