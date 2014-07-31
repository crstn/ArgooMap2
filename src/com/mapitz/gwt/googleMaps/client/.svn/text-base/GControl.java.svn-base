package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Interface and factory for contols to control the Map (Zoom, Scale, etc...).
 * Controls are added to the map using the GMap2.addControl() method. <br/>In
 * contrast to overlays, which are positioned relative to the map, controls are
 * positioned relative to the map view, i.e. they don't move when the map moves.
 * 
 * @author aglaforge
 * 
 */
public class GControl extends GoogleMapsWidget {
    protected GControl(JSObject element) {
        super(element);
    }

    public static GControl narrowToGControl(JSObject element) {
        return (element == null) ? null : new GControl(element);
    }

    public GControl(Widget w, GControlPosition position) {
        this(GControlImpl.create(w.getElement(), position.getJSObject()));
        GWTHelper.attach(w);
    }

    /**
     * Creates a control with buttons to pan in four directions, and zoom in and
     * zoom out, and a zoom slider.
     * 
     * @return
     */
    public static GControl GLargeMapControl() {
        return narrowToGControl(GControlImpl.GLargeMapControl());
    }

    /**
     * Creates a control with a collapsible overview map in the corner of the
     * screen
     */
    public static GControl GOverviewMapControl() {
        return narrowToGControl(GControlImpl.GOverviewMapControl());
    }

    /**
     * Creates a control with buttons to switch between map types.
     * 
     * @return
     */
    public static GControl GMapTypeControl() {
        return narrowToGControl(GControlImpl.GMapTypeControl());
    }

    /**
     * Creates a control that displays the map scale.
     * 
     * @return
     */
    public static GControl GScaleControl() {
        return narrowToGControl(GControlImpl.GScaleControl());
    }

    /**
     * Creates a control with buttons to pan in four directions, and zoom in and
     * zoom out.
     * 
     * @return
     */
    public static GControl GSmallMapControl() {
        return narrowToGControl(GControlImpl.GSmallMapControl());
    }

    /**
     * Creates a control with buttons to zoom in and zoom out.
     * 
     * @return
     */
    public static GControl GSmallZoomControl() {
        return narrowToGControl(GControlImpl.GSmallZoomControl());
    }

    /**
     * printable() Boolean Returns to the map if the control should be
     * printable.
     * 
     * @return
     */
    public boolean printable() {
        return GControlImpl.printable(getJSObject());
    }

    /**
     * selectable() Boolean Returns to the map if the control contains
     * selectable text.
     * 
     * @return
     */
    public boolean selectable() {
        return GControlImpl.selectable(getJSObject());
    }

    /**
     * initialize(map) Node Will be called by the map so the control can
     * initialize itself. The control will use the method GMap2.getContainer()
     * to get hold of the DOM element that contains the map, and add itself to
     * it. It returns the added element.
     * 
     * @return
     */
    public Element initialize(GMap2 map) {
        return GControlImpl.initialize(getJSObject(), map.getJSObject());
    }

    /**
     * getDefaultPosition() GControlPosition Returns to the map the position in
     * the map view at which the control appears by default. This will be
     * overridden by the second argument to GMap2.addControl().
     * 
     * @return
     */
    public GControlPosition getDefaultPosition() {
        return GControlPosition.narrowToGControlPosition(GControlImpl
                .getDefaultPosition(getJSObject()));
    }
}
