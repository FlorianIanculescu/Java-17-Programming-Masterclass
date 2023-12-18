public record Seat(char RowMarker, int seatNumber, boolean isReserved) {

    public Seat(char rowMarker, int seatNumber) {
//        this(rowMarker, seatNumber, new Random().nextBoolean());
        this(rowMarker, seatNumber, false);
    }
}
