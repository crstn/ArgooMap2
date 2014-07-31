package com.mapitz.gwt.googleMaps.client;

/**
 * This class is used to manage visibility of hundreds of markers on a map,
 * based on the map's current viewport and zoom level.
 * 
 * @author aglaforge
 * 
 */
public class GMarkerManager extends GoogleMapsWidget {

    protected GMarkerManager(JSObject element) {
        super(element);
    }

    public static GMarkerManager narrowToGMarkerManager(JSObject element) {
        return (element == null) ? null : new GMarkerManager(element);
    }

    /**
     * Creates a new marker manager that controlls visibility of markers for the
     * specified map. (Since 2.67)
     * 
     * @param map
     * @return
     */
    public GMarkerManager(GMap2 map) {
        this(GMarkerManagerImpl.create(map.getJSObject()));
    }

    /**
     * Creates a new marker manager that controlls visibility of markers for the
     * specified map. (Since 2.67)
     * 
     * @param map
     * @param options
     * @return
     */
    public GMarkerManager(GMap2 map, GMarkerManagerOptions options) {
        this(GMarkerManagerImpl
                .create(map.getJSObject(), options.getJSObject()));
    }

    /**
     * Adds a batch of markers to this marker manager. The markers are not added
     * to the map, until the refresh() method is called. Once placed on a map,
     * the markers are shown if they fall within the map's current viewport and
     * the map's zoom level is greater than or equal to the specified minZoom.
     * If the maxZoom was given, the markers are automatically removed if the
     * map's zoom is greater than the one specified. (Since 2.67)
     * 
     * @param array
     * @param minZoom
     * @param maxZoom
     */
    public void addMarkers(GMarker[] array, int minZoom, int maxZoom) {
        GMarkerManagerImpl.addMarkers(getJSObject(), ElementHelper
                .arrayConvert(array), minZoom, maxZoom);
    }

    /**
     * Adds a batch of markers to this marker manager. The markers are not added
     * to the map, until the refresh() method is called. Once placed on a map,
     * the markers are shown if they fall within the map's current viewport and
     * the map's zoom level is greater than or equal to the specified minZoom.
     * If the maxZoom was given, the markers are automatically removed if the
     * map's zoom is greater than the one specified. (Since 2.67)
     * 
     * @param array
     * @param minZoom
     */
    public void addMarkers(GMarker[] array, int minZoom) {
        GMarkerManagerImpl.addMarkers(getJSObject(), ElementHelper
                .arrayConvert(array), minZoom);
    }

    /**
     * Adds a single marker to a collection of markers controlled by this
     * manager. If the marker's location falls within the map's current viewport
     * and the map's zoom level is within the specified zoom level rage, the
     * marker is immediately added to the map. Similar to the addMarkers method,
     * the minZoom and the optional maxZoom parameters specify the range of zoom
     * levels at which the marker is shown. (Since 2.67)
     * 
     * @param marker
     * @param minZoom
     * @param maxZoom
     */
    public void addMarker(GMarker marker, int minZoom, int maxZoom) {
        GMarkerManagerImpl.addMarker(getJSObject(), marker.getJSObject(),
                minZoom, maxZoom);
    }

    /**
     * Adds a single marker to a collection of markers controlled by this
     * manager. If the marker's location falls within the map's current viewport
     * and the map's zoom level is within the specified zoom level rage, the
     * marker is immediately added to the map. Similar to the addMarkers method,
     * the minZoom and the optional maxZoom parameters specify the range of zoom
     * levels at which the marker is shown. (Since 2.67)
     * 
     * @param marker
     * @param minZoom
     */
    public void addMarker(GMarker marker, int minZoom) {
        GMarkerManagerImpl.addMarker(getJSObject(), marker.getJSObject(),
                minZoom);
    }

    /**
     * Forces the manager to update markers shown on the map. This method must
     * be called if markers were added using the addMarkers method. (Since 2.67)
     * 
     */
    public void refresh() {
        GMarkerManagerImpl.refresh(getJSObject());
    }

    /**
     * Returns the total number of markers potentially visible at the given zoom
     * level. This may include markers at lower zoom levels. (Since 2.67)
     * 
     * @param zoom
     * @return
     */
    public int getMarkerCount(int zoom) {
        return GMarkerManagerImpl.getMarkerCount(getJSObject(), zoom);
    }

}
