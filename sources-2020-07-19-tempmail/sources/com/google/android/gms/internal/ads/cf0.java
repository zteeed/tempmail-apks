package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cf0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsq f3555a;

    cf0(zzsq zzsq) {
        this.f3555a = zzsq;
    }

    public final void b0(ConnectionResult connectionResult) {
        synchronized (this.f3555a.f9094b) {
            zztd unused = this.f3555a.f9097e = null;
            if (this.f3555a.f9095c != null) {
                zzsz unused2 = this.f3555a.f9095c = null;
            }
            this.f3555a.f9094b.notifyAll();
        }
    }
}
