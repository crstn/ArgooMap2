package com.mapitz.gwt.googleMaps.client;

/**
 * Additional options of the GMapType
 * 
 * @author aglaforge
 * 
 */
public class GMapTypeOptions extends GOptionBase {
    protected GMapTypeOptions(JSObject element) {
        super(element);
    }

    public static GMapTypeOptions narrowToGMapTypeOptions(JSObject element) {
        return (element == null) ? null : new GMapTypeOptions(element);
    }

    public GMapTypeOptions() {
        super();
    }

    /**
     * shortName String Sets the short name of the map type that is returned
     * from GMapType.getName(true). Default is the same as the name.
     */
    public String getShortName() {
        return getAttribute("shortName");
    }

    /**
     * shortName String Sets the short name of the map type that is returned
     * from GMapType.getName(true). Default is the same as the name.
     */
    public void setShortName(String val) {
        setAttribute("shortName", val);
    }

    /**
     * urlArg String Sets the url argument of the map type that is returned from
     * GMapType.getUrlArg(). Default is the empty string.
     */
    public String getUrlArg() {
        return getAttribute("urlArg");
    }

    /**
     * urlArg String Sets the url argument of the map type that is returned from
     * GMapType.getUrlArg(). Default is the empty string.
     */
    public void setUrlArg(String val) {
        setAttribute("urlArg", val);
    }

    /**
     * maxResolution Number Sets the maximum zoom level of this map type,
     * returned by GMapType.getMaximumResolution(). Default is the maximum of
     * all tile layers.
     */
    public int getMaxResolution() {
        return Integer.parseInt(getAttribute("maxResolution"));
    }

    /**
     * maxResolution Number Sets the maximum zoom level of this map type,
     * returned by GMapType.getMaximumResolution(). Default is the maximum of
     * all tile layers.
     */
    public void setMaxResolution(int val) {
        setAttribute("maxResolution", String.valueOf(val));
    }

    /**
     * minResolution Number Sets the minimum zoom level of this map type,
     * returned by GMapType.getMinimumResolution(). Default is the minimum of
     * all tile layers.
     */
    public int getMinResolution() {
        return Integer.parseInt(getAttribute("minResolution"));
    }

    /**
     * minResolution Number Sets the minimum zoom level of this map type,
     * returned by GMapType.getMinimumResolution(). Default is the minimum of
     * all tile layers.
     */
    public void setMinResolution(int val) {
        setAttribute("minResolution", String.valueOf(val));
    }

    /**
     * tileSize Number Set the tile size returned by GMapType.getTileSize().
     * Default is 256.
     */
    public int getTileSize() {
        return Integer.parseInt(getAttribute("tileSize"));
    }

    /**
     * tileSize Number Set the tile size returned by GMapType.getTileSize().
     * Default is 256.
     */
    public void setTileSize(int val) {
        setAttribute("tileSize", String.valueOf(val));
    }

    /**
     * textColor String Sets the text color returned by GMapType.getTextColor().
     * Default is "black".
     */
    public String getTextColor() {
        return getAttribute("textColor");
    }

    /**
     * textColor String Sets the text color returned by GMapType.getTextColor().
     * Default is "black".
     */
    public void setTextColor(String val) {
        setAttribute("textColor", val);
    }

    /**
     * linkColor String Sets the text color returned by GMapType.getLinkColor().
     * Default is "#7777cc".
     */
    public String getLinkColor() {
        return getAttribute("linkColor");
    }

    /**
     * linkColor String Sets the text color returned by GMapType.getLinkColor().
     * Default is "#7777cc".
     */
    public void setLinkColor(String val) {
        setAttribute("linkColor", val);
    }

    /**
     * errorMessage String Sets the error message returned by
     * GMapType.getErrorMessage(). Default is the empty string.
     */
    public String getErrorMessage() {
        return getAttribute("errorMessage");
    }

    /**
     * errorMessage String Sets the error message returned by
     * GMapType.getErrorMessage(). Default is the empty string.
     */
    public void setErrorMessage(String val) {
        setAttribute("errorMessage", val);
    }
}
