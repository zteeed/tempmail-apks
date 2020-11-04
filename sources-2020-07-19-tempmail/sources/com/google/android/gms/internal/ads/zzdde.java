package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdde implements zzdec<zzddb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7886a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f7887b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcwj f7888c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f7889d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdla f7890e;

    /* renamed from: f  reason: collision with root package name */
    private final zzcwh f7891f;
    private String g;

    public zzdde(zzdvi zzdvi, ScheduledExecutorService scheduledExecutorService, String str, zzcwj zzcwj, Context context, zzdla zzdla, zzcwh zzcwh) {
        this.f7886a = zzdvi;
        this.f7887b = scheduledExecutorService;
        this.g = str;
        this.f7888c = zzcwj;
        this.f7889d = context;
        this.f7890e = zzdla;
        this.f7891f = zzcwh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(String str, List list, Bundle bundle) throws Exception {
        zzbbn zzbbn = new zzbbn();
        this.f7891f.a(str);
        zzaox b2 = this.f7891f.b(str);
        if (b2 != null) {
            Bundle bundle2 = bundle;
            b2.H1(ObjectWrapper.b0(this.f7889d), this.g, bundle2, (Bundle) list.get(0), this.f7890e.f8167e, new zzcwp(str, b2, zzbbn));
            return zzbbn;
        }
        throw null;
    }

    public final zzdvf<zzddb> b() {
        if (((Boolean) zzwg.e().c(zzaav.K0)).booleanValue()) {
            return zzdux.c(new us(this), this.f7886a);
        }
        return zzdux.g(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf c() {
        Map<String, List<Bundle>> g2 = this.f7888c.g(this.g, this.f7890e.f8168f);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : g2.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            Bundle bundle = this.f7890e.f8166d.n;
            arrayList.add(zzduo.H(zzdux.c(new ws(this, str, list, bundle != null ? bundle.getBundle(str) : null), this.f7886a)).C(((Long) zzwg.e().c(zzaav.J0)).longValue(), TimeUnit.MILLISECONDS, this.f7887b).E(Throwable.class, new vs(str), this.f7886a));
        }
        return zzdux.o(arrayList).a(new xs(arrayList), this.f7886a);
    }
}
