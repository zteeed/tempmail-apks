package com.google.zxing.s.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: InactivityTimer */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11758a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver f11759b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11760c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f11761d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f11762e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11763f;

    /* compiled from: InactivityTimer */
    private final class b extends BroadcastReceiver {

        /* compiled from: InactivityTimer */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f11765b;

            a(boolean z) {
                this.f11765b = z;
            }

            public void run() {
                e.this.f(this.f11765b);
            }
        }

        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                e.this.f11761d.post(new a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public e(Context context, Runnable runnable) {
        this.f11758a = context;
        this.f11762e = runnable;
        this.f11759b = new b();
        this.f11761d = new Handler();
    }

    private void e() {
        this.f11761d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    public void f(boolean z) {
        this.f11763f = z;
        if (this.f11760c) {
            c();
        }
    }

    private void g() {
        if (!this.f11760c) {
            this.f11758a.registerReceiver(this.f11759b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f11760c = true;
        }
    }

    private void i() {
        if (this.f11760c) {
            this.f11758a.unregisterReceiver(this.f11759b);
            this.f11760c = false;
        }
    }

    public void c() {
        e();
        if (this.f11763f) {
            this.f11761d.postDelayed(this.f11762e, 300000);
        }
    }

    public void d() {
        e();
        i();
    }

    public void h() {
        g();
        c();
    }
}
