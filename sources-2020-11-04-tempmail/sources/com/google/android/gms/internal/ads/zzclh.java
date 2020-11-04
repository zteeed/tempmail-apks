package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclh {

    /* renamed from: a  reason: collision with root package name */
    private List<Map<String, String>> f7381a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f7382b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7383c = false;

    /* renamed from: d  reason: collision with root package name */
    private String f7384d;

    /* renamed from: e  reason: collision with root package name */
    private zzclc f7385e;

    public zzclh(String str, zzclc zzclc) {
        this.f7384d = str;
        this.f7385e = zzclc;
    }

    private final Map<String, String> c() {
        Map<String, String> a2 = this.f7385e.a();
        a2.put("tms", Long.toString(zzq.zzld().b(), 10));
        a2.put("tid", this.f7384d);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.S0     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.f7382b     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            java.util.Map r0 = r3.c()     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x002e }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f7381a     // Catch:{ all -> 0x002e }
            r1.add(r0)     // Catch:{ all -> 0x002e }
            r0 = 1
            r3.f7382b = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclh.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.S0     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.f7383c     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            java.util.Map r0 = r3.c()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f7381a     // Catch:{ all -> 0x0046 }
            r1.add(r0)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.f7381a     // Catch:{ all -> 0x0046 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0046 }
        L_0x002f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0046 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzclc r2 = r3.f7385e     // Catch:{ all -> 0x0046 }
            r2.d(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x002f
        L_0x0041:
            r0 = 1
            r3.f7383c = r0     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclh.b():void");
    }

    public final synchronized void d(String str) {
        if (((Boolean) zzwg.e().c(zzaav.S0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_started");
            c2.put("ancn", str);
            this.f7381a.add(c2);
        }
    }

    public final synchronized void e(String str) {
        if (((Boolean) zzwg.e().c(zzaav.S0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            this.f7381a.add(c2);
        }
    }

    public final synchronized void f(String str, String str2) {
        if (((Boolean) zzwg.e().c(zzaav.S0)).booleanValue()) {
            Map<String, String> c2 = c();
            c2.put("action", "adapter_init_finished");
            c2.put("ancn", str);
            c2.put("rqe", str2);
            this.f7381a.add(c2);
        }
    }
}
