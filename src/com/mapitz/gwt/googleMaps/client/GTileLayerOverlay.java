package com.mapitz.gwt.googleMaps.client;

public class GTileLayerOverlay extends GOverlay {

    protected GTileLayerOverlay(JSObject element) {
        super(element);
    }

    public static GTileLayerOverlay narrowToGTileLayerOverlay(JSObject element) {
        return (element == null) ? null : new GTileLayerOverlay(element);
    }

    public GTileLayerOverlay(GTileLayer tilelayer) {
        this(GTileLayerOverlayImpl.create(tilelayer.getJSObject()));
    }

}
