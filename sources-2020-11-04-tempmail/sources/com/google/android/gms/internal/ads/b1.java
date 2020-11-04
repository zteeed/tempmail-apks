package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class b1 implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    private final zzahc f3596a;

    b1(zzahc zzahc) {
        this.f3596a = zzahc;
    }

    public final boolean apply(Object obj) {
        zzahc zzahc = (zzahc) obj;
        return (zzahc instanceof h1) && h1.b((h1) zzahc).equals(this.f3596a);
    }
}
