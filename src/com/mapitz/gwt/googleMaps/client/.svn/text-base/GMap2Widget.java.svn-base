package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The basic GMap2Widget, the is the class you need to start with in the GWT
 * framework. <br/>Example: <br/>GMap2Widget mapWidget = new GMap2Widget(e);
 * <br/> <br/>access the GMap2 object by: <br/>GMap2 gmaps =
 * mapWidget.getGmap();
 * 
 * @author aglaforge
 * 
 */
public class GMap2Widget extends Widget {
    private static VerticalPanel hiddenPanel;
    protected static GLatLng defaultCenter = new GLatLng(37.4419, -122.1419);
    protected static int defaultZoom = 13;
    protected static GMapOptions defaultOptions = null;

    public static GMapOptions getDefaultOptions() {
        return defaultOptions;
    }

    public static void setDefaultOptions(GMapOptions defaultOptions) {
        GMap2Widget.defaultOptions = defaultOptions;
    }

    public static GLatLng getDefaultCenter() {
        return defaultCenter;
    }

    public static void setDefaultCenter(GLatLng defaultCenter) {
        GMap2Widget.defaultCenter = defaultCenter;
    }

    public static int getDefaultZoom() {
        return defaultZoom;
    }

    public static void setDefaultZoom(int defaultZoom) {
        GMap2Widget.defaultZoom = defaultZoom;
    }

    GMap2 gmap;
    GLatLng initialCenter;
    int initialZoom;
    GMapOptions options;

    public GMap2Widget() {
        this("300px", "300px", getDefaultCenter(), getDefaultZoom(),
                getDefaultOptions());
    }

    public GMap2Widget(String height, String width) {
        this(height, width, getDefaultCenter(), getDefaultZoom(),
                getDefaultOptions());
    }

    public GMap2Widget(String height, String width, GLatLng center, int zoom,
            GMapOptions options) {
        sanityCheck();
        Element e = DOM.createDiv();
        setElement(e);
        setHeight(height);
        setWidth(width);
        getHiddenPanel().add(this);
        this.initialCenter = center;
        this.initialZoom = zoom;
        this.options = options;
    }

    private static VerticalPanel getHiddenPanel() {
        if (hiddenPanel == null) {
            hiddenPanel = new VerticalPanel();
            hiddenPanel.setHeight("1px");
            hiddenPanel.setWidth("1px");
            // hiddenPanel.setVisible(true);
            RootPanel.get().add(hiddenPanel);
        }

        return hiddenPanel;
    }

    // private native String fixSize(String subject)/*-{
    // return subject.replace(/(^\d+$)/g, "$1px");
    // }-*/;

    public void setHeight(String height) {
        if (height.matches("^\\d+$")) {
            super.setHeight(height + "px");
        } else
            super.setHeight(height);

        // If it's not initialized yet there is no need to do anything
        if (gmap != null)
            gmap.checkResize();
    }

    public void setWidth(String width) {
        if (width.matches("^\\d+$")) {
            super.setWidth(width + "px");
        } else
            super.setWidth(width);

        // If it's not initialized yet there is no need to do anything
        if (gmap != null)
            gmap.checkResize();
    }

    public GMapOptions getOptions() {
        return options;
    }

    public void setOptions(GMapOptions options) {
        this.options = options;
    }

    public GMap2 getGmap() {
        // The preference here is lazy initalization
        if (gmap == null) {
            gmap = new GMap2(getElement(), options);
            gmap.setCenter(initialCenter, initialZoom);
            gmap.checkResize();
        }
        return gmap;
    }

    protected void sanityCheck() {
        if (!GWT.isScript()) {
            if (!isGoogleMapsScriptIncluded()) {
                GWT
                        .log(
                                "Google Maps GWT Configuration Error:",
                                new Exception(
                                        "The Javascript for the Google Maps API appears to be missing from your HTML file"));
                GWT
                        .log(
                                "PROBLEM DETECTED: The Javascript for the Google Maps API appears to be missing from your HTML file.",
                                null);
                GWT
                        .log(
                                "Recommendation: You should have a line like: <script src=\"http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAA2uVP_UOqpQ8kN5UusRJxtRTb-vLQlFZmc2N8bgWI8YDPp5FEVBTeVqWarvzWD3SO7oLG9SYKPHZvRg\" type=\"text/javascript\"></script> in your <HEAD></HEAD>",
                                null);
            }

            if (!isVNamespacePresent()) {
                GWT.log("Google Maps GWT Configuration Error:", new Exception(
                        "VML support missing from your HTML file"));
                GWT
                        .log(
                                "PROBLEM DETECTED: VML support missing from your HTML file.  GPolyline and GPolygon will not function properly in IE.",
                                null);
                GWT
                        .log(
                                "Recommendation: Replace your HTML tag with: <html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\">",
                                null);
                GWT
                        .log(
                                "Recommendation: Insert the following style between your Head tags:\n<style type=\"text/css\">\nv\\:* {\nbehavior:url(#default#VML);\n}\n</style>",
                                null);
            }
        }
    }

    public boolean isGoogleMapsScriptIncluded() {
        Element head = ElementHelper.getHead();
        JSObject scripts = ElementHelper.getElementsByTagName(head, "script");
        JElementArray array = new JElementArray(scripts);
        int length = array.length();

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                String text = DOM.getAttribute(array.getAsElement(i), "src");
                if (text.matches("http://maps.google.com/maps.*"))
                    return true;
            }
        }
        return false;
    }

    public static native boolean isVNamespacePresent()/*-{
     if ($doc.namespaces) return ($doc.namespaces['v'] != null);
     else
     {
     var html = $wnd.top.document.getElementsByTagName("html")[0];
     if(html.getAttribute('xmlns:v')) return true;
     }
     return false;
     }-*/;

    protected void onAttach() {
        super.onAttach();
        // Corrects a centering issue when the map object is moved to another
        // parent
        if (this.getParent() != getHiddenPanel()) {
            // If it's not initialized yet there is no need to do anything
            if (gmap != null) {
                GLatLng center = gmap.getCenter();
                gmap.setCenter(center);
                gmap.checkResize();
            }
        }
    }
}
