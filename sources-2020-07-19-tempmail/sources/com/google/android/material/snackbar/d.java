package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
class d {

    /* renamed from: e  reason: collision with root package name */
    private static d f10881e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f10882a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10883b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f10884c;

    /* renamed from: d  reason: collision with root package name */
    private c f10885d;

    /* compiled from: SnackbarManager */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d.this.c((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager */
    interface b {
        void a(int i);
    }

    /* compiled from: SnackbarManager */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f10887a;

        /* renamed from: b  reason: collision with root package name */
        int f10888b;

        /* renamed from: c  reason: collision with root package name */
        boolean f10889c;

        /* access modifiers changed from: package-private */
        public boolean a(b bVar) {
            return bVar != null && this.f10887a.get() == bVar;
        }
    }

    private d() {
    }

    private boolean a(c cVar, int i) {
        b bVar = (b) cVar.f10887a.get();
        if (bVar == null) {
            return false;
        }
        this.f10883b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    static d b() {
        if (f10881e == null) {
            f10881e = new d();
        }
        return f10881e;
    }

    private boolean d(b bVar) {
        c cVar = this.f10884c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i = cVar.f10888b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f10883b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f10883b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this.f10882a) {
            if (this.f10884c == cVar || this.f10885d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f10882a) {
            if (d(bVar) && !this.f10884c.f10889c) {
                this.f10884c.f10889c = true;
                this.f10883b.removeCallbacksAndMessages(this.f10884c);
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f10882a) {
            if (d(bVar) && this.f10884c.f10889c) {
                this.f10884c.f10889c = false;
                g(this.f10884c);
            }
        }
    }
}
