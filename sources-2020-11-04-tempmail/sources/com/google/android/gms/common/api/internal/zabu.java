package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zabu extends zal {
    private TaskCompletionSource<Void> g;

    public void g() {
        super.g();
        this.g.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* access modifiers changed from: protected */
    public final void m(ConnectionResult connectionResult, int i) {
        this.g.b(ApiExceptionUtil.a(new Status(connectionResult.u(), connectionResult.v(), connectionResult.A())));
    }

    /* access modifiers changed from: protected */
    public final void o() {
        int i = this.f3092f.i(this.f2942b.n());
        if (i == 0) {
            this.g.c(null);
        } else if (!this.g.a().q()) {
            n(new ConnectionResult(i, (PendingIntent) null), 0);
        }
    }
}
