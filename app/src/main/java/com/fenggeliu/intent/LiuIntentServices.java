package com.fenggeliu.intent;

/**
 * Created by fengge on 11/11/2016.
 */
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class LiuIntentServices extends IntentService {

    private static final String TAG = "com.fenggeliu.intent";

    public LiuIntentServices() {
        super("LiuIntentServices");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the server does
        Log.i(TAG, "The service has not started");
    }
}
