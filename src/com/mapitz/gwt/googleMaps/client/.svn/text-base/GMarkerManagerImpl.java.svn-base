package com.mapitz.gwt.googleMaps.client;

class GMarkerManagerImpl {

    public static native JSObject create(JSObject map)/*-{
     return new $wnd.GMarkerManager(map);
     }-*/;

    public static native JSObject create(JSObject map, JSObject options)/*-{
     return new $wnd.GMarkerManager(map, options);
     }-*/;

    // addMarkers(markers, minZoom, mJSObject)
    public static native void addMarkers(JSObject self, JSObject array,
            int minZoom, int maxZoom)/*-{
     self.addMarkers(array, minZoom, maxZoom);
     }-*/;

    public static native void addMarkers(JSObject self, JSObject array,
            int minZoom)/*-{
     self.addMarkers(array, minZoom);
     }-*/;

    // addMarker(marker, minZoom, maxZoom?)
    public static native void addMarker(JSObject self, JSObject marker,
            int minZoom, int maxZoom)/*-{
     self.addMarker(marker, minZoom, maxZoom);
     }-*/;

    public static native void addMarker(JSObject self, JSObject marker,
            int minZoom)/*-{
     self.addMarker(marker, minZoom);
     }-*/;

    // refresh()
    public static native void refresh(JSObject self)/*-{
     self.refresh();
     }-*/;

    // getMarkerCount(zoom)
    public static native int getMarkerCount(JSObject self, int zoom)/*-{
     return self.getMarkerCount(zoom);
     }-*/;
}
