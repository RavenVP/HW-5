package drivers;

import Transport.FreightCar;

public class Driver_C extends Driver<FreightCar>{
    public Driver_C(String surname, String name, String patronymic, char driverLicense, double experience, FreightCar raceTransport) {
        super( surname, name, patronymic, driverLicense, experience, raceTransport);
    }

}
