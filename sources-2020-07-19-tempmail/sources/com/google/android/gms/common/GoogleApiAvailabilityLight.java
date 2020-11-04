package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;

@ShowFirstParty
@KeepForSdk
public class GoogleApiAvailabilityLight {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public static final int f2668a = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b  reason: collision with root package name */
    private static final GoogleApiAvailabilityLight f2669b = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @KeepForSdk
    public static GoogleApiAvailabilityLight h() {
        return f2669b;
    }

    @VisibleForTesting
    private static String n(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f2668a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(Wrappers.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @KeepForSdk
    public void a(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int b(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public Intent c(int i) {
        return d((Context) null, i, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    public Intent d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !DeviceProperties.e(context)) {
                return zzg.a("com.google.android.gms", n(context, str));
            }
            return zzg.c();
        } else if (i != 3) {
            return null;
        } else {
            return zzg.b("com.google.android.gms");
        }
    }

    @KeepForSdk
    public PendingIntent e(Context context, int i, int i2) {
        return f(context, i, i2, (String) null);
    }

    @ShowFirstParty
    @KeepForSdk
    public PendingIntent f(Context context, int i, int i2, String str) {
        Intent d2 = d(context, i, str);
        if (d2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d2, 134217728);
    }

    @KeepForSdk
    public String g(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @KeepForSdk
    @HideFirstParty
    public int i(Context context) {
        return j(context, f2668a);
    }

    @KeepForSdk
    public int j(Context context, int i) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean k(Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    @KeepForSdk
    public boolean l(Context context, String str) {
        return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(context, str);
    }

    @KeepForSdk
    public boolean m(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }
}
