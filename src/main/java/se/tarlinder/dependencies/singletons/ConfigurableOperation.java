package se.tarlinder.dependencies.singletons;

public class ConfigurableOperation {

    private String result;

    public void doIt() {
        NIHConfigurationManager configurationManager = NIHConfigurationManager.getInstance();
        result = prepend(configurationManager.get("magicString"));
    }

    private String prepend(String s) {
        return "I processed *" + s + "*";
    }

    public String getResult() {
        return result;
    }
}
