package Ex1.Main;


import Ex1.Modules.Insert;
import Ex1.Modules.Undo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static final Undo SESSION = Undo.getInstance();
    public static final String[] DEFAULTCOMMANDS = {"exit", "undo", "history"};
    public static ArrayList<String> defaultCommands = new ArrayList<>(Arrays.asList(DEFAULTCOMMANDS));

    public static void main(String[] args) {


        boolean exit = false;

        do {
            System.out.println("> undo (go back to last command)\n" +
                    "> history (see the command history)\n> exit (exit cmd)" +
                    "\nWrite next command ... \n> ");

            Insert input = Insert.getInstance();

            String command = input.sendInput();

            if(command.equalsIgnoreCase("exit")){
                exit = true;
            } else {
                System.out.println(command + "\n");
            }
        } while(!exit);

    }
}