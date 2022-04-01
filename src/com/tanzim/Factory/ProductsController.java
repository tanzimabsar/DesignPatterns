package com.tanzim.Factory;

import com.tanzim.Factory.Matcha.Controller;
import com.tanzim.Factory.Sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    /**
     * Using the Factory ShaprController we can create a SharpController
     * Engine which can elegantly extend the object isntead of instantiating it here
     * We also use an interface here to define its methods so its consistent
     */
    public void listProducts() {
        // Send db a query
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
