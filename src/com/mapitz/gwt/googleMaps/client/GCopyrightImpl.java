package com.mapitz.gwt.googleMaps.client;

class GCopyrightImpl {
    // GCopyright(id, bounds, minZoom, text)
    public static native JSObject create(int id, JSObject bounds, int minZoom,
            String text)/*-{
     return new $wnd.GCopyright(id, bounds, minZoom, text);
     }-*/;

    protected static native JSObject getBounds(JSObject self) /*-{
     var ret = self.bounds;
     return (ret === undefined) ? null : ret;
     }-*/;
}
