package drivers;

import Transport.FreightCar;

public class DriverC extends Driver<FreightCar>{
    public DriverC(String surname, String name, String patronymic, char driverLicense, double experience, FreightCar raceTransport) {
        super( surname, name, patronymic, driverLicense, experience, raceTransport);
    }

}
