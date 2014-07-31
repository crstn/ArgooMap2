package com.mapitz.gwt.googleMaps.client;

class JStringArrayImpl {

    public static native void arraySet(JSObject array, int index, String value) /*-{ 
     array[index] = value;
     }-*/;

    public static native String getAsString(JSObject array, int pos)/*-{
     if (array) return array[pos];
     return 0;
     }-*/;
}
