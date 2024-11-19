package Nivel3.Command;

import Nivel3.Modules.Vehicle;

public class AccelerateCommand implements Command{

    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
