import java.awt.*;
import java.util.ArrayList;

public abstract class Car implements Movable{
    /**
     * Instance variables
     */
    private int nrDoors;
    private double enginePower;
    private Color color;
    private String modelName;
    private double currentSpeed;
    private double x,y;
    private double direction;

    /**
     * Constructor that creates car objects
     * @param nrDoors = Doors
     * @param enginePower = EnginePower
     * @param color = Color
     * @param modelName = modelName
     */
    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    /**
     * Sets current speed to 0.1
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /**
     * Sets currentSpeed to 0.0
     */
    public void stopEngine() {
        currentSpeed = 0.0;
    }

    /**
     * Getter - returns current speed
     * Meant to be private but results in test errors....
     * @return currentSpeed
     */
    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    /** Setter - sets value to current speed
     * @param amount = gas(amount)
     * */
    private void setCurrentSpeed(double amount){
        currentSpeed = amount;
    }

    /**
     * speedFactor in
     * @return speedFactor
     */
    public abstract double speedFactor();

    /** Increments the speed of the car depending on speedFactor and amount
     * @param amount = Gas(amount)
     * */
    private void incrementSpeed(double amount) {
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    /** Decrements the speed of the car depending on speedFactor and amount
     * @param amount = Gas(amount)
     */
    private void decrementSpeed(double amount) {
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
    }

    /** Returns incrementSpeed with the amount specified, if it's between 0 and 1
     * @param amount = Gas(amount)
     * */
    public void gas(double amount) {
        if(amount <= 1 && amount >= 0){
            this.incrementSpeed(amount);
        }
    }

    /** Returns decrementSpeed with the amount specified, if it's between 0 and 1
     * @param amount = brake(amount)
     * */
    public void brake(double amount) {
        if(amount <= 1 && amount >= 0){
            this.decrementSpeed(amount);
        }
    }

    /**
     * Changes x and y coordinate of the car object dependant on direction and currentSpeed
     */
    @Override
    public void move(){
        this.x += Math.cos(direction) * currentSpeed;
        this.y += Math.sin(direction) * currentSpeed;
    }
    /**
     * When method is called, 0.2 is added to direction
     */
    @Override
    public void turnLeft(){
        this.direction += 0.2;
    }

    /**
     * Changes direction by -0.2 radians
     */
    @Override
    public void turnRight(){
        this.direction -= 0.2;
    }

    /**
     * Getter for EnginePower
     * @return enginePower
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * Getter for NrDoors
     * @return nrDoors
     */
    public int getNrDoors() {
        return nrDoors;
    }

    /**
     * Getter for Color
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Getter for ModelName
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Getter for Direction
     * @return direction
     */
    public double getDirection() {
        return direction;
    }
}

