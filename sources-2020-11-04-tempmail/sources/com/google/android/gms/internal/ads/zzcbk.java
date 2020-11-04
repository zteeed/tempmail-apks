package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.tempmail.t.y;
import com.tempmail.utils.x;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbk implements zzccs {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6970a;

    /* renamed from: b  reason: collision with root package name */
    private final zzccv f6971b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f6972c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcgr f6973d;

    /* renamed from: e  reason: collision with root package name */
    private final zzcck f6974e;

    /* renamed from: f  reason: collision with root package name */
    private final zzeg f6975f;
    /* access modifiers changed from: private */
    public final zzbtc g;
    /* access modifiers changed from: private */
    public final zzbsk h;
    private final zzdkk i;
    private final zzbbd j;
    private final zzdla k;
    private final zzblu l;
    private final zzcdn m;
    private final Clock n;
    private final zzbyj o;
    private final zzdpd p;
    private boolean q = false;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private Point u = new Point();
    private Point v = new Point();
    private long w = 0;
    private long x = 0;
    private zzxp y;

    public zzcbk(Context context, zzccv zzccv, JSONObject jSONObject, zzcgr zzcgr, zzcck zzcck, zzeg zzeg, zzbtc zzbtc, zzbsk zzbsk, zzdkk zzdkk, zzbbd zzbbd, zzdla zzdla, zzblu zzblu, zzcdn zzcdn, Clock clock, zzbyj zzbyj, zzdpd zzdpd) {
        this.f6970a = context;
        this.f6971b = zzccv;
        this.f6972c = jSONObject;
        this.f6973d = zzcgr;
        this.f6974e = zzcck;
        this.f6975f = zzeg;
        this.g = zzbtc;
        this.h = zzbsk;
        this.i = zzdkk;
        this.j = zzbbd;
        this.k = zzdla;
        this.l = zzblu;
        this.m = zzcdn;
        this.n = clock;
        this.o = zzbyj;
        this.p = zzdpd;
    }

    private final void p(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f6972c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f6971b.i(this.f6974e.e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f6974e.A());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.k.i != null && this.k.i.h);
            jSONObject8.put("custom_mute_enabled", !this.f6974e.j().isEmpty() && this.f6974e.D() != null);
            if (this.m.c() != null && this.f6972c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.n.a());
            if (this.t && r()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f6971b.i(this.f6974e.e()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", v(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a2 = this.n.a();
            jSONObject9.put("time_from_last_touch_down", a2 - this.w);
            jSONObject9.put("time_from_last_touch", a2 - this.x);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbbj.a(this.f6973d.i("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzbba.c("Unable to create click JSON.", e2);
        }
    }

    private final boolean q(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f6972c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzwg.e().c(zzaav.r1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", zzbae.j(this.f6970a));
            this.f6973d.d("/logScionEvent", new ug(this));
            this.f6973d.d("/nativeImpression", new wg(this));
            zzbbj.a(this.f6973d.i("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z2 = this.q;
            if (z2 || this.i.z == null) {
                return true;
            }
            this.q = z2 | zzq.zzlg().c(this.f6970a, this.j.f6314b, this.i.z.toString(), this.k.f8351f);
            return true;
        } catch (JSONException e2) {
            zzbba.c("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private final boolean r() {
        return this.f6972c.optBoolean("allow_custom_click_gesture", false);
    }

    private final String t(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int A = this.f6974e.A();
        if (A == 1) {
            return "1099";
        }
        if (A == 2) {
            return "2099";
        }
        if (A != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean u(String str) {
        JSONObject optJSONObject = this.f6972c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final String v(View view) {
        try {
            JSONObject optJSONObject = this.f6972c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f6975f.h().zza(this.f6970a, optJSONObject.optString("click_string"), view);
        } catch (Exception e2) {
            zzbba.c("Exception obtaining click signals", e2);
            return null;
        }
    }

    private final String w(View view) {
        if (!((Boolean) zzwg.e().c(zzaav.r1)).booleanValue()) {
            return null;
        }
        try {
            return this.f6975f.h().zza(this.f6970a, view, (Activity) null);
        } catch (Exception unused) {
            zzbba.g("Exception getting data.");
            return null;
        }
    }

    public final void J() {
        this.t = true;
    }

    public final void N() {
        if (this.f6972c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.m.a();
        }
    }

    public final void R(zzxp zzxp) {
        this.y = zzxp;
    }

    public final void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.u = new Point();
        this.v = new Point();
        if (!this.r) {
            this.o.C0(view);
            this.r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.l.B(this);
        boolean k2 = zzbae.k(this.j.f6316d);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (k2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (k2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            zzbba.f("Click data is null. No click is reported.");
        } else if (!u("click_reporting")) {
            zzbba.g("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            p((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzq.zzkw().h(bundle, (JSONObject) null), false, false);
        }
    }

    public final void c(View view) {
        if (!this.f6972c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbba.i("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzcdn zzcdn = this.m;
        if (view != null) {
            view.setOnClickListener(zzcdn);
            view.setClickable(true);
            zzcdn.h = new WeakReference<>(view);
        }
    }

    public final void c0(zzxt zzxt) {
        try {
            if (!this.s) {
                if (zzxt != null || this.f6974e.D() == null) {
                    this.s = true;
                    this.p.e(zzxt.K0());
                    g();
                    return;
                }
                this.s = true;
                this.p.e(this.f6974e.D().K0());
                g();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void d() {
        q((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    public final void destroy() {
        this.f6973d.a();
    }

    public final void e() {
        Preconditions.f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f6972c);
            zzbbj.a(this.f6973d.i("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            zzbba.c("", e2);
        }
    }

    public final void f(View view, Map<String, WeakReference<View>> map) {
        this.u = new Point();
        this.v = new Point();
        this.o.D0(view);
        this.r = false;
    }

    public final void f0(zzafo zzafo) {
        if (!this.f6972c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbba.i("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.m.b(zzafo);
        }
    }

    public final void g() {
        try {
            if (this.y != null) {
                this.y.onAdMuted();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    public final void h(View view, MotionEvent motionEvent, View view2) {
        this.u = zzbae.a(motionEvent, view2);
        long a2 = this.n.a();
        this.x = a2;
        if (motionEvent.getAction() == 0) {
            this.w = a2;
            this.v = this.u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f6975f.d(obtain);
        obtain.recycle();
    }

    public final void i(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject e2 = zzbae.e(this.f6970a, map, map2, view2);
        JSONObject d2 = zzbae.d(this.f6970a, view2);
        JSONObject l2 = zzbae.l(view2);
        JSONObject i2 = zzbae.i(this.f6970a, view2);
        View view4 = view;
        String t2 = t(view, map);
        p(view, d2, e2, l2, i2, t2, zzbae.f(t2, this.f6970a, this.v, this.u), (JSONObject) null, z, false);
    }

    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        q(zzbae.d(this.f6970a, view), zzbae.e(this.f6970a, map, map2, view), zzbae.l(view), zzbae.i(this.f6970a, view), w(view), (JSONObject) null, zzbae.g(this.i));
    }

    public final void k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.t) {
            zzbba.f("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!r()) {
            zzbba.f("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject e2 = zzbae.e(this.f6970a, map, map2, view);
            JSONObject d2 = zzbae.d(this.f6970a, view);
            JSONObject l2 = zzbae.l(view);
            JSONObject i2 = zzbae.i(this.f6970a, view);
            String t2 = t((View) null, map);
            p(view, d2, e2, l2, i2, t2, zzbae.f(t2, this.f6970a, this.v, this.u), (JSONObject) null, z, true);
        }
    }

    public final void l(String str) {
        p((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void m(Bundle bundle) {
        if (bundle == null) {
            zzbba.f("Touch event data is null. No touch event is reported.");
        } else if (!u("touch_reporting")) {
            zzbba.g("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.f6975f.h().zza((int) bundle.getFloat(x.f13134a), (int) bundle.getFloat(y.f13082d), i2);
        }
    }

    public final boolean m0() {
        return r();
    }

    public final boolean n(Bundle bundle) {
        if (!u("impression_reporting")) {
            zzbba.g("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return q((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, zzq.zzkw().h(bundle, (JSONObject) null), false);
    }
}
