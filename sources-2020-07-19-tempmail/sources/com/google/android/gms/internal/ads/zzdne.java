package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdne<AdT extends zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdmi f8236a;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public zzdnk f8237b;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public zzdvq<zzdmw<AdT>> f8238c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private zzdvf<zzdmw<AdT>> f8239d;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public int f8240e = zzdmu.g;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzdml f8241f;
    /* access modifiers changed from: private */
    public final zzdnh<AdT> g;
    private final LinkedList<zzdnk> h;
    private final zzduu<zzdmw<AdT>> i = new gx(this);

    public zzdne(zzdml zzdml, zzdmi zzdmi, zzdnh<AdT> zzdnh) {
        this.f8241f = zzdml;
        this.f8236a = zzdmi;
        this.g = zzdnh;
        this.h = new LinkedList<>();
        this.f8236a.b(new hx(this));
    }

    private final boolean d() {
        zzdvf<zzdmw<AdT>> zzdvf = this.f8239d;
        return zzdvf == null || zzdvf.isDone();
    }

    /* access modifiers changed from: private */
    public final void l(zzdnk zzdnk) {
        while (d()) {
            if (zzdnk != null || !this.h.isEmpty()) {
                if (zzdnk == null) {
                    zzdnk = this.h.remove();
                }
                if (zzdnk.b() == null || !this.f8241f.a(zzdnk.b())) {
                    zzdnk = null;
                } else {
                    this.f8237b = zzdnk.c();
                    this.f8238c = zzdvq.C();
                    zzdvf<zzdmw<AdT>> c2 = this.g.c(this.f8237b);
                    this.f8239d = c2;
                    zzdux.f(c2, this.i, zzdnk.a());
                    return;
                }
            } else {
                return;
            }
        }
        if (zzdnk != null) {
            this.h.add(zzdnk);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        synchronized (this) {
            l(this.f8237b);
        }
    }

    public final void g(zzdnk zzdnk) {
        this.h.add(zzdnk);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf i(zzdmw zzdmw) throws Exception {
        zzdvf g2;
        synchronized (this) {
            g2 = zzdux.g(new zzdni(zzdmw, this.f8237b));
        }
        return g2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzdvf<com.google.android.gms.internal.ads.zzdni<AdT>> j(com.google.android.gms.internal.ads.zzdnk r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.d()     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r3)
            return r1
        L_0x000a:
            int r0 = com.google.android.gms.internal.ads.zzdmu.i     // Catch:{ all -> 0x0044 }
            r3.f8240e = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdnk r0 = r3.f8237b     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdmv r0 = r0.b()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdmv r0 = r4.b()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzdnk r0 = r3.f8237b     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdmv r0 = r0.b()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdmv r2 = r4.b()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0042
        L_0x002d:
            int r0 = com.google.android.gms.internal.ads.zzdmu.h     // Catch:{ all -> 0x0044 }
            r3.f8240e = r0     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdvq<com.google.android.gms.internal.ads.zzdmw<AdT>> r0 = r3.f8238c     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.fx r1 = new com.google.android.gms.internal.ads.fx     // Catch:{ all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.zzdvf r4 = com.google.android.gms.internal.ads.zzdux.j(r0, r1, r4)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdne.j(com.google.android.gms.internal.ads.zzdnk):com.google.android.gms.internal.ads.zzdvf");
    }
}
