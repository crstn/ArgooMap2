package com.mapitz.gwt.googleMaps.client;

/**
 * Instantiate this class to add keyboard bindings to a map. The key bindings
 * are the same as for the maps application. key action up, down, left, right
 * Moves the map continuously while the key is pressed. Two keys can be pressed
 * simultaneously in order to move diagonally. page down, page up, home, end
 * Pans the map by 3/4 its size in the corresponding direction, with a nice
 * animation. This corresponds to the arrow buttons in the GLargeMapControl and
 * the GSmallMapControl. +, - Zooms one level in or out, respectively. This
 * corresponds to the + and - buttons in the GLargeMapControl and the
 * GSmallMapControl.
 * 
 * @author aglaforge
 */
public class GKeyboardHandler extends GoogleMapsWidget {

    protected GKeyboardHandler(JSObject element) {
        super(element);
    }

    public static GKeyboardHandler narrowToGKeyboardHandler(JSObject e) {
        return (e == null) ? null : new GKeyboardHandler(e);
    }

    /**
     * Installs keyboard event handler for the map passed as argument.
     * 
     * @param map
     */
    public GKeyboardHandler(GMap2 map) {
        super(GKeyboardHandlerImpl.create(map.getJSObject()));
    }
}
