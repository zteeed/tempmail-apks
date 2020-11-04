package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class en implements zzduu<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f3734a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcqi f3735b;

    en(zzcqi zzcqi, boolean z) {
        this.f3735b = zzcqi;
        this.f3734a = z;
    }

    public final void a(Throwable th) {
        zzbba.g("Failed to get signals bundle");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList b2 = zzcqi.k(bundle);
        zzty.zzo.zzc e2 = zzcqi.j(bundle);
        this.f3735b.f7369e.a(new dn(this, this.f3734a, b2, this.f3735b.i(bundle), e2));
    }
}
