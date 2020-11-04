package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzclx f5334b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdlm f5335c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaie f5336d;

    /* renamed from: e  reason: collision with root package name */
    private final List f5337e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5338f;

    vk(zzclx zzclx, zzdlm zzdlm, zzaie zzaie, List list, String str) {
        this.f5334b = zzclx;
        this.f5335c = zzdlm;
        this.f5336d = zzaie;
        this.f5337e = list;
        this.f5338f = str;
    }

    public final void run() {
        this.f5334b.f(this.f5335c, this.f5336d, this.f5337e, this.f5338f);
    }
}
