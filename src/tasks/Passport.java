package tasks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    public static void main(String[] args) {
        Passport p1 = new Passport(123, "Алексеев", "Егор", "Викторович", "21.11.1980");
        Passport p2 = new Passport(2123, "Бушуев", "Иван", "Андреевич", "11.05.1999");
        Passport p3 = new Passport(312, "Овсянкин", "Андрей", "28.10.2000");


        addPassport(p2);
        addPassport(p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();
        printAllPassports();
        System.out.println();

    }




    private int number;
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;
    private static Set<Passport> passports = new HashSet<>();

    public Passport(int number, String surname, String name, String patronymic, String birthDate) {
        if (number <= 0) {
            throw new RuntimeException("Неверно введён номер паспорта");
        } else {this.number = number;}
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Неверно введено имя в паспорте");
        } else {this.name = name;}
        if (surname == null || surname.isEmpty() || surname.isBlank()) {
            throw new RuntimeException("Неверно введена фамилия в паспорте");
        } else {this.surname = surname;}
        if (birthDate == null || birthDate.isEmpty() || birthDate.isBlank()) {
            throw new RuntimeException("Неверно введена дата в паспорте");
        } else {this.birthDate = birthDate;}
        this.patronymic = patronymic;
    }
    public Passport(int number, String surname, String name, String birthDate) {
        this(number, surname, name, null, birthDate);
    }

    public static void addPassport(Passport newPassport) {
        for (Passport passport : passports) {
            if (passport.getNumber() == newPassport.getNumber()) {
                throw new IllegalArgumentException("Паспорт с  номером <<"+ newPassport.getNumber()+">> уже есть, обновите данные");
            }
        }
        passports.add(newPassport);
    }

    public static Passport searchPassport(Passport searched) {
        for (Passport passport : passports) {
            if (passport.getNumber() == searched.getNumber()) {
                return passport;
            }
        }
        return null;
    }

    public static void printAllPassports() {
        for (Passport passport : passports) {
            System.out.println(passport);
        }
    }

    public int getNumber() {return number;}
    public String getSurname() {return surname;}
    public String getName() {return name;}
    public String getPatronymic() {return patronymic;}
    public String getBirthDate() {return birthDate;}
    public void setNumber(int number) {this.number = number;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setName(String name) {this.name = name;}
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}
    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number && Objects.equals(surname, passport.surname) && Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surname, name, patronymic, birthDate);
    }
}
