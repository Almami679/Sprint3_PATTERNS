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
        if (!defaultCommands.contains(command)) {
            if (!commands.contains(command)) {
                Undo.getInstance().saveStoric(command);
            }
            return Undo.getInstance().executeCommand(command);
        } else {
            if (command.equalsIgnoreCase("undo")){
                return Undo.getInstance().undo();
            } else if (command.equalsIgnoreCase("history")) {
            Undo.getInstance().getStoric();
                return "> " + command;
            } else {
                return command;
            }
        }
    }



}

