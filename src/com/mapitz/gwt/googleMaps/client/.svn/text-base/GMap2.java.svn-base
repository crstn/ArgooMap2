package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Instantiate class GMap2 in order to create a map. This is the central class
 * in the API. Everything else is auxiliary.
 * 
 * @author aglaforge
 * 
 */
public class GMap2 extends GoogleMapsWidget {
    /**
     * Creates a GMap2 object by passing a DIV element
     * 
     * @param e
     * @return
     */
    public GMap2(Element e, GMapOptions options) {
        super((options == null) ? GMap2Impl.create(e) : GMap2Impl.create(e,
                options.getJSObject()));
    }

    public GMap2(Element e) {
        super(GMap2Impl.create(e));
    }

    protected GMap2(JSObject e) {
        super(e);
    }

    public static GMap2 narrowToGMap2(JSObject element) {
        return (element == null) ? null : new GMap2(element);
    }

    public void enableAutomatedCheckResizeOnMoveEnd() {
        GMap2Impl.enableAutomatedCheckResizeOnMoveEnd(getJSObject());
    }

    public void enableCheckResizeOnLoad() {
        GMap2Impl.enableCheckResizeOnLoad(getJSObject());
    }

    /**
     * Set's the center position on the map
     * 
     * @param latlng
     */
    public void setCenter(GLatLng latlng) {
        GMap2Impl.setCenter(getJSObject(), latlng.getJSObject());
    }

    /**
     * Enables dragging of the map by the user
     * 
     */
    public void enableDragging() {
        GMap2Impl.enableDragging(getJSObject());
    }

    /**
     * Disables dragging of the map by the user
     * 
     */
    public void disableDragging() {
        GMap2Impl.disableDragging(getJSObject());
    }

    /***************************************************************************
     * Test to see if dragging enabled
     * 
     * @return
     */
    public boolean draggingEnabled() {
        return GMap2Impl.draggingEnabled(getJSObject());
    }

    /**
     * Enables display of the information window
     * 
     */
    public void enableInfoWindow() {
        GMap2Impl.enableInfoWindow(getJSObject());
    }

    /**
     * Disables display of the information window
     * 
     */
    public void disableInfoWindow() {
        GMap2Impl.disableInfoWindow(getJSObject());
    }

    /**
     * Tests if info window will be displayed
     * 
     * @return
     */
    public boolean infoWindowEnabled() {
        return GMap2Impl.infoWindowEnabled(getJSObject());
    }

    /**
     * Tests if the map is "loaded" and ready to be used
     * 
     * @return
     */
    public boolean isLoaded() {
        return GMap2Impl.isLoaded(getJSObject());
    }

    /**
     * Returns the geographical coordinates of the center point of the map view.
     * 
     * @return
     */
    public GLatLng getCenter() {
        return GLatLng.narrowToGLatLng(GMap2Impl.getCenter(getJSObject()));
    }

    /**
     * Returns the the visible rectangular region of the map view in
     * geographical coordinates.
     * 
     * @return
     */
    public GLatLngBounds getBounds() {
        return GLatLngBounds.narrowToGLatLngBounds(GMap2Impl
                .getBounds(getJSObject()));
    }

    /**
     * Returns the zoom level at which the given rectangular region fits in the
     * map view. The zoom level is computed for the currently selected map type.
     * If no map type is selected yet, the first on the list of map types is
     * used.
     * 
     * @param bounds
     * @return
     */
    public int getBoundsZoomLevel(GLatLngBounds bounds) {
        return GMap2Impl
                .getBoundsZoomLevel(getJSObject(), bounds.getJSObject());
    }

    /**
     * Returns the current zoom level.
     * 
     * @return
     */
    public int getZoom() {
        return GMap2Impl.getZoom(getJSObject());
    }

    /**
     * Returns the size of the map view in pixels.
     * 
     * @return
     */
    public GSize getSize() {
        return GSize.narrowToGSize(GMap2Impl.getSize(getJSObject()));
    }

    /**
     * panTo(center) none Changes the center point of the map to the given
     * point. If the point is already visible in the current map view, change
     * the center in a smooth animation.
     * 
     * @param center
     */
    public void panTo(GLatLng center) {
        GMap2Impl.panTo(getJSObject(), center.getJSObject());
    }

    /**
     * panBy(distance) none Starts a pan animation by the given distance in
     * pixels.
     * 
     * @param distance
     */
    public void panBy(int distance) {
        GMap2Impl.panBy(getJSObject(), distance);
    }

    /**
     * panDirection(dx, dy) none Starts a pan animation by half the width of the
     * map in the indicated directions. +1 is right and down, -1 is left and up,
     * respectively.
     * 
     * @param dx
     * @param dy
     */
    public void panDirection(int dx, int dy) {
        GMap2Impl.panDirection(getJSObject(), dx, dy);
    }

