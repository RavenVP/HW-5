package drivers;

import Transport.PassengerCar;

public class Driver_B extends Driver<PassengerCar> {

    public Driver_B(String surname, String name, String patronymic, char driverLicense, double experience, PassengerCar raceTransport) {
        super( surname, name, patronymic, driverLicense, experience, raceTransport);
    }

}
