package com.journeyapps.barcodescanner.q;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.zxing.s.a.g;
import com.journeyapps.barcodescanner.n;
import com.journeyapps.barcodescanner.p;

/* compiled from: CameraInstance */
public class b {
    /* access modifiers changed from: private */
    public static final String n = "b";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public f f12215a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public e f12216b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public c f12217c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f12218d;

    /* renamed from: e  reason: collision with root package name */
    private h f12219e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f12220f = false;
    /* access modifiers changed from: private */
    public boolean g = true;
    private Handler h;
    private d i = new d();
    private Runnable j = new c();
    private Runnable k = new d();
    private Runnable l = new e();
    private Runnable m = new f();

    /* compiled from: CameraInstance */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12221b;

        a(boolean z) {
            this.f12221b = z;
        }

        public void run() {
            b.this.f12217c.s(this.f12221b);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.q.b$b  reason: collision with other inner class name */
    /* compiled from: CameraInstance */
    class C0122b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f12223b;

        /* renamed from: com.journeyapps.barcodescanner.q.b$b$a */
        /* compiled from: CameraInstance */
        class a implements Runnable {
            a() {
            }

            public void run() {
                b.this.f12217c.l(C0122b.this.f12223b);
            }
        }

        C0122b(k kVar) {
            this.f12223b = kVar;
        }

        public void run() {
            if (!b.this.f12220f) {
                Log.d(b.n, "Camera is closed, not requesting preview");
            } else {
                b.this.f12215a.c(new a());
            }
        }
    }

    /* compiled from: CameraInstance */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                Log.d(b.n, "Opening camera");
                b.this.f12217c.k();
            } catch (Exception e2) {
                b.this.o(e2);
                Log.e(b.n, "Failed to open camera", e2);
            }
        }
    }

    /* compiled from: CameraInstance */
    class d implements Runnable {
        d() {
        }

        public void run() {
            try {
                Log.d(b.n, "Configuring camera");
                b.this.f12217c.d();
                if (b.this.f12218d != null) {
                    b.this.f12218d.obtainMessage(g.zxing_prewiew_size_ready, b.this.m()).sendToTarget();
                }
            } catch (Exception e2) {
                b.this.o(e2);
                Log.e(b.n, "Failed to configure camera", e2);
            }
        }
    }

    /* compiled from: CameraInstance */
    class e implements Runnable {
        e() {
        }

        public void run() {
            try {
                Log.d(b.n, "Starting preview");
                b.this.f12217c.r(b.this.f12216b);
                b.this.f12217c.t();
            } catch (Exception e2) {
                b.this.o(e2);
                Log.e(b.n, "Failed to start preview", e2);
            }
        }
    }

    /* compiled from: CameraInstance */
    class f implements Runnable {
        f() {
        }

        public void run() {
            try {
                Log.d(b.n, "Closing camera");
                b.this.f12217c.u();
                b.this.f12217c.c();
            } catch (Exception e2) {
                Log.e(b.n, "Failed to close camera", e2);
            }
            boolean unused = b.this.g = true;
            b.this.f12218d.sendEmptyMessage(g.zxing_camera_closed);
            b.this.f12215a.b();
        }
    }

    public b(Context context) {
        p.a();
        this.f12215a = f.d();
        c cVar = new c(context);
        this.f12217c = cVar;
        cVar.n(this.i);
        this.h = new Handler();
    }

    /* access modifiers changed from: private */
    public n m() {
        return this.f12217c.g();
    }

    /* access modifiers changed from: private */
    public void o(Exception exc) {
        Handler handler = this.f12218d;
        if (handler != null) {
            handler.obtainMessage(g.zxing_camera_error, exc).sendToTarget();
        }
    }

    private void x() {
        if (!this.f12220f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void j() {
        p.a();
        if (this.f12220f) {
            this.f12215a.c(this.m);
        } else {
            this.g = true;
        }
        this.f12220f = false;
    }

    public void k() {
        p.a();
        x();
        this.f12215a.c(this.k);
    }

    public h l() {
        return this.f12219e;
    }

    public boolean n() {
        return this.g;
    }

    public void p() {
        p.a();
        this.f12220f = true;
        this.g = false;
        this.f12215a.e(this.j);
    }

    public void q(k kVar) {
        this.h.post(new C0122b(kVar));
    }

    public void r(d dVar) {
        if (!this.f12220f) {
            this.i = dVar;
            this.f12217c.n(dVar);
        }
    }

    public void s(h hVar) {
        this.f12219e = hVar;
        this.f12217c.p(hVar);
    }

    public void t(Handler handler) {
        this.f12218d = handler;
    }

    public void u(e eVar) {
        this.f12216b = eVar;
    }

    public void v(boolean z) {
        p.a();
        if (this.f12220f) {
            this.f12215a.c(new a(z));
        }
    }

    public void w() {
        p.a();
        x();
        this.f12215a.c(this.l);
    }
}
