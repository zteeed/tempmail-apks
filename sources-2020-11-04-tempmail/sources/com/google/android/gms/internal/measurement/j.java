package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class j extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzt f9608f;
    private final /* synthetic */ zzag g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(zzag zzag, zzt zzt) {
        super(zzag);
        this.g = zzag;
        this.f9608f = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.g.i.generateEventId(this.f9608f);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f9608f.E((Bundle) null);
    }
}
