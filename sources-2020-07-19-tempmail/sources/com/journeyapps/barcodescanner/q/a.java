package com.journeyapps.barcodescanner.q;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: AutoFocusManager */
public final class a {
    private static final String i = "a";
    private static final Collection<String> j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12206a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f12207b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12208c;

    /* renamed from: d  reason: collision with root package name */
    private final Camera f12209d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f12210e = new Handler(this.g);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f12211f = 1;
    private final Handler.Callback g = new C0120a();
    private final Camera.AutoFocusCallback h = new b();

    /* renamed from: com.journeyapps.barcodescanner.q.a$a  reason: collision with other inner class name */
    /* compiled from: AutoFocusManager */
    class C0120a implements Handler.Callback {
        C0120a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != a.this.f12211f) {
                return false;
            }
            a.this.h();
            return true;
        }
    }

    /* compiled from: AutoFocusManager */
    class b implements Camera.AutoFocusCallback {

        /* renamed from: com.journeyapps.barcodescanner.q.a$b$a  reason: collision with other inner class name */
        /* compiled from: AutoFocusManager */
        class C0121a implements Runnable {
            C0121a() {
            }

            public void run() {
                boolean unused = a.this.f12207b = false;
                a.this.f();
            }
        }

        b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            a.this.f12210e.post(new C0121a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        j = arrayList;
        arrayList.add("auto");
        j.add("macro");
    }

    public a(Camera camera, d dVar) {
        boolean z = true;
        this.f12209d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.f12208c = (!dVar.c() || !j.contains(focusMode)) ? false : z;
        String str = i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + this.f12208c);
        i();
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f12206a && !this.f12210e.hasMessages(this.f12211f)) {
            this.f12210e.sendMessageDelayed(this.f12210e.obtainMessage(this.f12211f), 2000);
        }
    }

    private void g() {
        this.f12210e.removeMessages(this.f12211f);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f12208c && !this.f12206a && !this.f12207b) {
            try {
                this.f12209d.autoFocus(this.h);
                this.f12207b = true;
            } catch (RuntimeException e2) {
                Log.w(i, "Unexpected exception while focusing", e2);
                f();
            }
        }
    }

    public void i() {
        this.f12206a = false;
        h();
    }

    public void j() {
        this.f12206a = true;
        this.f12207b = false;
        g();
        if (this.f12208c) {
            try {
                this.f12209d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                Log.w(i, "Unexpected exception while cancelling focusing", e2);
            }
        }
    }
}
