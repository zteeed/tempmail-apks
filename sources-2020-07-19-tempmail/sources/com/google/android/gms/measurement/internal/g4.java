package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class g4 implements Callable<List<zzw>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10012b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10013c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10014d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f10015e;

    g4(zzgd zzgd, zzn zzn, String str, String str2) {
        this.f10015e = zzgd;
        this.f10012b = zzn;
        this.f10013c = str;
        this.f10014d = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f10015e.f10456b.e0();
        return this.f10015e.f10456b.V().k0(this.f10012b.f10523b, this.f10013c, this.f10014d);
    }
}
