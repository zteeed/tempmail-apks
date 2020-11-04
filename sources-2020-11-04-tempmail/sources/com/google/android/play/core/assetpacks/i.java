package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;

final class i extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f11277c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f11278d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q f11279e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(q qVar, m mVar, int i, m mVar2) {
        super(mVar);
        this.f11279e = qVar;
        this.f11277c = i;
        this.f11278d = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f11279e.f11363c.f()).j4(this.f11279e.f11361a, q.m(this.f11277c), q.s(), new l(this.f11279e, this.f11278d, (int[]) null));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
