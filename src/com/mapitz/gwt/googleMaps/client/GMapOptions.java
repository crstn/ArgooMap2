package com.mapitz.gwt.googleMaps.client;

/**
 * Additional options for the GMap
 * 
 * @author aglaforge
 * 
 */
public class GMapOptions extends GOptionBase {

    protected GMapOptions(JSObject element) {
        super(element);
    }

    public static GMapOptions narrowToGMapOptions(JSObject element) {
        return (element == null) ? null : new GMapOptions(element);
    }

    public GMapOptions() {
        super();
    }

    /**
     * The cursor to display while dragging the map. (Since 2.59)
     * 
     * @param url
     */
    public void setDraggingCursor(String url) {
        setAttribute("draggingCursor", url);
    }

    /**
     * The cursor to display while dragging the map. (Since 2.59)
     * 
     * @return
     */
    public String getDraggingCursor() {
        return getAttribute("draggingCursor");
    }

    /**
     * The cursor to display when the map is draggable. (Since 2.59)
     * 
     * @param url
     */
    public void setDraggableCursor(String url) {
        setAttribute("draggableCursor", url);
    }

    /**
     * The cursor to display when the map is draggable. (Since 2.59)
     * 
     * @return
     */
    public String getDraggableCursor() {
        return getAttribute("draggableCursor");
    }

    /**
     * size GSize Sets the size in pixels of the map. The container that is
     * passed to the map constructor will be resized to the given size. By
     * default, the map will assume the size of its container.
     */
    public void setSize(GSize size) {
        setAttribute("size", size.getJSObject());
    }

    /**
     * size GSize Sets the size in pixels of the map. The container that is
     * passed to the map constructor will be resized to the given size. By
     * default, the map will assume the size of its container.
     */
    public GSize getSize() {
        return GSize.narrowToGSize(getAttributeAsJSObject("size"));
    }

    /**
     * mapTypes Array of GMapType Array of map types to be used by this map. By
     * default, G_DEFAULT_MAP_TYPES is used. You can use this option to restrict
     * the set of predefined map types that is displayed on the map, or to pass
     * your own map types to the map. See also GMap2.addMapType().
     */
    public void setMapTypes(GMapType[] array) {
        setAttribute("mapTypes", ElementHelper.arrayConvert(array));
    }

    /**
     * mapTypes Array of GMapType Array of map types to be used by this map. By
     * default, G_DEFAULT_MAP_TYPES is used. You can use this option to restrict
     * the set of predefined map types that is displayed on the map, or to pass
     * your own map types to the map. See also GMap2.addMapType().
     */
    public GMapType[] getMapTypes() {
        GMapType[] rtn = null;
        JSObject hold = getAttributeAsJSObject("mapTypes");

        if (hold != null) {
            JObjectArray array = new JObjectArray(hold);
            int size = array.length();
            rtn = new GMapType[size];

            for (int i = 0; i < size; i++) {
                rtn[i] = new GMapType(array.get(i));
            }
        }

        return rtn;
    }

    /**
     * makes the Google Logo unclickable
     * 
     * @param bool
     */
    public void setLogoPassive(boolean bool) {
        setAttribute("logoPassive", bool);
    }

    /**
     * makes the Google Logo unclickable
     * 
     * @return
     */
    public boolean getLogoPassive() {
        return getAttributeAsBoolean("logoPassive");
    }
}
