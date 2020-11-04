package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class nm implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f4679b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4680c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdvf f4681d;

    nm(zzdvf zzdvf, zzdvf zzdvf2, zzdvf zzdvf3) {
        this.f4679b = zzdvf;
        this.f4680c = zzdvf2;
        this.f4681d = zzdvf3;
    }

    public final Object call() {
        return new zzcpm((zzcpt) this.f4679b.get(), (JSONObject) this.f4680c.get(), (zzass) this.f4681d.get());
    }
}
