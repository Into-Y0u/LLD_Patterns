package MovieTicketBookingSystem.screen;

import java.util.Hashtable;

import MovieTicketBookingSystem.Contants.ScreenType;
import MovieTicketBookingSystem.Contants.SeatType;

public interface Screen {

    Hashtable<SeatType, Integer> getCapacity();

    ScreenType getScreenType();

    String getScreenId();

    String getScreenLocation();

}