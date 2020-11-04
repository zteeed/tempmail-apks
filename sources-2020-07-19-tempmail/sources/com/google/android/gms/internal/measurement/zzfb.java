package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzfb {

    /* renamed from: b  reason: collision with root package name */
    private static volatile zzfb f9620b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile zzfb f9621c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzfb f9622d = new zzfb(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, zzfo.zzd<?, ?>> f9623a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f9624a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9625b;

        a(Object obj, int i) {
            this.f9624a = obj;
            this.f9625b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9624a == aVar.f9624a && this.f9625b == aVar.f9625b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f9624a) * 65535) + this.f9625b;
        }
    }

    zzfb() {
        this.f9623a = new HashMap();
    }

    public static zzfb a() {
        zzfb zzfb = f9620b;
        if (zzfb == null) {
            synchronized (zzfb.class) {
                zzfb = f9620b;
                if (zzfb == null) {
                    zzfb = f9622d;
                    f9620b = zzfb;
                }
            }
        }
        return zzfb;
    }

    public static zzfb c() {
        Class<zzfb> cls = zzfb.class;
        zzfb zzfb = f9621c;
        if (zzfb != null) {
            return zzfb;
        }
        synchronized (cls) {
            zzfb zzfb2 = f9621c;
            if (zzfb2 != null) {
                return zzfb2;
            }
            zzfb b2 = j2.b(cls);
            f9621c = b2;
            return b2;
        }
    }

    public final <ContainingType extends zzgw> zzfo.zzd<ContainingType, ?> b(ContainingType containingtype, int i) {
        return this.f9623a.get(new a(containingtype, i));
    }

    private zzfb(boolean z) {
        this.f9623a = Collections.emptyMap();
    }
}
