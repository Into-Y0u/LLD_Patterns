package MovieTicketBookingSystem.seat;

import MovieTicketBookingSystem.Contants.SeatStatus;
import MovieTicketBookingSystem.Contants.SeatType;

public interface Seat {

    String getSeatNumber();

    SeatStatus getStatus();

    SeatType getSeatType();

    boolean isAvailable();

    boolean bookSeat();
}