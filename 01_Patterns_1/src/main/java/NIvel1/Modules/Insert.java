package NIvel1.Modules;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static NIvel1.Modules.Undo.commands;

public class Insert {

    private final Undo SESSION = Undo.getInstance();
    private static final Insert instance = new Insert();
    private final Scanner input = new Scanner(System.in);
    private final String[] DEFAULTCOMMANDS = {"exit", "undo", "history"};
    private ArrayList<String> defaultCommands = new ArrayList<>(Arrays.asList(DEFAULTCOMMANDS));


    public static Insert getInstance() {
        return instance;
    }

    public String sendInput(){
        String command = input.nextLine();
        String output;
        if (validateDefaultCommands(command)) {
            Undo.getInstance().saveStoric(command);
            output = Undo.getInstance().executeCommand(command);
        } else {
            output = executeDefaultCommand(command);
        }
        return output;
    }

    private boolean validateDefaultCommands(String command){
        boolean output = false;
        if (!defaultCommands.contains(command) && (!commands.contains(command))) {
            output = true;
        }
        return output;
    }

    private String executeDefaultCommand(String command) {
        String output = command;
        if (command.equalsIgnoreCase("undo")){
            output = Undo.getInstance().undo();
        } else if (command.equalsIgnoreCase("history")) {
            Undo.getInstance().getStoric();
            output = "> " + command;
        }
        return output;

    }





}

