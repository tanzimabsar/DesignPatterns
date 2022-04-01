package com.tanzim.Factory.Sharp;

import com.tanzim.Factory.Matcha.Controller;
import com.tanzim.Factory.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
