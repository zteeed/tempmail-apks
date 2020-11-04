package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class r extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f9665f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(zzag zzag, boolean z) {
        super(zzag);
        this.g = zzag;
        this.f9665f = z;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.setDataCollectionEnabled(this.f9665f);
    }
}
