package com.tanzim.Composite;

import java.util.ArrayList;
import java.util.List;
import com.tanzim.Composite.Shape;

public class Group {
    private List<Object> shapes = new ArrayList<>();

    public void add(Object shape) {
        shapes.add(shape);
    }

    public void render() {
        /** Here the design pattern is quite clunky
         * If we were to add more methods, this needs to be repeated
         * which can lead to very difficult and terse code
         * Let us use the compositional design pattern here
         * so we can treat all objects within the same heirarchy
         * in the same way
         */

        for (var object: shapes) {
            if (object instanceof Shape) {
                ((Shape)object).render();
            } else
                ((Group)object).render();
        }
    }
}
