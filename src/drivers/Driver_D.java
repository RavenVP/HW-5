package drivers;

import Transport.Bus;
import Transport.FreightCar;

public class Driver_D extends Driver<Bus>{

    public Driver_D(String surname, String name, String patronymic, char driverLicense, double experience, Bus raceTransport) {
        super( surname,  name,  patronymic,  driverLicense,  experience,  raceTransport);
    }

}
