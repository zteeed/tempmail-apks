package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccl extends zzyh {

    /* renamed from: b  reason: collision with root package name */
    private final Object f7020b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private zzyi f7021c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final zzang f7022d;

    public zzccl(@Nullable zzyi zzyi, @Nullable zzang zzang) {
        this.f7021c = zzyi;
        this.f7022d = zzang;
    }

    public final boolean D5() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean F0() throws RemoteException {
        throw new RemoteException();
    }

    public final void Z0(zzyj zzyj) throws RemoteException {
        synchronized (this.f7020b) {
            if (this.f7021c != null) {
                this.f7021c.Z0(zzyj);
            }
        }
    }

    public final zzyj c6() throws RemoteException {
        synchronized (this.f7020b) {
            if (this.f7021c == null) {
                return null;
            }
            zzyj c6 = this.f7021c.c6();
            return c6;
        }
    }

    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    public final float getCurrentTime() throws RemoteException {
        zzang zzang = this.f7022d;
        if (zzang != null) {
            return zzang.K1();
        }
        return 0.0f;
    }

    public final float getDuration() throws RemoteException {
        zzang zzang = this.f7022d;
        if (zzang != null) {
            return zzang.c2();
        }
        return 0.0f;
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
