package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
abstract class s4 extends p4 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f10413b;

    s4(zzfy zzfy) {
        super(zzfy);
        this.f10357a.i(this);
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
        if (this.f10413b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!s()) {
            this.f10357a.t();
            this.f10413b = true;
        }
    }

    public final void r() {
        if (!this.f10413b) {
            o();
            this.f10357a.t();
            this.f10413b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean s();

    /* access modifiers changed from: package-private */
    public final boolean t() {
        return this.f10413b;
    }
}
