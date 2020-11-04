package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdbi implements zzela<zzdbe> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzame> f8005a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8006b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzaxx> f8007c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f8008d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzdla> f8009e;

    private zzdbi(zzelj<zzame> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<zzaxx> zzelj3, zzelj<ApplicationInfo> zzelj4, zzelj<zzdla> zzelj5) {
        this.f8005a = zzelj;
        this.f8006b = zzelj2;
        this.f8007c = zzelj3;
        this.f8008d = zzelj4;
        this.f8009e = zzelj5;
    }

    public static zzdbi a(zzelj<zzame> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<zzaxx> zzelj3, zzelj<ApplicationInfo> zzelj4, zzelj<zzdla> zzelj5) {
        return new zzdbi(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzdbe(this.f8005a.get(), this.f8006b.get(), this.f8007c.get(), this.f8008d.get(), this.f8009e.get());
    }
}
