package de.ifgi.argoomap.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.KeyboardListenerAdapter;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.mapitz.gwt.googleMaps.client.GClientGeocoder;
import com.mapitz.gwt.googleMaps.client.GControl;
import com.mapitz.gwt.googleMaps.client.GEventListener;
import com.mapitz.gwt.googleMaps.client.GFactualGeocodeCache;
import com.mapitz.gwt.googleMaps.client.GGeocodeResultListener;
import com.mapitz.gwt.googleMaps.client.GLatLng;
import com.mapitz.gwt.googleMaps.client.GMap2;
import com.mapitz.gwt.googleMaps.client.GMap2EventManager;
import com.mapitz.gwt.googleMaps.client.GMap2Widget;
import com.mapitz.gwt.googleMaps.client.GMapType;
import com.mapitz.gwt.googleMaps.client.GMarker;
import com.mapitz.gwt.googleMaps.client.GMarkerEventListener;
import com.mapitz.gwt.googleMaps.client.GOverlay;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ArgooMap2 implements EntryPoint {

    public void onModuleLoad() {

        // add map to UI
        GMap2Widget mapWidget = new GMap2Widget();
        RootPanel.get("map").add(mapWidget);
        final GMap2 gmaps = mapWidget.getGmap();

        // add text field to UI
        final TextBox textbox = new TextBox();
        textbox.setText("take me to...");

        // if the users clicks in the textbox, remove the current text:
        textbox.addClickListener(new TextWiper());

        // if "enter" is hit in the search box, send the geocoding query:
        textbox.addKeyboardListener(new KeyboardListenerAdapter() {
            public void onKeyUp(Widget inSender, char inKeyCode, int inModifiers) {
                if (inKeyCode == KeyboardListener.KEY_ENTER) {
                    GFactualGeocodeCache cache = new GFactualGeocodeCache();
                    GClientGeocoder geocoder = new GClientGeocoder(cache);
                    geocoder.getLatLng(textbox.getText(),
                            new GGeocodeResultListener() {
                                public void onSuccess(GLatLng latlng) {
                                    gmaps.panTo(latlng);
                                }

                                public void onFail(String address) {
                                    GWT.log("Failed to locate: " + address,
                                            new Exception("Geocoding failed"));
                                }
                            });
                }
            }
        });
        RootPanel.get("status_buttons").add(textbox);

        // add button to UI
        // Button geocode = new Button("take me to there!", new ClickListener()
        // {
        // public void onClick(Widget sender) {
        // GFactualGeocodeCache cache = new GFactualGeocodeCache();
        // GClientGeocoder geocoder = new GClientGeocoder(cache);
        // geocoder.getLatLng(textbox.getText(),
        // new GGeocodeResultListener() {
        // public void onSuccess(GLatLng latlng) {
        // gmaps.panTo(latlng);
        // }
        //
        // public void onFail(String address) {
        // GWT.log("Failed to locate: " + address,
        // new Exception("Geocoding failed"));
        // }
        //
        // });
        // }
        //
        // });
        // RootPanel.get("status_buttons").add(geocode);

        // set map dimensions
        mapWidget.setHeight("300px");
        mapWidget.setWidth("100%");

        // set map type
        gmaps.setMapType(GMapType.G_NORMAL_MAP());

        GMap2EventManager eventManager = new GMap2EventManager();

        // eventManager.addOnClickListener(gmaps, listener);

        // GMapOptions opts = new GMapOptions();

        // GSize size = new GSize(20, 50);

        // GControlPosition position = new
        // GControlPosition(GControlAnchor.G_ANCHOR_TOP_LEFT(), size);

        gmaps.addControl(GControl.GLargeMapControl());
        gmaps.addControl(GControl.GScaleControl());
        gmaps.addControl(GControl.GOverviewMapControl());
        gmaps.addControl(GControl.GMapTypeControl());
        gmaps.enableContinuousZoom(); // what does this actually do?
        GLatLng pos = new GLatLng(37.4419, -122.1419);
        gmaps.setCenter(pos, 13);

        // eventManager.addOnZoomEndListener(gmaps, listener);

        GMarkerEventListener ml = new GMarkerEventListener() {
            public void onClick(GMarker marker) {
                GWT.log("Clicked on the marker", new Exception(""));
            }

            public void onDblClick(GMarker marker) {
                GWT.log("Double Clicked on the marker", new Exception(""));
            }

            public void onMouseDown(GMarker marker) {
                GWT.log("Mouse down", new Exception(""));
            }

            public void onMouseUp(GMarker marker) {
                GWT.log("Mouse up", new Exception(""));
            }

            public void onMouseOver(GMarker marker) {
                GWT.log("Mouse over", new Exception(""));
            }

            public void onMouseOut(GMarker marker) {
                GWT.log("Mouse out", new Exception(""));
            }

            public void onInfoWindowOpen(GMarker marker) {
                GWT.log("Info window open", new Exception(""));
            }

            public void onInfoWindowClose(GMarker marker) {
                GWT.log("Info window close", new Exception(""));
            }

            public void onRemove(GMarker marker) {
                GWT.log("Removed marker", new Exception(""));
            }

        };

        // add zooming via mouse wheel to the map: DOES NOT WORK FOR SOME
        // REASON...
        // MouseWheel.setMouseWheelListener(RootPanel.get("map").getElement(),
        // new MouseWheelListener() {
        // public void onMouseWheelUp(int intensity) {
        // Window.alert("up.. " + intensity);
        // }
        // public void onMouseWheelDown(int intensity) {
        // Window.alert("down..." + intensity);
        // }
        // });

        /*
         * GMarker gmarker = GMarker.create(pos); GMarkerEventManager
         * markerEventManager = new GMarkerEventManager();
         * markerEventManager.addOnClickListener(gmarker, ml);
         * markerEventManager.addOnDblClickListener(gmarker, ml);
         * markerEventManager.addOnInfoWindowCloseListener(gmarker, ml);
         * markerEventManager.addOnInfoWindowOpenListener(gmarker, ml);
         * markerEventManager.addOnMouseDownListener(gmarker, ml);
         * markerEventManager.addOnMouseOutListener(gmarker, ml);
         * markerEventManager.addOnMouseOverListener(gmarker, ml);
         * markerEventManager.addOnMouseUpListener(gmarker, ml);
         * markerEventManager.addOnRemoveListener(gmarker, ml);
         * gmaps.addOverlay(gmarker);
         */

        // gmaps.checkResize();
        // some panning tests:
        // geocoder.getLatLng("Tiergarten, Berlin, Germany", gResult);
        // geocoder.getLatLng("Alexanderplatz, Berlin, Germany", gResult);
    }

}
