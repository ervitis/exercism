import java.time.DayOfWeek;
import java.time.LocalDate;

class Meetup {
    final int mm, yyyy;
    static final int TEEN = 13;
    static final int WEEK = 7;

    Meetup(int mm, int yyyy) {
        this.mm = mm;
        this.yyyy = yyyy;
    }

    private int findDiff(DayOfWeek day, int refDay, int sign) {
        int diff = sign * (day.getValue() - LocalDate.of(yyyy, mm, refDay).getDayOfWeek().getValue());
        if (diff < 0) {
            diff += WEEK;
        }
        return refDay + diff * sign;
    }

    public LocalDate day(DayOfWeek day, MeetupSchedule type) {
        int myDay;
        int sign = 1;

        switch (type) {
            case TEENTH:
                myDay = TEEN;
                break;
            case FIRST:
            case SECOND:
            case THIRD:
            case FOURTH:
                myDay = 1 + WEEK * type.ordinal();
                break;
            case LAST:
                myDay = LocalDate.of(yyyy, mm, 1).lengthOfMonth();
                sign = -1;
                break;
            default: myDay = 0;
        }

        return LocalDate.of(yyyy, mm, findDiff(day, myDay, sign));
    }
}