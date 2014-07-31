package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.ui.Widget;

/**
 * An array of instances of this class can be passed as the tabs argument to the
 * methods GMap2.openInfoWindowTabs(), GMap2.openInfoWindowTabsHtml(),
 * GMarker.openInfoWindowTabs(), and GMarker.openInfoWindowTabsHtml(). If the
 * array contains more than one element, the info window will be shown with
 * tabs. Every InfoWindowTab object contains two items: content defines the
 * content of the info window when the tab is selected, and label defines the
 * label of the tab. The properties are passed as arguments to the constructor.
 * For the openInfoWindowTabs() methods, content is a DOM Node. For the methods
 * openInfoWindowTabsHtml(), content is a string that contains HTML text.
 * 
 * @author aglaforge
 * 
 */
public class GInfoWindowTab extends GoogleMapsWidget {
    protected Widget widget;

    protected GInfoWindowTab(JSObject element) {
        super(element);
    }

    public static GInfoWindowTab narrowToGInfoWindowTab(JSObject e) {
        return (e == null) ? null : new GInfoWindowTab(e);
    }

    public GInfoWindowTab(String label, String content) {
        this(GInfoWindowTabImpl.create(label, content));
    }

    public GInfoWindowTab(String label, Widget widget) {
        this(GInfoWindowTabImpl.create(label, widget.getElement()));
        setWidget(widget);
    }

    Widget getWidget() {
        return widget;
    }

    void setWidget(Widget widget) {
        this.widget = widget;
    }
}
