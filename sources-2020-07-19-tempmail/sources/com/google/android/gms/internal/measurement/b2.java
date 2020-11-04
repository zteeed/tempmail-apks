package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfg;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
abstract class b2<T extends zzfg<T>> {
    b2() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* access modifiers changed from: package-private */
    public abstract c2<T> b(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object c(zzfb zzfb, zzgw zzgw, int i);

    /* access modifiers changed from: package-private */
    public abstract <UT, UB> UB d(m3 m3Var, Object obj, zzfb zzfb, c2<T> c2Var, UB ub, f4<UT, UB> f4Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void e(zzeg zzeg, Object obj, zzfb zzfb, c2<T> c2Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void f(m3 m3Var, Object obj, zzfb zzfb, c2<T> c2Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void g(w4 w4Var, Map.Entry<?, ?> entry) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract boolean h(zzgw zzgw);

    /* access modifiers changed from: package-private */
    public abstract c2<T> i(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);
}
