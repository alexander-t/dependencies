package se.tarlinder.depedencies.singletons.instancereplace

import se.tarlinder.dependencies.singletons.instancereplace.ConfigurableOperation
import se.tarlinder.dependencies.singletons.instancereplace.ConfigurationProvider
import se.tarlinder.dependencies.singletons.instancereplace.RelaxedNIHConfigurationManager
import spock.lang.Specification

class ConfigurableOperationTest extends Specification {
    def "Proper legacy singletons can even be initialized"() {

        given: "The class that relies on a relaxed singleton that implements an interface"
        def testedOperation = new ConfigurableOperation()

        and: "A mock instance"
        def configurationProviderMock = Mock(ConfigurationProvider)
        configurationProviderMock.get(_) >> "The Magic String"
        RelaxedNIHConfigurationManager.instance = configurationProviderMock

        when: "An operation on that singleton is invoked"
        testedOperation.doIt()

        then: "The test will fail miserably"
        testedOperation.getResult() == "I processed *The Magic String*"
    }
}
