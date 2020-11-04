package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gt implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final List f4097b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4098c;

    gt(List list, Object obj) {
        this.f4097b = list;
        this.f4098c = obj;
    }

    public final Object call() {
        List<zzdvf> list = this.f4097b;
        Object obj = this.f4098c;
        for (zzdvf zzdvf : list) {
            zzddz zzddz = (zzddz) zzdvf.get();
            if (zzddz != null) {
                zzddz.a(obj);
            }
        }
        return obj;
    }
}
