package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class e4 implements Callable<List<s7>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f9976b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f9977c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f9978d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f9979e;

    e4(zzgd zzgd, zzn zzn, String str, String str2) {
        this.f9979e = zzgd;
        this.f9976b = zzn;
        this.f9977c = str;
        this.f9978d = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f9979e.f10456b.e0();
        return this.f9979e.f10456b.V().J(this.f9976b.f10523b, this.f9977c, this.f9978d);
    }
}
