package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cf0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzsq f3738a;

    cf0(zzsq zzsq) {
        this.f3738a = zzsq;
    }

    public final void h0(ConnectionResult connectionResult) {
        synchronized (this.f3738a.f9277b) {
            zztd unused = this.f3738a.f9280e = null;
            if (this.f3738a.f9278c != null) {
                zzsz unused2 = this.f3738a.f9278c = null;
            }
            this.f3738a.f9277b.notifyAll();
        }
    }
}
