package com.mapitz.gwt.googleMaps.client;

class GPointImpl {
    public static native JSObject create(int x, int y)/*-{
     return new $wnd.GPoint(x, y);
     }-*/;

    public static native boolean equals(JSObject self, JSObject other)/*-{
     return self.equals(other);
     }-*/;

    public static native String toString(JSObject self)/*-{
     return self.toString();
     }-*/;
}
