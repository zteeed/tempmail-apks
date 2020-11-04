package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccd extends zzbpb {
    private final Executor h;
    private final zzcck i;
    private final zzccs j;
    private final zzcdg k;
    private final zzcco l;
    private final zzccv m;
    private final zzeku<zzcgj> n;
    private final zzeku<zzcgh> o;
    private final zzeku<zzcgm> p;
    private final zzeku<zzcgd> q;
    private final zzeku<zzcgl> r;
    private zzcee s;
    private boolean t;
    private final zzavv u;
    private final zzeg v;
    private final zzbbd w;
    private final Context x;
    private final zzccj y;
    private final zzcww z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzccd(zzbpa zzbpa, Executor executor, zzcck zzcck, zzccs zzccs, zzcdg zzcdg, zzcco zzcco, zzccv zzccv, zzeku<zzcgj> zzeku, zzeku<zzcgh> zzeku2, zzeku<zzcgm> zzeku3, zzeku<zzcgd> zzeku4, zzeku<zzcgl> zzeku5, zzavv zzavv, zzeg zzeg, zzbbd zzbbd, Context context, zzccj zzccj, zzcww zzcww) {
        super(zzbpa);
        this.h = executor;
        this.i = zzcck;
        this.j = zzccs;
        this.k = zzcdg;
        this.l = zzcco;
        this.m = zzccv;
        this.n = zzeku;
        this.o = zzeku2;
        this.p = zzeku3;
        this.q = zzeku4;
        this.r = zzeku5;
        this.u = zzavv;
        this.v = zzeg;
        this.w = zzbbd;
        this.x = context;
        this.y = zzccj;
        this.z = zzcww;
    }

    public static boolean I(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    public final synchronized void A(zzcee zzcee) {
        this.j.f(zzcee.S5(), zzcee.H5());
        if (zzcee.V() != null) {
            zzcee.V().setClickable(false);
            zzcee.V().removeAllViews();
        }
        if (zzcee.g1() != null) {
            zzcee.g1().e(this.u);
        }
        this.s = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B(boolean z2) {
        this.j.k(this.s.S5(), this.s.H5(), this.s.k6(), z2);
    }

    public final synchronized void C(String str) {
        this.j.l(str);
    }

    public final synchronized void D(Bundle bundle) {
        this.j.b(bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzcco r0 = r10.l
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzcck r0 = r10.i
            com.google.android.gms.internal.ads.zzbfn r0 = r0.G()
            com.google.android.gms.internal.ads.zzcck r1 = r10.i
            com.google.android.gms.internal.ads.zzbfn r1 = r1.F()
            if (r0 != 0) goto L_0x001a
            if (r1 != 0) goto L_0x001a
            return
        L_0x001a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r3 = 0
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            r8 = r3
            goto L_0x0032
        L_0x002a:
            if (r2 == 0) goto L_0x0030
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L_0x0028
        L_0x0030:
            r0 = r3
            r8 = r0
        L_0x0032:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.zzaqf r3 = com.google.android.gms.ads.internal.zzq.zzll()
            android.content.Context r4 = r10.x
            boolean r3 = r3.h(r4)
            if (r3 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzbbd r3 = r10.w
            int r4 = r3.f6315c
            int r3 = r3.f6316d
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            java.lang.String r4 = "."
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaqf r3 = com.google.android.gms.ads.internal.zzq.zzll()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0075
            return
        L_0x0075:
            com.google.android.gms.internal.ads.zzcck r3 = r10.i
            r3.L(r11)
            r0.A(r11)
            if (r2 == 0) goto L_0x008c
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzaqf r1 = com.google.android.gms.ads.internal.zzq.zzll()
            r1.d(r11, r0)
        L_0x008c:
            if (r12 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzaqf r12 = com.google.android.gms.ads.internal.zzq.zzll()
            r12.e(r11)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccd.E(java.lang.String, boolean):void");
    }

    public final synchronized void F(Bundle bundle) {
        this.j.m(bundle);
    }

    public final synchronized boolean G(Bundle bundle) {
        if (this.t) {
            return true;
        }
        boolean n2 = this.j.n(bundle);
        this.t = n2;
        return n2;
    }

    public final synchronized void H() {
        this.j.J();
    }

    public final synchronized void a() {
        this.h.execute(new zg(this));
        super.a();
    }

    public final void b() {
        this.h.execute(new yg(this));
        if (this.i.A() != 7) {
            Executor executor = this.h;
            zzccs zzccs = this.j;
            zzccs.getClass();
            executor.execute(ah.a(zzccs));
        }
        super.b();
    }

    public final synchronized void g() {
        this.j.N();
    }

    public final synchronized boolean h() {
        return this.j.m0();
    }

    public final synchronized void i() {
        if (this.s == null) {
            zzbba.f("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.h.execute(new bh(this, this.s instanceof zzcdf));
        }
    }

    public final synchronized void j(View view) {
        this.j.c(view);
    }

    public final synchronized void k(View view, MotionEvent motionEvent, View view2) {
        this.j.h(view, motionEvent, view2);
    }

    public final synchronized void l(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z2) {
        this.k.g(this.s);
        this.j.i(view, view2, map, map2, z2);
    }

    public final synchronized void m(zzafo zzafo) {
        this.j.f0(zzafo);
    }

    public final synchronized void n(zzcee zzcee) {
        zzdw h2;
        this.s = zzcee;
        this.k.b(zzcee);
        this.j.a(zzcee.S5(), zzcee.k6(), zzcee.W6(), zzcee, zzcee);
        if (((Boolean) zzwg.e().c(zzaav.b1)).booleanValue() && (h2 = this.v.h()) != null) {
            h2.zzb(zzcee.S5());
        }
        if (zzcee.g1() != null) {
            zzcee.g1().d(this.u);
        }
    }

    public final synchronized void o(zzxp zzxp) {
        this.j.R(zzxp);
    }

    public final synchronized void p(zzxt zzxt) {
        this.j.c0(zzxt);
    }

    public final synchronized void q(zzyc zzyc) {
        this.z.b(zzyc);
    }

    public final void r(View view) {
        IObjectWrapper H = this.i.H();
        boolean z2 = this.i.G() != null;
        if (this.l.a() && H != null && z2 && view != null) {
            zzq.zzll().d(H, view);
        }
    }

    public final void s(View view) {
        IObjectWrapper H = this.i.H();
        if (this.l.a() && H != null && view != null) {
            zzq.zzll().g(H, view);
        }
    }

    public final synchronized void t() {
        if (!this.t) {
            this.j.d();
        }
    }

    public final boolean u() {
        return this.l.d();
    }

    public final boolean v() {
        return this.l.a();
    }

    public final zzccj w() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x() {
        this.j.destroy();
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void y() {
        try {
            int A = this.i.A();
            if (A != 1) {
                if (A != 2) {
                    if (A != 3) {
                        if (A != 6) {
                            if (A != 7) {
                                zzbba.g("Wrong native template id!");
                            } else if (this.m.e() != null) {
                                this.m.e().e4(this.q.get());
                            }
                        } else if (this.m.c() != null) {
                            E("Google", true);
                            this.m.c().E0(this.p.get());
                        }
                    } else if (this.m.h(this.i.e()) != null) {
                        if (this.i.F() != null) {
                            E("Google", true);
                        }
                        this.m.h(this.i.e()).w1(this.r.get());
                    }
                } else if (this.m.b() != null) {
                    E("Google", true);
                    this.m.b().X1(this.o.get());
                }
            } else if (this.m.a() != null) {
                E("Google", true);
                this.m.a().l5(this.n.get());
            }
        } catch (RemoteException e2) {
            zzbba.c("RemoteException when notifyAdLoad is called", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void z(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.t     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzcdg r6 = r2.k     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzcee r1 = r2.s     // Catch:{ all -> 0x006a }
            r6.h(r1)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzccs r6 = r2.j     // Catch:{ all -> 0x006a }
            r6.j(r3, r4, r5)     // Catch:{ all -> 0x006a }
            r2.t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x001a:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzaav.C1     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzaar r1 = com.google.android.gms.internal.ads.zzwg.e()     // Catch:{ all -> 0x006a }
            java.lang.Object r6 = r1.c(r6)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x006a }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x006a }
            if (r6 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0068
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x006a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x006a }
        L_0x0038:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x006a }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x006a }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x006a }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            boolean r1 = I(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzcdg r6 = r2.k     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzcee r1 = r2.s     // Catch:{ all -> 0x006a }
            r6.h(r1)     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.zzccs r6 = r2.j     // Catch:{ all -> 0x006a }
            r6.j(r3, r4, r5)     // Catch:{ all -> 0x006a }
            r2.t = r0     // Catch:{ all -> 0x006a }
            monitor-exit(r2)
            return
        L_0x0068:
            monitor-exit(r2)
            return
        L_0x006a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccd.z(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }
}
