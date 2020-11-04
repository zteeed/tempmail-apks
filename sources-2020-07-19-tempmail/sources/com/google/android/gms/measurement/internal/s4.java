package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
abstract class s4 extends p4 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f10227b;

    s4(zzfy zzfy) {
        super(zzfy);
        this.f10171a.i(this);
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    /* access modifiers changed from: protected */
    public final void p() {
        if (!t()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f10227b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!s()) {
            this.f10171a.t();
            this.f10227b = true;
        }
    }

    public final void r() {
        if (!this.f10227b) {
            o();
            this.f10171a.t();
            this.f10227b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean s();

    /* access modifiers changed from: package-private */
    public final boolean t() {
        return this.f10227b;
    }
}
