package Nivel3.Modules;

public class Car implements Vehicle{

    private int totalSpeed = 130;
    private int speed;
    private boolean engineOn;

    public Car() {
        this.speed = 0;
        this.engineOn = false;
    }


    @Override
    public void startEngine() {
        this.engineOn = !engineOn;
        System.out.println(this.engineOn ? "Engine ON" : "Engine OFF");
    }

    @Override
    public void brake() {
        if (this.speed != 0) {
            this.speed -= 10;
            System.out.println("slowing down... (Car is going at " + this.speed + " K/h)");
        } else{
            System.out.println("Car is already stopped");
        }
    }

    @Override
    public void accelerate() {
        if (this.speed != totalSpeed && engineOn) {
            this.speed +=20;
            System.out.println("accelerate... (Car is going at " + this.speed + " k/h)");
        } else if (!engineOn) {
            System.out.println("The engine is Off");
        } else {
            System.out.println("Car is already going at maximum speed (" + this.speed + " K/h)" );
        }
    }
}
