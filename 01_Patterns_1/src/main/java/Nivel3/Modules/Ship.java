package Nivel3.Modules;

public class Ship implements Vehicle{

    private int totalSpeed = 60;
    private int speed;
    private boolean engineOn;

    public Ship () {
        this.speed = 0;
        this.engineOn = false;
    }


    @Override
    public void startEngine() {
        this.engineOn = true;
        System.out.println("Engine ON");
    }

    @Override
    public void brake() {
        if (this.speed != 0) {
            this.speed -= 5;
            System.out.println("slowing down... (the boat is going at " + this.speed + " knots)");
        } else{
            System.out.println("Ship is stopped");
        }
    }

    @Override
    public void accelerate() {
        if (this.speed != totalSpeed && engineOn) {
            this.speed +=10;
            System.out.println("accelerate... (the boat is going at " + this.speed + " knots)");
        } else if (!engineOn) {
            System.out.println("The engine is Off");
        }
        else {
            System.out.println("Ship is already going at maximum speed (" + this.speed + " knots)" );
        }



    }
}
