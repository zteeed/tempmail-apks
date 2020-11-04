package com.google.android.play.core.internal;

import android.os.IBinder;

final /* synthetic */ class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    private final l f11482a;

    c(l lVar) {
        this.f11482a = lVar;
    }

    public final void binderDied() {
        this.f11482a.k();
    }
}
