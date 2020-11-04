package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
final class o extends zzag.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f9651f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ zzt i;
    private final /* synthetic */ zzag j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(zzag zzag, String str, String str2, boolean z, zzt zzt) {
        super(zzag);
        this.j = zzag;
        this.f9651f = str;
        this.g = str2;
        this.h = z;
        this.i = zzt;
    }

    /* access modifiers changed from: package-private */
    public final void a() throws RemoteException {
        this.j.i.getUserProperties(this.f9651f, this.g, this.h, this.i);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.i.E((Bundle) null);
    }
}
