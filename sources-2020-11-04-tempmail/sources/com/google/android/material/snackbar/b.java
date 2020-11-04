package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
class b {

    /* renamed from: e  reason: collision with root package name */
    private static b f11089e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f11090a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f11091b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f11092c;

    /* renamed from: d  reason: collision with root package name */
    private c f11093d;

    /* compiled from: SnackbarManager */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    /* compiled from: SnackbarManager */
    interface C0099b {
        void a(int i);

        void show();
    }

    /* compiled from: SnackbarManager */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<C0099b> f11095a;

        /* renamed from: b  reason: collision with root package name */
        int f11096b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11097c;

        c(int i, C0099b bVar) {
            this.f11095a = new WeakReference<>(bVar);
            this.f11096b = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(C0099b bVar) {
            return bVar != null && this.f11095a.get() == bVar;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i) {
        C0099b bVar = (C0099b) cVar.f11095a.get();
        if (bVar == null) {
            return false;
        }
        this.f11091b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    static b c() {
        if (f11089e == null) {
            f11089e = new b();
        }
        return f11089e;
    }

    private boolean f(C0099b bVar) {
        c cVar = this.f11092c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean g(C0099b bVar) {
        c cVar = this.f11093d;
        return cVar != null && cVar.a(bVar);
    }

    private void l(c cVar) {
        int i = cVar.f11096b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f11091b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f11091b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    private void n() {
        c cVar = this.f11093d;
        if (cVar != null) {
            this.f11092c = cVar;
            this.f11093d = null;
            C0099b bVar = (C0099b) cVar.f11095a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f11092c = null;
            }
        }
    }

    public void b(C0099b bVar, int i) {
        synchronized (this.f11090a) {
            if (f(bVar)) {
                a(this.f11092c, i);
            } else if (g(bVar)) {
                a(this.f11093d, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        synchronized (this.f11090a) {
            if (this.f11092c == cVar || this.f11093d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(C0099b bVar) {
        boolean z;
        synchronized (this.f11090a) {
            if (!f(bVar)) {
                if (!g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void h(C0099b bVar) {
        synchronized (this.f11090a) {
            if (f(bVar)) {
                this.f11092c = null;
                if (this.f11093d != null) {
                    n();
                }
            }
        }
    }

    public void i(C0099b bVar) {
        synchronized (this.f11090a) {
            if (f(bVar)) {
                l(this.f11092c);
            }
        }
    }

    public void j(C0099b bVar) {
        synchronized (this.f11090a) {
            if (f(bVar) && !this.f11092c.f11097c) {
                this.f11092c.f11097c = true;
                this.f11091b.removeCallbacksAndMessages(this.f11092c);
            }
        }
    }

    public void k(C0099b bVar) {
        synchronized (this.f11090a) {
            if (f(bVar) && this.f11092c.f11097c) {
                this.f11092c.f11097c = false;
                l(this.f11092c);
            }
        }
    }

    public void m(int i, C0099b bVar) {
        synchronized (this.f11090a) {
            if (f(bVar)) {
                this.f11092c.f11096b = i;
                this.f11091b.removeCallbacksAndMessages(this.f11092c);
                l(this.f11092c);
                return;
            }
            if (g(bVar)) {
                this.f11093d.f11096b = i;
            } else {
                this.f11093d = new c(i, bVar);
            }
            if (this.f11092c == null || !a(this.f11092c, 4)) {
                this.f11092c = null;
                n();
            }
        }
    }
}
