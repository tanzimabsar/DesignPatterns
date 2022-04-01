package com.tanzim.Factory.Sharp;

import com.tanzim.Factory.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by SharpView Engine";
    }
}
