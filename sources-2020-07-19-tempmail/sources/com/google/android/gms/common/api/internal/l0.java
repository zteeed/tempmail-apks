package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class l0 extends zabr {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dialog f2801a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ k0 f2802b;

    l0(k0 k0Var, Dialog dialog) {
        this.f2802b = k0Var;
        this.f2801a = dialog;
    }

    public final void a() {
        this.f2802b.f2798c.p();
        if (this.f2801a.isShowing()) {
            this.f2801a.dismiss();
        }
    }
}
