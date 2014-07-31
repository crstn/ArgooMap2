package com.mapitz.gwt.googleMaps.client;

/**
 * A GLatLngBounds instance represents a rectangle in geographical coordinates,
 * including one that crosses the 180 degrees meridian.
 * 
 * @author aglaforge
 * 
 */
public class GLatLngBounds extends GoogleMapsWidget {
    protected GLatLngBounds(JSObject element) {
        super(element);
    }

    public static GLatLngBounds narrowToGLatLngBounds(JSObject element) {
        return (element == null) ? null : new GLatLngBounds(element);
    }

    public GLatLngBounds() {
        super(GLatLngBoundsImpl.create());
    }

    public GLatLngBounds(GLatLng sw, GLatLng ne) {
        super(GLatLngBoundsImpl.create(sw.getJSObject(), ne.getJSObject()));
    }

    /**
     * equals(other) Boolean Returns true iff all parameters in this rectangle
     * are equal to the parameters of the other, within a certain roundoff
     * margin.
     * 
     * @param other
     * @return
     */
    public boolean equals(GLatLngBounds other) {
        return GLatLngBoundsImpl.equals(getJSObject(), other.getJSObject());
    }

    /**
     * contains(latlng) Boolean Returns true iff the geographical coordinates of
     * the point lie within this rectangle.
     * 
     * @param latlng
     * @return
     */
    public boolean contains(GLatLng latlng) {
        return GLatLngBoundsImpl.contains(getJSObject(), latlng.getJSObject());
    }

    /**
     * intersects(other) Boolean What the name says.
     * 
     * @param other
     * @return
     */
    public boolean intersects(GLatLngBounds other) {
        return GLatLngBoundsImpl.intersects(getJSObject(), other.getJSObject());
    }

    /**
     * containsBounds(other) Boolean What the name says.
     * 
     * @param other
     * @return
     */
    public boolean containsBounds(GLatLngBounds other) {
        return GLatLngBoundsImpl.containsBounds(getJSObject(), other
                .getJSObject());
    }

    /**
     * extend(latlng) none Enlarges this rectangle such that it contains the
     * given point. In longitude direction, it is enlarged in the smaller of the
     * two possible ways. If both are equal, it is enlarged at the eastern
     * boundary.
     * 
     * @param latlng
     */
    public void extend(GLatLng latlng) {
        GLatLngBoundsImpl.extend(getJSObject(), latlng.getJSObject());
    }

    /**
     * getSouthWest() GLatLng Returns the point at the south-west corner of the
     * rectangle.
     * 
     * @return
     */
    public GLatLng getSouthWest() {
        return GLatLng.narrowToGLatLng(GLatLngBoundsImpl
                .getSouthWest(getJSObject()));
    }

    /**
     * getNorthEast() GLatLng Returns the point at the north-east corner of the
     * rectangle.
     * 
     * @return
     */
    public GLatLng getNorthEast() {
        return GLatLng.narrowToGLatLng(GLatLngBoundsImpl
                .getNorthEast(getJSObject()));
    }

    /**
     * toSpan() GLatLng Returns a GLatLng whose cordinates represent the size of
     * this rectangle.
     * 
     * @return
     */
    public GLatLng toSpan() {
        return GLatLng.narrowToGLatLng(GLatLngBoundsImpl.toSpan(getJSObject()));
    }

    /**
     * isFullLat() Boolean Returns true if this rectangle extends from the south
     * pole to the north pole.
     * 
     * @return
     */
    public boolean isFullLat() {
        return GLatLngBoundsImpl.isFullLat(getJSObject());
    }

    /**
     * isFullLng() Boolean Returns true if this rectangle extends fully around
     * the earth in the longitude direction.
     * 
     * @return
     */
    public boolean isFullLng() {
        return GLatLngBoundsImpl.isFullLng(getJSObject());
    }

    /**
     * isEmpty() Boolean Returns true if this rectangle is empty.
     * 
     * @return
     */
    public boolean isEmpty() {
        return GLatLngBoundsImpl.isEmpty(getJSObject());
    }

    /**
     * getCenter() GLatLng Returns the point at the center of the rectangle.
     * (Since 2.52)
     * 
     * @return
     */
    public GLatLng getCenter() {
        return GLatLng.narrowToGLatLng(GLatLngBoundsImpl
                .getCenter(getJSObject()));
    }
}
