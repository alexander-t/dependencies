package se.tarlinder.depedencies.relations

import se.tarlinder.dependencies.relations.Raffle
import spock.lang.Specification

class RaffleTest extends Specification {

    def "It's impossible to test code with indirect input"() {
        given:
        def testedRaffle = new Raffle()

        expect:
        testedRaffle.ticketCount == 1
    }
}
