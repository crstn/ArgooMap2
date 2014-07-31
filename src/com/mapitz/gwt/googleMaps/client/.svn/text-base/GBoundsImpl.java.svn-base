package com.mapitz.gwt.googleMaps.client;

class GBoundsImpl {
    /*
     * GClientGeocoder(cache?) Creates a new instance of a geocoder that talks
     * directly to Google servers. The optional cache parameter allows one to
     * specify a custom client-side cache of known addresses. If none is
     * specified, a GFactualGeocodeCache is used. (Since 2.55)
     */
    protected static native JSObject create(JSObject array)/*-{
     return new $wnd.GBounds(array);
     }-*/;

    // toString() String Returns a string that contains the coordinates of the
    // upper left and the lower right corner points of the box, in this order,
    // separated by comma, surrounded by parentheses.

    // min() GPoint The point at the upper left corner of the box.
    public static native JSObject min(JSObject self)/*-{
     return self.min();
     }-*/;

    public static native JSObject mid(JSObject self)/*-{
     return self.mid();
     }-*/;

    // max() GPoint The point at the lower right corner of the box.
    public static native JSObject max(JSObject self)/*-{
     return self.max();
     }-*/;

    // containsBounds(other) Boolean Returns true iff the other box is entirely
    // contained in this box.
    public static native boolean containsBounds(JSObject self, JSObject other)/*-{
     return self.containsBounds(other);
     }-*/;

    // extend(point) none Enlarges this box so that the point is also contained
    // in this box.
    public static native void extend(JSObject self, JSObject point)/*-{
     self.extend(point);
     }-*/;

    // intersection(other) Element Returns the box by which this box overlaps
    // the other box. If there is no overlap, returns an empty box.
    public static native JSObject intersection(JSObject original, JSObject other)/*-{
     return $wnd.GBounds.intersection(original, other);
     }-*/;

    public static native boolean equals(JSObject self, JSObject other)/*-{
     return self.equals(other);
     }-*/;

    public static native JSObject copy(JSObject self)/*-{
     return self.copy();
     }-*/;

    public static native String toString(JSObject self)/*-{
     return self.toString();
     }-*/;

    public static native int getAttributeAsInt(JSObject elem, String attr) /*-{
     var ret = elem[attr];
     return (ret === undefined) ? 0 : ret;
     }-*/;
}
