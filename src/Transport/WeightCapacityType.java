package Transport;

public enum WeightCapacityType {
    N1 ("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 до 12 тонн"),
    N3 ("с полной массой свыше 12 тонн");
    private final String weightCapacityType;
    WeightCapacityType(String weightCapacityType) {
        this.weightCapacityType = weightCapacityType;
    }

    public String getWeightInfo() {return weightCapacityType;}
}
