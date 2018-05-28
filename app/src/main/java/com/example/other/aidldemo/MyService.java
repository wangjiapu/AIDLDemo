package com.example.other.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return new MyBinder();
    }

    class MyBinder extends IRemoteService.Stub{

        @Override
        public String sayHello() throws RemoteException {
            return "test";
        }
    }
}
