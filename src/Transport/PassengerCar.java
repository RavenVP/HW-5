package Transport;

public class PassengerCar extends Car implements Competing {
    public PassengerCar(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }


    public void startMoving() {
        System.out.println("Начал движение");
    }


    public void endMoving() {
        System.out.println("Закончил движение");
    }

    public void pitStop() {
        System.out.println("Эта машина ушла на питстоп");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга этой машины - ");
    }

    public void maxSpeed() {
        System.out.println("Наибольшая скорость этой машины - ");
    }
}
