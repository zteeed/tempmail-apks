package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class g extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9583f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(zzag zzag, String str) {
        super(zzag);
        this.g = zzag;
        this.f9583f = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.beginAdUnitExposure(this.f9583f, this.f9737c);
    }
}
