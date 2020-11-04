package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class u extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Long f9679f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ zzag l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u(zzag zzag, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzag);
        this.l = zzag;
        this.f9679f = l2;
        this.g = str;
        this.h = str2;
        this.i = bundle;
        this.j = z;
        this.k = z2;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        Long l2 = this.f9679f;
        this.l.i.logEvent(this.g, this.h, this.i, this.j, this.k, l2 == null ? this.f9736b : l2.longValue());
    }
}
