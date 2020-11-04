package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.zzdqi;
import com.google.android.gms.internal.ads.zzdqm;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdpx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8301a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f8302b;

    public zzdpx(Context context, Looper looper) {
        this.f8301a = context;
        this.f8302b = looper;
    }

    public final void a(String str) {
        zzdqm.zza N = zzdqm.N();
        N.y(this.f8301a.getPackageName());
        N.x(zzdqm.zzb.BLOCKED_IMPRESSION);
        zzdqi.zzb L = zzdqi.L();
        L.x(str);
        L.w(zzdqi.zza.BLOCKED_REASON_BACKGROUND);
        N.w(L);
        new oy(this.f8301a, this.f8302b, (zzdqm) ((zzegb) N.O())).b();
    }
}
