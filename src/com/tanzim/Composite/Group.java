package com.tanzim.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A heirarchy of objects here are groups<Object>
 *     we can manipulate these objects in the same way
 *     with a common interface that is shared between objects
 *     this also means we dont have to check the type or check
 *     if methods exists, which can slow down our app
 */

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component shape) {
        components.add(shape);
    }

    public void render() {
        for (var component: components)
            component.render();
    }

    @Override
    public void move() {
        for (var component: components)
            component.move();
    }
}
