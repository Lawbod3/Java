public class Bike {
    private int bikeSwitch;
    private int speed = 0;

    public void turnOn() {
        bikeSwitch = 1;
    }

    public boolean isTurnOn() {
        if (bikeSwitch == 0) return false;
        return true;
    }

    public void turnOff() {
        bikeSwitch = 0;

    }

    public int accelerate() {
        if (bikeSwitch == 0) return 0;
         speed++;
        if (speed > 20) speed ++;
        if (speed > 30) speed ++;
        if (speed > 40) speed++;

        return speed;
    }

    public int gear() {
        int result = 1;
        if(speed < 1) return 0;
        if(speed > 20) result++;
        if(speed > 30)result ++;
        if(speed > 40)result ++;

        return result;

    }

    public void accelerate(int value) {
        speed += value;
    }

    public int decelerate() {
        if (speed == 0) return 0;
        if(bikeSwitch == 0) return 0;
        speed--;
        if(speed > 20) speed--;
        if(speed > 30) speed--;
        if(speed > 40)speed--;
        return speed;

    }

    public void decelerate(int value) {

        speed -= value;
    }
}
