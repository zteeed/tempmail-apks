package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbh implements zzdec<gs> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7820a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7821b;

    zzdbh(Context context, zzdvi zzdvi) {
        this.f7820a = context;
        this.f7821b = zzdvi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ gs a() throws Exception {
        zzq.zzkw();
        String I = zzaye.I(this.f7820a);
        String str = "";
        if (((Boolean) zzwg.e().c(zzaav.W2)).booleanValue()) {
            str = this.f7820a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        zzq.zzkw();
        return new gs(I, str, zzaye.J(this.f7820a));
    }

    public final zzdvf<gs> b() {
        return this.f7821b.f(new fs(this));
    }
}