    /**
     * setZoom(level) none Sets the zoom level to the given new value.
     * 
     * @param level
     */
    public void setZoom(int level) {
        GMap2Impl.setZoom(getJSObject(), level);
    }

    /**
     * zoomIn() none Increments zoom level by one.
     * 
     */
    public void zoomIn() {
        GMap2Impl.zoomIn(getJSObject());
    }

    /**
     * zoomOut() none Decrements zoom level by one.
     * 
     */
    public void zoomOut() {
        GMap2Impl.zoomOut(getJSObject());
    }

    /**
     * savePosition() none Stores the current map position and zoom level for
     * later recall by returnToSavedPosition().
     * 
     */
    public void savePosition() {
        GMap2Impl.savePosition(getJSObject());
    }

    /**
     * returnToSavedPosition() none Restores the map view that was saved by
     * savePosition().
     * 
     */
    public void returnToSavedPosition() {
        GMap2Impl.returnToSavedPosition(getJSObject());
    }

    /**
     * checkResize() none Notifies the map of a change of the size of its
     * container. Call this method after the size of the container DOM object
     * has changed, so that the map can adjust itself to fit the new size.
     * 
     */
    public void checkResize() {
        GMap2Impl.checkResize(getJSObject());
    }

    /**
     * addControl(control, position?) none Adds the control to the map. The
     * position on the map is determined by the optional position argument. If
     * this argument is absent, the default position of the control is used, as
     * determined by the GControl.getDefaultPosition() method. A control
     * instance must not be added more than once to the map.
     */
    public void addControl(GControl control, GControlPosition position) {
        GMap2Impl.addControl(getJSObject(), control.getJSObject(), position
                .getJSObject());
    }

    /**
     * addControl(control, position?) none Adds the control to the map. The
     * position on the map is determined by the optional position argument. If
     * this argument is absent, the default position of the control is used, as
     * determined by the GControl.getDefaultPosition() method. A control
     * instance must not be added more than once to the map.
     */
    public void addControl(GControl control) {
        GMap2Impl.addControl(getJSObject(), control.getJSObject());
    }

    /**
     * removeControl(control) none Removes the control from the map. It does
     * nothing if the control was never added to the map.
     */
    public void removeControl(GControl control) {
        GMap2Impl.removeControl(getJSObject(), control.getJSObject());
    }

    /**
     * getContainer() Node Returns the DOM object that contains the map. Used by
     * GControl.initialize().
     */
    public Element getContainer() {
        return GMap2Impl.getContainer(getJSObject());
    }

    /**
     * getMapTypes() Array of GMapType Returns the array of map types registered
     * with this map.
     */
    public GMapType[] getMapTypes() {
        GMapType[] rtn = null;
        JSObject hold = GMap2Impl.getMapTypes(getJSObject());
        if (hold != null) {
            JObjectArray array = new JObjectArray(hold);
            int size = ElementHelper.arrayLength(hold);
            rtn = new GMapType[size];

            for (int i = 0; i < size; i++) {
                rtn[i] = new GMapType(array.get(i));
            }
        }
        return rtn;
    }

    /**
     * getCurrentMapType() GMapType Returns the currently selected map type.
     */
    public GMapType getCurrentMapType() {
        return GMapType.narrowToGMapType(GMap2Impl
                .getCurrentMapType(getJSObject()));
    }

    /**
     * setMapType(type) none Selects the given new map type. The type must be
     * known to the map. See the constructor, and the method addMapType().
     */
    public void setMapType(GMapType type) {
        GMap2Impl.setMapType(getJSObject(), type.getJSObject());
    }

    /**
     * addMapType(type) none Adds a new map type to the map. See section
     * GMapType for how to define custom map types.
     */
    public void addMapType(GMapType type) {
        GMap2Impl.addMapType(getJSObject(), type.getJSObject());
    }

    /**
     * removeMapType(type) none Removes the map type from the map. Will update
     * the set of buttons displayed by the GMapTypeControl and fire the
     * removemaptype event.
     */
    public void removeMapType(GMapType type) {
        GMap2Impl.removeMapType(getJSObject(), type.getJSObject());
    }

    public void setCenter(GLatLng latlng, int zoomlevel, GMapType type) {
        GMap2Impl.setCenter(getJSObject(), latlng.getJSObject(), zoomlevel,
                type.getJSObject());
    }

    public void setCenter(GLatLng latlng, int zoom) {
        GMap2Impl.setCenter(getJSObject(), latlng.getJSObject(), zoom);
    }

    /**
     * addOverlay(overlay) none Adds an overlay to the map and fires the
     * addoverlay event.
     */
    public void addOverlay(GOverlay overlay) {
        GMap2Impl.addOverlay(getJSObject(), overlay.getJSObject());
    }

