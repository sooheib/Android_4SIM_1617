package com.sim.datastorage.utils;


import android.app.Application;

//TODO Change To App Variable and Declare to Manifest
public class MyApp extends Application {

    private boolean connected;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

}
