package com.heroiclabs;

public abstract class AbstractClientListener implements ClientListener {
    public abstract void onDisconnect(final Throwable t);
}
