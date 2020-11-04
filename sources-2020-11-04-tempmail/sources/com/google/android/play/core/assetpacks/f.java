package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.internal.n0;
import com.google.android.play.core.tasks.m;
import java.util.Map;

final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Map f11239c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f11240d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q f11241e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(q qVar, m mVar, Map map, m mVar2) {
        super(mVar);
        this.f11241e = qVar;
        this.f11239c = map;
        this.f11240d = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((n0) this.f11241e.f11363c.f()).q3(this.f11241e.f11361a, q.j(this.f11239c), new n(this.f11241e, this.f11240d));
        } catch (RemoteException e2) {
            q.f11360f.d(e2, "syncPacks", new Object[0]);
            this.f11240d.d(new RuntimeException(e2));
        }
    }
}
