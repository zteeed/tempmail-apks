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
    private final WeakReference<View> f6872b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f6873c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f6874d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f6875e = new HashMap();
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    private zzccd f6876f;
    private zzqo g;

    public zzcdf(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzq.zzlt();
        zzbbv.a(view, this);
        zzq.zzlt();
        zzbbv.b(view, this);
        this.f6872b = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f6873c.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f6875e.putAll(this.f6873c);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f6874d.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f6875e.putAll(this.f6874d);
        this.g = new zzqo(view.getContext(), view);
    }

    public final synchronized View E(String str) {
        WeakReference weakReference = this.f6875e.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized void I(IObjectWrapper iObjectWrapper) {
        if (this.f6876f != null) {
            Object P = ObjectWrapper.P(iObjectWrapper);
            if (!(P instanceof View)) {
                zzbba.i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f6876f.j((View) P);
        }
    }

    public final synchronized Map<String, WeakReference<View>> L5() {
        return this.f6873c;
    }

    public final FrameLayout P() {
        return null;
    }

    public final synchronized IObjectWrapper U1() {
        return null;
    }

    public final zzqo a1() {
        return this.g;
    }

    public final synchronized String b6() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d1(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f6875e     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f6873c     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f6874d     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6875e     // Catch:{ all -> 0x0047 }
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
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f6873c     // Catch:{ all -> 0x0047 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdf.d1(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized Map<String, WeakReference<View>> l5() {
        return this.f6875e;
    }

    public final synchronized void onClick(View view) {
        if (this.f6876f != null) {
            this.f6876f.l(view, w5(), l5(), L5(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f6876f != null) {
            this.f6876f.z(w5(), l5(), L5(), zzccd.I(w5()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f6876f != null) {
            this.f6876f.z(w5(), l5(), L5(), zzccd.I(w5()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f6876f != null) {
            this.f6876f.k(view, motionEvent, w5());
        }
        return false;
    }

    public final synchronized void p5() {
        if (this.f6876f != null) {
            this.f6876f.A(this);
            this.f6876f = null;
        }
    }

    public final synchronized Map<String, WeakReference<View>> s6() {
        return this.f6874d;
    }

    public final View w5() {
        return (View) this.f6872b.get();
    }

    public final synchronized void z(IObjectWrapper iObjectWrapper) {
        Object P = ObjectWrapper.P(iObjectWrapper);
        if (!(P instanceof zzccd)) {
            zzbba.i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.f6876f != null) {
            this.f6876f.A(this);
        }
        if (((zzccd) P).u()) {
            zzccd zzccd = (zzccd) P;
            this.f6876f = zzccd;
            zzccd.n(this);
            this.f6876f.r(w5());
            return;
        }
        zzbba.g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }
}