    /**
     * addOverlay(collection) none Adds a collection of overlays to the map.
     */
    public void addOverlay(GOverlayCollection collection) {
        if ((collection != null) && (collection.size() > 0)) {
            int size = collection.size();

            for (int i = 0; i < size; i++) {
                addOverlay(collection.get(i));
            }
        }
    }

    /**
     * removeOverlay(overlay) none Removes the overlay from the map. If the
     * overlay was on the map, it fires the removeoverlay event.
     */
    public void removeOverlay(GOverlay overlay) {
        GMap2Impl.removeOverlay(getJSObject(), overlay.getJSObject());
    }

    /**
     * removeOverlay(collection) none Removes a collection of overlays to the
     * map.
     */
    public void removeOverlay(GOverlayCollection collection) {
        if (collection != null) {
            int size = collection.size();

            for (int i = 0; i < size; i++) {
                removeOverlay(collection.get(i));
            }
        }
    }

    /**
     * clearOverlays() none Removes all overlay from the map, and fires the
     * clearoverlays event.
     */
    public void clearOverlays() {
        GMap2Impl.clearOverlays(getJSObject());
    }

    /**
     * getPane(pane) Node Returns a DIV that holds the object in the layer
     * identified by pane. Used by GOverlay instances in method
     * GOverlay.initialize() instances to draw themselves on the map
     */
    public Element getPane(GMapPane pane) {
        return GMap2Impl.getPane(getJSObject(), pane.getIndex());
    }

    /**
     * openInfoWindow(point, widget, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as a DOM node.
     */
    public void openInfoWindow(GLatLng point, Widget widget,
            GInfoWindowOptions opts) {
        GInfoWindowManager.getInstance().associate(widget);
        GMap2Impl.openInfoWindow(getJSObject(), point.getJSObject(), widget
                .getElement(), opts.getJSObject());
    }

    /**
     * openInfoWindow(point, widget, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as a DOM node.
     */
    public void openInfoWindow(GLatLng point, Widget widget) {
        GInfoWindowManager.getInstance().associate(widget);
        GMap2Impl.openInfoWindow(getJSObject(), point.getJSObject(), widget
                .getElement());
    }

    /**
     * openInfoWindowHtml(point, html, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as HTML text.
     */
    public void openInfoWindowHtml(GLatLng point, String html,
            GInfoWindowOptions opts) {
        GMap2Impl.openInfoWindowHtml(getJSObject(), point.getJSObject(), html,
                opts.getJSObject());
    }

    /**
     * openInfoWindowHtml(point, html, opts?) none Opens a simple info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as HTML text.
     */
    public void openInfoWindowHtml(GLatLng point, String html) {
        GMap2Impl.openInfoWindowHtml(getJSObject(), point.getJSObject(), html);
    }

    /**
     * openInfoWindowTabs(point, tabs, opts?) none Opens a tabbed info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as DOM nodes.
     */
    public void openInfoWindowTabs(GLatLng point, GInfoWindowTab[] tabs,
            GInfoWindowOptions opts) {
        GInfoWindowManager.getInstance().associate(tabs);
        GMap2Impl.openInfoWindowTabs(getJSObject(), point.getJSObject(),
                ElementHelper.arrayConvert(tabs), opts.getJSObject());
    }

    /**
     * openInfoWindowTabs(point, tabs, opts?) none Opens a tabbed info window at
     * the given point. Pans the map such that the opened info window is fully
     * visible. The content of the info window is given as DOM nodes.
     */
    public void openInfoWindowTabs(GLatLng point, GInfoWindowTab[] tabs) {
        GInfoWindowManager.getInstance().associate(tabs);
        GMap2Impl.openInfoWindowTabs(getJSObject(), point.getJSObject(),
                ElementHelper.arrayConvert(tabs));
    }

    /**
     * openInfoWindowTabsHtml(point, tabs, opts?) none Opens a tabbed info
     * window at the given point. Pans the map such that the opened info window
     * is fully visible. The content of the info window is given as HTML text.
     */
    public void openInfoWindowTabsHtml(GLatLng point, GInfoWindowTab[] tabs,
            GInfoWindowOptions opts) {
        GMap2Impl.openInfoWindowTabsHtml(getJSObject(), point.getJSObject(),
                ElementHelper.arrayConvert(tabs), opts.getJSObject());
    }

    /**
     * openInfoWindowTabsHtml(point, tabs, opts?) none Opens a tabbed info
     * window at the given point. Pans the map such that the opened info window
     * is fully visible. The content of the info window is given as HTML text.
     */
    public void openInfoWindowTabsHtml(GLatLng point, GInfoWindowTab[] tabs) {
        GMap2Impl.openInfoWindowTabsHtml(getJSObject(), point.getJSObject(),
                ElementHelper.arrayConvert(tabs));
    }

