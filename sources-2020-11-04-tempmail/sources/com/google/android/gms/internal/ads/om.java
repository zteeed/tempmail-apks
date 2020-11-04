package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class om implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzdvf f4752b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdvf f4753c;

    om(zzdvf zzdvf, zzdvf zzdvf2) {
        this.f4752b = zzdvf;
        this.f4753c = zzdvf2;
    }

    public final Object call() {
        return new zzcpq((JSONObject) this.f4752b.get(), (zzass) this.f4753c.get());
    }
}
