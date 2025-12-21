package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Bus;
import programmer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());

        Bus bus = new Bus();
        bus.drive();
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());
        System.out.println(bus.isBig());
    }
}
