package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzclx f5151b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdlm f5152c;

    /* renamed from: d  reason: collision with root package name */
    private final zzaie f5153d;

    /* renamed from: e  reason: collision with root package name */
    private final List f5154e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5155f;

    vk(zzclx zzclx, zzdlm zzdlm, zzaie zzaie, List list, String str) {
        this.f5151b = zzclx;
        this.f5152c = zzdlm;
        this.f5153d = zzaie;
        this.f5154e = list;
        this.f5155f = str;
    }

    public final void run() {
        this.f5151b.f(this.f5152c, this.f5153d, this.f5154e, this.f5155f);
    }
}
