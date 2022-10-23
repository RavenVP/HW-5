package Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private Queue<Car> cars = new ArrayDeque<>();

    public ServiceStation() {
        this.cars = cars;
    }

    public void addCarToService(Car car) {
        if (car instanceof Bus) {
            System.out.println("Для автобусов сервис не требуется");
            return;
        }
        System.out.println(car.getBrand() + " " + car.getModel() + " прошёл сервис");
        cars.add(car);
    }
    public void service() {
        if (cars.isEmpty()) {
            Car carQueue = cars.poll();
            carQueue.service();
        }
    }






    public Queue<Car> getCars() {return cars;}
}
