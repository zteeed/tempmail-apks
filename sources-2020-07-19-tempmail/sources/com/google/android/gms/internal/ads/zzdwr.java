package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwr<P> {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f8429d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentMap<String, List<zzdwu<P>>> f8430a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private zzdwu<P> f8431b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<P> f8432c;

    private zzdwr(Class<P> cls) {
        this.f8432c = cls;
    }

    public static <P> zzdwr<P> a(Class<P> cls) {
        return new zzdwr<>(cls);
    }

    public final zzdwu<P> b(P p, zzebn.zzb zzb) throws GeneralSecurityException {
        byte[] bArr;
        if (zzb.G() == zzebg.ENABLED) {
            int i = p10.f4598a[zzb.H().ordinal()];
            if (i == 1 || i == 2) {
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzb.M()).array();
            } else if (i == 3) {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzb.M()).array();
            } else if (i == 4) {
                bArr = zzdwe.f8419a;
            } else {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzdwu zzdwu = new zzdwu(p, bArr, zzb.G(), zzb.H(), zzb.M());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzdwu);
            String str = new String(zzdwu.d(), f8429d);
            List list = (List) this.f8430a.put(str, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzdwu);
                this.f8430a.put(str, Collections.unmodifiableList(arrayList2));
            }
            return zzdwu;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final void c(zzdwu<P> zzdwu) {
        if (zzdwu == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (zzdwu.b() == zzebg.ENABLED) {
            List list = (List) this.f8430a.get(new String(zzdwu.d(), f8429d));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f8431b = zzdwu;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        } else {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
    }

    public final Class<P> d() {
        return this.f8432c;
    }

    public final zzdwu<P> e() {
        return this.f8431b;
    }
}
