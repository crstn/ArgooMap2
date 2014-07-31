package com.mapitz.gwt.googleMaps.client;

class GControlPositionImpl {
    /*
     * Creates a specification for a control position.
     */
    public static native JSObject create(int anchor, JSObject offset)/*-{
     return new $wnd.GControlPosition(anchor, offset);
     }-*/;
}
