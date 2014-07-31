package com.mapitz.gwt.googleMaps.client;

class GPolylineImpl {
    /*
     * Creates an encoded polyline
     */
    public static native JSObject create(String c, int w, double o, String p,
            int z, String l, int n)
    /*-{
     return $wnd.GPolyline.fromEncoded({
     color: c,
     weight: w,
     opacity: o,
     points: p,
     levels: l,
     zoomFactor: z,
     numLevels: n
     });
     }-*/;

    /*
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public static native JSObject create(JSObject points, String color,
            int weight, double opacity)/*-{
     return new $wnd.GPolyline(points, color, weight, opacity);
     }-*/;

    /*
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public static native JSObject create(JSObject points, String color,
            int weight)/*-{
     return new $wnd.GPolyline(points, color, weight);
     }-*/;

    /*
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public static native JSObject create(JSObject points, String color)/*-{
     return new $wnd.GPolyline(points, color);
     }-*/;

    /*
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public static native JSObject create(JSObject points)/*-{
     return new $wnd.GPolyline(points);
     }-*/;

    /*
     * getVertexCount() Number Returns the number of vertices in the polyline.
     * (Since 2.46)
     */
    public static native int getVertexCount(JSObject self)/*-{
     return self.getVertexCount();
     }-*/;

    /*
     * getVertex(index) GLatLng Returns the vertex with the given index in the
     * polyline. (Since 2.46)
     */
    public static native JSObject getVertex(JSObject self, int index)/*-{
     return self.getVertex(index);
     }-*/;
}
