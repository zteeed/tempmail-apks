package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;
import java.util.List;

final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f11227c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f11228d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q f11229e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(q qVar, m mVar, List list, m mVar2) {
        super(mVar);
        this.f11229e = qVar;
        this.f11227c = list;
        this.f11228d = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f11229e.f11363c.f()).T5(this.f11229e.f11361a, q.c(this.f11227c), q.s(), new l(this.f11229e, this.f11228d, (byte[]) null));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "cancelDownloads(%s)", this.f11227c);
        }
    }
}
