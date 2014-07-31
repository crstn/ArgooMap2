package com.mapitz.gwt.googleMaps.client;

/**
 * GLatLng is a point in geographical coordinates longitude and latitude.
 * <br/>Notice that although usual map projections associate longitude with the
 * x-coordinate of the map, and latitude with the y-coordinate, the latitude
 * cooridnate is always written first, followed by the longitude, as it is
 * custom in cartography. <br/>Notice also that you cannot modify the
 * coordinates of a GLatLng. If you want to compute another point, you have to
 * create a new one.
 * 
 * @author aglaforge
 * 
 */
public class GLatLng extends GoogleMapsWidget {
    protected GLatLng(JSObject element) {
        super(element);
    }

    public static GLatLng narrowToGLatLng(JSObject element) {
        return (element == null) ? null : new GLatLng(element);
    }

    /**
     * Notice the ordering of latitude and longitude. If the unbounded flag is
     * true, then the numbers will be used as passed, oterwise latitude will be
     * clamped to lie between -90 degrees and +90 degrees, and longitude will be
     * wrapped to lie between -180 degrees and +180 degrees.
     */
    public GLatLng(double lat, double lng) {
        this(GLatLngImpl.create(lat, lng));
    }

    /**
     * Notice the ordering of latitude and longitude. If the unbounded flag is
     * true, then the numbers will be used as passed, oterwise latitude will be
     * clamped to lie between -90 degrees and +90 degrees, and longitude will be
     * wrapped to lie between -180 degrees and +180 degrees.
     */
    public GLatLng(double lat, double lng, boolean unbounded) {
        this(GLatLngImpl.create(lat, lng, unbounded));
    }

    /**
     * Returns the latitude coordinate in degrees, as a number between -90 and
     * +90. If the unbounded flag was set in the constructor, this coordinate
     * can be outside this interval.
     */
    public double lat() {
        return GLatLngImpl.lat(getJSObject());
    }

    /**
     * Returns the longitude coordinate in degrees, as a number between -180 and
     * +180. If the unbounded flag was set in the constructor, this coordinate
     * can be outside this interval.
     */
    public double lng() {
        return GLatLngImpl.lng(getJSObject());
    }

    /**
     * Returns the latitude coordinate in radians, as a number between -PI/2 and
     * +PI/2. If the unbounded flag was set in the constructor, this coordinate
     * can be outside this interval.
     */
    public double latRadians() {
        return GLatLngImpl.latRadians(getJSObject());
    }

    /**
     * Returns the longitude coordinate in radians, as a number between -PI and
     * +PI. If the unbounded flag was set in the constructor, this coordinate
     * can be outside this interval.
     */
    public double lngRadians() {
        return GLatLngImpl.lngRadians(getJSObject());
    }

    /**
     * Returns the distance, in meters, from this point to the given point. The
     * earth is approximated as a sphere, hence the distance could be off by as
     * much as 0.3%.
     */
    public double distanceFrom(GLatLng other) {
        return GLatLngImpl.distanceFrom(getJSObject(), other.getJSObject());
    }

    /**
     * Returns true if the other size has equal components, within certain
     * roundoff margins.
     */
    public boolean equals(GLatLng other) {
        return GLatLngImpl.equals(getJSObject(), other.getJSObject());
    }

    /**
     * Returns a string that represents this point that is suitable for use as a
     * URL paramater value. It contains the latitude and the longitide in
     * degrees to 6 decimal digits, in this order, separated by a comma, without
     * whitespace.
     */
    public String toUrlValue() {
        return GLatLngImpl.toUrlValue(getJSObject());
    }

    public String toString() {
        return GLatLngImpl.toString(getJSObject());
    }
}
