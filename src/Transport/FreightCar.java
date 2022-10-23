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
    public void diagnostic() {
        int a = (int) (1 + Math.random() * 40);
        if (a > 20) {
            throw new RuntimeException(" Грузовой атомобиль " + getBrand()+ " " + getModel()+  " не прошёл диагностику");        }
    }

    @Override
    public void fixCar() {
        System.out.println();
        System.out.println("Было проведено техобслуживание " + getBrand()  + " "+ getModel() );
    }

    @Override
    public boolean service() {
        System.out.println();
        System.out.println("Был проведён сервис " + getBrand()  + " "+ getModel() );
        return false;
    }


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
