package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;

final class h extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f11266c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11267d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m f11268e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f11269f;
    final /* synthetic */ q g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(q qVar, m mVar, int i, String str, m mVar2, int i2) {
        super(mVar);
        this.g = qVar;
        this.f11266c = i;
        this.f11267d = str;
        this.f11268e = mVar2;
        this.f11269f = i2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.g.f11363c.f()).u3(this.g.f11361a, q.n(this.f11266c, this.f11267d), q.s(), new p(this.g, this.f11268e, this.f11266c, this.f11267d, this.f11269f));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
