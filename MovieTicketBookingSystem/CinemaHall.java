package MovieTicketBookingSystem;

import java.util.ArrayList;

import MovieTicketBookingSystem.screen.Screen;

public class CinemaHall {
    private String hallName;
    private String hallId;
    private String location;

    private ArrayList<Screen> screenList;

    public CinemaHall(String hallId, String hallName, String location, String genre) {
        this.hallName = hallName;
        this.hallId = hallId;
        this.location = location;
        this.screenList = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        this.screenList.add(screen);
    }

    public String getHallName() {
        return hallName;
    }

    public String getHallId() {
        return hallId;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Screen> getScreenList() {
        return screenList;
    }

}
