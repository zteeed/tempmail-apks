package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class tu implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    private final zzdho f5013a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdmw f5014b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbpz f5015c;

    tu(zzdho zzdho, zzdmw zzdmw, zzbpz zzbpz) {
        this.f5013a = zzdho;
        this.f5014b = zzdmw;
        this.f5015c = zzbpz;
    }

    public final zzdvf zzf(Object obj) {
        zzdmw zzdmw = this.f5014b;
        zzbpz zzbpz = this.f5015c;
        zzdkw zzdkw = (zzdkw) obj;
        zzdmw.f8228b = zzdkw;
        Iterator<zzdkk> it = zzdkw.f8162b.f8156a.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().f8131a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        if (!z) {
            return zzdux.g(null);
        }
        return zzbpz.j(zzdux.g(zzdkw));
    }
}
