package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class zzp {

    /* renamed from: a  reason: collision with root package name */
    private static Object f3068a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3069b;

    /* renamed from: c  reason: collision with root package name */
    private static String f3070c;

    /* renamed from: d  reason: collision with root package name */
    private static int f3071d;

    public static String a(Context context) {
        c(context);
        return f3070c;
    }

    public static int b(Context context) {
        c(context);
        return f3071d;
    }

    private static void c(Context context) {
        synchronized (f3068a) {
            if (!f3069b) {
                f3069b = true;
                try {
                    Bundle bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3070c = bundle.getString("com.google.app.id");
                        f3071d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
