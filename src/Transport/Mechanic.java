package Transport;

public class Mechanic<T extends Car> {
    private String name;
    private String surname;
    private String company;


    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t)  {
        return t.service();
    }

    public void fixCar(T t) {
        t.fixCar();
    }


    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getCompany() {return company;}
}
