package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class i extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9603f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(zzag zzag, String str) {
        super(zzag);
        this.g = zzag;
        this.f9603f = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.endAdUnitExposure(this.f9603f, this.f9737c);
    }
}
