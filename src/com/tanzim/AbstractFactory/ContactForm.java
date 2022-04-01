package com.tanzim.AbstractFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        // Entry Point
        factory.createTextBox().render();
        /** Here wgiven either the them factory, we can create a text box
         * or any other widget
         * However, this means more code in terms of factories for each theme type
         * but that also makes for easier code to read
         * that way we do not need to have some nested logic based on
         * enum values for the theme and it also alows to change things
         * at RUN time
         */
    }
}
