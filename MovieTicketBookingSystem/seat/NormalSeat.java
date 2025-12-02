package MovieTicketBookingSystem.seat;

import MovieTicketBookingSystem.Contants.SeatType;

public class NormalSeat extends AbstractSeat {
    public NormalSeat(String seatNumber) {
        super(seatNumber, SeatType.NORMAL);
    }

}
