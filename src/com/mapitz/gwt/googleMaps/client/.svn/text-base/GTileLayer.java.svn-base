package com.mapitz.gwt.googleMaps.client;

/**
 * You implement this interface in order to provide custom map tile layers. Your
 * implementation of this interface should use an instance of GTileLayer as a
 * prototype, because this implements the copyright handling for you.
 * 
 * @author aglaforge
 * 
 */
public class GTileLayer extends GoogleMapsWidget {
    protected GTileLayer(JSObject element) {
        super(element);
    }

    public static GTileLayer narrowToGTileLayer(JSObject element) {
        return (element == null) ? null : new GTileLayer(element);
    }

    /**
     * GTileLayer(copyrights, minResolution, maxResolution) Constructor
     * arguments can be omitted if instantiated as a prototype. A Subclass
     * constructor must invoke this constructor using call().
     */
    public GTileLayer(GCopyrightCollection copyrights, int minResolution,
            int maxResolution) {
        this(GTileLayerImpl.create(copyrights.getJSObject(), minResolution,
                maxResolution));
    }

    /**
     * minResolution() Number Returns to the map type the lowest zoom level of
     * this tile layer.
     */
    public int minResolution() {
        return GTileLayerImpl.minResolution(getJSObject());
    }

    /**
     * maxResolution() Number Returns to the map type the highest zoom level of
     * this tile layer.
     */
    public int maxResolution() {
        return GTileLayerImpl.maxResolution(getJSObject());
    }

    /**
     * getTileUrl(tile, zoom) String Abstract. Returns to the map the URL of the
     * map tile with the tile indices given by the x and y properties of the
     * GPoint, at the given zoom level.
     */
    public String getTileUrl(GPoint tile, int zoom) {
        return GTileLayerImpl.getTileUrl(getJSObject(), tile.getJSObject(),
                zoom);
    }

    /**
     * isPng() Boolean Abstract. Returns to the map whether the tiles are in PNG
     * image format and hence can be transparent. Otherwise GIF is assumed.
     */
    public boolean isPng() {
        return GTileLayerImpl.isPng(getJSObject());
    }

    /**
     * getOpacity() Number Abstract. Returns to the map the opacity with which
     * to display this tile layer. 1.0 is opaque, 0.0 is transparent.
     */
    public double getOpacity() {
        return GTileLayerImpl.getOpacity(getJSObject());
    }

    // TODO Event - New Copyright

}
