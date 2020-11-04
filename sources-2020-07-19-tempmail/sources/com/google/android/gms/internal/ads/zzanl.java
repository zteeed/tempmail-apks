package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanl extends zzyh {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5801b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile zzyj f5802c;

    public final zzyj E5() throws RemoteException {
        zzyj zzyj;
        synchronized (this.f5801b) {
            zzyj = this.f5802c;
        }
        return zzyj;
    }

    public final void S0(zzyj zzyj) throws RemoteException {
        synchronized (this.f5801b) {
            this.f5802c = zzyj;
        }
    }

    public final void X1(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final boolean g5() throws RemoteException {
        throw new RemoteException();
    }

    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    public final float getCurrentTime() throws RemoteException {
        throw new RemoteException();
    }

    public final float getDuration() throws RemoteException {
        throw new RemoteException();
    }

    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean l1() throws RemoteException {
        throw new RemoteException();
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean z0() throws RemoteException {
        throw new RemoteException();
    }
}
