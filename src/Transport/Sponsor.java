package Transport;

import java.util.Objects;

public class Sponsor {

    private String name;
    private int donation;

    public Sponsor(String name, int donation) {
        this.name = name;
        this.donation = donation;
    }

    public void donationInfo() {
        System.out.println("Спонсор " +name+ " проспонсировал на сумму -> " +donation);
    }

    public String getName() {return name;}
    public int getDonation() {return donation;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return donation == sponsor.donation && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, donation);
    }
}
