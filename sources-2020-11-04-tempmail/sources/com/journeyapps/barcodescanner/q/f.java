package com.journeyapps.barcodescanner.q;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: CameraThread */
class f {

    /* renamed from: e  reason: collision with root package name */
    private static f f12801e;

    /* renamed from: a  reason: collision with root package name */
    private Handler f12802a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f12803b;

    /* renamed from: c  reason: collision with root package name */
    private int f12804c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12805d = new Object();

    private f() {
    }

    private void a() {
        synchronized (this.f12805d) {
            if (this.f12802a == null) {
                if (this.f12804c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f12803b = handlerThread;
                    handlerThread.start();
                    this.f12802a = new Handler(this.f12803b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public static f d() {
        if (f12801e == null) {
            f12801e = new f();
        }
        return f12801e;
    }

    private void f() {
        synchronized (this.f12805d) {
            this.f12803b.quit();
            this.f12803b = null;
            this.f12802a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        synchronized (this.f12805d) {
            int i = this.f12804c - 1;
            this.f12804c = i;
            if (i == 0) {
                f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(Runnable runnable) {
        synchronized (this.f12805d) {
            a();
            this.f12802a.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void e(Runnable runnable) {
        synchronized (this.f12805d) {
            this.f12804c++;
            c(runnable);
        }
    }
}
