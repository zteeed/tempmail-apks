package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbi implements zzela<zzdbe> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzame> f7822a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f7823b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzaxx> f7824c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f7825d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f7826e;

    private zzdbi(zzelj<zzame> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<zzaxx> zzelj3, zzelj<ApplicationInfo> zzelj4, zzelj<zzdla> zzelj5) {
        this.f7822a = zzelj;
        this.f7823b = zzelj2;
        this.f7824c = zzelj3;
        this.f7825d = zzelj4;
        this.f7826e = zzelj5;
    }

    public static zzdbi a(zzelj<zzame> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<zzaxx> zzelj3, zzelj<ApplicationInfo> zzelj4, zzelj<zzdla> zzelj5) {
        return new zzdbi(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzdbe(this.f7822a.get(), this.f7823b.get(), this.f7824c.get(), this.f7825d.get(), this.f7826e.get());
    }
}
