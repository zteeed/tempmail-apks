package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdg {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxx f6877a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdla f6878b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcco f6879c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f6880d;

    /* renamed from: e  reason: collision with root package name */
    private final zzcdo f6881e;

    /* renamed from: f  reason: collision with root package name */
    private final zzcdw f6882f;
    private final Executor g;
    private final Executor h;
    private final zzadj i;
    private final zzccj j;

    public zzcdg(zzaxx zzaxx, zzdla zzdla, zzcco zzcco, zzcck zzcck, zzcdo zzcdo, zzcdw zzcdw, Executor executor, Executor executor2, zzccj zzccj) {
        this.f6877a = zzaxx;
        this.f6878b = zzdla;
        this.i = zzdla.i;
        this.f6879c = zzcco;
        this.f6880d = zzcck;
        this.f6881e = zzcdo;
        this.f6882f = zzcdw;
        this.g = executor;
        this.h = executor2;
        this.j = zzccj;
    }

    private static void a(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* access modifiers changed from: private */
    public static boolean e(zzcee zzcee, String[] strArr) {
        Map<String, WeakReference<View>> L5 = zzcee.L5();
        if (L5 == null) {
            return false;
        }
        for (String str : strArr) {
            if (L5.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final void b(zzcee zzcee) {
        this.g.execute(new gh(this, zzcee));
    }

    public final boolean c(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View E = this.f6880d.E();
        if (E == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (E.getParent() instanceof ViewGroup) {
            ((ViewGroup) E.getParent()).removeView(E);
        }
        if (((Boolean) zzwg.e().c(zzaav.B1)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(E, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.f6880d.E() == null) {
            return;
        }
        if (2 == this.f6880d.A() || 1 == this.f6880d.A()) {
            this.f6877a.f(this.f6878b.f8168f, String.valueOf(this.f6880d.A()), z);
        } else if (6 == this.f6880d.A()) {
            this.f6877a.f(this.f6878b.f8168f, "2", z);
            this.f6877a.f(this.f6878b.f8168f, "1", z);
        }
    }

    public final void g(zzcee zzcee) {
        if (zzcee != null && this.f6881e != null && zzcee.P() != null && this.f6879c.c()) {
            try {
                zzcee.P().addView(this.f6881e.c());
            } catch (zzbfz e2) {
                zzaxv.l("web view can not be obtained", e2);
            }
        }
    }

    public final void h(zzcee zzcee) {
        if (zzcee != null) {
            Context context = zzcee.w5().getContext();
            if (zzbae.g(this.f6879c.f6840a)) {
                if (!(context instanceof Activity)) {
                    zzbba.f("Activity context is needed for policy validator.");
                } else if (this.f6882f != null && zzcee.P() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f6882f.a(this.f6879c.f6840a, zzcee.P(), windowManager), zzbae.n());
                    } catch (zzbfz e2) {
                        zzaxv.l("web view can not be obtained", e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void i(com.google.android.gms.internal.ads.zzcee r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzcco r0 = r9.f6879c
            boolean r0 = r0.e()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcco r0 = r9.f6879c
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "1098"
            java.lang.String r4 = "3011"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r4 >= r5) goto L_0x0037
            r5 = r0[r4]
            android.view.View r5 = r10.E(r5)
            if (r5 == 0) goto L_0x0034
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0034
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0038
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r5 = r3
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            android.view.View r4 = r10.w5()
            android.content.Context r4 = r4.getContext()
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            com.google.android.gms.internal.ads.zzcck r7 = r9.f6880d
            android.view.View r7 = r7.B()
            if (r7 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzcck r4 = r9.f6880d
            android.view.View r4 = r4.B()
            com.google.android.gms.internal.ads.zzadj r7 = r9.i
            if (r7 != 0) goto L_0x005e
            goto L_0x009b
        L_0x005e:
            if (r0 != 0) goto L_0x009b
            int r7 = r7.f5638f
            a(r6, r7)
            r4.setLayoutParams(r6)
            goto L_0x009b
        L_0x0069:
            com.google.android.gms.internal.ads.zzcck r7 = r9.f6880d
            com.google.android.gms.internal.ads.zzadl r7 = r7.b0()
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzada
            if (r7 != 0) goto L_0x0075
            r4 = r3
            goto L_0x009b
        L_0x0075:
            com.google.android.gms.internal.ads.zzcck r7 = r9.f6880d
            com.google.android.gms.internal.ads.zzadl r7 = r7.b0()
            com.google.android.gms.internal.ads.zzada r7 = (com.google.android.gms.internal.ads.zzada) r7
            if (r0 != 0) goto L_0x0086
            int r8 = r7.F6()
            a(r6, r8)
        L_0x0086:
            com.google.android.gms.internal.ads.zzadd r8 = new com.google.android.gms.internal.ads.zzadd
            r8.<init>(r4, r7, r6)
            com.google.android.gms.internal.ads.zzaag<java.lang.String> r4 = com.google.android.gms.internal.ads.zzaav.z1
            com.google.android.gms.internal.ads.zzaar r6 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r4 = r6.c(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8.setContentDescription(r4)
            r4 = r8
        L_0x009b:
            r6 = -1
            if (r4 == 0) goto L_0x00e0
            android.view.ViewParent r7 = r4.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00af
            android.view.ViewParent r7 = r4.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r4)
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            r5.removeAllViews()
            r5.addView(r4)
            goto L_0x00d9
        L_0x00b8:
            com.google.android.gms.ads.formats.AdChoicesView r0 = new com.google.android.gms.ads.formats.AdChoicesView
            android.view.View r5 = r10.w5()
            android.content.Context r5 = r5.getContext()
            r0.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r6, r6)
            r0.setLayoutParams(r5)
            r0.addView(r4)
            android.widget.FrameLayout r5 = r10.P()
            if (r5 == 0) goto L_0x00d9
            r5.addView(r0)
        L_0x00d9:
            java.lang.String r0 = r10.b6()
            r10.d1(r0, r4, r2)
        L_0x00e0:
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzcde.o
            int r2 = r0.length
        L_0x00e3:
            if (r1 >= r2) goto L_0x00f5
            r4 = r0[r1]
            android.view.View r4 = r10.E(r4)
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00f2
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x00f6
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f5:
            r4 = r3
        L_0x00f6:
            java.util.concurrent.Executor r0 = r9.h
            com.google.android.gms.internal.ads.fh r1 = new com.google.android.gms.internal.ads.fh
            r1.<init>(r9, r4)
            r0.execute(r1)
            if (r4 == 0) goto L_0x01ae
            boolean r0 = r9.c(r4)
            if (r0 == 0) goto L_0x011f
            com.google.android.gms.internal.ads.zzcck r0 = r9.f6880d
            com.google.android.gms.internal.ads.zzbfn r0 = r0.F()
            if (r0 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.zzcck r0 = r9.f6880d
            com.google.android.gms.internal.ads.zzbfn r0 = r0.F()
            com.google.android.gms.internal.ads.hh r1 = new com.google.android.gms.internal.ads.hh
            r1.<init>(r9, r10, r4)
            r0.t0(r1)
            return
        L_0x011f:
            r4.removeAllViews()
            android.view.View r0 = r10.w5()
            if (r0 == 0) goto L_0x012d
            android.content.Context r0 = r0.getContext()
            goto L_0x012e
        L_0x012d:
            r0 = r3
        L_0x012e:
            if (r0 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaav.y1
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r1 = r2.c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzccj r1 = r9.j
            com.google.android.gms.internal.ads.zzado r1 = r1.b()
            if (r1 == 0) goto L_0x01ae
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.N2()     // Catch:{ RemoteException -> 0x014f }
            goto L_0x0161
        L_0x014f:
            java.lang.String r10 = "Could not get main image drawable"
            com.google.android.gms.internal.ads.zzbba.i(r10)
            return
        L_0x0155:
            com.google.android.gms.internal.ads.zzcck r1 = r9.f6880d
            com.google.android.gms.internal.ads.zzadt r1 = r1.C()
            if (r1 == 0) goto L_0x01ae
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.s2()     // Catch:{ RemoteException -> 0x01a9 }
        L_0x0161:
            if (r1 == 0) goto L_0x01ae
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.P(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 == 0) goto L_0x01ae
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            r2.setImageDrawable(r1)
            if (r10 == 0) goto L_0x0179
            com.google.android.gms.dynamic.IObjectWrapper r3 = r10.U1()
        L_0x0179:
            if (r3 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.zzaag<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.zzaav.a3
            com.google.android.gms.internal.ads.zzaar r0 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r10 = r0.c(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x018e
            goto L_0x0198
        L_0x018e:
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.P(r3)
            android.widget.ImageView$ScaleType r10 = (android.widget.ImageView.ScaleType) r10
            r2.setScaleType(r10)
            goto L_0x019d
        L_0x0198:
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2.setScaleType(r10)
        L_0x019d:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r6, r6)
            r2.setLayoutParams(r10)
            r4.addView(r2)
            goto L_0x01ae
        L_0x01a9:
            java.lang.String r10 = "Could not get drawable from image"
            com.google.android.gms.internal.ads.zzbba.i(r10)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdg.i(com.google.android.gms.internal.ads.zzcee):void");
    }
}
