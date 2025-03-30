public class AirCondition {
    private int airConditionSwitch = 0;
    private int temperature ;

    public AirCondition(int item) {
        temperature = item;
    }

    public AirCondition() {
        temperature = 16;

    }


    public void turnOn() {
        airConditionSwitch = 1;
    }

    public boolean isTurnOn() {
        if (airConditionSwitch > 0) return true;
        return false;

    }

    public void turnOff() {
        airConditionSwitch = 0;
    }


    public int increaseTemprature() {
        if (airConditionSwitch == 0) return 0;
        if(temperature > 30) return  30;
        temperature++;
        return temperature;


    }

    public int decreaseTemprature() {
        if (airConditionSwitch == 0) return 0;
        if(temperature < 16) return  16;
        temperature--;
      return temperature;
    }

    public void setTemprature(int input) {
        temperature = input;



    }
}
