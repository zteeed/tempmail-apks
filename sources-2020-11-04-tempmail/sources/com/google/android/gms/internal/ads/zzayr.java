package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzq;

@TargetApi(26)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayr extends zzays {
    public final zzui g(Context context, TelephonyManager telephonyManager) {
        zzq.zzkw();
        if (zzaye.l0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzui.ENUM_TRUE : zzui.ENUM_FALSE;
        }
        return zzui.ENUM_FALSE;
    }
}
