package MovieTicketBookingSystem.seat;

import java.util.concurrent.locks.ReentrantLock;

import MovieTicketBookingSystem.Contants.SeatStatus;
import MovieTicketBookingSystem.Contants.SeatType;

public abstract class AbstractSeat implements Seat {
    private String seatNumber;
    private final SeatType seatType;
    private SeatStatus seatStatus;
    private static final ReentrantLock rlock = new ReentrantLock();

    AbstractSeat(String seatNumber, SeatType seatType) {
        this.seatStatus = SeatStatus.UNOCCUPIED;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    @Override
    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    @Override
    public SeatStatus getStatus() {
        return this.seatStatus;
    }

    @Override
    public SeatType getSeatType() {
        return seatType;
    }

    @Override
    public boolean isAvailable() {
        return this.seatStatus.equals(SeatStatus.UNOCCUPIED);
    }

    @Override
    public boolean bookSeat() {
        if (this.seatStatus.equals(SeatStatus.UNOCCUPIED)) {
            synchronized (rlock) {
                this.setSeatStatus(SeatStatus.IN_QUEUE);
                return true;
            }
        }
        return false;
    }

}
