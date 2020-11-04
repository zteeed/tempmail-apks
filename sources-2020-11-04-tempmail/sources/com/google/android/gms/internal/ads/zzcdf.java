package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdf extends zzaed implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcee {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f7055b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7056c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7057d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f7058e = new HashMap();
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private zzccd f7059f;
    private zzqo g;

    public zzcdf(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzq.zzlt();
        zzbbv.a(view, this);
        zzq.zzlt();
        zzbbv.b(view, this);
        this.f7055b = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f7056c.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f7058e.putAll(this.f7056c);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f7057d.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f7058e.putAll(this.f7057d);
        this.g = new zzqo(view.getContext(), view);
    }

    public final synchronized String B6() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    public final synchronized void C(IObjectWrapper iObjectWrapper) {
        Object V = ObjectWrapper.V(iObjectWrapper);
        if (!(V instanceof zzccd)) {
            zzbba.i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.f7059f != null) {
            this.f7059f.A(this);
        }
        if (((zzccd) V).u()) {
            zzccd zzccd = (zzccd) V;
            this.f7059f = zzccd;
            zzccd.n(this);
            this.f7059f.r(S5());
            return;
        }
        zzbba.g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final synchronized View H(String str) {
        WeakReference weakReference = this.f7058e.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized Map<String, WeakReference<View>> H5() {
        return this.f7058e;
    }

    public final synchronized void L5() {
        if (this.f7059f != null) {
            this.f7059f.A(this);
            this.f7059f = null;
        }
    }

    public final synchronized void M(IObjectWrapper iObjectWrapper) {
        if (this.f7059f != null) {
            Object V = ObjectWrapper.V(iObjectWrapper);
            if (!(V instanceof View)) {
                zzbba.i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f7059f.j((View) V);
        }
    }

    public final View S5() {
        return (View) this.f7055b.get();
    }

    public final FrameLayout V() {
        return null;
    }

    public final synchronized Map<String, WeakReference<View>> W6() {
        return this.f7057d;
    }

    public final synchronized IObjectWrapper d2() {
        return null;
    }

    public final zzqo g1() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void j1(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f7058e     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f7056c     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f7057d     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f7058e     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0045
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f7056c     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0047 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0047 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.j1(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized Map<String, WeakReference<View>> k6() {
        return this.f7056c;
    }

    public final synchronized void onClick(View view) {
        if (this.f7059f != null) {
            this.f7059f.l(view, S5(), H5(), k6(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f7059f != null) {
            this.f7059f.z(S5(), H5(), k6(), zzccd.I(S5()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f7059f != null) {
            this.f7059f.z(S5(), H5(), k6(), zzccd.I(S5()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f7059f != null) {
            this.f7059f.k(view, motionEvent, S5());
        }
        return false;
    }
}
