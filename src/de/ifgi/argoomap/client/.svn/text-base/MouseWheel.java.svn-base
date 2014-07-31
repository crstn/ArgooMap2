package de.ifgi.argoomap.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;




public class MouseWheel {
   
    private MouseWheel(Element e, MouseWheelListener listener) {
        attachMouseWheelListener(e, listener);
    }
   
    /**
     * Sets a MouseWheelListener to a given Element
     */
    public static void setMouseWheelListener(Element e, MouseWheelListener listener) {
        new MouseWheel(e, listener);
    }
   
   
    /**
     * This method is used by FF
     * @param event
     */
    private static native void dispatchMouseWheelEvent(JavaScriptObject event) /*-{
       
        @de.ifgi.argoomap.client.MouseWheel::dispatchMouseWheelEvent(Lcom/google/gwt/core/client/JavaScriptObject;Lbr/de/ifgi/argoomap/client/MouseWheelListener;)(event, this.__mousewheellistener);
   
    }-*/;
   
    /**
     * This method is used by IE and FF
     * Part of this method was retrieved from http://adomas.org/notes/mouse-wheel.html
     *
     * @param event
     * @param listener
     */
    private static native void dispatchMouseWheelEvent(JavaScriptObject event, MouseWheelListener listener) /*-{

         if (!event) event = $wnd.event; // For IE

         var delta = 0;
         if (event.wheelDelta)             // IE case, delta is multiple of 120
              delta = event.wheelDelta / 120;
         else if (event.detail )            // Mozilla case
              delta = -event.detail / 3;   // different sign and multiple of 3
        
         if ( delta > 0 ) {
             listener.@de.ifgi.argoomap.client.MouseWheelListener::onMouseWheelUp(I)(delta);
         } else {
             listener.@de.ifgi.argoomap.client.MouseWheelListener::onMouseWheelDown(I)(-delta);
         }

         //taken from http://adomas.org/javascript-mouse-wheel/test2.html
         if (event.preventDefault)
             event.preventDefault();
         event.returnValue = false;

    }-*/;
   
   
    private native void attachMouseWheelListener(Element e, MouseWheelListener listener) /*-{
       
        e.__mousewheellistener = listener;
       
        // for FF
        if (e.addEventListener) {
            e.addEventListener('DOMMouseScroll', @de.ifgi.argoomap.client.MouseWheel::dispatchMouseWheelEvent(Lcom/google/gwt/core/client/JavaScriptObject;), false);
            return;
        }
       
        // for IE
        e.onmousewheel = function(event) {
            @de.ifgi.argoomap.client.MouseWheel::dispatchMouseWheelEvent (Lcom/google/gwt/core/client/JavaScriptObject;Lde/ifgi/argoomap/client/MouseWheelListener;)(event, this.__mousewheellistener);
        }
       
    }-*/;
   
}