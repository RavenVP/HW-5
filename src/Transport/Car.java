package Transport;

import Transport.drivers.Driver;
import tasks.Passport;

import java.time.LocalDate;
import java.util.*;

public abstract class Car  {


    private double engineValue;
    private String brand;
    private String model;

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();

    public void addDriver(Driver<?> driver) {
        for (Driver<?> driver1 : drivers) {
            if (driver1.equals(driver)) {
                return;
            }
        }
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        for (Mechanic<?> mechanic1 : mechanics) {
            if (mechanic1.equals(mechanic)) {
                return;
            }
        }
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        for (Sponsor sponsor1 : sponsors) {
            if (sponsor1.equals(sponsor)) {
                return;
            }
        }
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

    public Set<Driver<?>> getDrivers() {return drivers;}
    public Set<Mechanic<?>> getMechanics() {return mechanics;}
    public Set<Sponsor> getSponsors() {return sponsors;}

    public double getEngineValue() {return engineValue;}
    public void setEngineValue(double engineValue) {this.engineValue = engineValue;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}



     public void allCarInfo() {
         for (Driver<?> driver : drivers) {
            System.out.println("Имя водителя -> " + driver.getName() + " " + driver.getSurname());
         }
         System.out.println("Спонсоры ->");
         for (Sponsor sponsor : sponsors) {
            System.out.println(sponsor.getName() + " || " + sponsor.getDonation() + "$");
         }
         System.out.println("Механики ->" );
         for (Mechanic<?> mechanic : mechanics)  {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " <<" + mechanic.getCompany() + ">>") ;
             System.out.println(mechanics);
         }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(drivers, car.drivers) && Objects.equals(mechanics, car.mechanics) && Objects.equals(sponsors, car.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivers, mechanics, sponsors);
    }
}
