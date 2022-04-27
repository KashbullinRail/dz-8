import beepers.Beeper;
import colors.Color;
import engines.Engine;
import lights.Light;
import wheels.Wheel;

public abstract class Car {

    Beeper beeper;
    Engine engine;
    Color color;
    Light light;
    Wheel wheel;

    public Car(Beeper beeper, Engine engine, Color color, Light light, Wheel wheel){
        this.beeper = beeper;
        this.engine = engine;
        this.color = color;
        this.light = light;
        this.wheel = wheel;
    }
}
