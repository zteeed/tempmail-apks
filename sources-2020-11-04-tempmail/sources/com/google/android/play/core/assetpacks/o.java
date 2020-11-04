package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.m;

final class o extends l<Void> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f11346d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(q qVar, m<Void> mVar) {
        super(qVar, mVar);
        this.f11346d = qVar;
    }

    public final void P(Bundle bundle, Bundle bundle2) {
        super.P(bundle, bundle2);
        if (!this.f11346d.f11365e.compareAndSet(true, false)) {
            q.f11360f.g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f11346d.d();
        }
    }
}
