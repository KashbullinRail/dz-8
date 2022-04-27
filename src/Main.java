import beepers.*;
import colors.*;
import engines.*;
import lights.*;
import wheels.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Lambo
        Beeper horn = new Horn();
        Engine engineV12 = new EngineV12();
        Color expensive = new Expensive();
        Light laser = new Laser();
        Wheel sport = new Sport();
        Lambo lambo = new Lambo(horn, engineV12, expensive, laser, sport);

        //Priora
        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Color baclajan = new Baclajan();
        Light led = new LED();
        Wheel showOff = new ShowOff();
        Priora priora = new Priora(magicSound, engineV6, baclajan, led, showOff);

        //Liaz
        Beeper nasty = new Nasty();
        Engine electric = new Electric();
        Color urban = new Urban();
        Light hallogen = new Hallogen();
        Wheel comfort = new Comfort();
        Liaz liaz = new Liaz(nasty, electric, urban, hallogen, comfort);

        //KaMAZ
        Beeper loud = new Loud();
        Engine turboDiesel = new TurboDiesel();
        Color haki = new Haki();
        Light biKsenon = new BiKsenon();
        Wheel reliable = new Reliable();
        KaMAZ kaMAZ = new KaMAZ(loud, turboDiesel, haki, biKsenon, reliable);

//        System.out.println(lambo.beeper.makeSound());
//        System.out.println(lambo.engine.getSpeed());
//        System.out.println(lambo.getCost());
//
//        System.out.println(priora.beeper.makeSound());
//        System.out.println(priora.engine.getSpeed());
//        System.out.println(priora.downShifting());

        // Допы у Камаза
        System.out.println(kaMAZ.cargoBoard());
        // Допы у Лиаза
        System.out.println(liaz.standingRoom());

        ArrayList<Car> transporter = new ArrayList();
        transporter.add(lambo);
        transporter.add(priora);
        transporter.add(liaz);
        transporter.add(kaMAZ);

        transporter.forEach((Car car) -> {
            System.out.println(car.engine.getSpeed());
            System.out.println(car.beeper.makeSound());
            System.out.println(car.color.paintingColor());
            System.out.println(car.light.illuminates());
            System.out.println(car.wheel.radius());
        });
    }
}


