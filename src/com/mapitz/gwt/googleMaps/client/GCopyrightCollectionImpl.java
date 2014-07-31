package com.mapitz.gwt.googleMaps.client;

class GCopyrightCollectionImpl {
    /*
     * GCopyrightCollection(prefix) Copyright messages produced from this
     * copyright collection will have the common prefix given as the argument.
     * Example: "Imagery (C) 2006"
     */
    public static native JSObject create(String prefix)/*-{
     return new $wnd.GCopyrightCollection(prefix);
     }-*/;

    /*
     * GCopyrightCollection() Copyright messages produced from this copyright
     * collection will have the common prefix given as the argument. Example:
     * "Imagery (C) 2006"
     */
    public static native JSObject create()/*-{
     return new $wnd.GCopyrightCollection();
     }-*/;

    /*
     * addCopyright(copyright) none Adds a copyright information object to the
     * collection.
     */
    public static native void addCopyright(JSObject self, JSObject copyright)/*-{
     self.addCopyright(copyright);
     }-*/;

    /*
     * getCopyrights(bounds, zoom) Array of String Returns all copyright strings
     * that are pertinent for the given map region at the given zoom level.
     * Example: [ "Google", "Keyhole" ]
     */
    public static native JSObject getCopyrights(JSObject self, JSObject bounds,
            int zoom)/*-{
     self.getCopyrights(bounds, zoom);
     }-*/;

    /*
     * getCopyrightNotice(bounds, zoom) String Returns the prefix and all
     * relevant copyright strings that are pertinent for the given map region at
     * the given zoom level. Example: "Imagery (C) 2006 Google, Keyhole"
     */
    public static native String getCopyrightNotice(JSObject self,
            JSObject bounds, int zoom)/*-{
     self.getCopyrightNotice(bounds, zoom);
     }-*/;
}
