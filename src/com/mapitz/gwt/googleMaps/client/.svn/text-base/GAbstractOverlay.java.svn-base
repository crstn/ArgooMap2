package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

public abstract class GAbstractOverlay extends GOverlay implements
        GOverlayEvents {

    Element element;

    public GAbstractOverlay() {
        super(GOverlayImpl.create(null, 0, null));

        GOverlayImpl.setOverlay(getJSObject(), this);

        // Ensure this value gets set
        GMapPane pane = defaultMapPane();
        pane = (pane == null) ? GMapPane.G_MAP_MARKER_PANE() : pane;
        GOverlayImpl.setPanel(getJSObject(), pane.getIndex());
    }

    protected void init() {
        GOverlayImpl.setElement(getJSObject(), getElement());
    }

    public Element getElement() {
        return this.element;
    }

    public void setElement(Element widgetElement) {
        this.element = widgetElement;
    }

    public abstract GMapPane defaultMapPane();
}
