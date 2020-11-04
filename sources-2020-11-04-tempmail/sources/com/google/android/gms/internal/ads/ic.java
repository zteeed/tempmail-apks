package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ic implements zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4221b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f4222c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4223d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f4224e;

    ic(Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        this.f4221b = context;
        this.f4222c = zzbbd;
        this.f4223d = zzdkk;
        this.f4224e = zzdla;
    }

    public final void onAdLoaded() {
        zzq.zzlg().c(this.f4221b, this.f4222c.f6314b, this.f4223d.z.toString(), this.f4224e.f8351f);
    }
}
