package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class GDraggableObject extends GoogleMapsWidget {
    protected GDraggableObject(JSObject element) {
        super(element);
    }

    public GDraggableObject(Element element) {
        super(GDraggableObjectImpl.create(element));
    }

    public static GDraggableObject narrowToGDraggableObject(JSObject e) {
        return (e == null) ? null : new GDraggableObject(e);
    }

    public GDraggableObject(Widget widget) {
        super(GDraggableObjectImpl.create(widget.getElement()));
    }

    public GDraggableObject(Widget widget, GDraggableObjectOptions options) {
        super(GDraggableObjectImpl.create(widget.getElement(), options
                .getJSObject()));
    }

    /**
     * setDraggableCursor(cursor) none Sets the cursor when the mouse is over
     * this draggable objects. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public void setDraggableCursor(String cursor) {
        GDraggableObjectImpl.setDraggableCursor(getJSObject(), cursor);
    }

    /**
     * getDraggableCursor() none Gets the cursor when the mouse is over this
     * draggable objects. (Since 2.73)
     */
    public void getDraggableCursor() {
        GDraggableObjectImpl.getDraggableCursor(getJSObject());
    }

    /**
     * setDraggingCursor(cursor) none Sets the cursor when the mouse is held
     * down, dragging this draggable object. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public void setDraggingCursor(String cursor) {
        GDraggableObjectImpl.setDraggingCursor(getJSObject(), cursor);
    }

    /**
     * setDraggableCursor(cursor) none Sets the cursor when the mouse is over
     * this draggable objects. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static void setDraggableCursorGlobal(String cursor) {
        GDraggableObjectImpl.setDraggableCursor(cursor);
    }

    /**
     * setDraggingCursor(cursor) none Sets the cursor when the mouse is held
     * down, dragging this draggable object. (Since 2.59)
     * 
     * @param self
     * @param cursor
     */
    public static void setDraggingCursorGlobal(String cursor) {
        GDraggableObjectImpl.setDraggingCursor(cursor);
    }
}
