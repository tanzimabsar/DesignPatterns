package com.tanzim;

import com.tanzim.AbstractFactory.ContactForm;
import com.tanzim.AbstractFactory.material.MaterialWidgetFactory;
import com.tanzim.Composite.Group;
import com.tanzim.Composite.Shape;
import com.tanzim.Factory.ProductsController;
import com.tanzim.singleton.ConfigManager;

public class Main {

    public static void main(String[] args) {
        // Factory Pattern
        // Here we can just create the class and list products without
        // specifying the engine and passing that into it as an arg
        new ProductsController().listProducts();

        // instead of
        /**
         * #ProductsController.java
         * var engine = new Engine();
         * var html = engine.render(viewName, context);
         * System.out.println()
         */

        /** By sending a widget factory we can create a theme styled
         * component without sending it an enum and its dependencies
         * can also be created
        **/
        // new ContactForm().render(new MaterialWidgetFactory());

        // Composite Pattern
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.render();
    }

    public static void getSingleton() {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "tanzim");
        System.out.println(manager.get("name"));
    }
}
