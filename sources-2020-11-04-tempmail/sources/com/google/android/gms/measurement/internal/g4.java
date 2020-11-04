package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class g4 implements Callable<List<zzw>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10198b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10199c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10200d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f10201e;

    g4(zzgd zzgd, zzn zzn, String str, String str2) {
        this.f10201e = zzgd;
        this.f10198b = zzn;
        this.f10199c = str;
        this.f10200d = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f10201e.f10642b.e0();
        return this.f10201e.f10642b.V().k0(this.f10198b.f10709b, this.f10199c, this.f10200d);
    }
}
