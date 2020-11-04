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
    private boolean f12755a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f12756b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12757c;

    /* renamed from: d  reason: collision with root package name */
    private final Camera f12758d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f12759e = new Handler(this.g);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f12760f = 1;
    private final Handler.Callback g = new C0120a();
    private final Camera.AutoFocusCallback h = new b();

    /* renamed from: com.journeyapps.barcodescanner.q.a$a  reason: collision with other inner class name */
    /* compiled from: AutoFocusManager */
    class C0120a implements Handler.Callback {
        C0120a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != a.this.f12760f) {
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
                boolean unused = a.this.f12756b = false;
                a.this.f();
            }
        }

        b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            a.this.f12759e.post(new C0121a());
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
        this.f12758d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        this.f12757c = (!dVar.c() || !j.contains(focusMode)) ? false : z;
        String str = i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + this.f12757c);
        i();
    }

    /* access modifiers changed from: private */
    public synchronized void f() {
        if (!this.f12755a && !this.f12759e.hasMessages(this.f12760f)) {
            this.f12759e.sendMessageDelayed(this.f12759e.obtainMessage(this.f12760f), 2000);
        }
    }

    private void g() {
        this.f12759e.removeMessages(this.f12760f);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f12757c && !this.f12755a && !this.f12756b) {
            try {
                this.f12758d.autoFocus(this.h);
                this.f12756b = true;
            } catch (RuntimeException e2) {
                Log.w(i, "Unexpected exception while focusing", e2);
                f();
            }
        }
    }

    public void i() {
        this.f12755a = false;
        h();
    }

    public void j() {
        this.f12755a = true;
        this.f12756b = false;
        g();
        if (this.f12757c) {
            try {
                this.f12758d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                Log.w(i, "Unexpected exception while cancelling focusing", e2);
            }
        }
    }
}
