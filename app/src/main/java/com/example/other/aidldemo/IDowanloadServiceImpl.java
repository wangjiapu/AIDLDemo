package com.example.other.aidldemo;

import android.os.RemoteException;

public class IDowanloadServiceImpl extends IDownloadService.Stub{
    @Override
    public void download(String url) throws RemoteException {

    }

    @Override
    public void delete(String url) throws RemoteException {

    }

    @Override
    public void stop(String url) throws RemoteException {

    }

    @Override
    public int getQueueSize() throws RemoteException {
        return 0;
    }
}
