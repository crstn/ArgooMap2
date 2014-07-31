package com.mapitz.gwt.googleMaps.client;

public class GEventListener extends GoogleMapsWidget {

    protected GEventListener(JSObject element) {
        super(element);
    }

    public static GEventListener narrowToGEventListener(JSObject e) {
        return (e == null) ? null : new GEventListener(e);
    }

    /**
     * Unregisters the listener
     * 
     */
    public void unregister() {
        GEventListenerImpl.removeListener(getJSObject());
    }
}
