package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GOverlayImpl {
    // initialize(map) none Called by the map after the overlay is added to the
    // map using GMap2.addOverlay(). The overlay object can draw itself into the
    // different panes of the map that can be obtained using GMap2.getPane().
    // remove() none Called by the map after the overlay is removed from the map
    // using GMap2.removeOverlay() or GMap2.clearOverlays(). The overlay must
    // remove itself from the map panes here.
    // copy() GOverlay Returns an uninitialized copy of itself that can be added
    // to the map.
    // redraw(force) none Called by the map when the map display has changed.
    // The argument force will be true if the zoom level or the pixel offset of
    // the map view has changed, so that the pixel coordinates need to be
    // recomputed.

    // Returns a CSS z-index value for a given latitude. It computes a z index
    // such that overlays further south are on top of overlays further north,
    // thus creating the 3D appearance of marker overlays
    public static native double getZIndex(double latitude)/*-{
     return $wnd.GOverlay.getZIndex(latitude)
     }-*/;

    // initialize(map) none Called by the map after the overlay is added to the
    // map using GMap2.addOverlay(). The overlay object can draw itself into the
    // different panes of the map that can be obtained using GMap2.getPane().
    public static native void initialize(JSObject self, JSObject map)/*-{
     self.initialize(map);
     }-*/;

    // remove() none Called by the map after the overlay is removed from the map
    // using GMap2.removeOverlay() or GMap2.clearOverlays(). The overlay must
    // remove itself from the map panes here.
    public static native void remove(JSObject self)/*-{
     self.remove();
     }-*/;

    // copy() GOverlay Returns an uninitialized copy of itself that can be added
    // to the map.
    public static native JSObject copy(JSObject self)/*-{
     return self.copy();
     }-*/;

    // redraw(force) none Called by the map when the map display has changed.
    // The argument force will be true if the zoom level or the pixel offset of
    // the map view has changed, so that the pixel coordinates need to be
    // recomputed.
    public static native void redraw(JSObject self, boolean force)/*-{
     self.redraw(force);
     }-*/;

    public static native JSObject create(Element element, int panel,
            GOverlayEvents overlay)/*-{	
     if ($wnd.GWTDontTouchCustomGOverlay == undefined)
     {
     $wnd.GWTDontTouchCustomGOverlay = function GWTDontTouchCustomGOverlay(element, panel, overlay) {
     this.element = element;
     this.panel = panel;
     this.overlay = overlay;				
     }
     
     $wnd.GWTDontTouchCustomGOverlay.prototype = new $wnd.GOverlay();
     
     $wnd.GWTDontTouchCustomGOverlay.prototype.initialize = function(map) 
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onInitialize(Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GOverlayEvents;)(map, this.overlay);
     map.getPane(this.panel).appendChild(this.element);
     }
     
     $wnd.GWTDontTouchCustomGOverlay.prototype.remove = function() 
     {
     this.overlay.@com.mapitz.gwt.googleMaps.client.GOverlayEvents::onRemove()();
     this.element.parentNode.removeChild(this.element);
     }

     $wnd.GWTDontTouchCustomGOverlay.prototype.redraw = function(force) 
     {
     this.overlay.@com.mapitz.gwt.googleMaps.client.GOverlayEvents::onRedraw(Z)(force);
     }
     
     $wnd.GWTDontTouchCustomGOverlay.prototype.copy = function() 
     {
     var tmp = this.overlay.@com.mapitz.gwt.googleMaps.client.GOverlayEvents::onCopy()();
     if (tmp != null) return tmp.@com.mapitz.gwt.googleMaps.client.GoogleMapsWidget::getJSObject()(); 
     return null;
     }
     }
     
     return new $wnd.GWTDontTouchCustomGOverlay(element, panel, overlay);
     }-*/;

    public static native void setPanel(JSObject self, int panel)/*-{
     self.panel = panel;
     }-*/;

    public static native void setOverlay(JSObject self, GOverlayEvents overlay)/*-{
     self.overlay = overlay;
     }-*/;

    public static native void setElement(JSObject self, Element element)/*-{
     self.element = element;
     }-*/;

    public static native void show(JSObject self)/*-{
     self.show();
     }-*/;

    public static native void hide(JSObject self)/*-{
     self.show();
     }-*/;
}
