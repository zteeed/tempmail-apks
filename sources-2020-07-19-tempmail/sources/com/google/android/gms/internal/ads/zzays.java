package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzays extends zzayp {
    private static boolean v(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean h(Activity activity, Configuration configuration) {
        if (!((Boolean) zzwg.e().c(zzaav.e2)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzwg.e().c(zzaav.g2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzwg.a();
        int r = zzbaq.r(activity, configuration.screenHeightDp);
        int r2 = zzbaq.r(activity, configuration.screenWidthDp);
        zzq.zzkw();
        DisplayMetrics b2 = zzaye.b((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = b2.heightPixels;
        int i2 = b2.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzwg.e().c(zzaav.d2)).intValue();
        if (!(v(i, r + dimensionPixelSize, round) && v(i2, r2, round))) {
            return true;
        }
        return false;
    }
}