    /**
     * showMapBlowup(point, opts?) none Opens an info window at the given point
     * that contains a closeup view on the map around this point.
     */
    public void showMapBlowup(GLatLng point, GInfoWindowOptions opts) {
        GMap2Impl.showMapBlowup(getJSObject(), point.getJSObject(), opts
                .getJSObject());
    }

    /**
     * showMapBlowup(point, opts?) none Opens an info window at the given point
     * that contains a closeup view on the map around this point.
     */
    public void showMapBlowup(GLatLng point) {
        GMap2Impl.showMapBlowup(getJSObject(), point.getJSObject());
    }

    /**
     * closeInfoWindow() none Closes the currently open info window.
     */
    public void closeInfoWindow() {
        GMap2Impl.closeInfoWindow(getJSObject());
    }

    /**
     * getInfoWindow() GInfoWindow Returns the info window object of this
     * GMap2Impl. If no info window exists yet, it is created, but not
     * displayed. This operation is not influenced by enableInfoWindow().
     */
    public GInfoWindow getInfoWindow() {
        return GInfoWindow.narrowToGInfoWindow(GMap2Impl
                .getInfoWindow(getJSObject()));
    }

    /**
     * fromLatLngToDivPixel(latlng) GPoint Computes the pixel coordinates of the
     * given geographical point in the DOM element that holds the draggable
     * GMap2Impl. You need this method to position a custom overlay when you
     * implement the GOverlay.redraw() method for a custom overlay.
     */
    public GPoint fromLatLngToDivPixel(GLatLng latlng) {
        return GPoint.narrowToGPoint(GMap2Impl.fromLatLngToDivPixel(
                getJSObject(), latlng.getJSObject()));
    }

    /**
     * fromDivPixelToLatLng(pixel) GLatLng Computes the geographical coordinates
     * from pixel coordinates in the div that holds the draggable GMap2Impl. You
     * need this when you implement interaction with custom overlays.
     */
    public GLatLng fromDivPixelToLatLng(GPoint pixel) {
        return GLatLng.narrowToGLatLng(GMap2Impl.fromDivPixelToLatLng(
                getJSObject(), pixel.getJSObject()));
    }

    /**
     * fromContainerPixelToLatLng(pixel) GLatLng Computes the geographical
     * coordinates of the point at the given pixel coordinates in the DOM
     * element that contains the map on the page. You need this when you
     * implement interaction of custom controls with the GMap2Impl.
     */
    public GLatLng fromContainerPixelToLatLng(GPoint pixel) {
        return GLatLng.narrowToGLatLng(GMap2Impl.fromContainerPixelToLatLng(
                getJSObject(), pixel.getJSObject()));
    }

    /**
     * enableDoubleClickZoom() none Enables double click to zoom in and out
     * (disabled by default). (Since 2.58)
     */
    public void enableDoubleClickZoom() {
        GMap2Impl.enableDoubleClickZoom(getJSObject());
    }

    /**
     * disableDoubleClickZoom() none Disables double click to zoom in and out.
     * (Since 2.58)
     * 
     */
    public void disableDoubleClickZoom() {
        GMap2Impl.disableDoubleClickZoom(getJSObject());
    }

    /**
     * doubleClickZoomEnabled() Boolean Returns true iff double click to zoom is
     * enabled. (Since 2.58)
     * 
     * @return
     */
    public boolean doubleClickZoomEnabled() {
        return GMap2Impl.doubleClickZoomEnabled(getJSObject());
    }

    /**
     * enableContinuousZoom() none Enables continuous smooth zooming for select
     * browsers (disabled by default). (Since 2.58)
     * 
     */
    public void enableContinuousZoom() {
        GMap2Impl.enableContinuousZoom(getJSObject());
    }

    /**
     * disableContinuousZoom() none Disables continuous smooth zooming. (Since
     * 2.58)
     * 
     */
    public void disableContinuousZoom() {
        GMap2Impl.disableContinuousZoom(getJSObject());
    }

    /**
     * continuousZoomEnabled() Boolean Returns true iff continuous smooth
     * zooming is enabled. (Since 2.58)
     * 
     * @return
     */
    public boolean continuousZoomEnabled() {
        return GMap2Impl.continuousZoomEnabled(getJSObject());
    }

    /**
     * Dismantles all registered event handlers in order to prevent memory
     * leaks. Should be called as a handler for the unload event.
     * 
     */
    public static void GUnload() {
        GMap2Impl.GUnload();
    }

    /**
     * Returns true if the current browser supports the maps API library.
     * 
     * @return
     */
    public static boolean GBrowserIsCompatible() {
        return GMap2Impl.GBrowserIsCompatible();
    }
}
