package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gt implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final List f3914b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3915c;

    gt(List list, Object obj) {
        this.f3914b = list;
        this.f3915c = obj;
    }

    public final Object call() {
        List<zzdvf> list = this.f3914b;
        Object obj = this.f3915c;
        for (zzdvf zzdvf : list) {
            zzddz zzddz = (zzddz) zzdvf.get();
            if (zzddz != null) {
                zzddz.a(obj);
            }
        }
        return obj;
    }
}
