package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ea implements zzdsl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3878a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbhg f3879b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3880c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3881d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3882e;

    /* renamed from: f  reason: collision with root package name */
    private final zzeg f3883f;
    private final zzbbd g;
    private final zzabi h;
    private final zzi i;
    private final zza j;
    private final zztm k;
    private final zzso l;
    private final boolean m;

    ea(Context context, zzbhg zzbhg, String str, boolean z, boolean z2, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z3) {
        this.f3878a = context;
        this.f3879b = zzbhg;
        this.f3880c = str;
        this.f3881d = z;
        this.f3882e = z2;
        this.f3883f = zzeg;
        this.g = zzbbd;
        this.h = zzabi;
        this.i = zzi;
        this.j = zza;
        this.k = zztm;
        this.l = zzso;
        this.m = z3;
    }

    public final Object get() {
        Context context = this.f3878a;
        zzbhg zzbhg = this.f3879b;
        String str = this.f3880c;
        boolean z = this.f3881d;
        boolean z2 = this.f3882e;
        zzeg zzeg = this.f3883f;
        zzbbd zzbbd = this.g;
        zzabi zzabi = this.h;
        zzi zzi = this.i;
        zza zza = this.j;
        zztm zztm = this.k;
        zzso zzso = this.l;
        boolean z3 = this.m;
        zzbhf zzbhf = new zzbhf();
        zzso zzso2 = zzso;
        ga gaVar = new ga(new zzbhd(context), zzbhf, zzbhg, str, z, z2, zzeg, zzbbd, zzabi, zzi, zza, zztm, zzso2, z3);
        zzbgc zzbgc = new zzbgc(gaVar);
        gaVar.setWebChromeClient(new zzbff(zzbgc));
        zzbhf.z(zzbgc, z2);
        return zzbgc;
    }
}
