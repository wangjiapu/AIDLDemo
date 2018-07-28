package com.example.other.aidldemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private IRemoteService remoteService;
    private ServiceConnection mServiceConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            remoteService=IRemoteService.Stub.asInterface(service);
            Log.e("onServiceConnected","connection ok");
            try {
                String s=remoteService.sayHello();
                Log.e("服务端传过来的数据是：",s);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.e("onServiceDisconnected","连接失败");
        }
    };

    private IDownloadService mDownloadService;
    private ServiceConnection mServiceConn=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mDownloadService=IDownloadService.Stub.asInterface(iBinder);

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start1Service();
            }
        });
    }

    private void start1Service() {

        Intent intent=new Intent(MainActivity.this,MyService.class);
        bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }
}
