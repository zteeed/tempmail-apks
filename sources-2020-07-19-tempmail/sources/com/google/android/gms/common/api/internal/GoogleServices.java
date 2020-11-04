package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
@Deprecated
public final class GoogleServices {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2748d = new Object();
    @GuardedBy("sLock")

    /* renamed from: e  reason: collision with root package name */
    private static GoogleServices f2749e;

    /* renamed from: a  reason: collision with root package name */
    private final String f2750a;

    /* renamed from: b  reason: collision with root package name */
    private final Status f2751b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2752c;

    @KeepForSdk
    @VisibleForTesting
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.f2752c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.f2752c = false;
        }
        String a2 = zzp.a(context);
        a2 = a2 == null ? new StringResourceValueReader(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f2751b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f2750a = null;
            return;
        }
        this.f2750a = a2;
        this.f2751b = Status.f2710f;
    }

    @KeepForSdk
    private static GoogleServices a(String str) {
        GoogleServices googleServices;
        synchronized (f2748d) {
            if (f2749e != null) {
                googleServices = f2749e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }

    @KeepForSdk
    public static String b() {
        return a("getGoogleAppId").f2750a;
    }

    @KeepForSdk
    public static Status c(Context context) {
        Status status;
        Preconditions.l(context, "Context must not be null.");
        synchronized (f2748d) {
            if (f2749e == null) {
                f2749e = new GoogleServices(context);
            }
            status = f2749e.f2751b;
        }
        return status;
    }

    @KeepForSdk
    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").f2752c;
    }
}
