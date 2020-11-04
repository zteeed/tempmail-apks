package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcm implements zzdec<zzdcj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f8043a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8044b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f8045c;

    public zzdcm(zzdvi zzdvi, Context context, Set<String> set) {
        this.f8043a = zzdvi;
        this.f8044b = context;
        this.f8045c = set;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdcj a() throws Exception {
        if (!((Boolean) zzwg.e().c(zzaav.o2)).booleanValue() || !zzdcj.b(this.f8045c)) {
            return new zzdcj((String) null);
        }
        return new zzdcj(zzq.zzll().a(this.f8044b));
    }

    public final zzdvf<zzdcj> b() {
        return this.f8043a.f(new ps(this));
    }
}
