package se.tarlinder.depedencies.time

import se.tarlinder.dependencies.time.ScheduledTask
import spock.lang.Specification

class ScheduledTaskTest extends Specification {
    def "Try hitting the wall clock time. Good luck!"() {

        given: "A mock task"
        def taskMock = Mock(Runnable)

        when: "It's added to the scheduler and checked against the clock"
        new ScheduledTask(10, 30, taskMock).runIfTime()

        then: "It's not going to work :("
        1 * taskMock.run()
    }
}


