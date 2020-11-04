package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class z0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzajt f5427b;

    /* renamed from: c  reason: collision with root package name */
    private final zzahc f5428c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f5429d;

    z0(zzajt zzajt, zzahc zzahc, Map map) {
        this.f5427b = zzajt;
        this.f5428c = zzahc;
        this.f5429d = map;
    }

    public final void run() {
        this.f5427b.R(this.f5428c, this.f5429d);
    }
}
