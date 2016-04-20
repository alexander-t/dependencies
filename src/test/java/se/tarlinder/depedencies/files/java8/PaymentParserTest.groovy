package se.tarlinder.depedencies.files.java8

import se.tarlinder.dependencies.files.java8.PaymentParser
import spock.lang.Specification

class PaymentParserTest extends Specification {

    def "In Java 1.8 streams are the preferred choice!"() {
        given: "A parser operating on a stream"
        def testedParser = new PaymentParser()

        when: "It's fed a stream built from a string array"
        String[] fileContents = ["0000112034;CREDIT;100.23;<rest of the line goes here>"]
        def payments = testedParser.readPayments(Arrays.stream(fileContents))

        then: "Parsing will work"
        payments[0].id == 112034L
    }
}
