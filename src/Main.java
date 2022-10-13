import Transport.Bus;
import Transport.FreightCar;
import Transport.PassengerCar;
import drivers.Driver_B;
import drivers.Driver_C;
import drivers.Driver_D;



public class Main {
    public static void main(String[] args) {

        PassengerCar pas1 = new PassengerCar("Audi", "Q5", 2.1);
        PassengerCar pas2 = new PassengerCar("Fiat", "500", 1.3);
        PassengerCar pas3 = new PassengerCar("Lexus", "RX350", 2.0);
        PassengerCar pas4 = new PassengerCar("Lada", "Grande", 1.5);

        FreightCar fr1 = new FreightCar("JAC", "Sunray", 2.7);
        FreightCar fr2 = new FreightCar("Валдай", "NEXT", 2.8);
        FreightCar fr3 = new FreightCar("ГАЗель", "NN", 2.7);
        FreightCar fr4 = new FreightCar("БелАЗ", "7513", 45);

        Bus bus1 = new Bus("Лиаз", "Курсор", 8);
        Bus bus2 = new Bus("Маз", "Междугородец", 7);
        Bus bus3 = new Bus("Hyundai", "H350", 3.5);
        Bus bus4 = new Bus("Лиаз", "Гармошка", 6.8);


        bus1.bestLapTime();

        Driver_B ipatov = new Driver_B("Ипатов", "Матвей", "Олегович", 'B', 12, pas1);
        Driver_C rogozin = new Driver_C("Рогозин", "Андрей", "Максимович", 'C', 11, fr1);
        Driver_D devetiarov = new Driver_D("Деветьяров", "Максим", "Викторович", 'D', 6, bus2);

        ipatov.info();
        rogozin.info();
        devetiarov.info();

        ipatov.refill();
    }



}