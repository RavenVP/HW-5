package Transport;

import Transport.drivers.Driver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Car  {


    private double engineValue;
    private String brand;
    private String model;

    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

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
    public abstract void diagnostic();

    public abstract void fixCar();
    public abstract boolean service();


    public abstract void identifyType();
    public void info() {
        System.out.println("Название || Бренд -> " + brand);
        System.out.println("Модель -> " + model);
        System.out.println("Объём двигателя -> " + engineValue + " литра");
        System.out.println();
    }

    public List<Driver<?>> getDrivers() {return drivers;}
    public List<Mechanic<?>> getMechanics() {return mechanics;}
    public List<Sponsor> getSponsors() {return sponsors;}

    public double getEngineValue() {return engineValue;}
    public void setEngineValue(double engineValue) {this.engineValue = engineValue;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}


    public void allCarInfo() {
        System.out.println("Имя водителя -> " + drivers.get(0).getName()+ " " + drivers.get(0).getSurname() );
        System.out.println("Спонсоры ->");
        for (int i = 0; i < sponsors.size(); i++) {
            System.out.println(sponsors.get(i).getName() + " || " + sponsors.get(i).getDonation() + "$");
        }
        System.out.println("Механики ->");
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println(mechanics.get(i).getName() + " " + mechanics.get(i).getSurname() + " <<" + mechanics.get(i).getCompany()+">>" );
        }

        }
}
