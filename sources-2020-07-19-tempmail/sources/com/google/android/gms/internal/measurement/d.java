package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class d extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9380f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ zzag i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d(zzag zzag, String str, String str2, Bundle bundle) {
        super(zzag);
        this.i = zzag;
        this.f9380f = str;
        this.g = str2;
        this.h = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.i.i.clearConditionalUserProperty(this.f9380f, this.g, this.h);
    }
}
