package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.zxing.m;
import com.google.zxing.s.a.g;
import com.journeyapps.barcodescanner.q.k;

/* compiled from: DecoderThread */
public class h {
    private static final String k = "h";

    /* renamed from: a  reason: collision with root package name */
    private com.journeyapps.barcodescanner.q.b f12180a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f12181b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f12182c;

    /* renamed from: d  reason: collision with root package name */
    private e f12183d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f12184e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f12185f;
    /* access modifiers changed from: private */
    public boolean g = false;
    /* access modifiers changed from: private */
    public final Object h = new Object();
    private final Handler.Callback i = new a();
    private final k j = new b();

    /* compiled from: DecoderThread */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == g.zxing_decode) {
                h.this.g((o) message.obj);
                return true;
            } else if (i != g.zxing_preview_failed) {
                return true;
            } else {
                h.this.h();
                return true;
            }
        }
    }

    /* compiled from: DecoderThread */
    class b implements k {
        b() {
        }

        public void a(Exception exc) {
            synchronized (h.this.h) {
                if (h.this.g) {
                    h.this.f12182c.obtainMessage(g.zxing_preview_failed).sendToTarget();
                }
            }
        }

        public void b(o oVar) {
            synchronized (h.this.h) {
                if (h.this.g) {
                    h.this.f12182c.obtainMessage(g.zxing_decode, oVar).sendToTarget();
                }
            }
        }
    }

    public h(com.journeyapps.barcodescanner.q.b bVar, e eVar, Handler handler) {
        p.a();
        this.f12180a = bVar;
        this.f12183d = eVar;
        this.f12184e = handler;
    }

    /* access modifiers changed from: private */
    public void g(o oVar) {
        long currentTimeMillis = System.currentTimeMillis();
        oVar.i(this.f12185f);
        com.google.zxing.h f2 = f(oVar);
        m c2 = f2 != null ? this.f12183d.c(f2) : null;
        if (c2 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = k;
            Log.d(str, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f12184e != null) {
                Message obtain = Message.obtain(this.f12184e, g.zxing_decode_succeeded, new c(c2, oVar));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f12184e;
            if (handler != null) {
                Message.obtain(handler, g.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f12184e != null) {
            Message.obtain(this.f12184e, g.zxing_possible_result_points, this.f12183d.d()).sendToTarget();
        }
        h();
    }

    /* access modifiers changed from: private */
    public void h() {
        this.f12180a.q(this.j);
    }

    /* access modifiers changed from: protected */
    public com.google.zxing.h f(o oVar) {
        if (this.f12185f == null) {
            return null;
        }
        return oVar.a();
    }

    public void i(Rect rect) {
        this.f12185f = rect;
    }

    public void j(e eVar) {
        this.f12183d = eVar;
    }

    public void k() {
        p.a();
        HandlerThread handlerThread = new HandlerThread(k);
        this.f12181b = handlerThread;
        handlerThread.start();
        this.f12182c = new Handler(this.f12181b.getLooper(), this.i);
        this.g = true;
        h();
    }

    public void l() {
        p.a();
        synchronized (this.h) {
            this.g = false;
            this.f12182c.removeCallbacksAndMessages((Object) null);
            this.f12181b.quit();
        }
    }
}
