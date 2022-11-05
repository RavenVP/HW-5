package tasks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private int number;
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;

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
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
