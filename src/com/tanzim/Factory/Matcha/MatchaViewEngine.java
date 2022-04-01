package com.tanzim.Factory.Matcha;

import com.tanzim.Factory.ViewEngine;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View by Matcha";
    }

}
