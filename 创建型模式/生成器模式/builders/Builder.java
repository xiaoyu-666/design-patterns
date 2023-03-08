package 创建型模式.生成器模式.builders;

import 创建型模式.生成器模式.cars.CarType;
import 创建型模式.生成器模式.components.Engine;
import 创建型模式.生成器模式.components.GPSNavigator;
import 创建型模式.生成器模式.components.Transmission;
import 创建型模式.生成器模式.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
