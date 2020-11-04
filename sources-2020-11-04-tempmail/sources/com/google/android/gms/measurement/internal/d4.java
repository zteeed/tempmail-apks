package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class d4 implements Callable<List<s7>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10147b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10148c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10149d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f10150e;

    d4(zzgd zzgd, String str, String str2, String str3) {
        this.f10150e = zzgd;
        this.f10147b = str;
        this.f10148c = str2;
        this.f10149d = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f10150e.f10642b.e0();
        return this.f10150e.f10642b.V().J(this.f10147b, this.f10148c, this.f10149d);
    }
}
