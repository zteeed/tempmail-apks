package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class qd0 implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<zzaa<?>>> f4908a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final zzm f4909b;

    qd0(zzm zzm) {
        this.f4909b = zzm;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d(com.google.android.gms.internal.ads.zzaa<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.E()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzaa<?>>> r1 = r5.f4908a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzaa<?>>> r1 = r5.f4908a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.u(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzaa<?>>> r6 = r5.f4908a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.zzaq.f6038b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzaq.a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzaa<?>>> r1 = r5.f4908a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.p(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.zzaq.f6038b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzaq.a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qd0.d(com.google.android.gms.internal.ads.zzaa):boolean");
    }

    public final void a(zzaa<?> zzaa, zzaj<?> zzaj) {
        List<zzaa> remove;
        zzn zzn = zzaj.f5917b;
        if (zzn == null || zzn.a()) {
            b(zzaa);
            return;
        }
        String E = zzaa.E();
        synchronized (this) {
            remove = this.f4908a.remove(E);
        }
        if (remove != null) {
            if (zzaq.f6038b) {
                zzaq.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), E);
            }
            for (zzaa b2 : remove) {
                this.f4909b.f9047e.b(b2, zzaj);
            }
        }
    }

    public final synchronized void b(zzaa<?> zzaa) {
        String E = zzaa.E();
        List remove = this.f4908a.remove(E);
        if (remove != null && !remove.isEmpty()) {
            if (zzaq.f6038b) {
                zzaq.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), E);
            }
            zzaa zzaa2 = (zzaa) remove.remove(0);
            this.f4908a.put(E, remove);
            zzaa2.p(this);
            try {
                this.f4909b.f9045c.put(zzaa2);
            } catch (InterruptedException e2) {
                zzaq.b("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f4909b.b();
            }
        }
    }
}
