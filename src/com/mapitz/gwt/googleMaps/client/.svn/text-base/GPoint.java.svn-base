package com.mapitz.gwt.googleMaps.client;

/**
 * A GPoint represents a point on the map by its pixel coordinates. Notice that
 * in v2, it doesn't represent a point on the earth by its geographical
 * coordinates anymore. Geographical coordinates are now represented by GLatLng.
 * <br/>In the map coordinate system, the x coordinate increases to the left,
 * and the y coordinate increases downwards. <br/>Notice that while the two
 * parameters of a GPoint are accessible as properties x and y, it is better to
 * never modify them, but to create a new object with different paramaters
 * instead.
 * 
 * @author aglaforge
 * 
 */
public class GPoint extends GoogleMapsWidget {
    protected GPoint(JSObject element) {
        super(element);
    }

    public static GPoint narrowToGPoint(JSObject element) {
        return (element == null) ? null : new GPoint(element);
    }

    public GPoint(int x, int y) {
        this(GPointImpl.create(x, y));
    }

    /**
     * x Number x coordinate, increases to the left.
     * 
     * @return
     */
    public int getX() {
        return ElementHelper.getAttributeAsInt(getJSObject(), "x");
    }

    /**
     * x Number x coordinate, increases to the left.
     * 
     * @param x
     */
    public void setX(int x) {
        ElementHelper.setAttribute(getJSObject(), "x", String.valueOf(x));
    }

    /**
     * y Number y coordinate, increases downwards.
     * 
     * @return
     */
    public int getY() {
        return ElementHelper.getAttributeAsInt(getJSObject(), "y");
    }

    /**
     * y Number y coordinate, increases downwards.
     * 
     * @param y
     */
    public void setY(int y) {
        ElementHelper.setAttribute(getJSObject(), "y", String.valueOf(y));
    }

    public boolean equals(GPoint other) {
        return GPointImpl.equals(getJSObject(), other.getJSObject());
    }

    public String toString() {
        return GPointImpl.toString(getJSObject());
    }
}
