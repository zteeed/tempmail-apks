package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
public class Wrappers {

    /* renamed from: b  reason: collision with root package name */
    private static Wrappers f3327b = new Wrappers();

    /* renamed from: a  reason: collision with root package name */
    private PackageManagerWrapper f3328a = null;

    @KeepForSdk
    public static PackageManagerWrapper a(Context context) {
        return f3327b.b(context);
    }

    @VisibleForTesting
    private final synchronized PackageManagerWrapper b(Context context) {
        if (this.f3328a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f3328a = new PackageManagerWrapper(context);
        }
        return this.f3328a;
    }
}
