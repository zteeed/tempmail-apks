package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;

final class g extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f11249c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11250d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f11251e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f11252f;
    final /* synthetic */ m g;
    final /* synthetic */ q h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(q qVar, m mVar, int i, String str, String str2, int i2, m mVar2) {
        super(mVar);
        this.h = qVar;
        this.f11249c = i;
        this.f11250d = str;
        this.f11251e = str2;
        this.f11252f = i2;
        this.g = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.h.f11363c.f()).S2(this.h.f11361a, q.o(this.f11249c, this.f11250d, this.f11251e, this.f11252f), q.s(), new l(this.h, this.g, (char[]) null));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
