package se.tarlinder.depedencies.files.streams

import se.tarlinder.dependencies.files.streams.PaymentParser
import spock.lang.Specification

class PaymentParserTest extends Specification {

    def "I java < 1.8 the standard recipe was to use java.io.streams"() {
        given: "A parser operating on a stream"
        def testedParser = new PaymentParser()

        when: "It's fed a stream built from a string"
        def fileContents = "0000112034;CREDIT;100.23;<rest of the line goes here>";
        def payments = testedParser.readPayments(new ByteArrayInputStream(fileContents.getBytes()));

        then: "Parsing will work"
        payments[0].id == 112034L
    }
}
