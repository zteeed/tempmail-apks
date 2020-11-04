package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class a extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f9540f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(zzag zzag, Bundle bundle) {
        super(zzag);
        this.g = zzag;
        this.f9540f = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.setConditionalUserProperty(this.f9540f, this.f9736b);
    }
}
