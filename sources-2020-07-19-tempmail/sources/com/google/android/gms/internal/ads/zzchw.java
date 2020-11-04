package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchw {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7070a;

    /* renamed from: b  reason: collision with root package name */
    private final zzeg f7071b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f7072c;

    /* renamed from: d  reason: collision with root package name */
    private final zza f7073d;

    /* renamed from: e  reason: collision with root package name */
    private final zztm f7074e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzbus f7075f;
    private final zzso g;

    public zzchw(zzbfv zzbfv, Context context, zzdla zzdla, zzeg zzeg, zzbbd zzbbd, zza zza, zztm zztm, zzbus zzbus, zzbze zzbze) {
        this.f7070a = context;
        this.f7071b = zzeg;
        this.f7072c = zzbbd;
        this.f7073d = zza;
        this.f7074e = zztm;
        this.f7075f = zzbus;
        this.g = zzbze;
    }

    public final zzbfn a(zzvh zzvh, boolean z) throws zzbfz {
        return zzbfv.a(this.f7070a, zzbhg.i(zzvh), zzvh.f9189b, false, false, this.f7071b, this.f7072c, (zzabi) null, new kj(this), this.f7073d, this.f7074e, this.g, z);
    }

    public final zzbfn c(zzvh zzvh) throws zzbfz {
        return a(zzvh, false);
    }
}
