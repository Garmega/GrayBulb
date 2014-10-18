package com.example.chennannicholasmao.graybulb;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class POIUpdateService extends IntentService {

    private ArrayList<LatLng> latLangList;
    private final IBinder mBinder = new LocalBinder();

    public POIUpdateService() {
        super("POIUpdateService");
    }

    public void onCreate() {

    }

    public ArrayList<LatLng> createList() {
        latLangList = new ArrayList<LatLng>();
        LatLng temp = new LatLng(47.653812, -122.307828);
        LatLng temp2 = new LatLng(47.656038, -122.306127);
        latLangList.add(temp);
        latLangList.add(temp2);

        return latLangList;
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }

    public class LocalBinder extends Binder {
        POIUpdateService getService() {
            // Return this instance of LocalService so clients can call public methods
            return POIUpdateService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
