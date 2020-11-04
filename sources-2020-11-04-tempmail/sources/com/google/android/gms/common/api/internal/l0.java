package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class l0 extends zabr {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dialog f2989a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ k0 f2990b;

    l0(k0 k0Var, Dialog dialog) {
        this.f2990b = k0Var;
        this.f2989a = dialog;
    }

    public final void a() {
        this.f2990b.f2986c.p();
        if (this.f2989a.isShowing()) {
            this.f2989a.dismiss();
        }
    }
}
