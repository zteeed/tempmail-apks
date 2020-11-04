package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpd {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8972a;

    public final synchronized void a() throws InterruptedException {
        while (!this.f8972a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f8972a) {
            return false;
        }
        this.f8972a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f8972a;
        this.f8972a = false;
        return z;
    }
}
