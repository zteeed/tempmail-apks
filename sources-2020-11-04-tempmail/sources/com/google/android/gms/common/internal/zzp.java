package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class zzp {

    /* renamed from: a  reason: collision with root package name */
    private static Object f3251a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3252b;

    /* renamed from: c  reason: collision with root package name */
    private static String f3253c;

    /* renamed from: d  reason: collision with root package name */
    private static int f3254d;

    public static String a(Context context) {
        c(context);
        return f3253c;
    }

    public static int b(Context context) {
        c(context);
        return f3254d;
    }

    private static void c(Context context) {
        synchronized (f3251a) {
            if (!f3252b) {
                f3252b = true;
                try {
                    Bundle bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f3253c = bundle.getString("com.google.app.id");
                        f3254d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
