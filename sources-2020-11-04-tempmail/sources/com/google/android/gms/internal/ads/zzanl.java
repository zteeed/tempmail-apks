package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanl extends zzyh {

    /* renamed from: b  reason: collision with root package name */
    private final Object f5984b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile zzyj f5985c;

    public final boolean D5() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean F0() throws RemoteException {
        throw new RemoteException();
    }

    public final void Z0(zzyj zzyj) throws RemoteException {
        synchronized (this.f5984b) {
            this.f5985c = zzyj;
        }
    }

    public final zzyj c6() throws RemoteException {
        zzyj zzyj;
        synchronized (this.f5984b) {
            zzyj = this.f5985c;
        }
        return zzyj;
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

    public final void h2(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean r1() throws RemoteException {
        throw new RemoteException();
    }

    public final void stop() throws RemoteException {
        throw new RemoteException();
    }
}
