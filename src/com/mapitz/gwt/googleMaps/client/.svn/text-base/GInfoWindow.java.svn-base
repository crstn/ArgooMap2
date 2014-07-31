package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

/**
 * An information panel which displays over the map. Only created by GMaps2.
 */
public class GInfoWindow extends GOverlay {
    protected GInfoWindow(JSObject element) {
        super(element);
    }

    public static GInfoWindow narrowToGInfoWindow(JSObject e) {
        return (e == null) ? null : new GInfoWindow(e);
    }

    /**
     * selectTab(index) none Selects the tab with the given index. This has the
     * same effect as clicking on the corresponding tab.
     */
    public void selectTab(int index) {
        GInfoWindowImpl.selectTab(getJSObject(), index);
    }

    /**
     * hide() none Makes the info window invisible. NOTE: This doesn't close the
     * info window. It can be made visible again using show().
     */
    public void hide() {
        GInfoWindowImpl.hide(getJSObject());
    }

    /**
     * show() none Makes the info window visible if its currently invisible.
     */
    public void show() {
        GInfoWindowImpl.show(getJSObject());
    }

    /**
     * isHidden() Boolean Returns true iff the info window is hidden. This
     * includes the state that it's closed.
     */
    public boolean isHidden() {
        return GInfoWindowImpl.isHidden(getJSObject());
    }

    /**
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size,
            GSize offset, int selectedTab) {
        GInfoWindowImpl.reset(getJSObject(), point.getJSObject(), ElementHelper
                .arrayConvert(tabs), size.getJSObject(), offset.getJSObject(),
                selectedTab);
    }

    /**
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size,
            GSize offset) {
        GInfoWindowImpl.reset(getJSObject(), point.getJSObject(), ElementHelper
                .arrayConvert(tabs), size.getJSObject(), offset.getJSObject());
    }

    /**
     * reset(point, tabs, size, offset?, selectedTab?) none Resets the state of
     * the info window. Each argument may be null and then its value will not be
     * changed from the current value.
     */
    public void reset(GLatLng point, GInfoWindowTab[] tabs, GSize size) {
        GInfoWindowImpl.reset(getJSObject(), point.getJSObject(), ElementHelper
                .arrayConvert(tabs), size.getJSObject());
    }

    /**
     * getPoint() GLatLng Returns the geographical point at which the info
     * window is anchored. The tip of the window points to this point on the
     * map, modulo the pixel offset.
     */
    public GLatLng getPoint() {
        return GLatLng.narrowToGLatLng(GInfoWindowImpl.getPoint(getJSObject()));
    }

    /**
     * getPixelOffset() GSize Returns the offset, in pixels, of the tip of the
     * info window from the point on the map at whose geographical coordinates
     * the info window is anchored.
     */
    public GSize getPixelOffset() {
        return GSize.narrowToGSize(GInfoWindowImpl
                .getPixelOffset(getJSObject()));
    }

    /**
     * getSelectedTab() Number Returns the index, starting at 0, of the current
     * selected tab.
     */
    public int getSelectedTab() {
        return GInfoWindowImpl.getSelectedTab(getJSObject());
    }

    /**
     * Returns the array of tabs in this info window. (Since 2.59)
     * 
     * @return
     */
    public GInfoWindowTab[] getTabs() {

        GInfoWindowTab[] rtn = null;
        JSObject hold = GInfoWindowImpl.getTabs(getJSObject());

        if (hold != null) {
            JObjectArray array = new JObjectArray(hold);
            int size = array.length();

            rtn = new GInfoWindowTab[size];

            for (int i = 0; i < size; i++) {
                rtn[i] = new GInfoWindowTab(array.get(i));
            }
        }

        return rtn;
    }

    /**
     * Returns the array of DOM nodes that hold the content of the tabs of this
     * info window. (Since 2.59)
     * 
     * @return
     */
    public Element[] getContentContainers() {
        Element[] rtn = null;
        JSObject hold = GInfoWindowImpl.getContentContainers(getJSObject());

        if (hold != null) {
            JElementArray array = JElementArray.narrowToJElementArray(hold);
            int size = array.length();
            rtn = new Element[size];

            for (int i = 0; i < size; i++) {
                rtn[i] = array.getAsElement(i);
            }
        }

        return rtn;
    }
}
