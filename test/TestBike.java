import org.junit.Test;

import static org.junit.Assert.*;

public class TestBike {
    @Test
    public void testBikeIsOn() {
        Bike myBike = new Bike();
        myBike.turnOn();
        assertTrue(myBike.isTurnOn());
    }
    @Test
    public void testBikeIsOff() {
        Bike myBike = new Bike();
        myBike.turnOff();
        assertFalse(myBike.isTurnOn());
    }
    @Test
    public void testBikeCanAccelerate() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate();
        assertEquals(2, myBike.accelerate());

    }
    @Test
    public void testBikeDontAcceleratewhenTurnOffOrNotOn() {
        Bike myBike = new Bike();
        myBike.accelerate();
        assertEquals(0, myBike.accelerate());
    }
    @Test
    public void testBikeCanGear() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(1, myBike.gear());
    }
    @Test
    public void testBikeDontGearWhenTurnOffAccelerate() {
        Bike myBike = new Bike();
        myBike.turnOn();
        assertEquals(0, myBike.gear());
    }
    @Test
    public void testBikeCanChangeGear() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate();
        myBike.accelerate(20);
        assertEquals(2, myBike.gear());
    }
    @Test
    public void testBikeCanChangeGearToThree() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(20);
        myBike.accelerate(12);
        assertEquals(3, myBike.gear());
    }
    @Test
    public void testBikeCanChangeGearToFour() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(41);
        assertEquals(4, myBike.gear());
    }
    @Test
    public void testBikeCanChangeGearInAccordanceToGear() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(21);
       assertEquals(23, myBike.accelerate());
    }
    @Test
    public void testBikeCanChangeGearToFourInAccordanceToGear() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(44);
        assertEquals(48, myBike.accelerate());
    }
    @Test
    public void testBikeCanDecelerate() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(15);
        myBike.decelerate();
        assertEquals(13, myBike.decelerate());
    }
    @Test
    public void testBikeCanDecelerateWhenAtGearFour() {
        Bike myBike = new Bike();
        myBike.turnOn();
        myBike.accelerate(45);
        assertEquals(41, myBike.decelerate());
    }
    @Test
    public void testBikeCanDecelerateWhenAtGearAndDontDecelerateWhenBikeIsOff() {
        Bike myBike = new Bike();
        myBike.decelerate(20);
        assertEquals(0, myBike.decelerate());

    }
    @Test
    public void testBikeDontDeceleatewhenNOSpeed() {
        Bike myBike = new Bike();
        myBike.turnOn();
        assertEquals(0, myBike.decelerate());
    }

}
