package Transport;

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

}
