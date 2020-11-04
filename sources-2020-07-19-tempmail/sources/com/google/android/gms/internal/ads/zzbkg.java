package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbkg extends zzxl {

    /* renamed from: b  reason: collision with root package name */
    private final Context f6295b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbbd f6296c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcix f6297d;

    /* renamed from: e  reason: collision with root package name */
    private final zzcqu<zzdlm, zzcsc> f6298e;

    /* renamed from: f  reason: collision with root package name */
    private final zzcwj f6299f;
    private final zzclx g;
    private final zzavy h;
    private final zzciz i;
    @GuardedBy("this")
    private boolean j = false;

    zzbkg(Context context, zzbbd zzbbd, zzcix zzcix, zzcqu<zzdlm, zzcsc> zzcqu, zzcwj zzcwj, zzclx zzclx, zzavy zzavy, zzciz zzciz) {
        this.f6295b = context;
        this.f6296c = zzbbd;
        this.f6297d = zzcix;
        this.f6298e = zzcqu;
        this.f6299f = zzcwj;
        this.g = zzclx;
        this.h = zzavy;
        this.i = zzciz;
    }

    public final List<zzaic> B2() throws RemoteException {
        return this.g.k();
    }

    public final void C1() {
        this.g.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void F() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.j     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.internal.ads.zzbba.i(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.f6295b     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaav.a(r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaxh r0 = com.google.android.gms.ads.internal.zzq.zzla()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.f6295b     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzbbd r2 = r3.f6296c     // Catch:{ all -> 0x005d }
            r0.k(r1, r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzsq r0 = com.google.android.gms.ads.internal.zzq.zzlc()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.f6295b     // Catch:{ all -> 0x005d }
            r0.c(r1)     // Catch:{ all -> 0x005d }
            r0 = 1
            r3.j = r0     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzclx r0 = r3.g     // Catch:{ all -> 0x005d }
            r0.j()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.L0     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzcwj r0 = r3.f6299f     // Catch:{ all -> 0x005d }
            r0.a()     // Catch:{ all -> 0x005d }
        L_0x0044:
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaav.G1     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.c(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzciz r0 = r3.i     // Catch:{ all -> 0x005d }
            r0.a()     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r3)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkg.F():void");
    }

    public final synchronized void J1(boolean z) {
        zzq.zzlb().a(z);
    }

    public final void V1(zzaij zzaij) throws RemoteException {
        this.g.q(zzaij);
    }

    public final synchronized void Y4(String str) {
        zzaav.a(this.f6295b);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzwg.e().c(zzaav.F1)).booleanValue()) {
                zzq.zzle().zza(this.f6295b, this.f6296c, str, (Runnable) null);
            }
        }
    }

    public final synchronized float k4() {
        return zzq.zzlb().d();
    }

    public final void m0(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbba.g("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.P(iObjectWrapper);
        if (context == null) {
            zzbba.g("Context is null. Failed to open debug menu.");
            return;
        }
        zzayv zzayv = new zzayv(context);
        zzayv.a(str);
        zzayv.g(this.f6296c.f6131b);
        zzayv.b();
    }

    public final synchronized void n5(float f2) {
        zzq.zzlb().b(f2);
    }

    public final synchronized boolean q3() {
        return zzq.zzlb().e();
    }

    public final String t3() {
        return this.f6296c.f6131b;
    }

    public final void u5(zzamr zzamr) throws RemoteException {
        this.f6297d.c(zzamr);
    }

    public final void y1(zzzu zzzu) throws RemoteException {
        this.h.d(this.f6295b, zzzu);
    }

    public final void y3(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzaav.a(this.f6295b);
        if (((Boolean) zzwg.e().c(zzaav.H1)).booleanValue()) {
            zzq.zzkw();
            str2 = zzaye.L(this.f6295b);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) zzwg.e().c(zzaav.F1)).booleanValue() | ((Boolean) zzwg.e().c(zzaav.n0)).booleanValue();
            qb qbVar = null;
            if (((Boolean) zzwg.e().c(zzaav.n0)).booleanValue()) {
                booleanValue = true;
                qbVar = new qb(this, (Runnable) ObjectWrapper.P(iObjectWrapper));
            }
            if (booleanValue) {
                zzq.zzle().zza(this.f6295b, this.f6296c, str, (Runnable) qbVar);
            }
        }
    }

    public final void z2(String str) {
        this.f6299f.f(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void z6(Runnable runnable) {
        Preconditions.f("Adapters must be initialized on the main thread.");
        Map<String, zzamm> e2 = zzq.zzla().r().C().e();
        if (e2 != null && !e2.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzbba.d("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f6297d.a()) {
                HashMap hashMap = new HashMap();
                for (zzamm zzamm : e2.values()) {
                    for (zzamn next : zzamm.f5790a) {
                        String str = next.f5792b;
                        for (String next2 : next.f5791a) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        zzcqv<zzdlm, zzcsc> a2 = this.f6298e.a(str2, jSONObject);
                        if (a2 != null) {
                            zzdlm zzdlm = (zzdlm) a2.f7383b;
                            if (!zzdlm.d()) {
                                if (zzdlm.y()) {
                                    zzdlm.l(this.f6295b, (zzcsc) a2.f7384c, (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    zzbba.f(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (zzdlg e3) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        zzbba.d(sb.toString(), e3);
                    }
                }
            }
        }
    }
}
