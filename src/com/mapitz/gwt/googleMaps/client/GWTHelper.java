package com.mapitz.gwt.googleMaps.client;

import java.util.Iterator;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class GWTHelper {
    public static void attach(Widget w) {
        if (w instanceof HasWidgets) {
            HasWidgets hw = (HasWidgets) w;
            Iterator i = hw.iterator();
            while (i.hasNext()) {
                Widget child = (Widget) i.next();
                attach(child);
            }
        } else {
            DOM.setEventListener(w.getElement(), w);
        }
    }

    public static void detach(Widget w) {
        if (w instanceof HasWidgets) {
            HasWidgets hw = (HasWidgets) w;
            Iterator i = hw.iterator();
            while (i.hasNext()) {
                Widget child = (Widget) i.next();
                detach(child);
            }
        } else {
            DOM.setEventListener(w.getElement(), null);
        }
    }
}
