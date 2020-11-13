import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;

public class test {

    Saab95 saab = new Saab95();
    Volvo240 volvo = new Volvo240();

    /** IF THE VOLVO HAS 4 DOORS AND SAAB HAS 2 DOORS, TEST IT PASSED */
    @Test
    public void checkNrDoors(){
        assertEquals(saab.getNrDoors(), 2);
        assertEquals(volvo.getNrDoors(), 4);
    }

    /** CHECKS IF THE VOLVO HAS 100 BHP AND THE SAAB HAS 125 */
    @Test
    public void checkEnginepower(){
        assertTrue( volvo.getEnginePower() == 100);
        assertTrue(saab.getEnginePower() == 125);
    }

    /** CHECKS IF THE VOLVO IS YELLOW AND IF THE SAAB IS BLUE */
    @Test
    public void checkColor(){
        assertEquals(Color.YELLOW, volvo.getColor());
        assertEquals(Color.BLUE, saab.getColor());
    }

    /** CHECKS IF THE VOLVO IS A 240 AND THE SAAB A 95 */
    @Test
    public void checkModelName(){
        assertEquals("240", volvo.getModelName());
        assertEquals("95", saab.getModelName());
    }

    /** CHECKS IF THE SAAB CAR HAS A TURBO THAT CAN BE SET ON*/
    @Test
    public void checkTurboOn(){
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }

    /** IF THE VOLVO CAR HAS TRIMFACTOR BUT NOT THE SAAB CAR, IT SHOULD BE SO */
    @Test
    public void checkTrimFactor(){
        assertTrue(1.25 == volvo.getTrimFactor());
    }

    /**
     * IF ANY OF THE CARS MOVE, THE CAR SHOULD MOVE
     */
    @Test
    public void checkMove(){  } //TODO next lab

    /**
     * IF ANY OF THE CARS TURN LEFT, THE CAR SHOULD TURN LEFT
     */
    @Test
    public void checkTurnLeft(){
        double startAngle = volvo.getDirection();
        volvo.turnLeft();
        assertTrue(volvo.getDirection() > startAngle);
        saab.turnLeft();
        assertTrue(saab.getDirection() > startAngle);
    }

    /**
     * IF ANY OF THE CARS TURN RIGHT, THE CAR SHOULD TURN RIGHT
     */
    @Test
    public void checkTurnRight(){
        double startAngle = volvo.getDirection();
        volvo.turnRight();
        assertTrue(volvo.getDirection() < startAngle);
        saab.turnRight();
        assertTrue(saab.getDirection() < startAngle);
    }

    /** IF ANY OF THE CARS GAS, THE CAR SPEED SHOULD INCREMENT */
    @Test
    public void checkGas(){
        double startSpeedVolvo = volvo.getCurrentSpeed();
        volvo.gas(1);
        assertTrue(volvo.getCurrentSpeed() > startSpeedVolvo);
        double startSpeedSaab = saab.getCurrentSpeed();
        saab.gas(1);
        assertTrue(saab.getCurrentSpeed() > startSpeedSaab);
    }

    /** IF ANY OF THE CARS BRAKE, THE CAR SPEED SHOULD DECREMENT */
    @Test
    public void checkBrake(){
        double startSpeed = volvo.getCurrentSpeed();
        volvo.brake(1);
        assertTrue(volvo.getCurrentSpeed() < startSpeed);
    }

    /** IF ANY OF THE CARS STARTS, THE CURRENTSPEED SHOULD BE 0.1 */
    @Test
    public void checkStartEngine(){
        volvo.startEngine();
        assertTrue(volvo.getCurrentSpeed() == 0.1);
        saab.startEngine();
        assertTrue(saab.getCurrentSpeed() == 0.1);
    }

    /** IF ANY OF THE CARS TURNS OFF, THE CURRENTSPPED SHOULD BE 0.0 */
    @Test
    public void checkstopEngine(){
        volvo.startEngine();
        volvo.stopEngine();
        assertTrue(volvo.getCurrentSpeed() == 0.0);
        saab.stopEngine();
        saab.stopEngine();
        assertTrue(saab.getCurrentSpeed() == 0.0);
    }
}

