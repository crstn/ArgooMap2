package com.mapitz.gwt.googleMaps.client;

public class GPolygon extends GOverlay {

    public GPolygon(JSObject element) {
        super(element);
    }

    public static GPolygon narrowToGPolygon(JSObject element) {
        return (element == null) ? null : new GPolygon(element);
    }

    public GPolygon(GLatLng[] points, String strokeColor, int strokeWeight,
            double strokeOpacity, String fillColor, double fillOpacity) {
        this(GPolygonImpl.create(ElementHelper.arrayConvert(points),
                strokeColor, strokeWeight, strokeOpacity, fillColor,
                fillOpacity));
    }

    public GPolygon(GLatLng[] points) {
        this(GPolygonImpl.create(ElementHelper.arrayConvert(points)));
    }

    public int getVertextCount() {
        return GPolygonImpl.getVertexCount(getJSObject());
    }

    public GLatLng getVertex(int index) {
        return GLatLng.narrowToGLatLng(GPolygonImpl.getVertex(getJSObject(),
                index));
    }

}
