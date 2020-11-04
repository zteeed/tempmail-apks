package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class e4 implements Callable<List<s7>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10162b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10163c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10164d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f10165e;

    e4(zzgd zzgd, zzn zzn, String str, String str2) {
        this.f10165e = zzgd;
        this.f10162b = zzn;
        this.f10163c = str;
        this.f10164d = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f10165e.f10642b.e0();
        return this.f10165e.f10642b.V().J(this.f10162b.f10709b, this.f10163c, this.f10164d);
    }
}
