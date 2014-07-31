package com.mapitz.gwt.googleMaps.client;

public class GBounds extends GOptionBase {

    protected GBounds(JSObject element) {
        super(element);
    }

    public static GBounds narrowToGBounds(JSObject element) {
        return (element == null) ? null : new GBounds(element);
    }

    public GBounds(GPoint[] points) {
        this(GBoundsImpl.create(ElementHelper.arrayConvert(points)));
    }

    public GBounds(GLatLng[] points) {
        this(GBoundsImpl.create(ElementHelper.arrayConvert(points)));
    }

    /**
     * minX Number The x coordinate of the left edge of the rectangle.
     * 
     * @param x
     */
    public void setMinX(int value) {
        setAttribute("minX", value);
    }

    /**
     * minX Number The x coordinate of the left edge of the rectangle.
     * 
     * @return
     */
    public int getMinX() {
        return getAttributeAsInt("minX");
    }

    /**
     * minY Number The y coordinate of the top edge of the rectangle.
     * 
     * @param value
     */
    public void setMinY(int value) {
        setAttribute("minY", value);
    }

    /**
     * minY Number The y coordinate of the top edge of the rectangle.
     * 
     * @return
     */
    public int getMinY() {
        return getAttributeAsInt("minY");
    }

    /**
     * maxX Number The x coordinate of the right edge of the rectangle.
     * 
     * @param value
     */
    public void setMaxX(int value) {
        setAttribute("maxX", value);
    }

    /**
     * maxX Number The x coordinate of the right edge of the rectangle.
     * 
     * @return
     */
    public int getMaxX() {
        return getAttributeAsInt("maxX");
    }

    /**
     * maxY Number The y coordinate of the bottom edge of the rectangle.
     * 
     * @param value
     */
    public void setMaxY(int value) {
        setAttribute("maxY", value);
    }

    /**
     * maxY Number The y coordinate of the bottom edge of the rectangle.
     * 
     * @return
     */
    public int getMaxY() {
        return getAttributeAsInt("maxY");
    }

    /**
     * min() GPoint The point at the upper left corner of the box.
     */
    public GPoint min() {
        return GPoint.narrowToGPoint(GBoundsImpl.min(getJSObject()));
    }

    /**
     * mid() GPoint The point at the center of the box.
     * 
     * @return
     */
    public GPoint mid() {
        return GPoint.narrowToGPoint(GBoundsImpl.mid(getJSObject()));
    }

    /**
     * max() GPoint The point at the lower right corner of the box.
     */
    public GPoint max() {
        return GPoint.narrowToGPoint(GBoundsImpl.max(getJSObject()));
    }

    /**
     * containsBounds(other) Boolean Returns true iff the other box is entirely
     * contained in this box.
     * 
     * @param other
     * @return
     */
    public boolean containsBounds(GBounds other) {
        return GBoundsImpl.containsBounds(getJSObject(), other.getJSObject());
    }

    /**
     * extend(point) none Enlarges this box so that the point is also contained
     * in this box.
     * 
     * @param point
     */
    public void extend(GPoint point) {
        GBoundsImpl.extend(getJSObject(), point.getJSObject());
    }

    /**
     * intersection(other) GBounds Returns the box by which this box overlaps
     * the other box. If there is no overlap, returns an empty box.
     * 
     * @param other
     * @return
     */
    public GBounds intersection(GBounds other) {
        return intersection(this, other);
    }

    /**
     * intersection(other) GBounds Returns the box by which this box overlaps
     * the other box. If there is no overlap, returns an empty box.
     * 
     * @param other
     * @return
     */
    public static GBounds intersection(GBounds original, GBounds other) {
        return GBounds.narrowToGBounds(GBoundsImpl.intersection(original
                .getJSObject(), other.getJSObject()));
    }

    /**
     * undocumented from v2.63 returns true if the two GBounds are equal
     * 
     * @param other
     * @return
     */
    public boolean equals(GBounds other) {
        return GBoundsImpl.equals(getJSObject(), other.getJSObject());
    }

    /**
     * undocumented Returns a new GBounds that is a copy of this one.
     * 
     * @return
     */
    public GBounds copy() {
        return GBounds.narrowToGBounds(GBoundsImpl.copy(getJSObject()));
    }

    public String toString() {
        return GBoundsImpl.toString(getJSObject());
    }
}
