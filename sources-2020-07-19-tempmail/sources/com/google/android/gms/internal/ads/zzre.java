package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzre {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9052a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b  reason: collision with root package name */
    private se0 f9053b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c  reason: collision with root package name */
    private boolean f9054c = false;

    public final Activity a() {
        synchronized (this.f9052a) {
            if (this.f9053b == null) {
                return null;
            }
            Activity a2 = this.f9053b.a();
            return a2;
        }
    }

    public final Context b() {
        synchronized (this.f9052a) {
            if (this.f9053b == null) {
                return null;
            }
            Context b2 = this.f9053b.b();
            return b2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9052a
            monitor-enter(r0)
            boolean r1 = r4.f9054c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x000f
            r2 = r5
        L_0x000f:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0016
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.zzbba.i(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.se0 r2 = r4.f9053b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.se0 r2 = new com.google.android.gms.internal.ads.se0     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r4.f9053b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.se0 r2 = r4.f9053b     // Catch:{ all -> 0x0034 }
            r2.e(r1, r5)     // Catch:{ all -> 0x0034 }
            r5 = 1
            r4.f9054c = r5     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzre.c(android.content.Context):void");
    }

    public final void d(zzrj zzrj) {
        synchronized (this.f9052a) {
            if (this.f9053b == null) {
                this.f9053b = new se0();
            }
            this.f9053b.f(zzrj);
        }
    }

    public final void e(zzrj zzrj) {
        synchronized (this.f9052a) {
            if (this.f9053b != null) {
                this.f9053b.h(zzrj);
            }
        }
    }
}
