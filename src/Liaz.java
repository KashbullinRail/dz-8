import beepers.Beeper;
import colors.Color;
import engines.Engine;
import lights.Light;
import wheels.Wheel;

public class Liaz extends Car{
    public Liaz(Beeper beeper, Engine engine, Color color, Light light, Wheel wheel) {
        super(beeper, engine, color, light, wheel);
    }
    String standingRoom(){
        return "Есть стоячие места";
    }
}
