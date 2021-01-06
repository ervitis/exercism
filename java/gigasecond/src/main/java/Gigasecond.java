import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
    private final static long GIGASECOND = 1000000000;
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return this.moment.plus(GIGASECOND, ChronoUnit.SECONDS);
    }
}
