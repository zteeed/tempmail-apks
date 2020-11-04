package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class eu implements Callable {

    /* renamed from: b  reason: collision with root package name */
    static final Callable f3744b = new eu();

    private eu() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzwg.e().c(zzaav.B);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzwg.e().c(zzaav.C)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzbao.b(str2));
                }
            }
        }
        return new zzdgn(hashMap);
    }
}
