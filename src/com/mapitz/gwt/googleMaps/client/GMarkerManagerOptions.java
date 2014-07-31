package com.mapitz.gwt.googleMaps.client;

/**
 * This class represents optional arguments to the GMarkerManager constructor.
 * 
 * @author aglaforge
 * 
 */
public class GMarkerManagerOptions extends GOptionBase {

    protected GMarkerManagerOptions(JSObject e) {
        super(e);
    }

    public static GMarkerManagerOptions narrowToGMarkerManagerOptions(
            JSObject element) {
        return (element == null) ? null : new GMarkerManagerOptions(element);
    }

    public GMarkerManagerOptions() {
        super();
    }

    /**
     * Specifies, in pixels, the extra padding outside the map's current
     * viewport monitored by a manager. Markers that fall within this padding
     * are added to the map, even if they are not fully visible. (Since 2.67)
     * 
     * @param size
     */
    public void setBorderPadding(int size) {
        setAttribute("borderPadding", size);
    }

    /**
     * Specifies, in pixels, the extra padding outside the map's current
     * viewport monitored by a manager. Markers that fall within this padding
     * are added to the map, even if they are not fully visible. (Since 2.67)
     * 
     * @return
     */
    public int getBorderPadding() {
        return getAttributeAsInt("borderPadding");
    }

    /**
     * Sets the maximum zoom level monitored by a marker manager. If not given,
     * the manager assumes the maximum map zoom level. This value is also used
     * when markers are added to the manager without the optional maxZoom
     * parameter. (Since 2.67)
     * 
     * @param maxZoom
     */
    public void setMaxZoom(int maxZoom) {
        setAttribute("maxZoom", maxZoom);
    }

    /**
     * Sets the maximum zoom level monitored by a marker manager. If not given,
     * the manager assumes the maximum map zoom level. This value is also used
     * when markers are added to the manager without the optional maxZoom
     * parameter. (Since 2.67)
     * 
     * @return
     */
    public int getMaxZoom() {
        return getAttributeAsInt("maxZoom");
    }

    /**
     * Indicates whether or not a marker manager should track markers'
     * movements. If you wish to move managed markers using the setPoint method,
     * this option should be set to true. The default value is false. (Since
     * 2.67)
     * 
     * @param trackMarkers
     */
    public void setTrackMarkers(boolean trackMarkers) {
        setAttribute("trackMarkers", trackMarkers);
    }

    /**
     * Indicates whether or not a marker manager should track markers'
     * movements. If you wish to move managed markers using the setPoint method,
     * this option should be set to true. The default value is false. (Since
     * 2.67)
     * 
     * @return
     */
    public boolean getTrackMarkers() {
        return getAttributeAsBoolean("trackMarkers");
    }

}
