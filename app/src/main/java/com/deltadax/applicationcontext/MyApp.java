package com.deltadax.applicationcontext;

import android.app.Application;
import android.util.Log;

/**
 * Created by JosePablo on 30/07/17.
 */

public class MyApp extends Application {

    private static final String TAG = "MyApp";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: Mi app fue creada");
    }
}
