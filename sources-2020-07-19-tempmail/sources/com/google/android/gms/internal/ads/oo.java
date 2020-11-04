package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class oo implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcsx f4572b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4573c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf f4574d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkw f4575e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdkk f4576f;
    private final JSONObject g;

    oo(zzcsx zzcsx, zzdvf zzdvf, zzdvf zzdvf2, zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) {
        this.f4572b = zzcsx;
        this.f4573c = zzdvf;
        this.f4574d = zzdvf2;
        this.f4575e = zzdkw;
        this.f4576f = zzdkk;
        this.g = jSONObject;
    }

    public final Object call() {
        return this.f4572b.c(this.f4573c, this.f4574d, this.f4575e, this.f4576f, this.g);
    }
}
