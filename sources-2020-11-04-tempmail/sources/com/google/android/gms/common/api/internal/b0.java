package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class b0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zace f2959b;

    b0(zace zace) {
        this.f2959b = zace;
    }

    public final void run() {
        this.f2959b.h.c(new ConnectionResult(4));
    }
}
