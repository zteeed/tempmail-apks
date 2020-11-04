package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdeb<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<zzdec<? extends zzddz<T>>> f7927a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7928b;

    public zzdeb(Executor executor, Set<zzdec<? extends zzddz<T>>> set) {
        this.f7928b = executor;
        this.f7927a = set;
    }

    public final zzdvf<T> a(T t) {
        ArrayList arrayList = new ArrayList(this.f7927a.size());
        for (zzdec next : this.f7927a) {
            zzdvf b2 = next.b();
            if (zzack.f5595a.a().booleanValue()) {
                b2.f(new ht(next, zzq.zzld().b()), zzbbf.f6142f);
            }
            arrayList.add(b2);
        }
        return zzdux.o(arrayList).a(new gt(arrayList, t), this.f7928b);
    }
}
