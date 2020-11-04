package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class n00<V> extends l00<V, List<V>> {
    n00(zzdsr<? extends zzdvf<? extends V>> zzdsr, boolean z) {
        super(zzdsr, true);
        P();
    }

    public final /* synthetic */ Object V(List list) {
        ArrayList a2 = zzdta.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m00 m00 = (m00) it.next();
            a2.add(m00 != null ? m00.f4519a : null);
        }
        return Collections.unmodifiableList(a2);
    }
}
