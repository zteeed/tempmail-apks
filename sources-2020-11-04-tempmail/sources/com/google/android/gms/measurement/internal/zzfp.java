package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfp {

    /* renamed from: a  reason: collision with root package name */
    final zzfy f10627a;

    zzfp(zzfy zzfy) {
        this.f10627a = zzfy;
    }

    @VisibleForTesting
    private final boolean c() {
        try {
            PackageManagerWrapper a2 = Wrappers.a(this.f10627a.f());
            if (a2 == null) {
                this.f10627a.h().O().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            this.f10627a.h().O().b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final Bundle a(String str, zzd zzd) {
        this.f10627a.g().c();
        if (zzd == null) {
            this.f10627a.h().J().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle E = zzd.E(bundle);
            if (E != null) {
                return E;
            }
            this.f10627a.h().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f10627a.h().G().b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.f10627a.h().K().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f10627a.g().c();
        if (!c()) {
            this.f10627a.h().M().a("Install Referrer Reporter is not available");
            return;
        }
        zzfo zzfo = new zzfo(this, str);
        this.f10627a.g().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f10627a.f().getPackageManager();
        if (packageManager == null) {
            this.f10627a.h().K().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f10627a.h().M().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.f10627a.h().J().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f10627a.h().O().b("Install Referrer Service is", ConnectionTracker.b().a(this.f10627a.f(), new Intent(intent), zzfo, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.f10627a.h().G().b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }
}
