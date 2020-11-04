package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
abstract class m7 extends n7 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f10130c;

    m7(zzkj zzkj) {
        super(zzkj);
        this.f10143b.s(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        return this.f10130c;
    }

    /* access modifiers changed from: protected */
    public final void s() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (!this.f10130c) {
            u();
            this.f10143b.f0();
            this.f10130c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean u();
}
