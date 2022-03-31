package com.tanzim;

import com.tanzim.singleton.ConfigManager;

public class Main {

    public static void main(String[] args) {
        getSingleton();
    }

    public static void getSingleton() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "tanzim");
        System.out.println(manager.get("name"));
    }
}
