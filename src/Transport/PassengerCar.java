package Transport;

public class PassengerCar extends Car implements Competing {

    private BodyType bodyType;


    public PassengerCar(String brand, String model, double engineValue, BodyType bodyType) {
        super(brand, model, engineValue);
        this.bodyType = bodyType;
    }



    public void startMoving() {
        System.out.println("Начал движение");
    }

    public void endMoving() {
        System.out.println("Закончил движение");
    }


    public void identifyType() {
        if (bodyType == null ) {
            System.out.println("Данным по авто недостаточно");
        } else {
            System.out.println("Кузов авто -> " + bodyType);
        }
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

    public BodyType getBodyType() {return bodyType;}
    public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
}


