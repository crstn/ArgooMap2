package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GControlImpl {

    public static native JSObject create(Element body, JSObject position)/*-{	
     if ($wnd.GWTDontTouchCustomGControl == undefined)
     {
     $wnd.GWTDontTouchCustomGControl = function GWTDontTouchCustomGControl(body, position) {
     this.body = body; 
     this.position = position;
     }
     
     $wnd.GWTDontTouchCustomGControl.prototype = new $wnd.GControl();
     
     $wnd.GWTDontTouchCustomGControl.prototype.initialize = function(map) { 
     map.getContainer().appendChild(this.body); 
     return this.body; 
     }
     
     $wnd.GWTDontTouchCustomGControl.prototype.getDefaultPosition = function() { 
     return this.position; 
     } 
     }
     
     return new $wnd.GWTDontTouchCustomGControl(body, position);
     }-*/;

    /*
     * Creates a control with buttons to pan in four directions, and zoom in and
     * zoom out, and a zoom slider.
     */
    public static native JSObject GLargeMapControl()/*-{
     return new $wnd.GLargeMapControl();
     }-*/;

    /*
     * a collapsible overview map in the corner of the screen
     */
    public static native JSObject GOverviewMapControl()/*-{
     return new $wnd.GOverviewMapControl();
     }-*/;

    /*
     * Creates a control with buttons to switch between map types.
     */
    public static native JSObject GMapTypeControl()/*-{
     return new $wnd.GMapTypeControl();
     }-*/;

    /*
     * Creates a control that displays the map scale.
     */
    public static native JSObject GScaleControl()/*-{
     return new $wnd.GScaleControl();
     }-*/;

    /*
     * Creates a control with buttons to pan in four directions, and zoom in and
     * zoom out.
     */
    public static native JSObject GSmallMapControl()/*-{
     return new $wnd.GSmallMapControl();
     }-*/;

    /*
     * Creates a control with buttons to zoom in and zoom out.
     */
    public static native JSObject GSmallZoomControl()/*-{
     return new $wnd.GSmallZoomControl();
     }-*/;

    /*
     * printable() Boolean Returns to the map if the control should be
     * printable.
     */
    public static native boolean printable(JSObject self)/*-{
     return self.printable();
     }-*/;

    /*
     * selectable() Boolean Returns to the map if the control contains
     * selectable text.
     */
    public static native boolean selectable(JSObject self)/*-{
     return self.selectable();
     }-*/;

    /*
     * initialize(map) Node Will be called by the map so the control can
     * initialize itself. The control will use the method GMap2.getContainer()
     * to get hold of the DOM element that contains the map, and add itself to
     * it. It returns the added element.
     */
    public static native Element initialize(JSObject self, JSObject map)/*-{
     return self.initialize(map);
     }-*/;

    /*
     * getDefaultPosition() GControlPosition Returns to the map the position in
     * the map view at which the control appears by default. This will be
     * overridden by the second argument to GMap2.addControl().
     */
    public static native JSObject getDefaultPosition(JSObject self)/*-{
     return self.getDefaultPosition();
     }-*/;

}
