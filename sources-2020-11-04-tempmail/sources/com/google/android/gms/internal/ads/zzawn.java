package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzawn {
    @VisibleForTesting
    private static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String b(Uri uri, Context context) {
        if (!zzq.zzlu().l(context)) {
            return uri.toString();
        }
        String q = zzq.zzlu().q(context);
        if (q == null) {
            return uri.toString();
        }
        if (((Boolean) zzwg.e().c(zzaav.U)).booleanValue()) {
            String str = (String) zzwg.e().c(zzaav.V);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                zzq.zzlu().x(context, q);
                return c(uri2, context).replace(str, q);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = a(c(uri.toString(), context), "fbs_aeid", q).toString();
            zzq.zzlu().x(context, q);
            return uri3;
        }
        return uri.toString();
    }

    private static String c(String str, Context context) {
        String o = zzq.zzlu().o(context);
        String p = zzq.zzlu().p(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(o)) {
            str = a(str, "gmp_app_id", o).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(p)) ? str : a(str, "fbs_aiid", p).toString();
    }

    public static String d(String str, Context context, boolean z) {
        String q;
        if ((((Boolean) zzwg.e().c(zzaav.c0)).booleanValue() && !z) || !zzq.zzlu().l(context) || TextUtils.isEmpty(str) || (q = zzq.zzlu().q(context)) == null) {
            return str;
        }
        if (((Boolean) zzwg.e().c(zzaav.U)).booleanValue()) {
            String str2 = (String) zzwg.e().c(zzaav.V);
            if (!str.contains(str2)) {
                return str;
            }
            if (zzq.zzkw().X(str)) {
                zzq.zzlu().x(context, q);
                return c(str, context).replace(str2, q);
            } else if (!zzq.zzkw().Y(str)) {
                return str;
            } else {
                zzq.zzlu().y(context, q);
                return c(str, context).replace(str2, q);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (zzq.zzkw().X(str)) {
                zzq.zzlu().x(context, q);
                return a(c(str, context), "fbs_aeid", q).toString();
            } else if (!zzq.zzkw().Y(str)) {
                return str;
            } else {
                zzq.zzlu().y(context, q);
                return a(c(str, context), "fbs_aeid", q).toString();
            }
        }
    }
}
