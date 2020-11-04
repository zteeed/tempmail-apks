package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzavv implements zzqs {

    /* renamed from: b  reason: collision with root package name */
    private final Context f6179b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f6180c;

    /* renamed from: d  reason: collision with root package name */
    private String f6181d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6182e;

    public zzavv(Context context, String str) {
        this.f6179b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6181d = str;
        this.f6182e = false;
        this.f6180c = new Object();
    }

    public final void R(zzqt zzqt) {
        k(zzqt.j);
    }

    public final String f() {
        return this.f6181d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzavy r0 = com.google.android.gms.ads.internal.zzq.zzlu()
            android.content.Context r1 = r3.f6179b
            boolean r0 = r0.l(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f6180c
            monitor-enter(r0)
            boolean r1 = r3.f6182e     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f6182e = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f6181d     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f6182e     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzavy r4 = com.google.android.gms.ads.internal.zzq.zzlu()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6179b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6181d     // Catch:{ all -> 0x003f }
            r4.u(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.zzavy r4 = com.google.android.gms.ads.internal.zzq.zzlu()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6179b     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6181d     // Catch:{ all -> 0x003f }
            r4.v(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavv.k(boolean):void");
    }
}
