package se.tarlinder.dependencies.time;

import java.util.Calendar;

public class ScheduledTask {

    private final int hour;
    private final int minute;
    private final Runnable task;
    private Calendar cal = Calendar.getInstance();

    public ScheduledTask(int hour, int minute, Runnable task) {
        this.hour = hour;
        this.minute = minute;
        this.task = task;
    }

    public void runIfTime() {
        if (cal.get(Calendar.HOUR) == hour && cal.get(Calendar.MINUTE) == minute) {
            task.run();
        }
    }
}

