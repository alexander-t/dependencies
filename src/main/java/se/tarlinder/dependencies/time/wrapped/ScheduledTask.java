package se.tarlinder.dependencies.time.wrapped;

/**
 * This is a rather unrealistic example as such, but its purpose is to demonstrate
 * a dependency on system time.
 * Here it's been resolved using a home-made abstraction around the Calendar class.
 * This was the preferred solution prior to Java 1.8, where the abstract Clock class
 * was introduced.
 */
public class ScheduledTask {

    private final int hour;
    private final int minute;
    private final Runnable task;

    private TimeSource timeSource = new CalendarTimeSource();

    public ScheduledTask(int hour, int minute, Runnable task) {
        this.hour = hour;
        this.minute = minute;
        this.task = task;
    }

    public void runIfTime() {
        if (timeSource.getHour() == hour && timeSource.getMinute() == minute) {
            task.run();
        }
    }

    public void setTimeSource(TimeSource timeSource) {
        this.timeSource = timeSource;
    }
}

