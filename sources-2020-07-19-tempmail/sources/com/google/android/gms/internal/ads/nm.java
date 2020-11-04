package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class nm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f4496b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4497c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf f4498d;

    nm(zzdvf zzdvf, zzdvf zzdvf2, zzdvf zzdvf3) {
        this.f4496b = zzdvf;
        this.f4497c = zzdvf2;
        this.f4498d = zzdvf3;
    }

    public final Object call() {
        return new zzcpm((zzcpt) this.f4496b.get(), (JSONObject) this.f4497c.get(), (zzass) this.f4498d.get());
    }
}
