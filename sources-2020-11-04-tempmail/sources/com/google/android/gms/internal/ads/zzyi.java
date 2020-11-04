package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzyi extends IInterface {
    boolean D5() throws RemoteException;

    boolean F0() throws RemoteException;

    void Z0(zzyj zzyj) throws RemoteException;

    zzyj c6() throws RemoteException;

    float getAspectRatio() throws RemoteException;

    float getCurrentTime() throws RemoteException;

    float getDuration() throws RemoteException;

    int getPlaybackState() throws RemoteException;

    void h2(boolean z) throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    boolean r1() throws RemoteException;

    void stop() throws RemoteException;
}
