package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f3117a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3118b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f3119c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f3120d;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(Context context) {
        if (f3119c == null) {
            PackageManager packageManager = context.getPackageManager();
            f3119c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f3119c.booleanValue();
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean b(Context context) {
        if (f3118b == null) {
            f3118b = Boolean.valueOf(PlatformVersion.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3118b.booleanValue();
    }

    @KeepForSdk
    public static boolean c() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    public static boolean d(Context context) {
        if (f3117a == null) {
            f3117a = Boolean.valueOf(PlatformVersion.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f3117a.booleanValue();
    }

    @TargetApi(26)
    @KeepForSdk
    public static boolean e(Context context) {
        if (!d(context)) {
            return false;
        }
        if (PlatformVersion.j()) {
            return b(context) && !PlatformVersion.k();
        }
        return true;
    }

    public static boolean f(Context context) {
        if (f3120d == null) {
            f3120d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f3120d.booleanValue();
    }
}
