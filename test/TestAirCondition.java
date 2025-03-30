import org.junit.Test;

import static org.junit.Assert.*;

public class TestAirCondition {
    @Test
    public void testAirConditionIsOn() {
        AirCondition aC = new AirCondition();
        aC.turnOn();
        assertTrue(aC.isTurnOn());
    }
    @Test
    public void testAirConditionIsOff() {
        AirCondition aC = new AirCondition();
        aC.turnOn();
        assertTrue(aC.isTurnOn());
        aC.turnOff();
        assertFalse(aC.isTurnOn());
    }
    @Test
    public void testAirConditionIncreaseTemperature() {
        AirCondition aC = new AirCondition(16);
        aC.turnOn();
        aC.increaseTemprature();
        aC.increaseTemprature();
        aC.increaseTemprature();
        assertEquals(20, aC.increaseTemprature());

    }
    @Test
    public void testAirConditionTurnOffDontincreaseTemperature() {
        AirCondition aC = new AirCondition();
        aC.turnOff();
        int actual = aC.increaseTemprature();
        assertEquals(0, actual);
    }
    @Test
    public void testAirConditionTurnOffDecreaseTemperature() {
        AirCondition aC = new AirCondition();
        aC.turnOff();
        aC.decreaseTemprature();
        assertEquals(0, aC.decreaseTemprature());
    }
    @Test
    public void  testAirConditionTurnOnIncreaseAndDecrease() {
        AirCondition aC = new AirCondition();
        aC.setTemprature(30);
        aC.turnOn();
        aC.increaseTemprature();
        assertEquals(30, aC.increaseTemprature());

    }
    @Test
    public void testAirConditionDecreaseTemprature() {
        AirCondition aC = new AirCondition();
        aC.turnOn();
        aC.decreaseTemprature();
        assertEquals(16, aC.decreaseTemprature());
    }

}
