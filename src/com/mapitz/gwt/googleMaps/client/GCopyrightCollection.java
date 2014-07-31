package com.mapitz.gwt.googleMaps.client;

/**
 * You use this class to manage copyright messages displayed on maps of custom
 * map type. If you don't implement custom map types, then you don't need to use
 * this class. A copyright collection contains information about which copyright
 * to display for which region on the map at which zoom level. This is very
 * important for map types that display heterogenous data such as the satellite
 * map type.
 * 
 * @author aglaforge
 * 
 */
public class GCopyrightCollection extends GoogleMapsWidget {
    protected GCopyrightCollection(JSObject element) {
        super(element);
    }

    public static GCopyrightCollection narrowToGCopyrightCollection(JSObject e) {
        return (e == null) ? null : new GCopyrightCollection(e);
    }

    /**
     * GCopyrightCollection(prefix) Copyright messages produced from this
     * copyright collection will have the common prefix given as the argument.
     * Example: "Imagery (C) 2006"
     */
    public GCopyrightCollection(String prefix) {
        super(GCopyrightCollectionImpl.create(prefix));
    }

    /**
     * GCopyrightCollection() Copyright messages produced from this copyright
     * collection will have the common prefix given as the argument. Example:
     * "Imagery (C) 2006"
     */
    public GCopyrightCollection() {
        super(GCopyrightCollectionImpl.create());
    }

    /**
     * addCopyright(copyright) none Adds a copyright information object to the
     * collection.
     */
    public void addCopyright(GCopyright copyright) {
        GCopyrightCollectionImpl.addCopyright(getJSObject(), copyright
                .getJSObject());
    }

    /**
     * getCopyrights(bounds, zoom) Array of String Returns all copyright strings
     * that are pertinent for the given map region at the given zoom level.
     * Example: [ "Google", "Keyhole" ]
     */
    public String[] getCopyrights(GLatLngBounds bounds, int zoom) {
        JSObject e = GCopyrightCollectionImpl.getCopyrights(getJSObject(),
                bounds.getJSObject(), zoom);
        if (e == null)
            return null;
        return new JStringArray(e).toArray();
    }

    /**
     * getCopyrightNotice(bounds, zoom) String Returns the prefix and all
     * relevant copyright strings that are pertinent for the given map region at
     * the given zoom level. Example: "Imagery (C) 2006 Google, Keyhole"
     */
    public String getCopyrightNotice(GLatLngBounds bounds, int zoom) {
        return GCopyrightCollectionImpl.getCopyrightNotice(getJSObject(),
                bounds.getJSObject(), zoom);
    }

    // TODO Add Event
}
