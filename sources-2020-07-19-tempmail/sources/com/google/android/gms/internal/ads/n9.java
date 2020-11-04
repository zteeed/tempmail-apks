package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class n9 implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4457a;

    /* renamed from: b  reason: collision with root package name */
    private final zzeg f4458b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f4459c;

    /* renamed from: d  reason: collision with root package name */
    private final zza f4460d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4461e;

    n9(Context context, zzeg zzeg, zzbbd zzbbd, zza zza, String str) {
        this.f4457a = context;
        this.f4458b = zzeg;
        this.f4459c = zzbbd;
        this.f4460d = zza;
        this.f4461e = str;
    }

    public final zzdvf zzf(Object obj) {
        Context context = this.f4457a;
        zzeg zzeg = this.f4458b;
        zzbbd zzbbd = this.f4459c;
        zza zza = this.f4460d;
        String str = this.f4461e;
        zzq.zzkx();
        zzbfn a2 = zzbfv.a(context, zzbhg.b(), "", false, false, zzeg, zzbbd, (zzabi) null, (zzi) null, zza, zztm.f(), (zzso) null, false);
        zzbbo e2 = zzbbo.e(a2);
        a2.q().b(new p9(e2));
        a2.loadUrl(str);
        return e2;
    }
}
