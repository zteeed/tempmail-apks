package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbwv<ListenerT> {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<ListenerT, Executor> f6665b = new HashMap();

    protected zzbwv(Set<zzbyg<ListenerT>> set) {
        y0(set);
    }

    private final synchronized void y0(Set<zzbyg<ListenerT>> set) {
        for (zzbyg<ListenerT> m0 : set) {
            m0(m0);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void k0(zzbwx<ListenerT> zzbwx) {
        for (Map.Entry next : this.f6665b.entrySet()) {
            ((Executor) next.getValue()).execute(new sf(zzbwx, next.getKey()));
        }
    }

    public final synchronized void m0(zzbyg<ListenerT> zzbyg) {
        p0(zzbyg.f6696a, zzbyg.f6697b);
    }

    public final synchronized void p0(ListenerT listenert, Executor executor) {
        this.f6665b.put(listenert, executor);
    }
}
