package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbai {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            return c(callable);
        } catch (Throwable th) {
            zzbba.c("Unexpected exception.", th);
            zzarl.g(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public static <T> T b(zzdsl<T> zzdsl) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T t = zzdsl.get();
            StrictMode.setThreadPolicy(threadPolicy);
            return t;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private static <T> T c(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
