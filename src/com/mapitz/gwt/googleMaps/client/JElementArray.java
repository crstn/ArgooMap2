package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.Element;

public class JElementArray extends JArrayBase {
    protected JElementArray(JSObject element) {
        super(element);
    }

    public static JElementArray narrowToJElementArray(JSObject element) {
        return (element == null) ? null : new JElementArray(element);
    }

    public JElementArray(Element[] array) {
        super(array.length);

        for (int i = 0; i < array.length; i++) {
            set(i, array[i]);
        }
    }

    public void set(int index, Element value) {
        JElementArrayImpl.arraySet(getJSObject(), index, value);
    }

    public Element[] toArray() {
        Element[] rtn = new Element[length()];

        for (int i = 0; i < rtn.length; i++) {
            rtn[i] = JElementArrayImpl.getAsElement(getJSObject(), i);
        }

        return rtn;
    }

    public Element getAsElement(int i) {
        return JElementArrayImpl.getAsElement(getJSObject(), i);
    }

}
