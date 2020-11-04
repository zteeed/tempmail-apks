package com.google.firebase.iid;

import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f11748a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f11749b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c  reason: collision with root package name */
    private static WakeLock f11750c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f11749b
            monitor-enter(r0)
            com.google.android.gms.stats.WakeLock r1 = f11750c     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.stats.WakeLock r1 = new com.google.android.gms.stats.WakeLock     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0032 }
            f11750c = r1     // Catch:{ all -> 0x0032 }
            r1.c(r2)     // Catch:{ all -> 0x0032 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0032 }
            c(r5, r2)     // Catch:{ all -> 0x0032 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0027
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0027:
            if (r1 != 0) goto L_0x0030
            com.google.android.gms.stats.WakeLock r5 = f11750c     // Catch:{ all -> 0x0032 }
            long r1 = f11748a     // Catch:{ all -> 0x0032 }
            r5.a(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.g0.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    public static void b(Intent intent) {
        synchronized (f11749b) {
            if (f11750c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                c(intent, false);
                f11750c.b();
            }
        }
    }

    private static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
