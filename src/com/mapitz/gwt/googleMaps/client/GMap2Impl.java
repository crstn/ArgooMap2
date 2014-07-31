package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GMap2Impl {

    public static native JSObject create(Element div)/*-{
     return new $wnd.GMap2(div);
     }-*/;

    public static native JSObject create(Element div, JSObject options)/*-{
     return new $wnd.GMap2(div, options);
     }-*/;

    public static native void enableAutomatedCheckResizeOnMoveEnd(JSObject map)/*-{		
     $wnd.GEvent.addListener(map, "moveend", 
     function()
     {
     map.checkResize();
     }
     );
     }-*/;

    public static native void enableCheckResizeOnLoad(JSObject map)/*-{		
     $wnd.GEvent.addListener(map, "load", 
     function()
     {
     map.checkResize();
     }
     );
     }-*/;

    public static native void disableDragging(JSObject map)/*-{
     map.disableDragging();
     }-*/;

    public static native void disableInfoWindow(JSObject map)/*-{
     map.disableInfoWindow();
     }-*/;

    public static native boolean draggingEnabled(JSObject map)/*-{
     return map.draggingEnabled();
     }-*/;

    public static native void enableDragging(JSObject map)/*-{
     map.enableDragging();
     }-*/;

    public static native void enableInfoWindow(JSObject map)/*-{
     map.enableInfoWindow();
     }-*/;

    public static native boolean GBrowserIsCompatible()/*-{
     return $wnd.GBrowserIsCompatible();
     }-*/;

    public static native JSObject getBounds(JSObject map)/*-{
     return map.getBounds() ? map.getBounds() : null;
     }-*/;

    public static native int getBoundsZoomLevel(JSObject map, JSObject bounds)/*-{
     return map.getBoundsZoomLevel(bounds);
     }-*/;

    public static native JSObject getCenter(JSObject map)/*-{
     return map.getCenter();
     }-*/;

    public static native JSObject getSize(JSObject map)/*-{
     return map.getSize();
     }-*/;

    public static native int getZoom(JSObject map)/*-{
     return map.getZoom();
     }-*/;

    public static native boolean infoWindowEnabled(JSObject map)/*-{
     return map.infoWindowEnabled();
     }-*/;

    // enableDoubleClickZoom() none Enables double click to zoom in and out
    // (disabled by default). (Since 2.58)
    public static native void enableDoubleClickZoom(JSObject map)/*-{
     map.enableDoubleClickZoom();
     }-*/;

    // disableDoubleClickZoom() none Disables double click to zoom in and out.
    // (Since 2.58)
    public static native void disableDoubleClickZoom(JSObject map)/*-{
     map.disableDoubleClickZoom();
     }-*/;

    // doubleClickZoomEnabled() Boolean Returns true iff double click to zoom is
    // enabled. (Since 2.58)
    public static native boolean doubleClickZoomEnabled(JSObject map)/*-{
     return map.doubleClickZoomEnabled();
     }-*/;

    // enableContinuousZoom() none Enables continuous smooth zooming for select
    // browsers (disabled by default). (Since 2.58)
    public static native void enableContinuousZoom(JSObject map)/*-{
     map.enableContinuousZoom();
     }-*/;

    // disableContinuousZoom() none Disables continuous smooth zooming. (Since
    // 2.58)
    public static native void disableContinuousZoom(JSObject map)/*-{
     map.disableContinuousZoom();
     }-*/;

    // continuousZoomEnabled() Boolean Returns true iff continuous smooth
    // zooming is enabled. (Since 2.58)
    public static native boolean continuousZoomEnabled(JSObject map)/*-{
     return map.continuousZoomEnabled();
     }-*/;

    public static native boolean isLoaded(JSObject map)/*-{
     return map.isLoaded();
     }-*/;

    // setCenter(center, zoom?, type?) none Sets the map view to the given
    // center. Optionally, also sets zoom level and map type. The map type must
    // be known to the map. See the constructor, and the method addMapType().
    // This method must be called first after construction to set the initial
    // state of the map. It is an error to call other operations on the map
    // after construction.

    public static native void setCenter(JSObject map, JSObject latlng,
            int zoomlevel, JSObject type)/*-{
     map.setCenter(latlng, zoomlevel, type);
     }-*/;

    public static native void setCenter(JSObject map, JSObject latlng,
            int zoomlevel)/*-{
     map.setCenter(latlng, zoomlevel);
     }-*/;

    public static native void setCenter(JSObject map, JSObject latlng)/*-{
     map.setCenter(latlng);
     }-*/;

    // panTo(center) none Changes the center point of the map to the given
    // point. If the point is already visible in the current map view, change
    // the center in a smooth animation.
    public static native void panTo(JSObject map, JSObject center)/*-{
     map.panTo(center);
     }-*/;

    // setZoom(level) none Sets the zoom level to the given new value.
    public static native void setZoom(JSObject map, int level)/*-{
     map.setZoom(level);
     }-*/;

    // panBy(distance) none Starts a pan animation by the given distance in
    // pixels.
    public static native void panBy(JSObject map, int distance)/*-{
     map.panBy(distance);
     }-*/;

    // panDirection(dx, dy) none Starts a pan animation by half the width of the
    // map in the indicated directions. +1 is right and down, -1 is left and up,
    // respectively.
    public static native void panDirection(JSObject map, int dx, int dy)/*-{
     map.panDirection(dx, dy);
     }-*/;

    // zoomIn() none Increments zoom level by one.
    public static native void zoomIn(JSObject map)/*-{
     map.zoomIn();
     }-*/;

    // zoomOut() none Decrements zoom level by one.
    public static native void zoomOut(JSObject map)/*-{
     map.zoomOut();
     }-*/;

    // savePosition() none Stores the current map position and zoom level for
    // later recall by returnToSavedPosition().
    public static native void savePosition(JSObject map)/*-{
     map.savePosition();
     }-*/;

    // returnToSavedPosition() none Restores the map view that was saved by
    // savePosition().
    public static native void returnToSavedPosition(JSObject map)/*-{
     map.returnToSavedPosition();
     }-*/;

    // checkResize() none Notifies the map of a change of the size of its
    // container. Call this method after the size of the container DOM object
    // has changed, so that the map can adjust itself to fit the new size.
    public static native void checkResize(JSObject map)/*-{
     map.checkResize();
     }-*/;

    /*
     * addControl(control, position?) none Adds the control to the map. The
     * position on the map is determined by the optional position argument. If
     * this argument is absent, the default position of the control is used, as
     * determined by the GControl.getDefaultPosition() method. A control
     * instance must not be added more than once to the map.
     */
    public static native void addControl(JSObject map, JSObject control,
            JSObject position)/*-{
     map.addControl(control, position);
     }-*/;

    /*
     * addControl(control, position?) none Adds the control to the map. The
     * position on the map is determined by the optional position argument. If
     * this argument is absent, the default position of the control is used, as
     * determined by the GControl.getDefaultPosition() method. A control
     * instance must not be added more than once to the map.
     */
    public static native void addControl(JSObject map, JSObject control)/*-{
     map.addControl(control);
     }-*/;

    /*
     * removeControl(control) none Removes the control from the map. It does
     * nothing if the control was never added to the map.
     */
    public static native void removeControl(JSObject map, JSObject control)/*-{
     map.removeControl(control);
     }-*/;

    /*
     * getContainer() Node Returns the DOM object that contains the map. Used by
     * GControl.initialize().
     */
    public static native Element getContainer(JSObject map)/*-{
     return map.getContainer();
     }-*/;

    /*
     * getMapTypes() Array of GMapType Returns the array of map types registered
     * with this map.
     */
    public static native JSObject getMapTypes(JSObject map)/*-{
     var ret = map.getMapTypes();
     return (ret === undefined) ? null : ret;
     }-*/;

    /*
     * getCurrentMapType() GMapType Returns the currently selected map type.
     */
    public static native JSObject getCurrentMapType(JSObject map)/*-{
     return map.getCurrentMapType();
     }-*/;

    /*
     * setMapType(type) none Selects the given new map type. The type must be
     * known to the map. See the constructor, and the method addMapType().
     */
    public static native void setMapType(JSObject map, JSObject type)/*-{
     map.setMapType(type);
     }-*/;

    /*
     * addMapType(type) none Adds a new map type to the map. See section
     * GMapType for how to define custom map types.
     */
    public static native void addMapType(JSObject map, JSObject type)/*-{
     map.addMapType(type);
     }-*/;

    /*
     * removeMapType(type) none Removes the map type from the map. Will update
     * the set of buttons displayed by the GMapTypeControl and fire the
     * removemaptype event.
     */
    public static native void removeMapType(JSObject map, JSObject type)/*-{
     map.removeMapType(type);
     }-*/;

    /*
     * addOverlay(overlay) none Adds an overlay to the map and fires the
     * addoverlay event.
     */
    public static native void addOverlay(JSObject map, JSObject overlay)/*-{
     map.addOverlay(overlay);
     }-*/;

    /*
     * removeOverlay(overlay) none Removes the overlay from the map. If the
     * overlay was on the map, it fires the removeoverlay event.
     */
    public static native void removeOverlay(JSObject map, JSObject overlay)/*-{
     map.removeOverlay(overlay);
     }-*/;

    /*
     * clearOverlays() none Removes all overlay from the map, and fires the
     * clearoverlays event.
     */
    public static native void clearOverlays(JSObject map)/*-{
     map.clearOverlays();
     }-*/;

    /*
     * getPane(pane) Node Returns a DIV that holds the object in the layer
     * identified by pane. Used by GOverlay instances in method
     * GOverlay.initialize() instances to draw themselves on the map
     */
    public static native Element getPane(JSObject map, int pane)/*-{
     return map.getPane(pane);
     }-*/;

    // TODO Add

    /*
     * openInfoWindow(point, node, opts?) none Opens a simple info window at the
     * given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as a DOM node.
     */
    public static native void openInfoWindow(JSObject map, JSObject point,
            Element node, JSObject opts)/*-{
     map.openInfoWindow(point, node, opts);
     }-*/;

    /*
     * openInfoWindow(point, node, opts?) none Opens a simple info window at the
     * given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as a DOM node.
     */
    public static native void openInfoWindow(JSObject map, JSObject point,
            Element node)/*-{
     map.openInfoWindow(point, node);
     }-*/;

    /*
     * openInfoWindowHtml(point, html, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as HTML text.
     */
    public static native void openInfoWindowHtml(JSObject map, JSObject point,
            String html, JSObject opts)/*-{
     map.openInfoWindowHtml(point, html, opts);
     }-*/;

    /*
     * openInfoWindowHtml(point, html, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as HTML text.
     */
    public static native void openInfoWindowHtml(JSObject map, JSObject point,
            String html)/*-{
     map.openInfoWindowHtml(point, html);
     }-*/;

    /*
     * openInfoWindowTabs(point, tabs, opts?) none Opens a tabbed info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as DOM nodes.
     */
    public static native void openInfoWindowTabs(JSObject map, JSObject point,
            JSObject tabs, JSObject opts)/*-{
     map.openInfoWindowTabs(point, tabs, opts);
     }-*/;

    /*
     * openInfoWindowTabs(point, tabs, opts?) none Opens a tabbed info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as DOM nodes.
     */
    public static native void openInfoWindowTabs(JSObject map, JSObject point,
            JSObject tabs)/*-{
     map.openInfoWindowTabs(point, tabs);
     }-*/;

    /*
     * openInfoWindowTabsHtml(point, tabs, opts?) none Opens a tabbed info
     * window at the given point. Pans the map such that the opened info window
     * is fully visible. The content of the info window is given as HTML text.
     */
    public static native void openInfoWindowTabsHtml(JSObject map,
            JSObject point, JSObject tabs, JSObject opts)/*-{
     map.openInfoWindowTabsHtml(point, tabs, opts);
     }-*/;

    /*
     * openInfoWindowTabsHtml(point, tabs, opts?) none Opens a tabbed info
     * window at the given point. Pans the map such that the opened info window
     * is fully visible. The content of the info window is given as HTML text.
     */
    public static native void openInfoWindowTabsHtml(JSObject map,
            JSObject point, JSObject tabs)/*-{
     map.openInfoWindowTabsHtml(point, tabs);
     }-*/;

    /*
     * showMapBlowup(point, opts?) none Opens an info window at the given point
     * that contains a closeup view on the map around this point.
     */
    public static native void showMapBlowup(JSObject map, JSObject point,
            JSObject opts)/*-{
     map.showMapBlowup(point, opts);
     }-*/;

    /*
     * showMapBlowup(point, opts?) none Opens an info window at the given point
     * that contains a closeup view on the map around this point.
     */
    public static native void showMapBlowup(JSObject map, JSObject point)/*-{
     map.showMapBlowup(point);
     }-*/;

    /*
     * closeInfoWindow() none Closes the currently open info window.
     */
    public static native void closeInfoWindow(JSObject map)/*-{
     map.closeInfoWindow();
     }-*/;

    /*
     * getInfoWindow() GInfoWindow Returns the info window object of this map.
     * If no info window exists yet, it is created, but not displayed. This
     * operation is not influenced by enableInfoWindow().
     */
    public static native JSObject getInfoWindow(JSObject map)/*-{
     return map.getInfoWindow();
     }-*/;

    /*
     * fromLatLngToDivPixel(latlng) GPoint Computes the pixel coordinates of the
     * given geographical point in the DOM element that holds the draggable map.
     * You need this method to position a custom overlay when you implement the
     * GOverlay.redraw() method for a custom overlay.
     */
    public static native JSObject fromLatLngToDivPixel(JSObject map,
            JSObject latlng)/*-{
     return map.fromLatLngToDivPixel(latlng);
     }-*/;

    /*
     * fromDivPixelToLatLng(pixel) GLatLng Computes the geographical coordinates
     * from pixel coordinates in the div that holds the draggable map. You need
     * this when you implement interaction with custom overlays.
     */
    public static native JSObject fromDivPixelToLatLng(JSObject map,
            JSObject pixel)/*-{
     return map.fromDivPixelToLatLng(pixel);
     }-*/;

    /*
     * fromContainerPixelToLatLng(pixel) GLatLng Computes the geographical
     * coordinates of the point at the given pixel coordinates in the DOM
     * element that contains the map on the page. You need this when you
     * implement interaction of custom controls with the map.
     */
    public static native JSObject fromContainerPixelToLatLng(JSObject map,
            JSObject pixel)/*-{
     return map.fromContainerPixelToLatLng(pixel);
     }-*/;

    public static native void GUnload()/*-{
     return $wnd.GUnload();
     }-*/;

}
