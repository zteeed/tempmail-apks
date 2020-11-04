package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzefo {

    /* renamed from: b  reason: collision with root package name */
    private static volatile zzefo f8734b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile zzefo f8735c;

    /* renamed from: d  reason: collision with root package name */
    private static final zzefo f8736d = new zzefo(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, zzegb.zzf<?, ?>> f8737a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f8738a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8739b;

        a(Object obj, int i) {
            this.f8738a = obj;
            this.f8739b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8738a == aVar.f8738a && this.f8739b == aVar.f8739b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f8738a) * 65535) + this.f8739b;
        }
    }

    zzefo() {
        this.f8737a = new HashMap();
    }

    public static zzefo b() {
        zzefo zzefo = f8734b;
        if (zzefo == null) {
            synchronized (zzefo.class) {
                zzefo = f8734b;
                if (zzefo == null) {
                    zzefo = f8736d;
                    f8734b = zzefo;
                }
            }
        }
        return zzefo;
    }

    public static zzefo c() {
        Class<zzefo> cls = zzefo.class;
        zzefo zzefo = f8735c;
        if (zzefo != null) {
            return zzefo;
        }
        synchronized (cls) {
            zzefo zzefo2 = f8735c;
            if (zzefo2 != null) {
                return zzefo2;
            }
            zzefo b2 = o60.b(cls);
            f8735c = b2;
            return b2;
        }
    }

    public final <ContainingType extends zzehl> zzegb.zzf<ContainingType, ?> a(ContainingType containingtype, int i) {
        return this.f8737a.get(new a(containingtype, i));
    }

    private zzefo(boolean z) {
        this.f8737a = Collections.emptyMap();
    }
}
