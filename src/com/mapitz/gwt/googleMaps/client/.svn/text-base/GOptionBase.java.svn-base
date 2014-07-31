package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

public class GOptionBase extends GoogleMapsWidget {

    protected GOptionBase(JSObject element) {
        super(element);
    }

    public static GOptionBase narrowToGOptionBase(JSObject element) {
        return (element == null) ? null : new GOptionBase(element);
    }

    public GOptionBase() {
        this(GOptionBaseImpl.create());
    }

    protected void setAttribute(String attr, boolean value) {
        ElementHelper.setAttribute(getJSObject(), attr, value);
    }

    protected void setAttribute(String attr, int value) {
        ElementHelper.setAttribute(getJSObject(), attr, value);
    }

    protected void setAttribute(String attr, int[] value) {
        setAttribute(attr, new JIntArray(value).getJSObject());
    }

    protected void setAttribute(String attr, String value) {
        ElementHelper.setAttribute(getJSObject(), attr, value);
    }

    protected void setAttribute(String attr, Element value) {
        ElementHelper.setAttribute(getJSObject(), attr, value);
    }

    protected void setAttribute(String attr, JSObject value) {
        ElementHelper.setAttribute(getJSObject(), attr, value);
    }

    protected String getAttribute(String attr) {
        return ElementHelper.getAttribute(getJSObject(), attr);
    }

    protected boolean getAttributeAsBoolean(String attr) {
        return ElementHelper.getAttributeAsBoolean(getJSObject(), attr);
    }

    protected double getAttributeAsDouble(String attr) {
        return ElementHelper.getAttributeAsDouble(getJSObject(), attr);
    }

    protected Element getAttributeAsElement(String attr) {
        return ElementHelper.getAttributeAsElement(getJSObject(), attr);
    }

    protected JSObject getAttributeAsJSObject(String attr) {
        return ElementHelper.getAttributeAsJSObject(getJSObject(), attr);
    }

    protected int getAttributeAsInt(String attr) {
        return ElementHelper.getAttributeAsInt(getJSObject(), attr);
    }

    // TODO Perhaps move these back to helper methods
    protected int[] getAttributeAsIntArray(String attr) {
        return new JIntArray(getAttributeAsJSObject(attr)).toArray();
    }
}
