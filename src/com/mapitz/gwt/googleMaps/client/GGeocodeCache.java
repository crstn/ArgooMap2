package com.mapitz.gwt.googleMaps.client;

/**
 * Creates a new cache for storing a map from adresses to locations. The
 * constructor immediately calls the GGeocodeCache.reset method. (Since 2.55)
 * 
 * @author aglaforge
 * 
 */
public class GGeocodeCache extends GoogleMapsWidget {

    protected GGeocodeCache(JSObject element) {
        super(element);
    }

    public static GGeocodeCache narrowToGGeocodeCache(JSObject e) {
        return (e == null) ? null : new GGeocodeCache(e);
    }

    public GGeocodeCache() {
        this(GGeocodeCacheImpl.create());
    }

    public void reset() {
        GGeocodeCacheImpl.reset(getJSObject());
    }

}
