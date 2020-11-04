package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public class zzci {

    /* renamed from: a  reason: collision with root package name */
    private static UserManager f9586a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f9587b = (!a());

    private zzci() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f9586a == null) {
                f9586a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f9586a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
            } catch (NullPointerException e2) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                f9586a = null;
                i++;
            }
        }
        if (z) {
            f9586a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(android.content.Context r3) {
        /*
            boolean r0 = f9587b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.zzci> r0 = com.google.android.gms.internal.measurement.zzci.class
            monitor-enter(r0)
            boolean r2 = f9587b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = c(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f9587b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzci.d(android.content.Context):boolean");
    }
}
