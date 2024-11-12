package Modules;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    public static ArrayList<String> commands;


    private Undo() {
        commands = new ArrayList<>();

    }

    public synchronized static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void saveStoric(String command) {
        commands.add(command);
    }

    public void getStoric() {
        commands.forEach(comm -> System.out.println("> " + comm));
    }

    public String undo() {
        String command = commands.getLast();
        commands.remove(commands.getLast());
        return "last command used   > " + command;
    }

    public String executeCommand(String command) {
        return "Comando " + command + " ejecutado";
    }
}
