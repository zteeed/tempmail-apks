package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzjf {

    /* renamed from: a  reason: collision with root package name */
    private int f8952a;

    public void a() {
        this.f8952a = 0;
    }

    public final void b(int i) {
        this.f8952a = i;
    }

    public final void c(int i) {
        this.f8952a |= Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final boolean d(int i) {
        return (this.f8952a & i) == i;
    }

    public final boolean e() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }
}
