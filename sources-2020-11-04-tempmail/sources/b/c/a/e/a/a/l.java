package b.c.a.e.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.tasks.m;

final class l extends k<Void> {
    l(n nVar, m<Void> mVar) {
        super(nVar, new a("OnCompleteUpdateCallback"), mVar);
    }

    public final void y(Bundle bundle) throws RemoteException {
        super.y(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f2444c.d(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            this.f2444c.e(null);
        }
    }
}
