package com.mapitz.gwt.googleMaps.client;

import com.google.gwt.user.client.ui.Widget;

class GInfoWindowManager {
    private static GInfoWindowManager singleton;
    Widget[] stale;

    private GInfoWindowManager() {
    }

    public static GInfoWindowManager getInstance() {
        if (singleton == null)
            singleton = new GInfoWindowManager();

        return singleton;
    }

    public void associate(Widget[] w) {
        // Note this is a very blunt way to do this. Adding to a hidden panel
        // would be more graceful
        // were it not for the fact the GMaps will steal the DOM object and make
        // it impossible
        // to add/delete the widget... yay (It's not bad, but it's because GWT
        // doesn't expect anyone to play around
        // at the Javascript level)
        if (stale != null) {
            for (int i = 0; i < stale.length; i++) {
                GWTHelper.detach(stale[i]);
            }
        }
        Widget[] stale = new Widget[w.length];
        for (int i = 0; i < w.length; i++) {
            GWTHelper.attach(w[i]);
            stale[i] = w[i];
        }

        // Set it to a copy of the w array for safety... in case someone gets
        // creative and mods the w array on us
        this.stale = stale;
    }

    public void associate(Widget w) {
        associate(new Widget[] { w });
    }

    public void associate(GInfoWindowTab[] tabs) {
        int count = 0;

        // Count the number of available widgets
        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i].getWidget() != null)
                count++;
        }

        // Build widget array
        Widget[] w = new Widget[count];
        int pos = 0;
        for (int i = 0; i < tabs.length; i++) {
            if (tabs[i].getWidget() != null)
                w[pos++] = tabs[i].getWidget();
        }

        // Associate the array
        associate(w);
    }
}
