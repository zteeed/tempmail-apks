package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlj {
    public static void a(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        zzbba.h(sb.toString());
        zzaxv.l(str, th);
        if (i != 3) {
            zzq.zzla().h(th, str);
        }
    }

    public static void b(Context context, boolean z) {
        if (z) {
            zzbba.h("This request is sent from a test device.");
            return;
        }
        zzwg.a();
        String l = zzbaq.l(context);
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 101);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(l);
        sb.append("\") to get test ads on this device.");
        zzbba.h(sb.toString());
    }
}
