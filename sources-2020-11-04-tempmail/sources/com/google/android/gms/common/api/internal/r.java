package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class r extends zabr {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<zaaw> f3003a;

    r(zaaw zaaw) {
        this.f3003a = new WeakReference<>(zaaw);
    }

    public final void a() {
        zaaw zaaw = (zaaw) this.f3003a.get();
        if (zaaw != null) {
            zaaw.l();
        }
    }
}
