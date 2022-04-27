import beepers.Beeper;
import colors.Color;
import engines.Engine;
import lights.Light;
import wheels.Wheel;

public class Priora extends Car {

    public Priora(Beeper beeper, Engine engine, Color color, Light light, Wheel wheel) {
        super(beeper, engine, color, light, wheel);
    }

    String downShifting() {
        return "Занижена";
    }
}



