package com.mapitz.gwt.googleMaps.client;

class GInfoWindowImpl {
    /*
     * selectTab(index) none Selects the tab with the given index. This has the
     * same effect as clicking on the corresponding tab.
     */
    public static native void selectTab(JSObject self, int index)/*-{
     self.selectTab(index);
     }-*/;

    /*
     * hide() none Makes the info window invisible. NOTE: This doesn't close the
     * info window. It can be made visible again using show().
     */
    public static native void hide(JSObject self)/*-{
     self.hide();
     }-*/;

    /*
     * show() none Makes the info window visible if its currently invisible.
     */
    public static native void show(JSObject self)/*-{
     self.show();
     }-*/;

    /*
     * isHidden() Boolean Returns true iff the info window is hidden. This
     * includes the state that it's closed.
     */
    public static native boolean isHidden(JSObject self)/*-{
     return self.isHidden();
     }-*/;

    /*
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public static native void reset(JSObject self, JSObject point,
            JSObject tabs, JSObject size, JSObject offset, int selectedTab)/*-{
     self.reset(point, tabs, size, offset, selectedTab);
     }-*/;

    /*
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public static native void reset(JSObject self, JSObject point,
            JSObject tabs, JSObject size, JSObject offset)/*-{
     self.reset(point, tabs, size, offset);
     }-*/;

    /*
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public static native void reset(JSObject self, JSObject point,
            JSObject tabs, JSObject size)/*-{
     self.reset(point, tabs, size);
     }-*/;

    /*
     * getPoint() GLatLng Returns the geographical point at which the info
     * window is anchored. The tip of the window points to this point on the
     * map, modulo the pixel offset.
     */
    public static native JSObject getPoint(JSObject self)/*-{
     return self.getPoint();
     }-*/;

    /*
     * getPixelOffset() GSize Returns the offset, in pixels, of the tip of the
     * info window from the point on the map at whose geographical coordinates
     * the info window is anchored.
     */
    public static native JSObject getPixelOffset(JSObject self)/*-{
     return self.getPixelOffset();
     }-*/;

    /*
     * getSelectedTab() Number Returns the index, starting at 0, of the current
     * selected tab.
     */
    public static native int getSelectedTab(JSObject self)/*-{
     return self.getSelectedTab();
     }-*/;

    protected static native JSObject getTabs(JSObject self)/*-{
     return self.getTabs();
     }-*/;

    protected static native JSObject getContentContainers(JSObject self)/*-{
     return self.getContentContainers();
     }-*/;
}
