package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbep implements Iterable<zzben> {

    /* renamed from: b  reason: collision with root package name */
    private final List<zzben> f6397b = new ArrayList();

    public static boolean i(zzbdb zzbdb) {
        zzben j = j(zzbdb);
        if (j == null) {
            return false;
        }
        j.f6394b.c();
        return true;
    }

    static zzben j(zzbdb zzbdb) {
        Iterator<zzben> it = zzq.zzls().iterator();
        while (it.hasNext()) {
            zzben next = it.next();
            if (next.f6393a == zzbdb) {
                return next;
            }
        }
        return null;
    }

    public final void c(zzben zzben) {
        this.f6397b.add(zzben);
    }

    public final void h(zzben zzben) {
        this.f6397b.remove(zzben);
    }

    public final Iterator<zzben> iterator() {
        return this.f6397b.iterator();
    }
}
