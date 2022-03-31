package com.tanzim.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton class to create a ConfigManager
 * We can only have one instance of this class
 * This is to be used by multiple loggers (Simulated)
 */
public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();
    private static ConfigManager instance = new ConfigManager();


    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}