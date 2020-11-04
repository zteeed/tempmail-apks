package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.h00;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class l00<V, C> extends h00<V, C> {
    private List<m00<V>> q;

    l00(zzdsr<? extends zzdvf<? extends V>> zzdsr, boolean z) {
        super(zzdsr, true, true);
        List<m00<V>> list;
        if (zzdsr.isEmpty()) {
            list = zzdss.u();
        } else {
            list = zzdta.a(zzdsr.size());
        }
        for (int i = 0; i < zzdsr.size(); i++) {
            list.add((Object) null);
        }
        this.q = list;
    }

    /* access modifiers changed from: package-private */
    public final void M(h00.a aVar) {
        super.M(aVar);
        this.q = null;
    }

    /* access modifiers changed from: package-private */
    public final void Q() {
        List<m00<V>> list = this.q;
        if (list != null) {
            i(V(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(int i, @NullableDecl V v) {
        List<m00<V>> list = this.q;
        if (list != null) {
            list.set(i, new m00(v));
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C V(List<m00<V>> list);
}
