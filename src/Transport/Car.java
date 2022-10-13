package Transport;

import java.time.LocalDate;

public abstract class Car  {

    private double engineValue;
    private String brand;
    private String model;

    public Car(String brand, String model, double engineValue) {

        if (engineValue <= 0) {
            this.engineValue = 1.5;
        } else {
            this.engineValue = engineValue;
        }
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "<<default>>";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "<<default>>";
        } else {
            this.model = model;
        }


    }

    public abstract void startMoving();
    public abstract void endMoving();

    public void info() {
        System.out.println("Название || Бренд -> " + brand);
        System.out.println("Модель -> " + model);
        System.out.println("Объём двигателя -> " + engineValue + " литра");
    }
    public double getEngineValue() {return engineValue;}
    public void setEngineValue(double engineValue) {this.engineValue = engineValue;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
}
