package com.mapitz.gwt.googleMaps.client;

/**
 * The are some predefined map types. This class can be used to define custom
 * map types. In order to pass them to the map, use the GMap2 constructor, or
 * the GMap2.addMapType() method. <br/>This class can also be subclassed.
 * Constructor arguments can be omitted if instantiated as a prototype. A
 * subclass constructor must invoke the GMapType constructor using call().
 * 
 * @author aglaforge
 * 
 */
public class GMapType extends GoogleMapsWidget {
    protected GMapType(JSObject element) {
        super(element);
    }

    public static GMapType narrowToGMapType(JSObject element) {
        return (element == null) ? null : new GMapType(element);
    }

    /**
     * GMapType(layers, projection, name, opts?) Constructs a map type with the
     * given tile layers, projection, name, and optional parameters.
     */
    public GMapType(GTileLayer[] layers, GProjection projection, String name) {
        this(GMapTypeImpl.create(ElementHelper.arrayConvert(layers), projection
                .getJSObject(), name));
    }

    /**
     * GMapType(layers, projection, name, opts?) Constructs a map type with the
     * given tile layers, projection, name, and optional parameters.
     */
    public GMapType(GTileLayer[] layers, GProjection projection, String name,
            GMapTypeOptions opts) {
        this(GMapTypeImpl.create(ElementHelper.arrayConvert(layers), projection
                .getJSObject(), name, opts.getJSObject()));
    }

    /**
     * getSpanZoomLevel(center, span, viewSize) Number Returns to the map the
     * zoom level at which the map section defined by center and span fits into
     * the map view of the given size in pixels.
     */
    public int getSpanZoomLevel(GLatLng center, GLatLng span, GSize viewSize) {
        return GMapTypeImpl.getSpanZoomLevel(getJSObject(), center
                .getJSObject(), span.getJSObject(), viewSize.getJSObject());
    }

    /**
     * getBoundsZoomLevel(bounds, viewSize) none Returns to the map the zoom
     * level at which the map section defined by bounds fits into the map view
     * of the given size in pixels.
     */
    public int getBoundsZoomLevel(GLatLngBounds bounds, GSize viewSize) {
        return GMapTypeImpl.getBoundsZoomLevel(getJSObject(), bounds
                .getJSObject(), viewSize.getJSObject());
    }

    /**
     * getName(opt_short) String Returns to the map the name of the map type to
     * be used as the button label in the GMapTypeControl.
     */
    public String getName(boolean opt_short) {
        return GMapTypeImpl.getName(getJSObject(), opt_short);
    }

    /**
     * getProjection() GProjection Returns to the map the projection of this map
     * type.
     */
    public GProjection getProjection() {
        return GProjection.narrowToGProjection(GMapTypeImpl
                .getProjection(getJSObject()));
    }

    /**
     * getTileSize() Number Returns to the map the map tile size in pixels of
     * this map type. The tiles are assumed to be quadratic. All tile layers
     * have the same tile size.
     */
    public int getTileSize() {
        return GMapTypeImpl.getTileSize(getJSObject());
    }

    /**
     * getTileLayers() Array of GTileLayer Returns to the map the array of tile
     * layers.
     */
    public GTileLayer[] getTileLayers() {
        GTileLayer[] rtn = null;

        JObjectArray array = new JObjectArray(GMapTypeImpl
                .getTileLayers(getJSObject()));
        int size = array.length();

        if (size > -1) {
            rtn = new GTileLayer[size];

            for (int i = 0; i < size; i++) {
                rtn[i] = new GTileLayer(array.get(i));
            }
        }

        return rtn;
    }

    /**
     * getMinimumResolution(latlng?) Number Returns to the map the lowest zoom
     * level at which this map type is defined.
     */
    public int getMinimumResolution(GLatLng latlng) {
        return GMapTypeImpl.getMinimumResolution(getJSObject(), latlng
                .getJSObject());
    }

    /**
     * getMinimumResolution(latlng?) Number Returns to the map the lowest zoom
     * level at which this map type is defined.
     */
    public int getMinimumResolution() {
        return GMapTypeImpl.getMinimumResolution(getJSObject());
    }

    /**
     * getMaximumResolution(latlng?) Number Returns to the map the highest zoom
     * level at which this map type is defined.
     */
    public int getMaximumResolution(GLatLng latlng) {
        return GMapTypeImpl.getMaximumResolution(getJSObject(), latlng
                .getJSObject());
    }

    /**
     * getMaximumResolution(latlng?) Number Returns to the map the highest zoom
     * level at which this map type is defined.
     */
    public int getMaximumResolution() {
        return GMapTypeImpl.getMaximumResolution(getJSObject());
    }

    /**
     * getTextColor() String Returns to the map the color that is best used for
     * text that is overlaid on the map. Used for the color of the text of the
     * copyright message displayed by the copyroght control.
     */
    public String getTextColor() {
        return GMapTypeImpl.getTextColor(getJSObject());
    }

    /**
     * getLinkColor() String Returns to the map the color that is best used for
     * a hyperlink that is overlaid on the map. Used for the color of the link
     * to the terms of use displayed by the copyroght control.
     */
    public String getLinkColor() {
        return GMapTypeImpl.getLinkColor(getJSObject());
    }

    /**
     * getErrorMessage() String Returns to the map the error message that is
     * displayed in areas or on zoom level where this map type doesn't have map
     * tiles.
     */
    public String getErrorMessage() {
        return GMapTypeImpl.getErrorMessage(getJSObject());
    }

    /**
     * getCopyrights(bounds, zoom) Array of String Returns to the map the
     * copyright messages appropriate for the region described by bounds at the
     * given zoom level. This is used by the GCopyrightControl to display the
     * copyright message on the map.
     */
    public String[] getCopyrights(GLatLngBounds bounds, int zoom) {
        JSObject e = GMapTypeImpl.getCopyrights(getJSObject(), bounds
                .getJSObject(), zoom);
        if (e == null)
            return null;
        return new JStringArray(e).toArray();
    }

    /**
     * getUrlArg() String Returns to the map a value that is used as a URL
     * paramater value to identify this map type in permalinks to the current
     * map view. This is currently only used by the maps application.
     */
    public String getUrlArg() {
        return GMapTypeImpl.getUrlArg(getJSObject());
    }

    /**
     * G_NORMAL_MAP This is the normal street map type.
     */
    public static GMapType G_NORMAL_MAP() {
        return narrowToGMapType(GMapTypeImpl.G_NORMAL_MAP());
    }

    /**
     * G_SATELLITE_MAP This map type shows Google Earth satellite images.
     */
    public static GMapType G_SATELLITE_MAP() {
        return narrowToGMapType(GMapTypeImpl.G_SATELLITE_MAP());
    }

    /**
     * G_HYBRID_MAP This map type shows transparent street maps over Google
     * Earth satellite images.
     */
    public static GMapType G_HYBRID_MAP() {
        return narrowToGMapType(GMapTypeImpl.G_HYBRID_MAP());
    }

    /**
     * G_DEFAULT_MAP_TYPES An array of all three predefined map types described
     * above.
     */
    public static GMapType[] G_DEFAULT_MAP_TYPES() {
        GMapType[] rtn = null;
        JSObject hold = GMapTypeImpl.G_DEFAULT_MAP_TYPES();

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

}
