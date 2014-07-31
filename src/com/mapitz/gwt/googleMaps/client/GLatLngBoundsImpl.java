package com.mapitz.gwt.googleMaps.client;

class GLatLngBoundsImpl {

    public static native JSObject create(JSObject sw, JSObject ne)/*-{
     return new $wnd.GLatLngBounds(sw, ne);
     }-*/;

    public static native JSObject create()/*-{
     return new $wnd.GLatLngBounds();
     }-*/;

    public static native boolean contains(JSObject self, JSObject latlng)/*-{
     return self.contains(latlng);
     }-*/;

    public static native boolean containsBounds(JSObject self, JSObject other)/*-{
     return self.containsBounds(other);
     }-*/;

    public static native boolean equals(JSObject self, JSObject other)/*-{
     return self.equals(other);
     }-*/;

    public static native void extend(JSObject self, JSObject latlng)/*-{
     return self.extend(latlng);
     }-*/;

    public static native JSObject getCenter(JSObject self)/*-{
     return self.getCenter();
     }-*/;

    public static native JSObject getNorthEast(JSObject self)/*-{
     return self.getNorthEast();
     }-*/;

    // equals(other) Boolean Returns true iff all parameters in this rectangle
    // are equal to the parameters of the other, within a certain roundoff
    // margin.
    // contains(latlng) Boolean Returns true iff the geographical coordinates of
    // the point lie within this rectangle.
    // intersects(other) Boolean What the name says.
    // containsBounds(other) Boolean What the name says.
    // extend(latlng) none Enlarges this rectangle such that it contains the
    // given point. In longitude direction, it is enlarged in the smaller of the
    // two possible ways. If both are equal, it is enlarged at the eastern
    // boundary.

    public static native JSObject getSouthWest(JSObject self)/*-{
     return self.getSouthWest();
     }-*/;

    public static native boolean intersects(JSObject self, JSObject other)/*-{
     return self.intersects(other);
     }-*/;

    public static native boolean isEmpty(JSObject self)/*-{
     return self.isEmpty();
     }-*/;

    public static native boolean isFullLat(JSObject self)/*-{
     return self.isFullLat();
     }-*/;

    public static native boolean isFullLng(JSObject self)/*-{
     return self.isFullLng();
     }-*/;

    public static native JSObject toSpan(JSObject self)/*-{
     return self.toSpan();
     }-*/;

}
