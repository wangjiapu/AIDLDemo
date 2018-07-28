package com.example.other.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class CoreService extends Service {
    public CoreService() {
    }


    @Override
    public IBinder onBind(Intent intent) {
        return new IDowanloadServiceImpl();
    }

}
