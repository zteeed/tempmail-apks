package com.google.android.gms.common.api.internal;

abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final zabd f2816a;

    protected s(zabd zabd) {
        this.f2816a = zabd;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void b(zabe zabe) {
        zabe.f2850b.lock();
        try {
            if (zabe.l == this.f2816a) {
                a();
                zabe.f2850b.unlock();
            }
        } finally {
            zabe.f2850b.unlock();
        }
    }
}
