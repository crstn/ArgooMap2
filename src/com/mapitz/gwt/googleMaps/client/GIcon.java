package com.mapitz.gwt.googleMaps.client;

/**
 * An icon specifies the images used to display a GMarker on the map. For
 * browser compatibility reasons, specifying an icon is actually quite complex.
 * Note that you can use the default Maps icon G_DEFAULT_ICON if you don't want
 * to specify your own.
 * 
 * @author aglaforge
 * 
 */
public class GIcon extends GOptionBase {
    protected GIcon(JSObject element) {
        super(element);
    }

    public static GIcon narrowToGIcon(JSObject e) {
        return (e == null) ? null : new GIcon(e);
    }

    public GIcon(GIcon other, String url) {
        this(GIconImpl.create(other.getJSObject(), url));
    }

    public GIcon(GIcon other) {
        this(GIconImpl.create(other.getJSObject()));
    }

    public GIcon() {
        this(GIconImpl.create());
    }

    /**
     * G_DEFAULT_ICON
     */
    public GIcon getDefaultIcon() {
        return G_DEFAULT_ICON();
    }

    public GIcon G_DEFAULT_ICON() {
        return GIcon.narrowToGIcon(GIconImpl.G_DEFAULT_ICON());
    }

    /**
     * The foreground image URL of the icon.
     */
    public String getImage() {
        return getAttribute("image");
    }

    /**
     * The foreground image URL of the icon.
     */
    public void setImage(String url) {
        setAttribute("image", url);
    }

    /**
     * The shadow image URL of the icon.
     */
    public String getShadow() {
        return getAttribute("shadow");
    }

    /**
     * The shadow image URL of the icon.
     */
    public void setShadow(String url) {
        setAttribute("shadow", url);
    }

    /**
     * The pixel size of the foreground image of the icon.
     */
    public GSize getIconSize() {
        return GSize.narrowToGSize(getAttributeAsJSObject("iconSize"));
    }

    /**
     * The pixel size of the foreground image of the icon.
     */
    public void setIconSize(GSize size) {
        setAttribute("iconSize", size.getJSObject());
    }

    /**
     * The pixel size of the shadow image.
     */
    public GSize getShadowSize() {
        return GSize.narrowToGSize(getAttributeAsJSObject("shadowSize"));
    }

    /**
     * The pixel size of the shadow image.
     */
    public void setShadowSize(GSize size) {
        setAttribute("shadowSize", size.getJSObject());
    }

    /**
     * The pixel coordinate relative to the top left corner of the icon image at
     * which this icon is anchored to the map.
     */
    public void setIconAnchor(GPoint gpoint) {
        setAttribute("iconAnchor", gpoint.getJSObject());
    }

    /**
     * The pixel coordinate relative to the top left corner of the icon image at
     * which this icon is anchored to the map.
     */
    public GPoint getIconAnchor() {
        return GPoint.narrowToGPoint(getAttributeAsJSObject("iconAnchor"));
    }

    /**
     * infoWindowAnchor GPoint The pixel coordinate relative to the top left
     * corner of the icon image at which the info window is anchored to this
     * icon.
     */
    public void setInfoWindowAnchor(GPoint gpoint) {
        setAttribute("infoWindowAnchor", gpoint.getJSObject());
    }

    /**
     * infoWindowAnchor GPoint The pixel coordinate relative to the top left
     * corner of the icon image at which the info window is anchored to this
     * icon.
     */
    public GPoint getInfoWindowAnchor() {
        return GPoint
                .narrowToGPoint(getAttributeAsJSObject("infoWindowAnchor"));
    }

    /**
     * The URL of the foreground icon image used for printed maps. It must be
     * the same size as the main icon image given by image.
     */
    public String getPrintImage() {
        return getAttribute("printImage");
    }

    /**
     * The URL of the foreground icon image used for printed maps. It must be
     * the same size as the main icon image given by image.
     */
    public void setPrintImage(String url) {
        setAttribute("printImage", url);
    }

    /**
     * The URL of the foreground icon image used for printed maps in
     * Firefox/Mozilla. It must be the same size as the main icon image given by
     * image.
     */
    public String getMozPrintImage() {
        return getAttribute("mozPrintImage");
    }

    /**
     * The URL of the foreground icon image used for printed maps in
     * Firefox/Mozilla. It must be the same size as the main icon image given by
     * image.
     */
    public void setMozPrintImage(String url) {
        setAttribute("mozPrintImage", url);
    }

    /**
     * The URL of the shadow image used for printed maps. It should be a GIF
     * image since most browsers cannot print PNG images.
     */
    public String getPrintShadow() {
        return getAttribute("printShadow");
    }

    /**
     * The URL of the shadow image used for printed maps. It should be a GIF
     * image since most browsers cannot print PNG images.
     */
    public void setPrintShadow(String url) {
        setAttribute("printShadow", url);
    }

    /**
     * The URL of a virtually transparent version of the foreground icon image
     * used to capture click events in Internet Explorer. This image should be a
     * 24-bit PNG version of the main icon image with 1% opacity, but the same
     * shape and size as the main icon.
     */
    public String getTransparent() {
        return getAttribute("transparent");
    }

    /**
     * The URL of a virtually transparent version of the foreground icon image
     * used to capture click events in Internet Explorer. This image should be a
     * 24-bit PNG version of the main icon image with 1% opacity, but the same
     * shape and size as the main icon.
     */
    public void setTransparent(String url) {
        setAttribute("transparent", url);
    }

    /**
     * An array of integers representing the x/y coordinates of the image map we
     * should use to specify the clickable part of the icon image in browsers
     * other than Internet Explorer.
     */
    public int[] getImageMap() {
        return getAttributeAsIntArray("imageMap");
    }

    /**
     * An array of integers representing the x/y coordinates of the image map we
     * should use to specify the clickable part of the icon image in browsers
     * other than Internet Explorer.
     */
    public void setImageMap(int[] val) {
        setAttribute("imageMap", val);
    }

}
