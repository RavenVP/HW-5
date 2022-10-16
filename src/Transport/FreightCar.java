package Transport;

public class FreightCar extends Car implements Competing{

    private WeightCapacityType weightCapacityType;
    public FreightCar(String brand, String model, double engineValue,WeightCapacityType weightCapacityType) {
        super(brand, model, engineValue);
        this.weightCapacityType = weightCapacityType;
    }

    public void startMoving() {
        System.out.println("Начал движение");
    }
    public void endMoving() {
        System.out.println("Закончил движение");
    }

    @Override
    public void identifyType() {
        if (weightCapacityType == null ) {
            System.out.println("Данным по авто недостаточно");
        } else {
            System.out.println("Грузоподъёмность авто -> " + weightCapacityType.getWeightInfo());
        }

    }


    public void pitStop() {System.out.println("Этот грузовик ушёл на питстоп");}
    public void bestLapTime() {
        System.out.println("Лучшее время круга этого грузовика - ");
    }
    public void maxSpeed() {
        System.out.println("Наибольшая скорость этого грузовика - ");
    }


    public WeightCapacityType getWeightCapacityType() {return weightCapacityType;}
    public void setWeightCapacityType(WeightCapacityType weightCapacityType) {this.weightCapacityType = weightCapacityType;}
}
