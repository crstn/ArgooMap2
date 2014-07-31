package com.mapitz.gwt.googleMaps.client;

/**
 * This is a map overlay that draws a polyline on the map, using the vector
 * drawing facilities of the browser if they are available, or an image overlay
 * from Google servers otherwise.
 * 
 * @author aglaforge
 * 
 */
public class GPolyline extends GOverlay {
    protected GPolyline(JSObject element) {
        super(element);
    }

    public static GPolyline narrowToGPolyline(JSObject element) {
        return (element == null) ? null : new GPolyline(element);
    }

    /**
     * Creates a polyline from encoded strings of aggregated points and levels.
     * color is a string that contains a hexadecimal numeric HTML style, i.e.
     * #RRGGBB. weight is the width of the line in pixels. opacity is a number
     * between 0 and 1. points is a string containing the encoded latitude and
     * longitude coordinates. levels is a string containing the encoded polyline
     * zoom level groups. numLevels is the number of zoom levels contained in
     * the encoded levels string. zoomFactor is the magnification between
     * adjacent sets of zoom levels in the encoded levels string. Together,
     * these two values determine the precision of the levels within an encoded
     * polyline. The line will be antialiased and semitransparent. (Since 2.63)
     * 
     * @param color
     * @param weight
     * @param opacity
     * @param points
     * @param zoomFactor
     * @param levels
     * @param numLevels
     */
    public GPolyline(String color, int weight, double opacity, String points,
            int zoomFactor, String levels, int numLevels) {
        this(GPolylineImpl.create(color, weight, opacity, points, zoomFactor,
                levels, numLevels));
    }

    /**
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public GPolyline(GLatLng[] points, String color, int weight, double opacity) {
        this(GPolylineImpl.create(ElementHelper.arrayConvert(points), color,
                weight, opacity));
    };

    /**
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public GPolyline(GLatLng[] points, String color, int weight) {
        this(GPolylineImpl.create(ElementHelper.arrayConvert(points), color,
                weight));
    }

    /**
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public GPolyline(GLatLng[] points, String color) {
        this(GPolylineImpl.create(ElementHelper.arrayConvert(points), color));
    }

    /**
     * Creates a polyline from an array of vertices. The color is given as a
     * string that contains the color in hexadecimal numeric HTML style, i.e.
     * #RRGGBB. The weight is the width of the line in pixels. The opacity is
     * given as a number between 0 and 1. The line will be antialiased and
     * semitransparent.
     */
    public GPolyline(GLatLng[] points) {
        this(GPolylineImpl.create(ElementHelper.arrayConvert(points)));
    }

    /**
     * getVertexCount() Number Returns the number of vertices in the polyline.
     * (Since 2.46)
     */
    public int getVertexCount() {
        return GPolylineImpl.getVertexCount(getJSObject());
    }

    /**
     * getVertex(index) GLatLng Returns the vertex with the given index in the
     * polyline. (Since 2.46)
     */
    public GLatLng getVertex(int index) {
        return GLatLng.narrowToGLatLng(GPolylineImpl.getVertex(getJSObject(),
                index));
    }

    // TODO Added remove event
}
