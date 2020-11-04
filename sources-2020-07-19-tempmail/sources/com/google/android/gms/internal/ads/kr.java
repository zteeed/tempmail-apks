package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kr implements zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f4239a;

    kr(Set<String> set) {
        this.f4239a = set;
    }

    public final zzdvf<zzddz<Bundle>> b() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f4239a) {
            arrayList.add(add);
        }
        return zzdux.g(new jr(arrayList));
    }
}
