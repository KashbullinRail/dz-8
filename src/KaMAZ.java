import beepers.Beeper;
import colors.Color;
import engines.Engine;
import lights.Light;
import wheels.Wheel;

public class KaMAZ extends Car{
    public KaMAZ(Beeper beeper, Engine engine, Color color, Light light, Wheel wheel) {
        super(beeper, engine, color, light, wheel);
    }
    String cargoBoard(){
        return "Дополнительный грузовой борт";
    }
}
