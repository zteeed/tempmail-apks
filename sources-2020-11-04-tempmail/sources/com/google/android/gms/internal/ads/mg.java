package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mg implements zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4575b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f4576c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4577d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f4578e;

    mg(Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        this.f4575b = context;
        this.f4576c = zzbbd;
        this.f4577d = zzdkk;
        this.f4578e = zzdla;
    }

    public final void onAdLoaded() {
        zzq.zzlg().c(this.f4575b, this.f4576c.f6314b, this.f4577d.z.toString(), this.f4578e.f8351f);
    }
}
