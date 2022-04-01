package com.tanzim.AbstractFactory.material;

import com.tanzim.AbstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material Textbox");
    }
}
