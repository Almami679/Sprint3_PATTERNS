package Modules;


import java.util.Scanner;

import static Main.Main.SESSION;
import static Main.Main.defaultCommands;
import static Modules.Undo.commands;

public class Insert {

    private static final Insert instance = new Insert();
    private static Scanner input = new Scanner(System.in);


    public static Insert getInstance() {
        return instance;
    }

    public String sendInput(){
        String command = input.nextLine();
        if (!defaultCommands.contains(command)) {
            if (!commands.contains(command)) {
                SESSION.getInstance().saveStoric(command);
            }
            return SESSION.getInstance().executeCommand(command);
        } else {
            if (command.equalsIgnoreCase("undo")){
                return SESSION.getInstance().undo();
            } else if (command.equalsIgnoreCase("history")) {
            SESSION.getInstance().getStoric();
                return "> " + command;
            } else {
                return command;
            }
        }
    }



}

