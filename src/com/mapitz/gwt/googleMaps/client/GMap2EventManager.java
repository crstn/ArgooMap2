package com.mapitz.gwt.googleMaps.client;

/**
 * Event manager for GMap2, see GMap2EventListner for a description of the
 * handlers
 * 
 * @author aglaforge
 * 
 */
public class GMap2EventManager {
    private static GMap2EventManager instance;

    public static GMap2EventManager getInstance() {
        if (instance == null)
            instance = new GMap2EventManager();
        return instance;
    }

    public GEventListener addOnMoveListener(GMap2 map,
            GMap2EventMoveListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMoveListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMoveEndListener(GMap2 map,
            GMap2EventMoveListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMoveEndListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMoveStartListener(GMap2 map,
            GMap2EventMoveListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMoveStartListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnAddMapTypeListener(GMap2 map,
            GMap2EventMapTypeListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnAddMapTypeListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnRemoveMapTypeListener(GMap2 map,
            GMap2EventMapTypeListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnRemoveMapTypeListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMapTypeChangedListener(GMap2 map,
            GMap2EventMapTypeListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMapTypeChangedListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnClickListener(GMap2 map,
            GMap2EventClickListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnClickListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnZoomEndListener(GMap2 map,
            GMap2EventZoomListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnZoomEndListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnDragEndListener(GMap2 map,
            GMap2EventDragListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnDragEndListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnDragListener(GMap2 map,
            GMap2EventDragListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnDragListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnDragStartListener(GMap2 map,
            GMap2EventDragListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnDragStartListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnLoadListener(GMap2 map,
            GMap2EventLoadListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnLoadListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnInfoWindowCloseListener(GMap2 map,
            GMap2EventInfoWindowListener listener) {
        return GEventListener
                .narrowToGEventListener(GMap2EventManagerImpl
                        .addOnInfoWindowCloseListener(listener, map
                                .getJSObject(), map));
    }

    public GEventListener addOnInfoWindowOpenListener(GMap2 map,
            GMap2EventInfoWindowListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnInfoWindowOpenListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMouseOutListener(GMap2 map,
            GMap2EventMouseListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMouseOutListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMouseOverListener(GMap2 map,
            GMap2EventMouseListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMouseOverListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnMouseMoveListener(GMap2 map,
            GMap2EventMouseListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnMouseMoveListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnAddOverlayListener(GMap2 map,
            GMap2EventOverlayListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnAddOverlayListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnRemoveOverlayListener(GMap2 map,
            GMap2EventOverlayListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnRemoveOverlayListener(listener, map.getJSObject(), map));
    }

    public GEventListener addOnClearOverlaysListener(GMap2 map,
            GMap2EventOverlayListener listener) {
        return GEventListener.narrowToGEventListener(GMap2EventManagerImpl
                .addOnClearOverlaysListener(listener, map.getJSObject(), map));
    }
}
