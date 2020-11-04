package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class m9 implements zzdsl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4545a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbhg f4546b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4547c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4548d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4549e;

    /* renamed from: f  reason: collision with root package name */
    private final zzeg f4550f;
    private final zzbbd g;
    private final zzabi h = null;
    private final zzi i;
    private final zza j;
    private final zztm k;
    private final zzso l;
    private final boolean m;

    m9(Context context, zzbhg zzbhg, String str, boolean z, boolean z2, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z3) {
        this.f4545a = context;
        this.f4546b = zzbhg;
        this.f4547c = str;
        this.f4548d = z;
        this.f4549e = z2;
        this.f4550f = zzeg;
        this.g = zzbbd;
        this.i = zzi;
        this.j = zza;
        this.k = zztm;
        this.l = zzso;
        this.m = z3;
    }

    public final Object get() {
        Context context = this.f4545a;
        zzbhg zzbhg = this.f4546b;
        String str = this.f4547c;
        boolean z = this.f4548d;
        boolean z2 = this.f4549e;
        zzeg zzeg = this.f4550f;
        zzbbd zzbbd = this.g;
        zzabi zzabi = this.h;
        zzi zzi = this.i;
        zza zza = this.j;
        zztm zztm = this.k;
        zzbgc zzbgc = new zzbgc(r9.O0(context, zzbhg, str, z, z2, zzeg, zzbbd, zzabi, zzi, zza, zztm, this.l, this.m));
        zzbgc.setWebViewClient(zzq.zzky().f(zzbgc, zztm, z2));
        zzbgc.setWebChromeClient(new zzbff(zzbgc));
        return zzbgc;
    }
}
