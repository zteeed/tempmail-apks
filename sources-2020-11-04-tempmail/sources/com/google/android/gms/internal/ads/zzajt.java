package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzajt<ReferenceT> implements zzajq {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, CopyOnWriteArrayList<zzahc<? super ReferenceT>>> f5932b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private ReferenceT f5933c;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void j0(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 2
            boolean r0 = com.google.android.gms.internal.ads.zzbba.a(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "Received GMSG: "
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c4 }
            int r2 = r1.length()     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x001f
        L_0x0019:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c4 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c4 }
            r0 = r1
        L_0x001f:
            com.google.android.gms.internal.ads.zzaxv.m(r0)     // Catch:{ all -> 0x00c4 }
            java.util.Set r0 = r7.keySet()     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x002a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00c4 }
            java.lang.Object r2 = r7.get(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c4 }
            int r3 = r3.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + 4
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            int r4 = r4.length()     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = "  "
            r4.append(r3)     // Catch:{ all -> 0x00c4 }
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = ": "
            r4.append(r1)     // Catch:{ all -> 0x00c4 }
            r4.append(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaxv.m(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x002a
        L_0x006c:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.google.android.gms.internal.ads.zzahc<? super ReferenceT>>> r0 = r5.f5932b     // Catch:{ all -> 0x00c4 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x00c4 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0099
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x0099
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0080:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzahc r0 = (com.google.android.gms.internal.ads.zzahc) r0     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzdvi r1 = com.google.android.gms.internal.ads.zzbbf.f6324e     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.z0 r2 = new com.google.android.gms.internal.ads.z0     // Catch:{ all -> 0x00c4 }
            r2.<init>(r5, r0, r7)     // Catch:{ all -> 0x00c4 }
            r1.execute(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x0080
        L_0x0097:
            monitor-exit(r5)
            return
        L_0x0099:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.zzaav.B3     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x00c4 }
            java.lang.Object r7 = r0.c(r7)     // Catch:{ all -> 0x00c4 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x00c4 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x00c4 }
            if (r7 == 0) goto L_0x00c2
            com.google.android.gms.internal.ads.zzaxh r7 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.zzaay r7 = r7.l()     // Catch:{ all -> 0x00c4 }
            if (r7 != 0) goto L_0x00b6
            goto L_0x00c2
        L_0x00b6:
            com.google.android.gms.internal.ads.zzdvi r7 = com.google.android.gms.internal.ads.zzbbf.f6320a     // Catch:{ all -> 0x00c4 }
            com.google.android.gms.internal.ads.a1 r0 = new com.google.android.gms.internal.ads.a1     // Catch:{ all -> 0x00c4 }
            r0.<init>(r6)     // Catch:{ all -> 0x00c4 }
            r7.execute(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r5)
            return
        L_0x00c2:
            monitor-exit(r5)
            return
        L_0x00c4:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajt.j0(java.lang.String, java.util.Map):void");
    }

    public final boolean C(String str) {
        return str != null && y0(Uri.parse(str));
    }

    public final void C0(Uri uri) {
        String path = uri.getPath();
        zzq.zzkw();
        j0(path, zzaye.d0(uri));
    }

    public final synchronized void I() {
        this.f5932b.clear();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void R(zzahc zzahc, Map map) {
        zzahc.a(this.f5933c, map);
    }

    public final synchronized void c(String str, zzahc<? super ReferenceT> zzahc) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5932b.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f5932b.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzahc);
    }

    public final void k0(ReferenceT referencet) {
        this.f5933c = referencet;
    }

    public final synchronized void n(String str, zzahc<? super ReferenceT> zzahc) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5932b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzahc);
        }
    }

    public final synchronized void v(String str, Predicate<zzahc<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5932b.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzahc zzahc = (zzahc) it.next();
                if (predicate.apply(zzahc)) {
                    arrayList.add(zzahc);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    public final boolean y0(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        C0(uri);
        return true;
    }
}
