package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
abstract class x3 extends t1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f10314b;

    x3(zzfy zzfy) {
        super(zzfy);
        this.f10171a.d(this);
    }

    public final void A() {
        if (!this.f10314b) {
            w();
            this.f10171a.t();
            this.f10314b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean B();

    /* access modifiers changed from: protected */
    public void w() {
    }

    /* access modifiers changed from: package-private */
    public final boolean x() {
        return this.f10314b;
    }

    /* access modifiers changed from: protected */
    public final void y() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void z() {
        if (this.f10314b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!B()) {
            this.f10171a.t();
            this.f10314b = true;
        }
    }
}
