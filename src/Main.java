import Transport.*;
import Transport.drivers.Driver;
import Transport.drivers.DriverB;
import Transport.drivers.DriverC;
import Transport.drivers.DriverD;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        PassengerCar pas1 = new PassengerCar("Audi", "Q5", 2.1, BodyType.SEDAN);
        PassengerCar pas2 = new PassengerCar("Fiat", "500", 1.3, BodyType.COUPE);
        PassengerCar pas3 = new PassengerCar("Lexus", "RX350", 2.0, BodyType.CROSSOVER);
        PassengerCar pas4 = new PassengerCar("Lada", "Grande", 1.5, BodyType.SEDAN);

        FreightCar fr1 = new FreightCar("JAC", "Sunray", 2.7, WeightCapacityType.N1);
        FreightCar fr2 = new FreightCar("Валдай", "NEXT", 2.8, WeightCapacityType.N2);
        FreightCar fr3 = new FreightCar("ГАЗель", "NN", 2.7, WeightCapacityType.N3);
        FreightCar fr4 = new FreightCar("БелАЗ", "7513", 45, WeightCapacityType.N2);


        Bus bus1 = new Bus("Лиаз", "Курсор", 8, SeatsCapacityType.VERY_LARGE);
        Bus bus2 = new Bus("Маз", "Междугородец", 7, SeatsCapacityType.MEDIUM);
        Bus bus3 = new Bus("Hyundai", "H350", 3.5, SeatsCapacityType.SMALL);
        Bus bus4 = new Bus("Лиаз", "Гармошка", 6.8, SeatsCapacityType.MEDIUM);


        DriverB ipatov = new DriverB("Ипатов", "Матвей", "Олегович", 'B', 12, pas1);
        DriverC rogozin = new DriverC("Рогозин", "Андрей", "Максимович", 'C', 11, fr1);
        DriverD devetiarov = new DriverD("Деветьяров", "Максим", "Викторович", 'D', 6, bus2);

//        pas1.diagnostic();
//        fr1.diagnostic();
//        bus1.diagnostic();
//
//        ipatov.info();
//        rogozin.info();
//        devetiarov.info();
//
//        ipatov.refill();

        Sponsor darkSide = new Sponsor("DarkSide", 200000);
        Sponsor toyoTyres = new Sponsor("Toyo Tyres", 300000);
        Sponsor asus = new Sponsor("ASUS", 200000);

        Mechanic arthur = new Mechanic<>("Артур", "Филини", "RR Racing");

        pas1.addSponsor(darkSide);
        pas1.addSponsor(toyoTyres);
        pas1.addSponsor(asus);

        pas1.addDriver(ipatov);

        pas1.addMechanic(arthur);

        pas1.allCarInfo();
        pas1.fixCar();

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.addCarToService(pas1);
        serviceStation.addCarToService(bus1);
        serviceStation.addCarToService(pas3);
        serviceStation.service();

    }
}