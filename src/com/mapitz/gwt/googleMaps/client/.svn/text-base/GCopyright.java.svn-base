package com.mapitz.gwt.googleMaps.client;

/**
 * A copyright object contains information about which copyright message applies
 * to a region of the map given by a rectangle, at a given zoom level. You need
 * this object only if you implement custom map types or tile layers.
 * 
 * @author aglaforge
 * 
 */
public class GCopyright extends GOptionBase {
    protected GCopyright(JSObject element) {
        super(element);
    }

    public static GCopyright narrowToGCopyright(JSObject e) {
        return (e == null) ? null : new GCopyright(e);
    }

    /**
     * Creates a copyright information object with the given properties.
     * 
     * @param id
     * @param bounds
     * @param minZoom
     * @param text
     * @return
     */
    public GCopyright(int id, GLatLngBounds bounds, int minZoom, String text) {
        super(GCopyrightImpl.create(id, bounds.getJSObject(), minZoom, text));
    }

    /**
     * id Number A unique identifier for this copyright information.
     * 
     * @return
     */
    public int getId() {
        return getAttributeAsInt("id");
    }

    /**
     * id Number A unique identifier for this copyright information.
     * 
     * @param id
     */
    public void setId(int id) {
        setAttribute("id", id);
    }

    /**
     * minZoom Number The lowest zoom level at which this information applies.
     * 
     * @return
     */
    public int getMinZooom() {
        return getAttributeAsInt("minZoom");
    }

    /**
     * minZoom Number The lowest zoom level at which this information applies.
     * 
     * @param id
     */
    public void setMinZooom(int id) {
        setAttribute("minZoom", id);
    }

    /**
     * bounds GLatLngBounds The region to which this information applies.
     * 
     * @return
     */
    public GLatLngBounds getBounds() {
        return GLatLngBounds.narrowToGLatLngBounds(GCopyrightImpl
                .getBounds(getJSObject()));
    }

    /**
     * bounds GLatLngBounds The region to which this information applies.
     * 
     * @param bounds
     */
    public void setBounds(GLatLngBounds bounds) {
        setAttribute("bounds", bounds.getJSObject());
    }

    /**
     * text String The text of the copyright message.
     * 
     * @return
     */
    public String getText() {
        return getAttribute("text");
    }

    /**
     * text String The text of the copyright message.
     * 
     * @param text
     */
    public void setText(String text) {
        setAttribute("text", text);
    }

}
