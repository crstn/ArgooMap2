package com.mapitz.gwt.googleMaps.client;

/**
 * Options for the InfoWindow
 * 
 * @author aglaforge
 * 
 */
public class GInfoWindowOptions extends GOptionBase {

    public GInfoWindowOptions() {
        super();
    }

    protected GInfoWindowOptions(JSObject element) {
        super(element);
    }

    public static GInfoWindowOptions narrowToGInfoWindowOptions(JSObject e) {
        return (e == null) ? null : new GInfoWindowOptions(e);
    }

    /**
     * selectedTab Number Selects the tab with the given index, starting at 0,
     * instead of the first tab (with index 0).
     */
    public int getSelectedTab() {
        return getAttributeAsInt("selectedTab");
    }

    /**
     * selectedTab Number Selects the tab with the given index, starting at 0,
     * instead of the first tab (with index 0).
     */
    public void setSelectedTab(int var) {
        setAttribute("selectedTab", var);
    }

    /**
     * maxWidth Number Maximum width of the info window content, in pixels.
     */
    public int getMaxWidth() {
        return getAttributeAsInt("maxWidth");
    }

    /**
     * maxWidth Number Maximum width of the info window content, in pixels.
     */
    public void setMaxWidth(int var) {
        setAttribute("maxWidth", var);
    }

    /**
     * zoomLevel Number Pertinent for showMapBlowup() only. The zoom level of
     * the blowup map in the info window.
     */
    public int getZoomLevel() {
        return getAttributeAsInt("zoomLevel");
    }

    /**
     * zoomLevel Number Pertinent for showMapBlowup() only. The zoom level of
     * the blowup map in the info window.
     */
    public void setZoomLevel(int var) {
        setAttribute("zoomLevel", var);
    }

    /**
     * mapType GMapType Pertinent for showMapBlowup() only. The map type of the
     * blowup map in the info window.
     */
    public GMapType getMapType() {
        return GMapType.narrowToGMapType(getAttributeAsJSObject("mapType"));
    }

    /**
     * mapType GMapType Pertinent for showMapBlowup() only. The map type of the
     * blowup map in the info window.
     */
    public void setMapType(GMapType var) {
        setAttribute("mapType", var.getJSObject());
    }

    // TODO Code these as Events
    // onOpenFn Function Function is called after the info window is opened and
    // the content is displayed.
    // onCloseFn Function Function is called when the info window is closed.

}
