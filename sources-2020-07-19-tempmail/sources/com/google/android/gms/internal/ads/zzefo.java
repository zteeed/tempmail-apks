package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzefo {

    /* renamed from: b  reason: collision with root package name */
    private static volatile zzefo f8551b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile zzefo f8552c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzefo f8553d = new zzefo(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, zzegb.zzf<?, ?>> f8554a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8555a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8556b;

        a(Object obj, int i) {
            this.f8555a = obj;
            this.f8556b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8555a == aVar.f8555a && this.f8556b == aVar.f8556b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f8555a) * 65535) + this.f8556b;
        }
    }

    zzefo() {
        this.f8554a = new HashMap();
    }

    public static zzefo b() {
        zzefo zzefo = f8551b;
        if (zzefo == null) {
            synchronized (zzefo.class) {
                zzefo = f8551b;
                if (zzefo == null) {
                    zzefo = f8553d;
                    f8551b = zzefo;
                }
            }
        }
        return zzefo;
    }

    public static zzefo c() {
        Class<zzefo> cls = zzefo.class;
        zzefo zzefo = f8552c;
        if (zzefo != null) {
            return zzefo;
        }
        synchronized (cls) {
            zzefo zzefo2 = f8552c;
            if (zzefo2 != null) {
                return zzefo2;
            }
            zzefo b2 = o60.b(cls);
            f8552c = b2;
            return b2;
        }
    }

    public final <ContainingType extends zzehl> zzegb.zzf<ContainingType, ?> a(ContainingType containingtype, int i) {
        return this.f8554a.get(new a(containingtype, i));
    }

    private zzefo(boolean z) {
        this.f8554a = Collections.emptyMap();
    }
}
