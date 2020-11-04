package b.c.a.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.a;

final class m extends k<a> {

    /* renamed from: e  reason: collision with root package name */
    private final String f2446e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ n f2447f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(n nVar, com.google.android.play.core.tasks.m<a> mVar, String str) {
        super(nVar, new a("OnRequestInstallCallback"), mVar);
        this.f2447f = nVar;
        this.f2446e = str;
    }

    public final void l(Bundle bundle) throws RemoteException {
        super.l(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f2444c.d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f2444c.e(n.c(this.f2447f, bundle, this.f2446e));
        }
    }
}
