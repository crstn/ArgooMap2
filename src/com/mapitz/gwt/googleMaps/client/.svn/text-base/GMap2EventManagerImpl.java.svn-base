package com.mapitz.gwt.googleMaps.client;

class GMap2EventManagerImpl {
    // moveend none This event is fired when the change of the map view ends.
    public static native JSObject addOnMoveEndListener(
            GMap2EventMoveListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "moveend", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventMoveListener::onMoveEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // movestart none This event is fired when the map view starts changing.
    // This can be caused by dragging, in which case a dragstart event is also
    // fired, or by invocation of a method that changes the map view.
    public static native JSObject addOnMoveStartListener(
            GMap2EventMoveListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "movestart", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventMoveListener::onMoveStart(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // move none This event is fired, possibly repeatedly, while the map view is
    // changing.
    public static native JSObject addOnMoveListener(
            GMap2EventMoveListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "move", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventMoveListener::onMove(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // addmaptype type This event is fired when a map type is added to the map.
    public static native JSObject addOnAddMapTypeListener(
            GMap2EventMapTypeListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "addmaptype", 
     function(type)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onAddMapType(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventMapTypeListener;)(map, type, manager);
     }
     );
     }-*/;

    // removemaptype type This event is fired when a map type is removed from
    // the map.
    public static native JSObject addOnRemoveMapTypeListener(
            GMap2EventMapTypeListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "removemaptype", 
     function(type)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onRemoveMapType(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventMapTypeListener;)(map, type, manager);
     }
     );
     }-*/;

    // maptypechanged none This event is fired when another map type is
    // selected.
    public static native JSObject addOnMapTypeChangedListener(
            GMap2EventMapTypeListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "maptypechanged", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventMapTypeListener::onMapTypeChanged(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // click overlay, point This event is fired when the map is clicked with the
    // mouse. If the click was on a marker, then the marker is passed to the
    // event handler in the overlay argument, and a click event is also fired on
    // the marker. Otherwise, the geographical coordinates of the point that was
    // clicked are passed in the point argument.
    public static native JSObject addOnClickListener(
            GMap2EventClickListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "click", 
     function(overlay, point)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onClick(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventClickListener;)(map, overlay, point, manager);
     }
     );
     }-*/;

    // zoomend oldLevel, newLevel This event is fired when the map reaches a new
    // zoom level. The event handler receives the previous and the new zoom
    // level as arguments.
    public static native JSObject addOnZoomEndListener(
            GMap2EventZoomListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "zoomend", 
     function(oldLevel, newLevel)
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventZoomListener::onZoomEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;II)(map, oldLevel, newLevel);
     }
     );
     }-*/;

    // infowindowopen none This event is fired when the info window opens.
    public static native JSObject addOnInfoWindowOpenListener(
            GMap2EventInfoWindowListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "infowindowopen", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventInfoWindowListener::onInfoWindowOpen(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // infowindowclose none This event is fired when the info window closes. If
    // a currently open info window is reopened at a different point using
    // another call to openInfoWindow*(), then infowindowclose will fire first.
    public static native JSObject addOnInfoWindowCloseListener(
            GMap2EventInfoWindowListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "infowindowclose", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventInfoWindowListener::onInfoWindowClose(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // addoverlay overlay This event is fired when a single overlay is added to
    // the map by the method addOverlay(). The new overlay is passed as an
    // argument overlay to the event handler.
    public static native JSObject addOnAddOverlayListener(
            GMap2EventOverlayListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "addoverlay", 
     function(overlay)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onAddOverlay(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventOverlayListener;)(map, overlay, manager);
     }
     );
     }-*/;

    // removeoverlay overlay This event is fired when a single overlay is
    // removed by the method removeOverlay(). The overlay that was removed is
    // passed as an argument overlay to the event handler.
    public static native JSObject addOnRemoveOverlayListener(
            GMap2EventOverlayListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "removeoverlay", 
     function(overlay)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onRemoveOverlay(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventOverlayListener;)(map, overlay, manager);
     }
     );
     }-*/;

    // clearoverlays none This event is fired when all overlays are removed at
    // once by the method clearOverlays().
    public static native JSObject addOnClearOverlaysListener(
            GMap2EventOverlayListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "clearoverlays", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventOverlayListener::onClearOverlays(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // mouseout latlng This event is fired when the user moves the mouse off the
    // map.
    public static native JSObject addOnMouseOutListener(
            GMap2EventMouseListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "mouseout", 
     function(latlng)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onMouseOut(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventMouseListener;)(map, latlng, manager);
     }
     );
     }-*/;

    // mousemove latlng This event is fired when the user moves the mouse inside
    // the map.
    public static native JSObject addOnMouseMoveListener(
            GMap2EventMouseListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "mousemove", 
     function(latlng)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onMouseMove(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventMouseListener;)(map, latlng, manager);
     }
     );
     }-*/;

    // mouseover latlng This event is fired when the user moves the mouse over
    // the map from outside the map.
    public static native JSObject addOnMouseOverListener(
            GMap2EventMouseListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "mouseover", 
     function(latlng)
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onMouseOver(Lcom/mapitz/gwt/googleMaps/client/GMap2;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GMap2EventMouseListener;)(map, latlng, manager);
     }
     );
     }-*/;

    // dragstart none This event is fired when the user starts dragging the map.
    public static native JSObject addOnDragStartListener(
            GMap2EventDragListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "dragstart", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventDragListener::onDragStart(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // drag none This event is repeatedly fired while the user drags the map.
    public static native JSObject addOnDragListener(
            GMap2EventDragListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "drag", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventDragListener::onDrag(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // dragend none This event is fired when the user stops dragging the map.
    public static native JSObject addOnDragEndListener(
            GMap2EventDragListener manager, JSObject source, GMap2 map)/*-{		
     return $wnd.GEvent.addListener(source, "dragend", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventDragListener::onDragEnd(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

    // // load none This event is fired when the map setup is complete, and
    // isLoaded() would return true. This means position, zoom, and map type are
    // all initialized, but tile images may still be loading. (Since 2.52)
    // //TODO this works, but an exception gets thrown in the background
    public static native JSObject addOnLoadListener(
            GMap2EventLoadListener manager, JSObject source, GMap2 map)/*-{
     return $wnd.GEvent.addListener(source, "load", 
     function()
     {
     manager.@com.mapitz.gwt.googleMaps.client.GMap2EventLoadListener::onLoad(Lcom/mapitz/gwt/googleMaps/client/GMap2;)(map);
     }
     );
     }-*/;

}
