package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class PackageManagerWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3326a;

    public PackageManagerWrapper(Context context) {
        this.f3326a = context;
    }

    @KeepForSdk
    public int a(String str) {
        return this.f3326a.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int b(String str, String str2) {
        return this.f3326a.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    public ApplicationInfo c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f3326a.getPackageManager().getApplicationInfo(str, i);
    }

    @KeepForSdk
    public CharSequence d(String str) throws PackageManager.NameNotFoundException {
        return this.f3326a.getPackageManager().getApplicationLabel(this.f3326a.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    public PackageInfo e(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f3326a.getPackageManager().getPackageInfo(str, i);
    }

    public final String[] f(int i) {
        return this.f3326a.getPackageManager().getPackagesForUid(i);
    }

    @KeepForSdk
    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.a(this.f3326a);
        }
        if (!PlatformVersion.k() || (nameForUid = this.f3326a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3326a.getPackageManager().isInstantApp(nameForUid);
    }

    public final PackageInfo h(String str, int i, int i2) throws PackageManager.NameNotFoundException {
        return this.f3326a.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    public final boolean i(int i, String str) {
        if (PlatformVersion.f()) {
            try {
                ((AppOpsManager) this.f3326a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f3326a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
