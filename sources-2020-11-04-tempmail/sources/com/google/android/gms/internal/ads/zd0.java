package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zd0 implements Handler.Callback, Choreographer.FrameCallback {
    private static final zd0 g = new zd0();

    /* renamed from: b  reason: collision with root package name */
    public volatile long f5639b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f5640c;

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f5641d;

    /* renamed from: e  reason: collision with root package name */
    private Choreographer f5642e;

    /* renamed from: f  reason: collision with root package name */
    private int f5643f;

    private zd0() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f5641d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f5641d.getLooper(), this);
        this.f5640c = handler;
        handler.sendEmptyMessage(0);
    }

    public static zd0 a() {
        return g;
    }

    public final void b() {
        this.f5640c.sendEmptyMessage(1);
    }

    public final void c() {
        this.f5640c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f5639b = j;
        this.f5642e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f5642e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f5643f + 1;
            this.f5643f = i2;
            if (i2 == 1) {
                this.f5642e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f5643f - 1;
            this.f5643f = i3;
            if (i3 == 0) {
                this.f5642e.removeFrameCallback(this);
                this.f5639b = 0;
            }
            return true;
        }
    }
}