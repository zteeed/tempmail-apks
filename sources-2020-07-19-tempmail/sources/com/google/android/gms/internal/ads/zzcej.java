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
    private final zzana f6922a;

    /* renamed from: b  reason: collision with root package name */
    private final zzanf f6923b;

    /* renamed from: c  reason: collision with root package name */
    private final zzang f6924c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbtc f6925d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbsk f6926e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f6927f;
    private final zzdkk g;
    private final zzbbd h;
    private final zzdla i;
    private boolean j = false;
    private boolean k = false;

    public zzcej(zzana zzana, zzanf zzanf, zzang zzang, zzbtc zzbtc, zzbsk zzbsk, Context context, zzdkk zzdkk, zzbbd zzbbd, zzdla zzdla) {
        this.f6922a = zzana;
        this.f6923b = zzanf;
        this.f6924c = zzang;
        this.f6925d = zzbtc;
        this.f6926e = zzbsk;
        this.f6927f = context;
        this.g = zzdkk;
        this.h = zzbbd;
        this.i = zzdla;
    }

    private final void o(View view) {
        try {
            if (this.f6924c != null && !this.f6924c.D()) {
                this.f6924c.A(ObjectWrapper.b0(view));
                this.f6926e.onAdClicked();
            } else if (this.f6922a != null && !this.f6922a.D()) {
                this.f6922a.A(ObjectWrapper.b0(view));
                this.f6926e.onAdClicked();
            } else if (this.f6923b != null && !this.f6923b.D()) {
                this.f6923b.A(ObjectWrapper.b0(view));
                this.f6926e.onAdClicked();
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

    public final void G() {
        this.k = true;
    }

    public final void J() {
    }

    public final void M(zzxp zzxp) {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final void W(zzxt zzxt) {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final void Z(zzafo zzafo) {
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper b0 = ObjectWrapper.b0(view);
            HashMap<String, View> p = p(map);
            HashMap<String, View> p2 = p(map2);
            if (this.f6924c != null) {
                this.f6924c.u(b0, ObjectWrapper.b0(p), ObjectWrapper.b0(p2));
            } else if (this.f6922a != null) {
                this.f6922a.u(b0, ObjectWrapper.b0(p), ObjectWrapper.b0(p2));
                this.f6922a.K(b0);
            } else if (this.f6923b != null) {
                this.f6923b.u(b0, ObjectWrapper.b0(p), ObjectWrapper.b0(p2));
                this.f6923b.K(b0);
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call trackView", e2);
        }
    }

    public final void b(Bundle bundle) {
    }

    public final void c(View view) {
    }

    public final void d() {
    }

    public final void destroy() {
    }

    public final void e() {
    }

    public final void f(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper b0 = ObjectWrapper.b0(view);
            if (this.f6924c != null) {
                this.f6924c.r(b0);
            } else if (this.f6922a != null) {
                this.f6922a.r(b0);
            } else if (this.f6923b != null) {
                this.f6923b.r(b0);
            }
        } catch (RemoteException e2) {
            zzbba.d("Failed to call untrackView", e2);
        }
    }

    public final void g() {
        zzbba.i("Mute This Ad is not supported for 3rd party ads");
    }

    public final boolean g0() {
        return this.g.D;
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
                this.j |= zzq.zzlg().c(this.f6927f, this.h.f6131b, this.g.z.toString(), this.i.f8168f);
            }
            if (this.f6924c != null && !this.f6924c.t()) {
                this.f6924c.recordImpression();
                this.f6925d.onAdImpression();
            } else if (this.f6922a != null && !this.f6922a.t()) {
                this.f6922a.recordImpression();
                this.f6925d.onAdImpression();
            } else if (this.f6923b != null && !this.f6923b.t()) {
                this.f6923b.recordImpression();
                this.f6925d.onAdImpression();
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

    public final boolean n(Bundle bundle) {
        return false;
    }
}
