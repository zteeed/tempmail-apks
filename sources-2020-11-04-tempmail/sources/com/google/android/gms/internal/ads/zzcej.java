package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcej implements zzccs {

    /* renamed from: a  reason: collision with root package name */
    private final zzana f7105a;

    /* renamed from: b  reason: collision with root package name */
    private final zzanf f7106b;

    /* renamed from: c  reason: collision with root package name */
    private final zzang f7107c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbtc f7108d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbsk f7109e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f7110f;
    private final zzdkk g;
    private final zzbbd h;
    private final zzdla i;
    private boolean j = false;
    private boolean k = false;

    public zzcej(zzana zzana, zzanf zzanf, zzang zzang, zzbtc zzbtc, zzbsk zzbsk, Context context, zzdkk zzdkk, zzbbd zzbbd, zzdla zzdla) {
        this.f7105a = zzana;
        this.f7106b = zzanf;
        this.f7107c = zzang;
        this.f7108d = zzbtc;
        this.f7109e = zzbsk;
        this.f7110f = context;
        this.g = zzdkk;
        this.h = zzbbd;
        this.i = zzdla;
    }

    private final void o(View view) {
        try {
            if (this.f7107c != null && !this.f7107c.G()) {
                this.f7107c.D(ObjectWrapper.h0(view));
                this.f7109e.onAdClicked();
            } else if (this.f7105a != null && !this.f7105a.G()) {
                this.f7105a.D(ObjectWrapper.h0(view));
                this.f7109e.onAdClicked();
            } else if (this.f7106b != null && !this.f7106b.G()) {
                this.f7106b.D(ObjectWrapper.h0(view));
                this.f7109e.onAdClicked();
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call handleClick", e2);
        }
    }

    private static HashMap<String, View> p(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view = (View) ((WeakReference) next.getValue()).get();
                if (view != null) {
                    hashMap.put((String) next.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    public final void J() {
        this.k = true;
    }

    public final void N() {
    }

    public final void R(zzxp zzxp) {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper h0 = ObjectWrapper.h0(view);
            HashMap<String, View> p = p(map);
            HashMap<String, View> p2 = p(map2);
            if (this.f7107c != null) {
                this.f7107c.w(h0, ObjectWrapper.h0(p), ObjectWrapper.h0(p2));
            } else if (this.f7105a != null) {
                this.f7105a.w(h0, ObjectWrapper.h0(p), ObjectWrapper.h0(p2));
                this.f7105a.O(h0);
            } else if (this.f7106b != null) {
                this.f7106b.w(h0, ObjectWrapper.h0(p), ObjectWrapper.h0(p2));
                this.f7106b.O(h0);
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call trackView", e2);
        }
    }

    public final void b(Bundle bundle) {
    }

    public final void c(View view) {
    }

    public final void c0(zzxt zzxt) {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final void d() {
    }

    public final void destroy() {
    }

    public final void e() {
    }

    public final void f(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper h0 = ObjectWrapper.h0(view);
            if (this.f7107c != null) {
                this.f7107c.t(h0);
            } else if (this.f7105a != null) {
                this.f7105a.t(h0);
            } else if (this.f7106b != null) {
                this.f7106b.t(h0);
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call untrackView", e2);
        }
    }

    public final void f0(zzafo zzafo) {
    }

    public final void g() {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final void h(View view, MotionEvent motionEvent, View view2) {
    }

    public final void i(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.k || !this.g.D) {
            o(view);
        }
    }

    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.j && this.g.z != null) {
                this.j |= zzq.zzlg().c(this.f7110f, this.h.f6314b, this.g.z.toString(), this.i.f8351f);
            }
            if (this.f7107c != null && !this.f7107c.v()) {
                this.f7107c.recordImpression();
                this.f7108d.onAdImpression();
            } else if (this.f7105a != null && !this.f7105a.v()) {
                this.f7105a.recordImpression();
                this.f7108d.onAdImpression();
            } else if (this.f7106b != null && !this.f7106b.v()) {
                this.f7106b.recordImpression();
                this.f7108d.onAdImpression();
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call recordImpression", e2);
        }
    }

    public final void k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.k) {
            zzbba.i("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.g.D) {
            zzbba.i("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        } else {
            o(view);
        }
    }

    public final void l(String str) {
    }

    public final void m(Bundle bundle) {
    }

    public final boolean m0() {
        return this.g.D;
    }

    public final boolean n(Bundle bundle) {
        return false;
    }
}
