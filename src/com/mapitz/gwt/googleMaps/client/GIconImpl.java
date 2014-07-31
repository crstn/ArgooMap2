package com.mapitz.gwt.googleMaps.client;

class GIconImpl {
    /*
     * Creates a control with buttons to pan in four directions, and zoom in and
     * zoom out, and a zoom slider.
     */
    public static native JSObject create(JSObject other)/*-{
     return new $wnd.GIcon(other);
     }-*/;

    public static native JSObject create(JSObject other, String url)/*-{
     return new $wnd.GIcon(other, url);
     }-*/;

    public static native JSObject create()/*-{
     return new $wnd.GIcon();
     }-*/;

    public static native JSObject G_DEFAULT_ICON()/*-{
     return $wnd.G_DEFAULT_ICON;
     }-*/;
}
