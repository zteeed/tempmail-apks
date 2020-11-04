package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzty;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class en implements zzduu<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f3917a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcqi f3918b;

    en(zzcqi zzcqi, boolean z) {
        this.f3918b = zzcqi;
        this.f3917a = z;
    }

    public final void a(Throwable th) {
        zzbba.g("Failed to get signals bundle");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList b2 = zzcqi.k(bundle);
        zzty.zzo.zzc e2 = zzcqi.j(bundle);
        this.f3918b.f7552e.a(new dn(this, this.f3917a, b2, this.f3918b.i(bundle), e2));
    }
}
