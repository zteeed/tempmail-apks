package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

final class w implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f2827b;

    w(GoogleApiManager.zaa zaa) {
        this.f2827b = zaa;
    }

    public final void run() {
        this.f2827b.r();
    }
}
