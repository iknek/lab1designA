import java.awt.*;

public class Volvo240 extends Car {
    /** Instance variable unique to Volvo240 */
    private double trimFactor;

    /**
     * Initialization of Volvo240 object, with set value for trimFactor
     */
    public Volvo240() {
        super(4, 100, Color.yellow, "240");
        trimFactor = 1.25;
    }

    /**
     * Method for Volvo240 that returns speedFactor (acceleration)
     * @return speedFactor
     */
    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    /**
     * Getter for trimFactor
     * @return trimFactor
     */
    public double getTrimFactor() {
        return trimFactor;
    }


}
