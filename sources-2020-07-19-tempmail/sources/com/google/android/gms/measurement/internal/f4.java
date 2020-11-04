package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class f4 implements Callable<List<zzw>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9993b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f9994c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f9995d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f9996e;

    f4(zzgd zzgd, String str, String str2, String str3) {
        this.f9996e = zzgd;
        this.f9993b = str;
        this.f9994c = str2;
        this.f9995d = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f9996e.f10456b.e0();
        return this.f9996e.f10456b.V().k0(this.f9993b, this.f9994c, this.f9995d);
    }
}
