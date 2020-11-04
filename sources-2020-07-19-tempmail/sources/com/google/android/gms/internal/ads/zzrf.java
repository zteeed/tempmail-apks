package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrf {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9055a = new Object();
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private int f9056b;

    /* renamed from: c  reason: collision with root package name */
    private List<zzrc> f9057c = new LinkedList();

    public final boolean a(zzrc zzrc) {
        synchronized (this.f9055a) {
            if (this.f9057c.contains(zzrc)) {
                return true;
            }
            return false;
        }
    }

    public final boolean b(zzrc zzrc) {
        synchronized (this.f9055a) {
            Iterator<zzrc> it = this.f9057c.iterator();
            while (it.hasNext()) {
                zzrc next = it.next();
                if (!zzq.zzla().r().w()) {
                    if (zzrc != next && next.i().equals(zzrc.i())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzq.zzla().r().q() && zzrc != next && next.k().equals(zzrc.k())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void c(zzrc zzrc) {
        synchronized (this.f9055a) {
            if (this.f9057c.size() >= 10) {
                int size = this.f9057c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzbba.f(sb.toString());
                this.f9057c.remove(0);
            }
            int i = this.f9056b;
            this.f9056b = i + 1;
            zzrc.e(i);
            zzrc.o();
            this.f9057c.add(zzrc);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzrc d(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f9055a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.zzrc> r1 = r7.f9057c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r8 = "Queue empty"
            com.google.android.gms.internal.ads.zzbba.f(r8)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.zzrc> r1 = r7.f9057c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x0045
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.List<com.google.android.gms.internal.ads.zzrc> r1 = r7.f9057c     // Catch:{ all -> 0x005a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005a }
            r3 = 0
        L_0x0026:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.zzrc r5 = (com.google.android.gms.internal.ads.zzrc) r5     // Catch:{ all -> 0x005a }
            int r6 = r5.a()     // Catch:{ all -> 0x005a }
            if (r6 <= r8) goto L_0x003b
            r4 = r3
            r2 = r5
            r8 = r6
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x003e:
            java.util.List<com.google.android.gms.internal.ads.zzrc> r8 = r7.f9057c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.zzrc> r1 = r7.f9057c     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.zzrc r1 = (com.google.android.gms.internal.ads.zzrc) r1     // Catch:{ all -> 0x005a }
            if (r8 == 0) goto L_0x0055
            java.util.List<com.google.android.gms.internal.ads.zzrc> r8 = r7.f9057c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0055:
            r1.l()     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r1
        L_0x005a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrf.d(boolean):com.google.android.gms.internal.ads.zzrc");
    }
}
