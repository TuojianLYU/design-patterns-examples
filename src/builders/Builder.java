package src.builders;

import src.cars.CarType;
import src.components.Engine;
import src.components.GPSNavigator;
import src.components.Transmission;
import src.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
