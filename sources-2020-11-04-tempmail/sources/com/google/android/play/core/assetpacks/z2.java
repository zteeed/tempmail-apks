package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

final class z2 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11468a;

    public z2(Context context) {
        this.f11468a = context;
    }

    static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getString("local_testing_dir");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f11468a;
    }
}
