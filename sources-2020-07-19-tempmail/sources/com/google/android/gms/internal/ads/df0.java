package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class df0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsq f3644a;

    df0(zzsq zzsq) {
        this.f3644a = zzsq;
    }

    public final void E(Bundle bundle) {
        synchronized (this.f3644a.f9094b) {
            try {
                if (this.f3644a.f9095c != null) {
                    zztd unused = this.f3644a.f9097e = this.f3644a.f9095c.e();
                }
            } catch (DeadObjectException e2) {
                zzbba.c("Unable to obtain a cache service instance.", e2);
                this.f3644a.b();
            }
            this.f3644a.f9094b.notifyAll();
        }
    }

    public final void y(int i) {
        synchronized (this.f3644a.f9094b) {
            zztd unused = this.f3644a.f9097e = null;
            this.f3644a.f9094b.notifyAll();
        }
    }
}
