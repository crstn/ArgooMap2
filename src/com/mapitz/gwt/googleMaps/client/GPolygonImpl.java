package com.mapitz.gwt.googleMaps.client;

class GPolygonImpl {
    public static native JSObject create(JSObject points)/*-{
     return new $wnd.GPolygon(points);
     }-*/;

    public static native JSObject create(JSObject points, String strokeColor,
            int strokeWeight, double strokeOpacity, String fillColor,
            double fillOpacity)/*-{
     return new $wnd.GPolygon(points, strokeColor, strokeWeight, strokeOpacity, fillColor, fillOpacity);
     }-*/;

    // getVertexCount()
    public static native int getVertexCount(JSObject self)/*-{
     return self.getVertexCount();
     }-*/;

    public static native JSObject getVertex(JSObject self, int index)/*-{
     return self.getVertex(index);
     }-*/;
}
