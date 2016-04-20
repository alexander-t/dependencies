package se.tarlinder.depedencies.time.wrapped

import se.tarlinder.dependencies.time.wrapped.ScheduledTask
import se.tarlinder.dependencies.time.wrapped.TimeSource
import spock.lang.Specification

class ScheduledTaskTest extends Specification {
    def "Try hitting the wall clock time. Good luck!"() {

        given: "A scheduled task"
        def taskMock = Mock(Runnable)
        def scheduledTask = new ScheduledTask(10, 30, taskMock);

        and: "A custom (stubbed) time source"
        def timeSourceStub = Stub(TimeSource)
        timeSourceStub.hour >> 10
        timeSourceStub.minute >> 30
        scheduledTask.setTimeSource(timeSourceStub)

        when: "The task is checked against time current time"
        scheduledTask.runIfTime()

        then: "It'll be executed"
        1 * taskMock.run()
    }
}


