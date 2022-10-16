package drivers;

import Transport.Bus;

public class DriverD extends Driver<Bus>{
    public DriverD(String surname, String name, String patronymic, char driverLicense, double experience, Bus raceTransport) {
        super( surname,  name,  patronymic,  driverLicense,  experience,  raceTransport);
    }

}
