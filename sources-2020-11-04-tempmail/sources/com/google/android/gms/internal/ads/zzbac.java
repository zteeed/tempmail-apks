package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbac {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f6272a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f6273b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f6274c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6275d = new Object();

    public final Handler a() {
        return this.f6273b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f6275d) {
            if (this.f6274c != 0) {
                Preconditions.l(this.f6272a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f6272a == null) {
                zzaxv.m("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f6272a = handlerThread;
                handlerThread.start();
                this.f6273b = new zzdrr(this.f6272a.getLooper());
                zzaxv.m("Looper thread started.");
            } else {
                zzaxv.m("Resuming the looper thread");
                this.f6275d.notifyAll();
            }
            this.f6274c++;
            looper = this.f6272a.getLooper();
        }
        return looper;
    }
}
