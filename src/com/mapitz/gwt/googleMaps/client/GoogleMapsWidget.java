package com.mapitz.gwt.googleMaps.client;

public class GoogleMapsWidget {
    private JSObject element;

    protected GoogleMapsWidget(JSObject element) {
        setJSObject(element);
    }

    public static GoogleMapsWidget narrowToGoogleMapsWidget(JSObject element) {
        return (element == null) ? null : new GoogleMapsWidget(element);
    }

    public JSObject getJSObject() {
        return element;
    }

    public void setJSObject(JSObject element) {
        this.element = element;
    }
}
