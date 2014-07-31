package com.mapitz.gwt.googleMaps.client;

public class GEvent {
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
    public static GEventListener addListener(GoogleMapsWidget source,
            String event, GEventHandler handler) {
        return GEventListener.narrowToGEventListener(GEventImpl.addListener(
                source.getJSObject(), event, handler));
    }

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
    public static GEventListener addDomListener(GoogleMapsWidget source,
            String event, GEventHandler handler) {
        JSObject e = GEventImpl.addDomListener(source.getJSObject(), event,
                handler);
        if (e == null)
            return null;
        return new GEventListener(e);
    }

    /**
     * removeListener(handle) none Removes a handler that was installed using
     * addListener() or addDomListener().
     */
    public static void removeListener(GEventListener handle) {
        GEventImpl.removeListener(handle.getJSObject());
    }

    /**
     * clearListeners(source, event) none Removes all handlers on the given
     * object for the given event that were installed using addListener() or
     * addDomListener().
     * 
     * @param source
     * @param event
     */
    public static void clearListeners(GoogleMapsWidget source, String event) {
        GEventImpl.clearListeners(source.getJSObject(), event);
    }

    /**
     * clearInstanceListeners(source) none Removes all handlers on the given
     * object for all events that were installed using addListener() or
     * addDomListener().
     * 
     * @param source
     */
    public static void clearInstanceListeners(GoogleMapsWidget source) {
        GEventImpl.clearInstanceListeners(source.getJSObject());
    };

    /**
     * trigger(source, event, ...) none Fires a custom event on the source
     * object. All arguments after event are passed as arguments to the event
     * handler functions.
     * 
     * @param source
     * @param event
     * @param args
     */
    public static void trigger(GoogleMapsWidget source, String event,
            GoogleMapsWidget[] args) {
        GEventImpl.trigger(source.getJSObject(), event, (args == null) ? null
                : ElementHelper.arrayConvert(args));
    }

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
