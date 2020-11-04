package b.c.a.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.j0;
import com.google.android.play.core.tasks.m;

class k<T> extends j0 {

    /* renamed from: b  reason: collision with root package name */
    final a f2443b;

    /* renamed from: c  reason: collision with root package name */
    final m<T> f2444c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f2445d;

    k(n nVar, a aVar, m<T> mVar) {
        this.f2445d = nVar;
        this.f2443b = aVar;
        this.f2444c = mVar;
    }

    public void l(Bundle bundle) throws RemoteException {
        this.f2445d.f2450a.b();
        this.f2443b.f("onRequestInfo", new Object[0]);
    }

    public void y(Bundle bundle) throws RemoteException {
        this.f2445d.f2450a.b();
        this.f2443b.f("onCompleteUpdate", new Object[0]);
    }
}
