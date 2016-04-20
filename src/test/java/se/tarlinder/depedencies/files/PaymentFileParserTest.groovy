package se.tarlinder.depedencies.files

import se.tarlinder.dependencies.files.PaymentFileParser
import spock.lang.Specification

class PaymentFileParserTest extends Specification {

    def "A parser that requires a filename can't be unit tested"() {
        given: "A legacy parser"
        def testedParser = new PaymentFileParser()

        when: "It parses the file"
        testedParser.readPaymentFile("/tmp/payment.csv")

        then: "This block won't even be reached"
    }
}
