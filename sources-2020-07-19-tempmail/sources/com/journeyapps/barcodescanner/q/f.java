package com.journeyapps.barcodescanner.q;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: CameraThread */
class f {

    /* renamed from: e  reason: collision with root package name */
    private static f f12252e;

    /* renamed from: a  reason: collision with root package name */
    private Handler f12253a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f12254b;

    /* renamed from: c  reason: collision with root package name */
    private int f12255c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12256d = new Object();

    private f() {
    }

    private void a() {
        synchronized (this.f12256d) {
            if (this.f12253a == null) {
                if (this.f12255c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f12254b = handlerThread;
                    handlerThread.start();
                    this.f12253a = new Handler(this.f12254b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public static f d() {
        if (f12252e == null) {
            f12252e = new f();
        }
        return f12252e;
    }

    private void f() {
        synchronized (this.f12256d) {
            this.f12254b.quit();
            this.f12254b = null;
            this.f12253a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        synchronized (this.f12256d) {
            int i = this.f12255c - 1;
            this.f12255c = i;
            if (i == 0) {
                f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(Runnable runnable) {
        synchronized (this.f12256d) {
            a();
            this.f12253a.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void e(Runnable runnable) {
        synchronized (this.f12256d) {
            this.f12255c++;
            c(runnable);
        }
    }
}
