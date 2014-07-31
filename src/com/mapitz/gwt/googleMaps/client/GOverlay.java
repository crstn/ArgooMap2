package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * This interface is implemented by the GMarker, GPolyline, and GInfoWindow
 * classes in the maps API library. You can implement it if you want to display
 * custom types of overlay objects on the map. An instance of GOverlay can be
 * put on the map with the method GMap2.addOverlay(). The map will then call the
 * method GOverlay.initialize() on the overlay instance to display itself on the
 * map initially. Whenever the map display changes, the map will call
 * GOverlay.redraw() so that the overlay can reposition itself if necessary. The
 * overlay instance can use the method GMap2.getPane() to get hold of one or
 * more DOM container elements to attach itself to.
 * 
 * @author aglaforge
 * 
 */
public class GOverlay extends GoogleMapsWidget {
    protected GOverlay(JSObject element) {
        super(element);
    }

    public static GOverlay narrowToGOverlay(JSObject element) {
        return (element == null) ? null : new GOverlay(element);
    }

    public GOverlay(Element e, GMapPane pane, GOverlayEvents overlay) {
        this(GOverlayImpl.create(e, pane.getIndex(), overlay));
    }

    public GOverlay(Widget w, GMapPane pane, GOverlayEvents overlay) {
        this(w.getElement(), pane, overlay);
    }

    /**
     * Returns a CSS z-index value for a given latitude. It computes a z index
     * such that overlays further south are on top of overlays further north,
     * thus creating the 3D appearance of marker overlays
     * 
     * @param latitude
     * @return
     */
    public static double getZIndex(double latitude) {
        return GOverlayImpl.getZIndex(latitude);
    }

    /**
     * initialize(map) none Called by the map after the overlay is added to the
     * map using GMap2.addOverlay(). The overlay object can draw itself into the
     * different panes of the map that can be obtained using GMap2.getPane().
     * 
     * @param self
     * @param map
     */
    public void initialize(GMap2 map) {
        GOverlayImpl.initialize(getJSObject(), map.getJSObject());
    }

    /**
     * remove() none Called by the map after the overlay is removed from the map
     * using GMap2.removeOverlay() or GMap2.clearOverlays(). The overlay must
     * remove itself from the map panes here.
     */
    public void remove() {
        GOverlayImpl.remove(getJSObject());
    }

    /**
     * copy() GOverlay Returns an uninitialized copy of itself that can be added
     * to the map.
     * 
     * @return
     */
    public GOverlay copy() {
        return GOverlay.narrowToGOverlay(GOverlayImpl.copy(getJSObject()));
    }

    /**
     * redraw(force) none Called by the map when the map display has changed.
     * The argument force will be true if the zoom level or the pixel offset of
     * the map view has changed, so that the pixel coordinates need to be
     * recomputed.
     * 
     * @param force
     */
    public void redraw(boolean force) {
        GOverlayImpl.redraw(getJSObject(), force);
    }

    /**
     * show() none Shows the overlay
     * 
     */
    public void show() {
        GOverlayImpl.show(getJSObject());
    }

    /**
     * hide() none Hides the overlay
     * 
     */
    public void hide() {
        GOverlayImpl.hide(getJSObject());
    }

}
