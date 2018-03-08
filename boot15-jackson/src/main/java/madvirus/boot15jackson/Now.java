package madvirus.boot15jackson;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

public class Now {
    private LocalDateTime localTime;
    private OffsetDateTime offsetTime;
    private Date date;

    public Now() {
        localTime = LocalDateTime.now();
        offsetTime = OffsetDateTime.now();
        date = new Date();
    }

    public LocalDateTime getLocalTime() {
        return localTime;
    }

    public OffsetDateTime getOffsetTime() {
        return offsetTime;
    }

    public Date getDate() {
        return date;
    }
}
