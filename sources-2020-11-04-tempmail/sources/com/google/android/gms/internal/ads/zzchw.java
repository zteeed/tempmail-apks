package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchw {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7253a;

    /* renamed from: b  reason: collision with root package name */
    private final zzeg f7254b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f7255c;

    /* renamed from: d  reason: collision with root package name */
    private final zza f7256d;

    /* renamed from: e  reason: collision with root package name */
    private final zztm f7257e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzbus f7258f;
    private final zzso g;

    public zzchw(zzbfv zzbfv, Context context, zzdla zzdla, zzeg zzeg, zzbbd zzbbd, zza zza, zztm zztm, zzbus zzbus, zzbze zzbze) {
        this.f7253a = context;
        this.f7254b = zzeg;
        this.f7255c = zzbbd;
        this.f7256d = zza;
        this.f7257e = zztm;
        this.f7258f = zzbus;
        this.g = zzbze;
    }

    public final zzbfn a(zzvh zzvh, boolean z) throws zzbfz {
        return zzbfv.a(this.f7253a, zzbhg.i(zzvh), zzvh.f9372b, false, false, this.f7254b, this.f7255c, (zzabi) null, new kj(this), this.f7256d, this.f7257e, this.g, z);
    }

    public final zzbfn c(zzvh zzvh) throws zzbfz {
        return a(zzvh, false);
    }
}
