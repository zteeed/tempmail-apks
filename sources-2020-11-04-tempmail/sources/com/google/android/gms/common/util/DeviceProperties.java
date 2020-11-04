package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class DeviceProperties {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f3300a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3301b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f3302c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f3303d;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean a(Context context) {
        if (f3302c == null) {
            PackageManager packageManager = context.getPackageManager();
            f3302c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f3302c.booleanValue();
    }

    @TargetApi(21)
    @KeepForSdk
    public static boolean b(Context context) {
        if (f3301b == null) {
            f3301b = Boolean.valueOf(PlatformVersion.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3301b.booleanValue();
    }

    @KeepForSdk
    public static boolean c() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    @KeepForSdk
    public static boolean d(Context context) {
        if (f3300a == null) {
            f3300a = Boolean.valueOf(PlatformVersion.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f3300a.booleanValue();
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
        if (f3303d == null) {
            f3303d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f3303d.booleanValue();
    }
}
