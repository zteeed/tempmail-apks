package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.m;

public abstract class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final m<?> f11481b;

    b() {
        this.f11481b = null;
    }

    public b(m<?> mVar) {
        this.f11481b = mVar;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final m<?> b() {
        return this.f11481b;
    }

    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            m<?> mVar = this.f11481b;
            if (mVar != null) {
                mVar.d(e2);
            }
        }
    }
}
