package MovieTicketBookingSystem;

import java.time.LocalDateTime;

public class Movie {
    private String title;
    private String id;
    private LocalDateTime releaseDate;
    private String genre;

    public Movie(String id, String title, LocalDateTime releaseDate, String genre) {
        this.title = title;
        this.id = id;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public String getTitle() {
        return title;
    }

}
