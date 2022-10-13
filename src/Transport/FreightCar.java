package Transport;

public class FreightCar extends Car implements Competing{
    public FreightCar(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }


    public void startMoving() {
        System.out.println("Начал движение");
    }


    public void endMoving() {
        System.out.println("Закончил движение");
    }

    public void pitStop() {
        System.out.println("Этот грузовик ушёл на питстоп");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга этого грузовика - ");
    }

    public void maxSpeed() {
        System.out.println("Наибольшая скорость этого грузовика - ");
    }
}
