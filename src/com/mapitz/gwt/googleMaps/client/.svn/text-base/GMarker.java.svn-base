package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.ui.Widget;

/**
 * A GMarker marks a position on the map. It implements the GOverlay interface
 * and thus is added to the map using the GMap2.addOverlay() method. <br/>A
 * marker object has a point, which is the geographical position where the
 * marker is anchored on the map, and an icon. If the icon is not set in the
 * constructor, the default icon G_DEFAULT_ICON is used. <br/>After it is added
 * to a map, the info window of that map can be opened through the marker. The
 * marker object will fire mouse events and infowindow events.
 * 
 * @author aglaforge
 * 
 */
public class GMarker extends GOverlay {
    protected GMarker(JSObject element) {
        super(element);
    }

    public static GMarker narrowToGMarker(JSObject element) {
        return (element == null) ? null : new GMarker(element);
    }

    /**
     * GMarker(point, opts?) Creates a marker at point with options specified in
     * GMarkerOptions. By default markers are clickable & have the default icon
     * G_DEFAULT_ICON. (Since 2.50)
     */
    public GMarker(GLatLng point, GMarkerOptions opts) {
        this(GMarkerImpl.create(point.getJSObject(), opts.getJSObject()));
    }

    /**
     * GMarker(point, opts?) Creates a marker at point with options specified in
     * GMarkerOptions. By default markers are clickable & have the default icon
     * G_DEFAULT_ICON. (Since 2.50)
     */
    public GMarker(GLatLng point) {
        this(GMarkerImpl.create(point.getJSObject()));
    }

    /**
     * openInfoWindow(content, opts?) none Opens the map info window over the
     * icon of the marker. The content of the info window is given as a DOM
     * node. Only option GInfoWindowOptions.maxWidth is applicable.
     */
    public void openInfoWindow(Widget widget, GInfoWindowOptions opts) {
        GInfoWindowManager.getInstance().associate(widget);
        GMarkerImpl.openInfoWindow(getJSObject(), widget.getElement(), opts
                .getJSObject());
    }

    /**
     * openInfoWindow(content, opts?) none Opens the map info window over the
     * icon of the marker. The content of the info window is given as a DOM
     * node. Only option GInfoWindowOptions.maxWidth is applicable.
     */
    public void openInfoWindow(Widget widget) {
        GInfoWindowManager.getInstance().associate(widget);
        GMarkerImpl.openInfoWindow(getJSObject(), widget.getElement());
    }

    /**
     * openInfoWindowHtml(content, opts?) none Opens the map info window over
     * the icon of the marker. The content of the info window is given as a
     * string that contains HTML text. Only option GInfoWindowOptions.maxWidth
     * is applicable.
     */
    public void openInfoWindowHtml(String content, GInfoWindowOptions opts) {
        GMarkerImpl.openInfoWindowHtml(getJSObject(), content, opts
                .getJSObject());
    }

    /**
     * openInfoWindowHtml(content, opts?) none Opens the map info window over
     * the icon of the marker. The content of the info window is given as a
     * string that contains HTML text. Only option GInfoWindowOptions.maxWidth
     * is applicable.
     */
    public void openInfoWindowHtml(String content) {
        GMarkerImpl.openInfoWindowHtml(getJSObject(), content);
    }

    /**
     * Undocumented method to enable Draggable points
     */
    public void enableDragging() {
        GMarkerImpl.enableDragging(getJSObject());
    }

    /**
     * openInfoWindowTabs(tabs, opts?) none Opens the tabbed map info window
     * over the icon of the marker. The content of the info window is given as
     * an array of tabs that contain the tab content as DOM nodes. Only options
     * GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are
     * applicable.
     */
    public void openInfoWindowTabs(GInfoWindowTab[] tabs,
            GInfoWindowOptions opts) {
        GInfoWindowManager.getInstance().associate(tabs);
        GMarkerImpl.openInfoWindowTabs(getJSObject(), ElementHelper
                .arrayConvert(tabs), opts.getJSObject());
    }

    /**
     * openInfoWindowTabs(tabs, opts?) none Opens the tabbed map info window
     * over the icon of the marker. The content of the info window is given as
     * an array of tabs that contain the tab content as DOM nodes. Only options
     * GInfoWindowOptions.maxWidth and InfoWindowOptions.selectedTab are
     * applicable.
     */
    public void openInfoWindowTabs(GInfoWindowTab[] tabs) {
        GInfoWindowManager.getInstance().associate(tabs);
        GMarkerImpl.openInfoWindowTabs(getJSObject(), ElementHelper
                .arrayConvert(tabs));
    }

    /**
     * openInfoWindowTabsHtml(tabs, opts?) none Opens the tabbed map info window
     * over the icon of the marker. The content of the info window is given as
     * an array of tabs that contain the tab content as Strings that contain
     * HTML text. Only options InfoWindowOptions.maxWidth and
     * InfoWindowOptions.selectedTab are applicable.
     */
    public void openInfoWindowTabsHtml(GInfoWindowTab[] tabs,
            GInfoWindowOptions opts) {
        GMarkerImpl.openInfoWindowTabsHtml(getJSObject(), ElementHelper
                .arrayConvert(tabs), opts.getJSObject());
    }

    /**
     * openInfoWindowTabsHtml(tabs, opts?) none Opens the tabbed map info window
     * over the icon of the marker. The content of the info window is given as
     * an array of tabs that contain the tab content as Strings that contain
     * HTML text. Only options InfoWindowOptions.maxWidth and
     * InfoWindowOptions.selectedTab are applicable.
     */
    public void openInfoWindowTabsHtml(GInfoWindowTab[] tabs) {
        GMarkerImpl.openInfoWindowTabsHtml(getJSObject(), ElementHelper
                .arrayConvert(tabs));
    }

    /**
     * showMapBlowup(opts?) none Opens the map info window over the icon of the
     * marker. The content of the info window is a closeup map around the marker
     * position. Only options InfoWindowOptions.zoomLevel and
     * InfoWindowOptions.mapType are applicable.
     */
    public void showMapBlowup(GInfoWindowOptions opts) {
        GMarkerImpl.showMapBlowup(getJSObject(), opts.getJSObject());
    }

    /**
     * showMapBlowup(opts?) none Opens the map info window over the icon of the
     * marker. The content of the info window is a closeup map around the marker
     * position. Only options InfoWindowOptions.zoomLevel and
     * InfoWindowOptions.mapType are applicable.
     */
    public void showMapBlowup() {
        GMarkerImpl.showMapBlowup(getJSObject());
    }

    /**
     * getIcon() GIcon Returns the icon of this marker, as set by the
     * constructor.
     */
    public GIcon getIcon() {
        return GIcon.narrowToGIcon(GMarkerImpl.getIcon(getJSObject()));
    }

    /**
     * getPoint() GLatLng Returns the geographical coordinates of the point at
     * which this marker is anchored, as set by the constructor or by
     * setPoint().
     */
    public GLatLng getPoint() {
        return GLatLng.narrowToGLatLng(GMarkerImpl.getPoint(getJSObject()));
    }

    /**
     * setPoint(point) none Sets the geographical coordinates of the point at
     * which this marker is anchored.
     */
    public void setPoint(GLatLng point) {
        GMarkerImpl.setPoint(getJSObject(), point.getJSObject());
    }
}
