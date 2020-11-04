package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdld {
    public static zzdkj a(List<zzdkj> list, zzdkj zzdkj) {
        return list.get(0);
    }

    public static zzvh b(Context context, List<zzdkj> list) {
        ArrayList arrayList = new ArrayList();
        for (zzdkj next : list) {
            if (next.f8313c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(next.f8311a, next.f8312b));
            }
        }
        return new zzvh(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzdkj c(zzvh zzvh) {
        if (zzvh.j) {
            return new zzdkj(-3, 0, true);
        }
        return new zzdkj(zzvh.f9376f, zzvh.f9373c, false);
    }
}
