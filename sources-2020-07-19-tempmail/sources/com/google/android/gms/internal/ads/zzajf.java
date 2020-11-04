package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzajf {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5745a;

    /* renamed from: b  reason: collision with root package name */
    private final zzwp f5746b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzajf(Context context, String str) {
        this(context, zzwg.b().i(context, str, new zzamo()));
        Preconditions.l(context, "context cannot be null");
    }

    public final zzajf a(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        try {
            this.f5746b.z5(new zzajd(instreamAdLoadCallback));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return this;
    }

    public final zzajf b(zzaja zzaja) {
        try {
            this.f5746b.P5(new zzaio(zzaja));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        return this;
    }

    public final zzajc c() {
        try {
            return new zzajc(this.f5745a, this.f5746b.j5());
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            return null;
        }
    }

    private zzajf(Context context, zzwp zzwp) {
        this.f5745a = context;
        this.f5746b = zzwp;
    }
}
