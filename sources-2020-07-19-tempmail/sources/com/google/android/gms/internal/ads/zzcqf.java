package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqf {

    /* renamed from: a  reason: collision with root package name */
    private int f7358a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f7359b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f7360c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f7361d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final Object f7362e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Object f7363f = new Object();
    private final Object g = new Object();
    private final Object h = new Object();

    public final int a() {
        int i;
        synchronized (this.f7362e) {
            i = this.f7358a;
        }
        return i;
    }

    public final long b() {
        long j;
        synchronized (this.f7363f) {
            j = this.f7359b;
        }
        return j;
    }

    public final synchronized long c() {
        long j;
        synchronized (this.g) {
            j = this.f7360c;
        }
        return j;
    }

    public final synchronized long d() {
        long j;
        synchronized (this.h) {
            j = this.f7361d;
        }
        return j;
    }

    public final void e(int i) {
        synchronized (this.f7362e) {
            this.f7358a = i;
        }
    }

    public final void f(long j) {
        synchronized (this.f7363f) {
            this.f7359b = j;
        }
    }

    public final synchronized void g(long j) {
        synchronized (this.h) {
            this.f7361d = j;
        }
    }

    public final synchronized void h(long j) {
        synchronized (this.g) {
            this.f7360c = j;
        }
    }
}
