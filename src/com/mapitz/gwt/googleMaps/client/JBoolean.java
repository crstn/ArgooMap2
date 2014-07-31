package com.mapitz.gwt.googleMaps.client;

public class JBoolean extends GoogleMapsWidget {

    protected JBoolean(JSObject element) {
        super(element);
    }

    public static JBoolean narrowToBooleanElement(JSObject element) {
        return ((element == null) || (!JBooleanImpl.isBoolean(element))) ? null
                : new JBoolean(element);
    }

    public JBoolean(boolean bool) {
        super(JBooleanImpl.create(bool));
    }

    public boolean toBoolean() {
        return JBooleanImpl.toBoolean(getJSObject());
    }
}
