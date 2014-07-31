package com.mapitz.gwt.googleMaps.client;

public interface GOverlayEvents {
    public void onRedraw(boolean force);

    public void onInitialize(GMap2 map);

    public void onRemove();

    public GOverlay onCopy();
}
