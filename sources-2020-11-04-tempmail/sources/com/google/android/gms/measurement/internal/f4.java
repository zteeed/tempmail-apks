package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class f4 implements Callable<List<zzw>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10179b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10180c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10181d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f10182e;

    f4(zzgd zzgd, String str, String str2, String str3) {
        this.f10182e = zzgd;
        this.f10179b = str;
        this.f10180c = str2;
        this.f10181d = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f10182e.f10642b.e0();
        return this.f10182e.f10642b.V().k0(this.f10179b, this.f10180c, this.f10181d);
    }
}
