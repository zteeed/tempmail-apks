package com.google.android.gms.common.api.internal;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final zabd f3004a;

    protected s(zabd zabd) {
        this.f3004a = zabd;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void b(zabe zabe) {
        zabe.f3038b.lock();
        try {
            if (zabe.l == this.f3004a) {
                a();
                zabe.f3038b.unlock();
            }
        } finally {
            zabe.f3038b.unlock();
        }
    }
}
