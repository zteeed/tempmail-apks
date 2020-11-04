package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

final class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager.zaa f2826b;

    v(GoogleApiManager.zaa zaa) {
        this.f2826b = zaa;
    }

    public final void run() {
        this.f2826b.q();
    }
}
