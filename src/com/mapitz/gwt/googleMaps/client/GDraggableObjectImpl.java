package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class GDraggableObjectImpl {
    public static native JSObject create(Element node)/*-{
     return new $wnd.GDraggableObject(node);
     }-*/;

    public static native JSObject create(Element node, JSObject options)/*-{
     return new $wnd.GDraggableObject(node, options);
     }-*/;

    /**
     * setDraggableCursor(cursor) none Sets the cursor when the mouse is over
     * this draggable objects. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static native void setDraggableCursor(JSObject self, String cursor)/*-{
     self.setDraggableCursor(cursor);
     }-*/;

    public static native String getDraggableCursor(JSObject self)/*-{
     return self.getDraggableCursor();
     }-*/;

    /**
     * setDraggingCursor(cursor) none Sets the cursor when the mouse is held
     * down, dragging this draggable object. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static native void setDraggingCursor(JSObject self, String cursor)/*-{
     self.setDraggingCursor(cursor);
     }-*/;

    /**
     * setDraggableCursor(cursor) none Sets the cursor when the mouse is over
     * this draggable objects. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static native void setDraggableCursor(String cursor)/*-{
     $wnd.GDraggableObject.setDraggableCursor(cursor);
     }-*/;

    /**
     * setDraggingCursor(cursor) none Sets the cursor when the mouse is held
     * down, dragging this draggable object. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static native void setDraggingCursor(String cursor)/*-{
     $wnd.GDraggableObject.setDraggingCursor(cursor);
     }-*/;
}
