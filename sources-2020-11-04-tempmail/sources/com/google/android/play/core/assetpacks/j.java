package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;

final class j extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f11292c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f11293d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f11294e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f11295f;
    final /* synthetic */ m g;
    final /* synthetic */ q h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(q qVar, m mVar, int i, String str, String str2, int i2, m mVar2) {
        super(mVar);
        this.h = qVar;
        this.f11292c = i;
        this.f11293d = str;
        this.f11294e = str2;
        this.f11295f = i2;
        this.g = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.h.f11363c.f()).B5(this.h.f11361a, q.o(this.f11292c, this.f11293d, this.f11294e, this.f11295f), q.s(), new m(this.h, this.g));
        } catch (RemoteException e2) {
            q.f11360f.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f11293d, this.f11294e, Integer.valueOf(this.f11295f), Integer.valueOf(this.f11292c));
            this.g.d(new RuntimeException(e2));
        }
    }
}
