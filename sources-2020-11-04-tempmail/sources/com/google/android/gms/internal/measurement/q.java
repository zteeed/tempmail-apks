package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class q extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f9656f;
    private final /* synthetic */ zzt g;
    private final /* synthetic */ zzag h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(zzag zzag, Bundle bundle, zzt zzt) {
        super(zzag);
        this.h = zzag;
        this.f9656f = bundle;
        this.g = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.h.i.performAction(this.f9656f, this.g, this.f9736b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.g.E((Bundle) null);
    }
}
