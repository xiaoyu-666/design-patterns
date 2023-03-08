package 创建型模式.生成器模式;

import 创建型模式.生成器模式.builders.CarBuilder;
import 创建型模式.生成器模式.builders.CarManualBuilder;
import 创建型模式.生成器模式.cars.Car;
import 创建型模式.生成器模式.cars.Manual;
import 创建型模式.生成器模式.director.Director;

public class main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
