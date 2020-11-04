package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class r extends zabr {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<zaaw> f2815a;

    r(zaaw zaaw) {
        this.f2815a = new WeakReference<>(zaaw);
    }

    public final void a() {
        zaaw zaaw = (zaaw) this.f2815a.get();
        if (zaaw != null) {
            zaaw.l();
        }
    }
}
