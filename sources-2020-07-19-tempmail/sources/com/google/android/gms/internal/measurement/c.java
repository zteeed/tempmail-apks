package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class c extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9365f;
    private final /* synthetic */ String g;
    private final /* synthetic */ zzt h;
    private final /* synthetic */ zzag i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(zzag zzag, String str, String str2, zzt zzt) {
        super(zzag);
        this.i = zzag;
        this.f9365f = str;
        this.g = str2;
        this.h = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.i.i.getConditionalUserProperties(this.f9365f, this.g, this.h);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.h.B((Bundle) null);
    }
}
