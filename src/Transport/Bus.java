package Transport;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engineValue) {
        super(brand, model, engineValue);
    }


    public void startMoving() {System.out.println("Начал движение");}
    public void endMoving() {
        System.out.println("Закончил движение");
    }


    public void pitStop() {
        System.out.println("Этот автобус ушёл на питстоп");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга этого автобуса - ");
    }

    public void maxSpeed() {
        System.out.println("Наибольшая скорость этого автобуса - ");
    }
}
