package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ea implements zzdsl {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3695a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbhg f3696b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3697c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3698d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3699e;

    /* renamed from: f  reason: collision with root package name */
    private final zzeg f3700f;
    private final zzbbd g;
    private final zzabi h;
    private final zzi i;
    private final zza j;
    private final zztm k;
    private final zzso l;
    private final boolean m;

    ea(Context context, zzbhg zzbhg, String str, boolean z, boolean z2, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z3) {
        this.f3695a = context;
        this.f3696b = zzbhg;
        this.f3697c = str;
        this.f3698d = z;
        this.f3699e = z2;
        this.f3700f = zzeg;
        this.g = zzbbd;
        this.h = zzabi;
        this.i = zzi;
        this.j = zza;
        this.k = zztm;
        this.l = zzso;
        this.m = z3;
    }

    public final Object get() {
        Context context = this.f3695a;
        zzbhg zzbhg = this.f3696b;
        String str = this.f3697c;
        boolean z = this.f3698d;
        boolean z2 = this.f3699e;
        zzeg zzeg = this.f3700f;
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
