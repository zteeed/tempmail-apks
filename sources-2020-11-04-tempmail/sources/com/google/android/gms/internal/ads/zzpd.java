package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpd {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9155a;

    public final synchronized void a() throws InterruptedException {
        while (!this.f9155a) {
            wait();
        }
    }

    public final synchronized boolean b() {
        if (this.f9155a) {
            return false;
        }
        this.f9155a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean c() {
        boolean z;
        z = this.f9155a;
        this.f9155a = false;
        return z;
    }
}
