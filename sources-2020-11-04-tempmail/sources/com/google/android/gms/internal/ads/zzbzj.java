package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzj extends zzbpb {
    private final Context h;
    private final WeakReference<zzbfn> i;
    private final zzbxx j;
    private final zzcam k;
    private final zzbpv l;
    private final zzdpx m;
    private final zzbss n;
    private boolean o = false;

    zzbzj(zzbpa zzbpa, Context context, @Nullable zzbfn zzbfn, zzbxx zzbxx, zzcam zzcam, zzbpv zzbpv, zzdpx zzdpx, zzbss zzbss) {
        super(zzbpa);
        this.h = context;
        this.i = new WeakReference<>(zzbfn);
        this.j = zzbxx;
        this.k = zzcam;
        this.l = zzbpv;
        this.m = zzdpx;
        this.n = zzbss;
    }

    public final void finalize() throws Throwable {
        try {
            zzbfn zzbfn = (zzbfn) this.i.get();
            if (((Boolean) zzwg.e().c(zzaav.A3)).booleanValue()) {
                if (!this.o && zzbfn != null) {
                    zzdvi zzdvi = zzbbf.f6324e;
                    zzbfn.getClass();
                    zzdvi.execute(kg.a(zzbfn));
                }
            } else if (zzbfn != null) {
                zzbfn.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean g() {
        return this.l.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.f0
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0049
            com.google.android.gms.ads.internal.zzq.zzkw()
            android.content.Context r0 = r4.h
            boolean r0 = com.google.android.gms.internal.ads.zzaye.B(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzbba.i(r0)
            com.google.android.gms.internal.ads.zzbss r0 = r4.n
            r0.g0()
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.g0
            com.google.android.gms.internal.ads.zzaar r3 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r3.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzdpx r0 = r4.m
            com.google.android.gms.internal.ads.zzdkw r3 = r4.f6672a
            com.google.android.gms.internal.ads.zzdku r3 = r3.f8345b
            com.google.android.gms.internal.ads.zzdkm r3 = r3.f8340b
            java.lang.String r3 = r3.f8321b
            r0.a(r3)
            goto L_0x004f
        L_0x0049:
            boolean r0 = r4.o
            if (r0 != 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            com.google.android.gms.internal.ads.zzbxx r0 = r4.j
            r0.O()
            com.google.android.gms.internal.ads.zzcam r0 = r4.k     // Catch:{ zzcap -> 0x0062 }
            android.content.Context r3 = r4.h     // Catch:{ zzcap -> 0x0062 }
            r0.a(r5, r3)     // Catch:{ zzcap -> 0x0062 }
            r4.o = r1
            return r1
        L_0x0062:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbss r0 = r4.n
            r0.E(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzj.h(boolean):boolean");
    }
}
