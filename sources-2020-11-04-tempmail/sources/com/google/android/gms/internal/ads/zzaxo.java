package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxo {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private long f6211a = -1;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private long f6212b = -1;
    @GuardedBy("lock")
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    private int f6213c = -1;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    int f6214d = -1;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private long f6215e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6216f = new Object();
    @VisibleForTesting
    private final String g;
    private final zzaxx h;
    @GuardedBy("lock")
    @VisibleForTesting
    private int i = 0;
    @GuardedBy("lock")
    @VisibleForTesting
    private int j = 0;

    public zzaxo(String str, zzaxx zzaxx) {
        this.g = str;
        this.h = zzaxx;
    }

    private static boolean b(Context context) {
        Context c2 = zzatd.c(context);
        int identifier = c2.getResources().getIdentifier("Theme.Translucent", "style", AbstractSpiCall.ANDROID_CLIENT_TYPE);
        if (identifier == 0) {
            zzbba.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == c2.getPackageManager().getActivityInfo(new ComponentName(c2.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzbba.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzbba.i("Fail to fetch AdActivity theme");
            zzbba.h("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.zzve r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f6216f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaxx r1 = r10.h     // Catch:{ all -> 0x0077 }
            long r1 = r1.o()     // Catch:{ all -> 0x0077 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzld()     // Catch:{ all -> 0x0077 }
            long r3 = r3.a()     // Catch:{ all -> 0x0077 }
            long r5 = r10.f6212b     // Catch:{ all -> 0x0077 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzaag<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzaav.r0     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0077 }
            java.lang.Object r5 = r6.c(r5)     // Catch:{ all -> 0x0077 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0077 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0077 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f6214d = r1     // Catch:{ all -> 0x0077 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.zzaxx r1 = r10.h     // Catch:{ all -> 0x0077 }
            int r1 = r1.l()     // Catch:{ all -> 0x0077 }
            r10.f6214d = r1     // Catch:{ all -> 0x0077 }
        L_0x003b:
            r10.f6212b = r12     // Catch:{ all -> 0x0077 }
            r10.f6211a = r12     // Catch:{ all -> 0x0077 }
            goto L_0x0042
        L_0x0040:
            r10.f6211a = r12     // Catch:{ all -> 0x0077 }
        L_0x0042:
            r12 = 1
            if (r11 == 0) goto L_0x0056
            android.os.Bundle r13 = r11.f9368d     // Catch:{ all -> 0x0077 }
            if (r13 == 0) goto L_0x0056
            android.os.Bundle r11 = r11.f9368d     // Catch:{ all -> 0x0077 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0077 }
            if (r11 != r12) goto L_0x0056
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0056:
            int r11 = r10.f6213c     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.f6213c = r11     // Catch:{ all -> 0x0077 }
            int r11 = r10.f6214d     // Catch:{ all -> 0x0077 }
            int r11 = r11 + r12
            r10.f6214d = r11     // Catch:{ all -> 0x0077 }
            if (r11 != 0) goto L_0x006c
            r11 = 0
            r10.f6215e = r11     // Catch:{ all -> 0x0077 }
            com.google.android.gms.internal.ads.zzaxx r11 = r10.h     // Catch:{ all -> 0x0077 }
            r11.r(r3)     // Catch:{ all -> 0x0077 }
            goto L_0x0075
        L_0x006c:
            com.google.android.gms.internal.ads.zzaxx r11 = r10.h     // Catch:{ all -> 0x0077 }
            long r11 = r11.i()     // Catch:{ all -> 0x0077 }
            long r3 = r3 - r11
            r10.f6215e = r3     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxo.a(com.google.android.gms.internal.ads.zzve, long):void");
    }

    public final Bundle c(Context context, String str) {
        Bundle bundle;
        synchronized (this.f6216f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.f6212b);
            bundle.putLong("currts", this.f6211a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f6213c);
            bundle.putInt("preqs_in_session", this.f6214d);
            bundle.putLong("time_in_session", this.f6215e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            bundle.putBoolean("support_transparent_background", b(context));
        }
        return bundle;
    }

    public final void d() {
        synchronized (this.f6216f) {
            this.j++;
        }
    }

    public final void e() {
        synchronized (this.f6216f) {
            this.i++;
        }
    }
}
