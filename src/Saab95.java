import java.awt.Color;

public class Saab95 extends Car {
    /**
     * Instance variable unique to Saab95
     */
    private boolean turboOn;

    /**
     * Initialization of Volvo240 object, with set boolean for turboOn
     */
    public Saab95() {
        super(2, 125, Color.blue, "95");
        turboOn = false;
    }

    /** Method that sets turboOn = true (used in speedFactor) */
    public void setTurboOn() {
        this.turboOn = true;
    }

    /** Method that sets turboOn = false (used in speedFactor) */
    private void setTurboOff() {
        this.turboOn = false;
    }

    /** Method that returns speedFactor (acceleration), depending on turboOn */
    @Override
    public double speedFactor(){
        double turbo = 1.0;
        if (this.turboOn) {
            turbo = 1.3;
        }
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Getter - Checks if turbo is on
     * @return turboOn
     */
    public boolean isTurboOn() {
        return turboOn;
    }
}
