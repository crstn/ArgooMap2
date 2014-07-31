package com.mapitz.gwt.googleMaps.client;

/**
 * This implementation of the GProjection interface for the mercator projection
 * is used by all predefined map types.
 * 
 * @author aglaforge
 * 
 */
public class GMercatorProjection extends GProjection {
    protected GMercatorProjection(JSObject element) {
        super(element);
    }

    public static GMercatorProjection narrowToGMercatorProjection(
            JSObject element) {
        return (element == null) ? null : new GMercatorProjection(element);
    }

    public GMercatorProjection(int zoomlevels) {
        this(GMercatorProjectionImpl.create(zoomlevels));
    }

}
