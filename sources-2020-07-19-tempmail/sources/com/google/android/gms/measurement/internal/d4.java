package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class d4 implements Callable<List<s7>> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9961b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f9962c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f9963d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzgd f9964e;

    d4(zzgd zzgd, String str, String str2, String str3) {
        this.f9964e = zzgd;
        this.f9961b = str;
        this.f9962c = str2;
        this.f9963d = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f9964e.f10456b.e0();
        return this.f9964e.f10456b.V().J(this.f9961b, this.f9962c, this.f9963d);
    }
}
