package MovieTicketBookingSystem.seat;

import MovieTicketBookingSystem.Contants.SeatType;

public class PremiumSeat extends AbstractSeat {
    public PremiumSeat(String seatNumber) {
        super(seatNumber, SeatType.PREMIUM);
    }

}