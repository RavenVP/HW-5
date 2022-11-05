package tasks;

import java.util.HashSet;
import java.util.Set;

public class PassportsSet {

    private static Set<Passport> passports = new HashSet<>();

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
                return searched;
            }
        }
        return null;
    }

    public static void printAllPassports() {
        for (Passport passport : passports) {
            System.out.println(passport);
        }
    }

}
