package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ic implements zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4038b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f4039c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4040d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f4041e;

    ic(Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        this.f4038b = context;
        this.f4039c = zzbbd;
        this.f4040d = zzdkk;
        this.f4041e = zzdla;
    }

    public final void onAdLoaded() {
        zzq.zzlg().c(this.f4038b, this.f4039c.f6131b, this.f4040d.z.toString(), this.f4041e.f8168f);
    }
}
