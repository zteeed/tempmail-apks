package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class k extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzt f9431f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(zzag zzag, zzt zzt) {
        super(zzag);
        this.g = zzag;
        this.f9431f = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.getCachedAppInstanceId(this.f9431f);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f9431f.B((Bundle) null);
    }
}
