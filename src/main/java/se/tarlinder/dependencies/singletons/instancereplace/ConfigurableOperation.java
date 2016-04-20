package se.tarlinder.dependencies.singletons.instancereplace;

public class ConfigurableOperation {

    private String result;

    public void doIt() {
        ConfigurationProvider configurationManager = RelaxedNIHConfigurationManager.getInstance();
        result = prepend(configurationManager.get("magicString"));
    }

    private String prepend(String s) {
        return "I processed *" + s + "*";
    }

    public String getResult() {
        return result;
    }
}
