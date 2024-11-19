package Nivel3.Command;

import Nivel3.Modules.Vehicle;

public class BrakeCommand implements Command{

    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void execute() {
        vehicle.brake();
    }
}
