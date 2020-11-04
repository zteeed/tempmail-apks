package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;

final class k extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f11304c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q f11305d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(q qVar, m mVar, m mVar2) {
        super(mVar);
        this.f11305d = qVar;
        this.f11304c = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f11305d.f11364d.f()).D2(this.f11305d.f11361a, q.s(), new o(this.f11305d, this.f11304c));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "keepAlive", new Object[0]);
        }
    }
}
