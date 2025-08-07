package MovieTicketBookingSystem.show;

import java.time.LocalDateTime;

public class Shows {
    private String screenId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Shows(String screenId, LocalDateTime startTime, LocalDateTime endTime) {
        this.screenId = screenId;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public String getScreenId() {
        return screenId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

}
