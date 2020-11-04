package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xk implements zzduu<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzclx f5317a;

    xk(zzclx zzclx) {
        this.f5317a = zzclx;
    }

    public final void a(Throwable th) {
        synchronized (this) {
            boolean unused = this.f5317a.f7228b = true;
            this.f5317a.h("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzq.zzld().b() - this.f5317a.f7229c));
            this.f5317a.f7230d.c(new Exception());
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            boolean unused = this.f5317a.f7228b = true;
            this.f5317a.h("com.google.android.gms.ads.MobileAds", true, "", (int) (zzq.zzld().b() - this.f5317a.f7229c));
            this.f5317a.h.execute(new al(this, str));
        }
    }
}
