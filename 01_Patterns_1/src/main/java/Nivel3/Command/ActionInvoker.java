package Nivel3.Command;

import Nivel3.Modules.Vehicle;

import java.util.HashMap;

public class ActionInvoker {

    private HashMap<Character, Command> action = new HashMap<>();

    private Vehicle vehicle;

    public ActionInvoker(Vehicle vehicle) {
        this.vehicle = vehicle;
        action.put('i', new StartEngineCommand(vehicle));
        action.put('w', new AccelerateCommand(vehicle));
        action.put('s', new BrakeCommand(vehicle));
    }

    public void action(char c) {
        if(!action.containsKey(c)) {
            System.out.println("Invalid key, please use only ([I], [W], [S], [Q]");
        } else{
            action.get(c).execute();
        }
    }
}
