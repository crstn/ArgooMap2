package com.mapitz.gwt.googleMaps.client;

class JIntArrayImpl {

    public static native void arraySet(JSObject array, int index, int value) /*-{ 
     array[index] = value;
     }-*/;

    public static native int getAsInt(JSObject array, int pos)/*-{
     if (array) return array[pos];
     return 0;
     }-*/;
}
