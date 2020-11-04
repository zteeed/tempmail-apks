package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzbba {
    public static boolean a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    public static void b(String str, Throwable th) {
        if (a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void c(String str, Throwable th) {
        if (a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void d(String str, Throwable th) {
        if (a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void e(String str, Throwable th) {
        if (!a(5)) {
            return;
        }
        if (th != null) {
            d(j(str), th);
        } else {
            i(j(str));
        }
    }

    public static void f(String str) {
        if (a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void g(String str) {
        if (a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void h(String str) {
        if (a(4)) {
            Log.i("Ads", str);
        }
    }

    public static void i(String str) {
        if (a(5)) {
            Log.w("Ads", str);
        }
    }

    @VisibleForTesting
    private static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void k(String str) {
        e(str, (Throwable) null);
    }
}
