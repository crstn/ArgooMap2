package com.mapitz.gwt.googleMaps.client;

/**
 * This class described the position of a control in the map view. It consists
 * of a corner relative to where the control is postioned, and an offset that
 * determines this position. It can be passed as optional argument position to
 * the method GMap2.addControl(), and it is returned from method
 * GControl.getDefaultPosition()
 * 
 * @author aglaforge
 * 
 */
public class GControlPosition extends GoogleMapsWidget {

    protected GControlPosition(JSObject element) {
        super(element);
    }

    public static GControlPosition narrowToGControlPosition(JSObject e) {
        return (e == null) ? null : new GControlPosition(e);
    }

    /**
     * Creates a specification for a control position.
     * 
     * @param anchor
     * @param offset
     * @return
     */
    public GControlPosition(GControlAnchor anchor, GSize offset) {
        this(GControlPositionImpl.create(anchor.getIndex(), offset
                .getJSObject()));
    }

}
