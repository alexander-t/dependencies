package se.tarlinder.depedencies.singletons

import se.tarlinder.dependencies.singletons.ConfigurableOperation
import spock.lang.Specification

class ConfigurableOperationTest extends Specification {
    def "Proper legacy singletons can even be initialized"() {

        given: "A class under test that depends on a singleton"
        def testedOperation = new ConfigurableOperation()

        when: "An operation on that singleton is invoked"
        testedOperation.doIt()

        then: "The test will fail miserably"
        testedOperation.getResult() == "I processed *The Magic String*"
    }
}
