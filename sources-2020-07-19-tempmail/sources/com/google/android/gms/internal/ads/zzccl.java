package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccl extends zzyh {

    /* renamed from: b  reason: collision with root package name */
    private final Object f6837b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private zzyi f6838c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final zzang f6839d;

    public zzccl(@Nullable zzyi zzyi, @Nullable zzang zzang) {
        this.f6838c = zzyi;
        this.f6839d = zzang;
    }

    public final zzyj E5() throws RemoteException {
        synchronized (this.f6837b) {
            if (this.f6838c == null) {
                return null;
            }
            zzyj E5 = this.f6838c.E5();
            return E5;
        }
    }

    public final void S0(zzyj zzyj) throws RemoteException {
        synchronized (this.f6837b) {
            if (this.f6838c != null) {
                this.f6838c.S0(zzyj);
            }
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
        zzang zzang = this.f6839d;
        if (zzang != null) {
            return zzang.B1();
        }
        return 0.0f;
    }

    public final float getDuration() throws RemoteException {
        zzang zzang = this.f6839d;
        if (zzang != null) {
            return zzang.T1();
        }
        return 0.0f;
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
