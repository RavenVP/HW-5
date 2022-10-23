package Transport;

public enum SeatsCapacityType {
    VERY_SMALL("до 10 мест"),
    SMALL("до 25 мест"),
    MEDIUM("40-50 мест"),
    LARGE("60-80 мест"),
    VERY_LARGE("100-120 мест");

    private final String seatsCapacityType;

    SeatsCapacityType(String seatsCapacityType) {
        this.seatsCapacityType = seatsCapacityType;
    }

    public String getSeatsCapacityType() {return seatsCapacityType;}
}
