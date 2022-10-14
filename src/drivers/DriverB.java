package drivers;

import Transport.PassengerCar;

public class DriverB extends Driver<PassengerCar> {

    public DriverB(String surname, String name, String patronymic, char driverLicense, double experience, PassengerCar raceTransport) {
        super( surname, name, patronymic, driverLicense, experience, raceTransport);
    }

}
