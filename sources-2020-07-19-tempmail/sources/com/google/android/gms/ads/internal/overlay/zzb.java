package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzaav;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzwg;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzb {
    public static boolean zza(Context context, zzd zzd, zzt zzt) {
        int i = 0;
        if (zzd == null) {
            zzbba.i("No intent data for launcher overlay.");
            return false;
        }
        zzaav.a(context);
        Intent intent = zzd.intent;
        if (intent != null) {
            return zza(context, intent, zzt);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzd.url)) {
            zzbba.i("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzd.mimeType)) {
            intent2.setDataAndType(Uri.parse(zzd.url), zzd.mimeType);
        } else {
            intent2.setData(Uri.parse(zzd.url));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzd.packageName)) {
            intent2.setPackage(zzd.packageName);
        }
        if (!TextUtils.isEmpty(zzd.zzdnt)) {
            String[] split = zzd.zzdnt.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzd.zzdnt);
                zzbba.i(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzd.zzdnu;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzbba.i("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzwg.e().c(zzaav.W1)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzwg.e().c(zzaav.V1)).booleanValue()) {
                zzq.zzkw();
                zzaye.F(context, intent2);
            }
        }
        return zza(context, intent2, zzt);
    }

    private static boolean zza(Context context, Intent intent, zzt zzt) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzaxv.m(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzq.zzkw();
            zzaye.i(context, intent);
            if (zzt == null) {
                return true;
            }
            zzt.zzuu();
            return true;
        } catch (ActivityNotFoundException e2) {
            zzbba.i(e2.getMessage());
            return false;
        }
    }
}
