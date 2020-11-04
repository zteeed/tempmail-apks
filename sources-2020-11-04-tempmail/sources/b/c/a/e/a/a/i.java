package b.c.a.e.a.a;

import android.os.RemoteException;
import com.google.android.play.core.internal.b;
import com.google.android.play.core.tasks.m;

final class i extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f2437c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f2438d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n f2439e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(n nVar, m mVar, String str, m mVar2) {
        super(mVar);
        this.f2439e = nVar;
        this.f2437c = str;
        this.f2438d = mVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.f2439e.f2450a.f().c4(this.f2439e.f2451b, n.b(this.f2439e, this.f2437c), new m(this.f2439e, this.f2438d, this.f2437c));
        } catch (RemoteException e2) {
            n.f2448e.d(e2, "requestUpdateInfo(%s)", this.f2437c);
            this.f2438d.d(new RuntimeException(e2));
        }
    }
}
