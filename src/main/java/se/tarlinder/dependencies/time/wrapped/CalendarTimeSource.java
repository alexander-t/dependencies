package se.tarlinder.dependencies.time.wrapped;

import java.util.Calendar;

public class CalendarTimeSource implements TimeSource {

    private Calendar calendar = Calendar.getInstance();

    @Override
    public int getHour() {
        return calendar.get(Calendar.HOUR);
    }

    @Override
    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }
}
