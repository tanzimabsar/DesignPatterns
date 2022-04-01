package com.tanzim.AbstractFactory.material;

import com.tanzim.AbstractFactory.TextBox;
import com.tanzim.AbstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
