package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzfb {

    /* renamed from: b  reason: collision with root package name */
    private static volatile zzfb f9803b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile zzfb f9804c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzfb f9805d = new zzfb(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, zzfo.zzd<?, ?>> f9806a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f9807a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9808b;

        a(Object obj, int i) {
            this.f9807a = obj;
            this.f9808b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9807a == aVar.f9807a && this.f9808b == aVar.f9808b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f9807a) * 65535) + this.f9808b;
        }
    }

    zzfb() {
        this.f9806a = new HashMap();
    }

    public static zzfb a() {
        zzfb zzfb = f9803b;
        if (zzfb == null) {
            synchronized (zzfb.class) {
                zzfb = f9803b;
                if (zzfb == null) {
                    zzfb = f9805d;
                    f9803b = zzfb;
                }
            }
        }
        return zzfb;
    }

    public static zzfb c() {
        Class<zzfb> cls = zzfb.class;
        zzfb zzfb = f9804c;
        if (zzfb != null) {
            return zzfb;
        }
        synchronized (cls) {
            zzfb zzfb2 = f9804c;
            if (zzfb2 != null) {
                return zzfb2;
            }
            zzfb b2 = j2.b(cls);
            f9804c = b2;
            return b2;
        }
    }

    public final <ContainingType extends zzgw> zzfo.zzd<ContainingType, ?> b(ContainingType containingtype, int i) {
        return this.f9806a.get(new a(containingtype, i));
    }

    private zzfb(boolean z) {
        this.f9806a = Collections.emptyMap();
    }
}
