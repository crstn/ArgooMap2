package com.mapitz.gwt.googleMaps.client;

class GMarkerManagerEventManagerImpl {
    public static native JSObject addOnChangedListener(
            GMarkerManagerEventListener listener, JSObject source)/*-{		
     return $wnd.GEvent.addListener(source, "changed", 
     function(bounds, markerCount)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onChanged(Lcom/mapitz/gwt/googleMaps/client/JSObject;ILcom/mapitz/gwt/googleMaps/client/GMarkerManagerEventListener;)(bounds, markerCount, listener);
     }
     );
     }-*/;
}
