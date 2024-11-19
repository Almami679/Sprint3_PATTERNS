package Nivel3.Modules;

public class Plane implements Vehicle{

    private int totalSpeed = 900;
    private int speed;
    private boolean engineOn;

    public Plane() {
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
            this.speed -= 50;
            System.out.println("slowing down... (Plane is going at " + this.speed + " K/h)");
        } else{
            System.out.println("Plane is already stopped");
        }
    }

    @Override
    public void accelerate() {
        if (this.speed != totalSpeed && engineOn) {
            this.speed +=50;
            System.out.println("accelerate... (Plane is going at " + this.speed + " K/h)");
        } else if (!engineOn) {
            System.out.println("The engine is Off");
        } else {
            System.out.println("Plane is already going at maximum speed (" + this.speed + " K/h)" );
        }
    }
}
