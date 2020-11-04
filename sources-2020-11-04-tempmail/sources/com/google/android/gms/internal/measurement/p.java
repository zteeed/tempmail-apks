package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class p extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9654f;
    private final /* synthetic */ zzt g;
    private final /* synthetic */ zzag h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(zzag zzag, String str, zzt zzt) {
        super(zzag);
        this.h = zzag;
        this.f9654f = str;
        this.g = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.h.i.getMaxUserProperties(this.f9654f, this.g);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.g.E((Bundle) null);
    }
}
