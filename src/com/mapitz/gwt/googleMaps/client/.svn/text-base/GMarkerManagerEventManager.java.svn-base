package com.mapitz.gwt.googleMaps.client;

public class GMarkerManagerEventManager {
    private static GMarkerManagerEventManager instance;

    public static GMarkerManagerEventManager getInstance() {
        if (instance == null)
            instance = new GMarkerManagerEventManager();
        return instance;
    }

    /**
     * This event is fired when markers managed by a manager have been added to
     * or removed from the map. The event handler function should be prepared to
     * accept two arguments. The fist one is the rectangle definining the bounds
     * of the visible grid. The second one carries the number of markers
     * currently shown on the map.
     * 
     * @param listener
     * @param source
     * @return
     */
    public GEventListener addOnChanged(GMarkerManagerEventListener listener,
            GMarkerManager source) {
        return new GEventListener(GMarkerManagerEventManagerImpl
                .addOnChangedListener(listener, source.getJSObject()));
    }
}
