package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class df0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsq f3827a;

    df0(zzsq zzsq) {
        this.f3827a = zzsq;
    }

    public final void B(int i) {
        synchronized (this.f3827a.f9277b) {
            zztd unused = this.f3827a.f9280e = null;
            this.f3827a.f9277b.notifyAll();
        }
    }

    public final void H(Bundle bundle) {
        synchronized (this.f3827a.f9277b) {
            try {
                if (this.f3827a.f9278c != null) {
                    zztd unused = this.f3827a.f9280e = this.f3827a.f9278c.e();
                }
            } catch (DeadObjectException e2) {
                zzbba.c("Unable to obtain a cache service instance.", e2);
                this.f3827a.b();
            }
            this.f3827a.f9277b.notifyAll();
        }
    }
}
