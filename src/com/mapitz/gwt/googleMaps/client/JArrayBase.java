package com.mapitz.gwt.googleMaps.client;

public class JArrayBase extends GoogleMapsWidget {

    protected JArrayBase(JSObject element) {
        super(element);
    }

    public static JArrayBase narrowToGoogleMapsWidgetArray(JSObject element) {
        return (element == null) ? null : new JArrayBase(element);
    }

    protected JArrayBase(int length) {
        this(JArrayBaseImpl.create(length));
    }

    public int length() {
        return JArrayBaseImpl.arrayLength(getJSObject());
    }
}
