package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcde extends zzadw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcee {
    public static final String[] o = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: b  reason: collision with root package name */
    private final String f6867b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private Map<String, WeakReference<View>> f6868c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f6869d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f6870e;

    /* renamed from: f  reason: collision with root package name */
    private zzdvi f6871f;
    private View g;
    private final int h;
    @GuardedBy("this")
    private zzccd i;
    private zzqo j;
    private IObjectWrapper k = null;
    private zzado l;
    private boolean m;
    private boolean n = false;

    public zzcde(FrameLayout frameLayout, FrameLayout frameLayout2, int i2) {
        String str;
        this.f6869d = frameLayout;
        this.f6870e = frameLayout2;
        this.h = i2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f6867b = str;
        zzq.zzlt();
        zzbbv.a(frameLayout, this);
        zzq.zzlt();
        zzbbv.b(frameLayout, this);
        this.f6871f = zzbbf.f6141e;
        this.j = new zzqo(this.f6869d.getContext(), this.f6869d);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void A6() {
        this.f6871f.execute(new eh(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void B6() {
        if (this.g == null) {
            View view = new View(this.f6869d.getContext());
            this.g = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f6869d != this.g.getParent()) {
            this.f6869d.addView(this.g);
        }
    }

    public final synchronized View E(String str) {
        if (this.n) {
            return null;
        }
        WeakReference weakReference = this.f6868c.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void I(IObjectWrapper iObjectWrapper) {
        this.i.j((View) ObjectWrapper.P(iObjectWrapper));
    }

    public final synchronized Map<String, WeakReference<View>> L5() {
        return this.f6868c;
    }

    public final FrameLayout P() {
        return this.f6870e;
    }

    public final IObjectWrapper U1() {
        return this.k;
    }

    public final zzqo a1() {
        return this.j;
    }

    public final synchronized void b3(IObjectWrapper iObjectWrapper) {
        if (!this.n) {
            this.k = iObjectWrapper;
        }
    }

    public final synchronized String b6() {
        return this.f6867b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d1(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.n     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f6868c     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6868c     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.h     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.internal.ads.zzbae.k(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcde.d1(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized void destroy() {
        if (!this.n) {
            if (this.i != null) {
                this.i.A(this);
                this.i = null;
            }
            this.f6868c.clear();
            this.f6869d.removeAllViews();
            this.f6870e.removeAllViews();
            this.f6868c = null;
            this.f6869d = null;
            this.f6870e = null;
            this.g = null;
            this.j = null;
            this.n = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void j6(com.google.android.gms.internal.ads.zzado r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.n     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r0 = 1
            r1.m = r0     // Catch:{ all -> 0x001b }
            r1.l = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzccd r0 = r1.i     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzccd r0 = r1.i     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzccj r0 = r0.w()     // Catch:{ all -> 0x001b }
            r0.a(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcde.j6(com.google.android.gms.internal.ads.zzado):void");
    }

    public final synchronized Map<String, WeakReference<View>> l5() {
        return this.f6868c;
    }

    public final synchronized void n2(String str, IObjectWrapper iObjectWrapper) {
        d1(str, (View) ObjectWrapper.P(iObjectWrapper), true);
    }

    public final synchronized IObjectWrapper o3(String str) {
        return ObjectWrapper.b0(E(str));
    }

    public final synchronized void onClick(View view) {
        if (this.i != null) {
            this.i.g();
            this.i.l(view, this.f6869d, l5(), L5(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.i != null) {
            this.i.z(this.f6869d, l5(), L5(), zzccd.I(this.f6869d));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.i != null) {
            this.i.z(this.f6869d, l5(), L5(), zzccd.I(this.f6869d));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.i != null) {
            this.i.k(view, motionEvent, this.f6869d);
        }
        return false;
    }

    public final synchronized Map<String, WeakReference<View>> s6() {
        return null;
    }

    public final synchronized void t0(IObjectWrapper iObjectWrapper, int i2) {
    }

    public final void v0(IObjectWrapper iObjectWrapper) {
        onTouch(this.f6869d, (MotionEvent) ObjectWrapper.P(iObjectWrapper));
    }

    public final /* synthetic */ View w5() {
        return this.f6869d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void z(com.google.android.gms.dynamic.IObjectWrapper r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.n     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.P(r2)     // Catch:{ all -> 0x0048 }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzccd     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.zzbba.i(r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.zzccd r0 = r1.i     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzccd r0 = r1.i     // Catch:{ all -> 0x0048 }
            r0.A(r1)     // Catch:{ all -> 0x0048 }
        L_0x001f:
            r1.A6()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzccd r2 = (com.google.android.gms.internal.ads.zzccd) r2     // Catch:{ all -> 0x0048 }
            r1.i = r2     // Catch:{ all -> 0x0048 }
            r2.n(r1)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzccd r2 = r1.i     // Catch:{ all -> 0x0048 }
            android.widget.FrameLayout r0 = r1.f6869d     // Catch:{ all -> 0x0048 }
            r2.r(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzccd r2 = r1.i     // Catch:{ all -> 0x0048 }
            android.widget.FrameLayout r0 = r1.f6870e     // Catch:{ all -> 0x0048 }
            r2.s(r0)     // Catch:{ all -> 0x0048 }
            boolean r2 = r1.m     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzccd r2 = r1.i     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzccj r2 = r2.w()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzado r0 = r1.l     // Catch:{ all -> 0x0048 }
            r2.a(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r1)
            return
        L_0x0048:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcde.z(com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
