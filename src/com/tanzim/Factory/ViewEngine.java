package com.tanzim.Factory;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
