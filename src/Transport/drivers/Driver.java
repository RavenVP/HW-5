package Transport.drivers;

import Transport.*;


public abstract class Driver<T extends Car & Competing>{
    private String surname;
    private String name;
    private String patronymic;

    private T raceTransport;
    private char driverLicense;
    private double experience;

    public  void startMoving() {
        System.out.println(surname + " начал движение");
    }

    public  void endMoving() {
        System.out.println(surname + " закончил движение");
    }

    public  void refill() {
        System.out.println(surname + " уехал на дозаправку");
    }


    public Driver(String surname, String name, String patronymic, char driverLicense, double experience, T raceTransport) {
        if (surname == null || surname.isBlank() || surname.isEmpty()) {
            this.surname = "<<default>>";
        } else {
            this.surname = surname;
        }
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "<<default>>";
        } else {
            this.name = name;
        }
        if (patronymic == null || patronymic.isBlank() || patronymic.isEmpty()) {
            this.patronymic = "<<default>>";
        } else {
            this.patronymic = patronymic;
        }
        if (experience <= 0) {
            this.experience = 1;
        } else {
            this.experience = experience;
        }
        if (driverLicense != 'B' && driverLicense != 'C' && driverLicense != 'D') {
            throw new RuntimeException(" Необходимо указать тип прав!");
        } else {
            this.driverLicense = driverLicense;
        }
        if (raceTransport != null) {
            this.raceTransport = raceTransport;
        }
    }

    public void info() {
        System.out.println("Водитель < " + surname + " " + name + " " + patronymic + " > управляет автомобилем <<"+ " " + raceTransport.getBrand() +
                " " + raceTransport.getModel() + " >> " + "и будет учавствовать в заезде");
        System.out.println("");
    }

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPatronymic() {return patronymic;}
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}
    public T getRaceTransport() {return raceTransport;}
    public void setRaceTransport(T raceTransport) {this.raceTransport = raceTransport;}
    public char getDriverLicense() {return driverLicense;}
    public void setDriverLicense(char driverLicense) {this.driverLicense = driverLicense;}
    public double getExperience() {return experience;}
    public void setExperience(double experience) {this.experience = experience;}
}

