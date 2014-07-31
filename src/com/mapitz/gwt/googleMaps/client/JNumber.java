package com.mapitz.gwt.googleMaps.client;

public class JNumber extends GoogleMapsWidget {

    protected JNumber(JSObject element) {
        super(element);
    }

    public static JNumber narrowToNumberElement(JSObject element) {
        return ((element == null) || (!JNumberImpl.isNumber(element))) ? null
                : new JNumber(element);
    }

    public JNumber(short num) {
        this(JNumberImpl.create(num));
    }

    public JNumber(int num) {
        this(JNumberImpl.create(num));
    }

    public JNumber(long num) {
        this(JNumberImpl.create(num));
    }

    public JNumber(float num) {
        this(JNumberImpl.create(num));
    }

    public JNumber(double num) {
        this(JNumberImpl.create(num));
    }

    public short toShort() {
        return JNumberImpl.toShort(getJSObject());
    }

    public int toInt() {
        return JNumberImpl.toInt(getJSObject());
    }

    public long toLong() {
        return JNumberImpl.toLong(getJSObject());
    }

    public float toFloat() {
        return JNumberImpl.toFloat(getJSObject());
    }

    public double toDouble() {
        return JNumberImpl.toDouble(getJSObject());
    }
}
