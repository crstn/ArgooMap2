package com.mapitz.gwt.googleMaps.client;

public class ElementBridge {

    public static void onHandle(JSObject source, JSObject args,
            GEventHandler handler) {
        handler.onHandle(source, (args == null) ? null : new JObjectArray(args)
                .toArray());
    }

    public static void onInitialize(JSObject map, GOverlayEvents overlay) {
        overlay.onInitialize(GMap2.narrowToGMap2(map));
    }

    public static void onChanged(JSObject bounds, int markerCount,
            GMarkerManagerEventListener listener) {
        listener.onChanged(GBounds.narrowToGBounds(bounds), markerCount);
    }

    public static void onSuccess(JSObject latlng,
            GGeocodeResultListener listener) {
        listener.onSuccess(GLatLng.narrowToGLatLng(latlng));
    }

    public static void onClick(GMap2 map, JSObject overlay, JSObject point,
            GMap2EventClickListener listener) {
        listener.onClick(map, GOverlay.narrowToGOverlay(overlay), GLatLng
                .narrowToGLatLng(point));
    }

    public static void onAddMapType(GMap2 map, JSObject type,
            GMap2EventMapTypeListener listener) {
        listener.onAddMapType(map, GMapType.narrowToGMapType(type));
    }

    public static void onRemoveMapType(GMap2 map, JSObject type,
            GMap2EventMapTypeListener listener) {
        listener.onRemoveMapType(map, GMapType.narrowToGMapType(type));
    }

    public static void onMouseMove(GMap2 map, JSObject latlng,
            GMap2EventMouseListener listener) {
        listener.onMouseMove(map, GLatLng.narrowToGLatLng(latlng));
    }

    public static void onMouseOver(GMap2 map, JSObject latlng,
            GMap2EventMouseListener listener) {
        listener.onMouseOver(map, GLatLng.narrowToGLatLng(latlng));
    }

    public static void onMouseOut(GMap2 map, JSObject latlng,
            GMap2EventMouseListener listener) {
        listener.onMouseOut(map, GLatLng.narrowToGLatLng(latlng));
    }

    public static void onAddOverlay(GMap2 map, JSObject overlay,
            GMap2EventOverlayListener listener) {
        listener.onAddOverlay(map, GOverlay.narrowToGOverlay(overlay));
    }

    public static void onRemoveOverlay(GMap2 map, JSObject overlay,
            GMap2EventOverlayListener listener) {
        listener.onRemoveOverlay(map, GOverlay.narrowToGOverlay(overlay));
    }
}
