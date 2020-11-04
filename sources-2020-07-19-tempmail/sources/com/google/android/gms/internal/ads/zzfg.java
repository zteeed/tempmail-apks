package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzfg {
    static {
        "0123456789abcdef".toCharArray();
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static long b(double d2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / ((double) displayMetrics.density));
    }

    public static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzeea.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean d(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static String e(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return zzcv.a(bArr, true);
    }

    public static boolean f(String str) {
        return str == null || str.isEmpty();
    }

    public static Activity g(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i = 0;
        while ((context instanceof ContextWrapper) && i < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i++;
        }
        return null;
    }
}
