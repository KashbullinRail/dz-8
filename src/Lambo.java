import beepers.Beeper;
import colors.Color;
import engines.Engine;
import lights.Light;
import wheels.Wheel;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Color color, Light light, Wheel wheel) {
        super(beeper, engine, color, light, wheel);
    }
    String getCost() {
        return "987654321";
    }
}





