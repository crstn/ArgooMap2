package com.mapitz.gwt.googleMaps.client;

/**
 * A GSize is the size in pixels of a rectangular area of the map. The size
 * object has two parameters, width and height. Width is a difference in the
 * x-coordinate; height is a difference in the y-coordinate, of points.
 * <br/>Notice that while the two parameters of a GSize are accessible as
 * properties width and height, it is better to never modify them, but to create
 * a new object with different paramaters instead.
 * 
 * @author aglaforge
 * 
 */
public class GSize extends GOptionBase {
    public GSize(int width, int height) {
        super(GSizeImpl.create(width, height));
    }

    protected GSize(JSObject element) {
        super(element);
    }

    public static GSize narrowToGSize(JSObject element) {
        return (element == null) ? null : new GSize(element);
    }

    public int getHeight() {
        return getAttributeAsInt("height");
    }

    public void setHeight(int val) {
        setAttribute("height", val);
    }

    public int getWidth() {
        return getAttributeAsInt("width");
    }

    public void setWidth(int val) {
        setAttribute("width", val);
    }

    public boolean equals(GSize other) {
        return GSizeImpl.equals(getJSObject(), other.getJSObject());
    }
}
