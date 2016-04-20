package se.tarlinder.dependencies.singletons;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Home-grown configuration manager that does nasty things with the file system and reflection
 */
public class NIHConfigurationManager {
    private static NIHConfigurationManager instance;
    private File configFile;
    private Map<String, String> values;

    // God forbid!
    private NIHConfigurationManager() {

        // No error handling! It's legacy!
        String language = System.getenv("CONFIG_LANG");
        File configDir = new File(System.getProperty("configDir"), language);
        configFile = new File(configDir, System.getProperty("configDir"));
    }

    public static NIHConfigurationManager getInstance() {
        if (instance == null) {
            instance = new NIHConfigurationManager();
        }
        return instance;
    }

    private synchronized void update() {
        values = new HashMap<String, String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(configFile));

            // Here we go... Update map based on the file's contents.
            // Of course it would be a proprietary file format.
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public String get(String key) {
        // Some "clever" implementation to get value
        return null;
    }
}
