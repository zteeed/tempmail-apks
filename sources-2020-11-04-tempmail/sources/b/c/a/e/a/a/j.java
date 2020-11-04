package b.c.a.e.a.a;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.tasks.m;

final class j extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f2440c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f2441d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n f2442e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(n nVar, m mVar, m mVar2, String str) {
        super(mVar);
        this.f2442e = nVar;
        this.f2440c = mVar2;
        this.f2441d = str;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.f2442e.f2450a.f().G6(this.f2442e.f2451b, n.j(), new l(this.f2442e, this.f2440c));
        } catch (RemoteException e2) {
            n.f2448e.d(e2, "completeUpdate(%s)", this.f2441d);
            this.f2440c.d(new RuntimeException(e2));
        }
    }
}
