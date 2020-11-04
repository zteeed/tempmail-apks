package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzvp {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final zzvc f9383a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzuz f9384b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zzzf f9385c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzafx f9386d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final zzatu f9387e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzaqg f9388f;
    /* access modifiers changed from: private */
    public final zzafw g;

    public zzvp(zzvc zzvc, zzuz zzuz, zzzf zzzf, zzafx zzafx, zzatu zzatu, zzauy zzauy, zzaqg zzaqg, zzafw zzafw) {
        this.f9383a = zzvc;
        this.f9384b = zzuz;
        this.f9385c = zzzf;
        this.f9386d = zzafx;
        this.f9387e = zzatu;
        this.f9388f = zzaqg;
        this.g = zzafw;
    }

    /* access modifiers changed from: private */
    public static void f(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzwg.a().d(context, zzwg.g().f6314b, "gmob-apps", bundle, true);
    }

    public final zzadx a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzadx) new mg0(this, frameLayout, frameLayout2, context).b(context, false);
    }

    public final zzaea b(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzaea) new lg0(this, view, hashMap, hashMap2).b(view.getContext(), false);
    }

    public final zzawr c(Context context, zzamr zzamr) {
        return (zzawr) new dg0(this, context, zzamr).b(context, false);
    }

    public final zzww e(Context context, zzvh zzvh, String str, zzamr zzamr) {
        return (zzww) new fg0(this, context, zzvh, str, zzamr).b(context, false);
    }

    public final zzaqi g(Activity activity) {
        eg0 eg0 = new eg0(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbba.g("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzaqi) eg0.b(activity, z);
    }

    public final zzwp i(Context context, String str, zzamr zzamr) {
        return (zzwp) new kg0(this, context, str, zzamr).b(context, false);
    }

    public final zzaui k(Context context, String str, zzamr zzamr) {
        return (zzaui) new bg0(this, context, str, zzamr).b(context, false);
    }
}
