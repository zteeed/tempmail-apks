package com.google.zxing.s.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: InactivityTimer */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12307a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver f12308b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12309c = false;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f12310d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f12311e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12312f;

    /* compiled from: InactivityTimer */
    private final class b extends BroadcastReceiver {

        /* compiled from: InactivityTimer */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f12314b;

            a(boolean z) {
                this.f12314b = z;
            }

            public void run() {
                e.this.f(this.f12314b);
            }
        }

        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                e.this.f12310d.post(new a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public e(Context context, Runnable runnable) {
        this.f12307a = context;
        this.f12311e = runnable;
        this.f12308b = new b();
        this.f12310d = new Handler();
    }

    private void e() {
        this.f12310d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    public void f(boolean z) {
        this.f12312f = z;
        if (this.f12309c) {
            c();
        }
    }

    private void g() {
        if (!this.f12309c) {
            this.f12307a.registerReceiver(this.f12308b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f12309c = true;
        }
    }

    private void i() {
        if (this.f12309c) {
            this.f12307a.unregisterReceiver(this.f12308b);
            this.f12309c = false;
        }
    }

    public void c() {
        e();
        if (this.f12312f) {
            this.f12310d.postDelayed(this.f12311e, 300000);
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
