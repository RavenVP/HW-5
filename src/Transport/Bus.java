package Transport;

public class Bus extends Car implements Competing{

    private SeatsCapacityType seatsCapacityType;
    public Bus(String brand, String model, double engineValue, SeatsCapacityType seatsCapacityType) {
        super(brand, model, engineValue);
        this.seatsCapacityType = seatsCapacityType;
    }


    public void startMoving() {System.out.println("Начал движение");}
    public void endMoving() {
        System.out.println("Закончил движение");
    }

    @Override
    public void diagnostic() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
    }

    @Override
    public void fixCar() {
        System.out.println();
        System.out.println("Автобус " + getBrand()  + " "+ getModel() +" в диагностике не нуждается");
    }

    @Override
    public boolean service() {
        return false;
    }


    public void identifyType() {
        if (seatsCapacityType == null ) {
            System.out.println("Данным по авто недостаточно");
        } else {
            System.out.println("Количество мест в авто -> " + seatsCapacityType.getSeatsCapacityType());
        }
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

    public SeatsCapacityType getSeatsCapacityType() {return seatsCapacityType;}

    public void setSeatsCapacityType(SeatsCapacityType seatsCapacityType) {this.seatsCapacityType = seatsCapacityType;}
}
