package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdga implements zzela<zzdfy> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzame> f8194a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8195b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Boolean> f8196c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f8197d;

    public zzdga(zzelj<zzame> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Boolean> zzelj3, zzelj<ApplicationInfo> zzelj4) {
        this.f8194a = zzelj;
        this.f8195b = zzelj2;
        this.f8196c = zzelj3;
        this.f8197d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzdfy(this.f8194a.get(), this.f8195b.get(), this.f8196c.get().booleanValue(), this.f8197d.get());
    }
}
