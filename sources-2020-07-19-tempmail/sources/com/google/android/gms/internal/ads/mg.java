package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mg implements zzbua {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4392b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f4393c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f4394d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f4395e;

    mg(Context context, zzbbd zzbbd, zzdkk zzdkk, zzdla zzdla) {
        this.f4392b = context;
        this.f4393c = zzbbd;
        this.f4394d = zzdkk;
        this.f4395e = zzdla;
    }

    public final void onAdLoaded() {
        zzq.zzlg().c(this.f4392b, this.f4393c.f6131b, this.f4394d.z.toString(), this.f4395e.f8168f);
    }
}
