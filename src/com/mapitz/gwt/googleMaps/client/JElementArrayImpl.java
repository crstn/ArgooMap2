package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

class JElementArrayImpl {

    public static native void arraySet(JSObject array, int index, Element value) /*-{ 
     array[index] = value;
     }-*/;

    public static native Element getAsElement(JSObject array, int pos)/*-{
     if (array) return array[pos];
     return 0;
     }-*/;

    public static native boolean isArray(JSObject element)/*-{
     return element && typeof element === 'object' && typeof element.length === 'number' &&
     !(element.propertyIsEnumerable('length'));
     }-*/;
}
