package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

final class u implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GoogleApiManager f3010a;

    u(GoogleApiManager googleApiManager) {
        this.f3010a = googleApiManager;
    }

    public final void a(boolean z) {
        this.f3010a.n.sendMessage(this.f3010a.n.obtainMessage(1, Boolean.valueOf(z)));
    }
}
