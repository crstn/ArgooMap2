package com.mapitz.gwt.googleMaps.client;

/**
 * Event Manager which manages GMarker events
 * 
 * @author aglaforge
 * 
 */
public class GMarkerEventManager {
    private static GMarkerEventManager instance;

    public static GMarkerEventManager getInstance() {
        if (instance == null)
            instance = new GMarkerEventManager();
        return instance;
    }

    /**
     * click none This event is fired when the marker icon was clicked. Notice
     * that this event will also fire for the map, with the marker passed as the
     * first argument to the event handler there.
     */
    public GEventListener addOnClickListener(GMarker marker,
            GMarkerEventClickListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnClickListener(listener, marker.getJSObject(), marker));
    }

    /**
     * dblclick none This event is fired when the marker icon was
     * double-clicked. Notice that this event will not fire for the map, because
     * the map centers on double-click as a hardwired behavior.
     */
    public GEventListener addOnDblClickListener(GMarker marker,
            GMarkerEventClickListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnDblClickListener(listener, marker.getJSObject(), marker));
    }

    public GEventListener addOnDragEndListener(GMarker marker,
            GMarkerEventDragListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnDragEndListener(listener, marker.getJSObject(), marker));
    }

    public GEventListener addOnDragStartListener(GMarker marker,
            GMarkerEventDragListener listener) {
        return GEventListener
                .narrowToGEventListener(GMarkerEventManagerImpl
                        .addOnDragStartListener(listener, marker.getJSObject(),
                                marker));
    }

    /**
     * mousedown none This event is fired when the DOM mousedown event is fired
     * on the marker icon. Notice that the marker will stop the mousedown DOM
     * event, so that it doesn't cause the map to start dragging.
     */
    public GEventListener addOnMouseDownListener(GMarker marker,
            GMarkerEventMouseListener listener) {
        return GEventListener
                .narrowToGEventListener(GMarkerEventManagerImpl
                        .addOnMouseDownListener(listener, marker.getJSObject(),
                                marker));
    }

    /**
     * mouseup none This event is fired for the DOM mouseup on the marker.
     * Notice that the marker will not stop the mousedown DOM event, because it
     * will not confuse the drag handler of the map.
     */
    public GEventListener addOnMouseUpListener(GMarker marker,
            GMarkerEventMouseListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnMouseUpListener(listener, marker.getJSObject(), marker));
    }

    /**
     * mouseover none This event is fired when the mouse enters the area of the
     * marker icon.
     */
    public GEventListener addOnMouseOverListener(GMarker marker,
            GMarkerEventMouseListener listener) {
        return GEventListener
                .narrowToGEventListener(GMarkerEventManagerImpl
                        .addOnMouseOverListener(listener, marker.getJSObject(),
                                marker));
    }

    /**
     * mouseout none This event is fired when the mouse leaves the area of the
     * marker icon.
     */
    public GEventListener addOnMouseOutListener(GMarker marker,
            GMarkerEventMouseListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnMouseOutListener(listener, marker.getJSObject(), marker));
    }

    /**
     * infowindowopen none This event is fired when the info window of the map
     * was opened through this marker.
     */
    public GEventListener addOnInfoWindowOpenListener(GMarker marker,
            GMarkerEventInfoWindowListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnInfoWindowOpenListener(listener, marker.getJSObject(),
                        marker));
    }

    /**
     * infowindowclose none This event is fired when the info window of the map
     * that was opened through this marker is closed again. This happens when
     * either the info window was closed, or when it was opened on another
     * marker, or on the map.
     */
    public GEventListener addOnInfoWindowCloseListener(GMarker marker,
            GMarkerEventInfoWindowListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnInfoWindowCloseListener(listener, marker.getJSObject(),
                        marker));
    }

    /**
     * remove none This event is fired when the marker is removed from the map,
     * using GMap2.removeOverlay() or GMap2.clearOverlays().
     */
    public GEventListener addOnRemoveListener(GMarker marker,
            GMarkerEventListener listener) {
        return GEventListener.narrowToGEventListener(GMarkerEventManagerImpl
                .addOnRemoveListener(listener, marker.getJSObject(), marker));
    }

    public static void clearInstanceListeners(GMarker source) {
        GMarkerEventManagerImpl.clearInstanceListeners(source);
    }
}
