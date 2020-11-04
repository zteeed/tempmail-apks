package com.google.android.play.core.assetpacks;

import android.os.Bundle;

final /* synthetic */ class t implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final v f11390b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f11391c;

    /* renamed from: d  reason: collision with root package name */
    private final b f11392d;

    t(v vVar, Bundle bundle, b bVar) {
        this.f11390b = vVar;
        this.f11391c = bundle;
        this.f11392d = bVar;
    }

    public final void run() {
        this.f11390b.i(this.f11391c, this.f11392d);
    }
}
