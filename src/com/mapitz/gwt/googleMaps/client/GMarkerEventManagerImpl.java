package com.mapitz.gwt.googleMaps.client;

class GMarkerEventManagerImpl {
    /*
     * click none This event is fired when the marker icon was clicked. Notice
     * that this event will also fire for the map, with the marker passed as the
     * first argument to the event handler there.
     */
    public static native JSObject addOnClickListener(
            GMarkerEventClickListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "click", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventClickListener::onClick(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * click none Clears all instance listeners for a given GMarker
     */
    public static native void clearInstanceListeners(GMarker source)/*-{		
     $wnd.GEvent.clearInstanceListeners(source);
     }-*/;

    /*
     * Undocumented DragStart Listener
     */
    public static native JSObject addOnDragStartListener(
            GMarkerEventDragListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "dragstart", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventDragListener::onDragStart(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * Undocumented DragEnd Listener
     */
    public static native JSObject addOnDragEndListener(
            GMarkerEventDragListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "dragend", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventDragListener::onDragEnd(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * dblclick none This event is fired when the marker icon was
     * double-clicked. Notice that this event will not fire for the map, because
     * the map centers on double-click as a hardwired behavior.
     */
    public static native JSObject addOnDblClickListener(
            GMarkerEventClickListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "dblclick", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventClickListener::onDblClick(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * mousedown none This event is fired when the DOM mousedown event is fired
     * on the marker icon. Notice that the marker will stop the mousedown DOM
     * event, so that it doesn't cause the map to start dragging.
     */
    public static native JSObject addOnMouseDownListener(
            GMarkerEventMouseListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "mousedown", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventMouseListener::onMouseDown(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * mouseup none This event is fired for the DOM mouseup on the marker.
     * Notice that the marker will not stop the mousedown DOM event, because it
     * will not confuse the drag handler of the map.
     */
    public static native JSObject addOnMouseUpListener(
            GMarkerEventMouseListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "mouseup", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventMouseListener::onMouseUp(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * mouseover none This event is fired when the mouse enters the area of the
     * marker icon.
     */
    public static native JSObject addOnMouseOverListener(
            GMarkerEventMouseListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "mouseover", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventMouseListener::onMouseOver(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * mouseout none This event is fired when the mouse leaves the area of the
     * marker icon.
     */
    public static native JSObject addOnMouseOutListener(
            GMarkerEventMouseListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "mouseout", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventMouseListener::onMouseOut(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * infowindowopen none This event is fired when the info window of the map
     * was opened through this marker.
     */
    public static native JSObject addOnInfoWindowOpenListener(
            GMarkerEventInfoWindowListener manager, JSObject source,
            GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "infowindowopen", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventInfoWindowListener::onInfoWindowOpen(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * infowindowclose none This event is fired when the info window of the map
     * that was opened through this marker is closed again. This happens when
     * either the info window was closed, or when it was opened on another
     * marker, or on the map.
     */
    public static native JSObject addOnInfoWindowCloseListener(
            GMarkerEventInfoWindowListener manager, JSObject source,
            GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "infowindowclose", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventInfoWindowListener::onInfoWindowClose(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;

    /*
     * remove none This event is fired when the marker is removed from the map,
     * using GMap2.removeOverlay() or GMap2.clearOverlays().
     */
    public static native JSObject addOnRemoveListener(
            GMarkerEventListener manager, JSObject source, GMarker marker)/*-{		
     return $wnd.GEvent.addListener(source, "remove", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMarkerEventListener::onRemove(Lcom/mapitz/gwt/googleMaps/client/GMarker;)(marker);
     }
     );
     }-*/;
}
