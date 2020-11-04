package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaaw {
    private static void a(List<String> list, zzabx<String> zzabx) {
        String a2 = zzabx.a();
        if (!TextUtils.isEmpty(a2)) {
            list.add(a2);
        }
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, zzabx.e("gad:dynamite_module:experiment_id", ""));
        a(arrayList, zzacj.f5772a);
        a(arrayList, zzacj.f5773b);
        a(arrayList, zzacj.f5774c);
        a(arrayList, zzacj.f5775d);
        a(arrayList, zzacj.f5776e);
        a(arrayList, zzacj.k);
        a(arrayList, zzacj.f5777f);
        a(arrayList, zzacj.g);
        a(arrayList, zzacj.h);
        a(arrayList, zzacj.i);
        a(arrayList, zzacj.j);
        return arrayList;
    }

    static List<String> c() {
        ArrayList arrayList = new ArrayList();
        a(arrayList, zzacs.f5795a);
        return arrayList;
    }
}
