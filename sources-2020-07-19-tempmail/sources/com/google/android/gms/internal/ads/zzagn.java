package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzagn implements zzahc<zzbfn> {
    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzbba.i("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzbba.i("No timestamp given for CSI tick.");
            } else {
                try {
                    long b2 = zzq.zzld().b() + (Long.parseLong(str4) - zzq.zzld().a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbfn.i().b(str2, str3, b2);
                } catch (NumberFormatException e2) {
                    zzbba.d("Malformed timestamp for CSI tick.", e2);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbba.i("No value given for CSI experiment.");
                return;
            }
            zzabi c2 = zzbfn.i().c();
            if (c2 == null) {
                zzbba.i("No ticker for WebView, dropping experiment ID.");
            } else {
                c2.d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AnalyticsConnectorReceiver.EVENT_NAME_KEY);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbba.i("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbba.i("No name given for CSI extra.");
            } else {
                zzabi c3 = zzbfn.i().c();
                if (c3 == null) {
                    zzbba.i("No ticker for WebView, dropping extra parameter.");
                } else {
                    c3.d(str6, str7);
                }
            }
        }
    }
}
