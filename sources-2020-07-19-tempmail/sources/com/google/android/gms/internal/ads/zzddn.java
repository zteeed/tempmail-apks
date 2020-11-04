package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddn implements zzdec<zzddo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7909a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7910b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f7911c;

    public zzddn(zzdvi zzdvi, Context context, zzbbd zzbbd) {
        this.f7909a = zzdvi;
        this.f7910b = context;
        this.f7911c = zzbbd;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzddo a() throws Exception {
        boolean g = Wrappers.a(this.f7910b).g();
        zzq.zzkw();
        boolean H = zzaye.H(this.f7910b);
        String str = this.f7911c.f6131b;
        zzq.zzky();
        boolean s = zzayj.s();
        zzq.zzkw();
        return new zzddo(g, H, str, s, zzaye.C(this.f7910b), DynamiteModule.c(this.f7910b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f7910b, ModuleDescriptor.MODULE_ID));
    }

    public final zzdvf<zzddo> b() {
        return this.f7909a.f(new zs(this));
    }
}
