package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class oo implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcsx f4755b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4756c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf f4757d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdkw f4758e;

    /* renamed from: f  reason: collision with root package name */
    private final zzdkk f4759f;
    private final JSONObject g;

    oo(zzcsx zzcsx, zzdvf zzdvf, zzdvf zzdvf2, zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) {
        this.f4755b = zzcsx;
        this.f4756c = zzdvf;
        this.f4757d = zzdvf2;
        this.f4758e = zzdkw;
        this.f4759f = zzdkk;
        this.g = jSONObject;
    }

    public final Object call() {
        return this.f4755b.c(this.f4756c, this.f4757d, this.f4758e, this.f4759f, this.g);
    }
}
