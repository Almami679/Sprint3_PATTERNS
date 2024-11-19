package Nivel3.Command;

import Nivel3.Modules.Vehicle;

public class StartEngineCommand implements Command{

    private Vehicle vehicle;

    public StartEngineCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void execute() {
        vehicle.startEngine();
    }
}
