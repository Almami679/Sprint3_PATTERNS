package Nivel3.Modules;

public class Bicycle implements Vehicle{

    private int totalSpeed = 60;
    private int speed;
    private boolean engineOn;

    public Bicycle() {
        this.speed = 0;
        this.engineOn = false;
    }


    @Override
    public void startEngine() {
        this.engineOn = !engineOn;
        System.out.println(this.engineOn ? "Pedaling" : "without pedaling");
    }

    @Override
    public void brake() {
        if (this.speed != 0) {
            this.speed -= 5;
            System.out.println("slowing down... (Bicycle is going at " + this.speed + " K/h)");
        } else{
            System.out.println("Bicycle is already stopped");
        }
    }

    @Override
    public void accelerate() {
        if (this.speed != totalSpeed && engineOn) {
            this.speed +=20;
            System.out.println("accelerate... (Bicycle is going at " + this.speed + " k/h)");
        } else if (!engineOn) {
            System.out.println("You are stopped, ");
        }else {
            System.out.println("Bicycle is already going at maximum speed (" + this.speed + " K/h)" );
        }
    }
}
