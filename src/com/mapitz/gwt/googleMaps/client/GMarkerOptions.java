package com.mapitz.gwt.googleMaps.client;

/**
 * Additional options for the GMarker
 * 
 * @author aglaforge
 * 
 */
public class GMarkerOptions extends GOptionBase {
    public GMarkerOptions() {
        super();
    }

    protected GMarkerOptions(JSObject element) {
        super(element);
    }

    public static GMarkerOptions narrowToGMarkerOptions(JSObject element) {
        return (element == null) ? null : new GMarkerOptions(element);
    }

    /*
     * Undocumented Dragging
     */
    public boolean getDraggable() {
        return getAttributeAsBoolean("draggable");
    }

    /*
     * Undocumented Dragging
     */
    public void setDraggable(boolean draggable) {
        setAttribute("draggable", draggable);
    }

    /*
     * icon GIcon Chooses the Icon for this class. If not specified,
     * G_DEFAULT_ICON is used. (Since 2.50)
     */
    public GIcon getIcon() {
        return GIcon.narrowToGIcon(getAttributeAsJSObject("icon"));
    }

    /*
     * icon GIcon Chooses the Icon for this class. If not specified,
     * G_DEFAULT_ICON is used. (Since 2.50)
     */
    public void setIcon(GIcon icon) {
        setAttribute("icon", icon.getJSObject());
    }

    /*
     * clickable Boolean Toggles whether or not the marker is clickable. Markers
     * that are not clickable or draggable are inert, consume less resources and
     * do not respond to any events. The default value for this option is true,
     * i.e. if the option is not specified, the marker will be clickable. (Since
     * 2.50)
     */
    public boolean getClickable() {
        return getAttributeAsBoolean("clickable");
    }

    /*
     * clickable Boolean Toggles whether or not the marker is clickable. Markers
     * that are not clickable or draggable are inert, consume less resources and
     * do not respond to any events. The default value for this option is true,
     * i.e. if the option is not specified, the marker will be clickable. (Since
     * 2.50)
     */
    public void setClickable(boolean clickable) {
        setAttribute("clickable", clickable);
    }

    /**
     * When dragging markers normally, the marker floats up and away from the
     * cursor. Setting this value to true keeps the marker underneath the
     * cursor, and moves the cross downwards instead. The default value for this
     * option is false. (Since 2.63)
     */
    public void setDragCrossMove(boolean dragCrossMove) {
        setAttribute("dragCrossMove", dragCrossMove);
    }

    /**
     * When dragging markers normally, the marker floats up and away from the
     * cursor. Setting this value to true keeps the marker underneath the
     * cursor, and moves the cross downwards instead. The default value for this
     * option is false. (Since 2.63)
     */
    public boolean getDragCrossMove() {
        return getAttributeAsBoolean("dragCrossMove");
    }

    /**
     * Toggles whether or not the marker should bounce up and down after it
     * finishes dragging. The default value for this option is false. (Since
     * 2.61)
     */
    public void setBouncy(boolean bouncy) {
        setAttribute("bouncy", bouncy);
    }

    /**
     * Toggles whether or not the marker should bounce up and down after it
     * finishes dragging. The default value for this option is false. (Since
     * 2.61)
     */
    public boolean getBouncy() {
        return getAttributeAsBoolean("bouncy");
    }

    /**
     * When finishing dragging, this number is used to define the acceleration
     * rate of the marker during the bounce down to earth. The default value for
     * this option is 1. (Since 2.61)
     */
    public void setBounceGravity(int bounceGravity) {
        setAttribute("bounceGravity", bounceGravity);
    }

    /**
     * When finishing dragging, this number is used to define the acceleration
     * rate of the marker during the bounce down to earth. The default value for
     * this option is 1. (Since 2.61)
     */
    public int getBounceGravity() {
        return getAttributeAsInt("bounceGravity");
    }

    /*
     * title String This string will appear as tooltip on the marker, i.e. it
     * will work just as the title attribute on HTML elements. (Since 2.50)
     */
    public String getTitle() {
        return getAttribute("title");
    }

    /*
     * title String This string will appear as tooltip on the marker, i.e. it
     * will work just as the title attribute on HTML elements. (Since 2.50)
     */
    public void setTitle(String val) {
        setAttribute("title", val);
    }

}
