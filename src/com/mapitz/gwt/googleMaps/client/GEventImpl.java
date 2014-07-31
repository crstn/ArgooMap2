package com.mapitz.gwt.googleMaps.client;

class GEventImpl {

    /**
     * addListener(source, event, handler) GEventListener Registers an event
     * handler for a custom event on the source object. Returns a handle that
     * can be used to eventually deregister the handler. The event handler will
     * be called with this set to the source object
     * 
     * @param source
     * @param event
     * @param handler
     * @return
     */
    public native static JSObject addListener(JSObject source, String event,
            GEventHandler handler)/*-{		
     return $wnd.GEvent.addListener(source, event, 
     function()
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onHandle(Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GEventHandler;)(source, arguments, handler);
     }
     );
     }-*/;

    /**
     * addDomListener(source, event, handler) GEventListener Registers an event
     * handler for a DOM event on the source object. The source object must be a
     * DOM Node. Returns a handle that can be used to eventually deregister the
     * handler. The event handler will be called with this set to the source
     * object. This function uses the DOM methods for the current browser to
     * register the event handler.
     * 
     * @param source
     * @param event
     * @param handler
     * @return
     */
    public native static JSObject addDomListener(JSObject source, String event,
            GEventHandler handler)/*-{		
     return $wnd.GEvent.addDomListener(source, event, 
     function()
     {
     @com.mapitz.gwt.googleMaps.client.ElementBridge::onHandle(Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/JSObject;Lcom/mapitz/gwt/googleMaps/client/GEventHandler;)(source, arguments, handler);
     }
     );
     }-*/;

    /**
     * removeListener(handle) none Removes a handler that was installed using
     * addListener() or addDomListener().
     */
    public static native void removeListener(JSObject handle)/*-{
     $wnd.GEvent.removeListener(handle);
     }-*/;

    /**
     * clearListeners(source, event) none Removes all handlers on the given
     * object for the given event that were installed using addListener() or
     * addDomListener().
     * 
     * @param source
     * @param event
     */
    public static native void clearListeners(JSObject source, String event)/*-{
     $wnd.GEvent.clearListeners(source, event);
     }-*/;

    /**
     * clearInstanceListeners(source) none Removes all handlers on the given
     * object for all events that were installed using addListener() or
     * addDomListener().
     * 
     * @param source
     */
    public static native void clearInstanceListeners(JSObject source)/*-{
     $wnd.GEvent.clearInstanceListeners(source);
     }-*/;

    // trigger(source, event, ...) none Fires a custom event on the source
    // object. All arguments after event are passed as arguments to the event
    // handler functions.
    public static native void trigger(JSObject source, String event,
            JSObject args)/*-{
     var argz = new Array();
     argz.push(source);
     argz.push(event);
     
     if (args)
     {
     for(var i = 0; i < args.length; i++)
     {
     argz.push(args[i]);
     }
     }
     
     $wnd.GEvent.trigger.apply(null, argz);
     }-*/;

    // bind(source, event, object, method) none Registers an invocation of the
    // method on the given object as the event handler for a custom event on the
    // source object. Returns a handle that can be used to eventually deregister
    // the handler.
    // bindDom(source, event, object, method) none Registers an invocation of
    // the method on the given object as the event handler for a custom event on
    // the source object. Returns a handle that can be used to eventually
    // deregister the handler.
    // callback(object, method) none Returns a closure that calls method on
    // object.
    // callbackArgs(object, method, ...) none Returns a closure that calls
    // method on object with the given arguments.

}
