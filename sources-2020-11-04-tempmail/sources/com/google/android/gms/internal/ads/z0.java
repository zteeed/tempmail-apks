package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class z0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzajt f5610b;

    /* renamed from: c  reason: collision with root package name */
    private final zzahc f5611c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f5612d;

    z0(zzajt zzajt, zzahc zzahc, Map map) {
        this.f5610b = zzajt;
        this.f5611c = zzahc;
        this.f5612d = map;
    }

    public final void run() {
        this.f5610b.R(this.f5611c, this.f5612d);
    }
}
