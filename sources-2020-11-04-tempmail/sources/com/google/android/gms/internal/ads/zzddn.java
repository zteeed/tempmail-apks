package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddn implements zzdec<zzddo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f8092a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8093b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f8094c;

    public zzddn(zzdvi zzdvi, Context context, zzbbd zzbbd) {
        this.f8092a = zzdvi;
        this.f8093b = context;
        this.f8094c = zzbbd;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddo a() throws Exception {
        boolean g = Wrappers.a(this.f8093b).g();
        zzq.zzkw();
        boolean H = zzaye.H(this.f8093b);
        String str = this.f8094c.f6314b;
        zzq.zzky();
        boolean s = zzayj.s();
        zzq.zzkw();
        return new zzddo(g, H, str, s, zzaye.C(this.f8093b), DynamiteModule.c(this.f8093b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f8093b, ModuleDescriptor.MODULE_ID));
    }

    public final zzdvf<zzddo> b() {
        return this.f8092a.f(new zs(this));
    }
}
