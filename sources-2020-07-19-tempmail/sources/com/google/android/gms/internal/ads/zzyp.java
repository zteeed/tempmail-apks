package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyp {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f9230a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f9231b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f9232c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<String> f9233d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9234e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f9235f = new HashSet<>();
    /* access modifiers changed from: private */
    public Date g;
    /* access modifiers changed from: private */
    public String h;
    /* access modifiers changed from: private */
    public final List<String> i = new ArrayList();
    /* access modifiers changed from: private */
    public int j = -1;
    /* access modifiers changed from: private */
    public Location k;
    /* access modifiers changed from: private */
    public boolean l = false;
    /* access modifiers changed from: private */
    public String m;
    /* access modifiers changed from: private */
    public String n;
    /* access modifiers changed from: private */
    public int o = -1;
    /* access modifiers changed from: private */
    public boolean p;
    /* access modifiers changed from: private */
    public AdInfo q;
    /* access modifiers changed from: private */
    public int r = -1;
    /* access modifiers changed from: private */
    public String s;

    @Deprecated
    public final void N(boolean z) {
        this.o = z ? 1 : 0;
    }

    public final void a(boolean z) {
        this.l = z;
    }

    public final void c(Location location) {
        this.k = location;
    }

    @Deprecated
    public final void d(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            f(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f9232c.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void e(AdInfo adInfo) {
        this.q = adInfo;
    }

    public final void f(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f9231b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void g(Date date) {
        this.g = date;
    }

    @Deprecated
    public final void h(boolean z) {
        this.p = z;
    }

    public final void j(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f9231b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f9231b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f9231b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void l(List<String> list) {
        this.i.clear();
        for (String next : list) {
            if (TextUtils.isEmpty(next)) {
                zzbba.i("neighboring content URL should not be null or empty");
            } else {
                this.i.add(next);
            }
        }
    }

    public final void m(String str) {
        this.f9230a.add(str);
    }

    public final void n(String str) {
        this.f9233d.add(str);
    }

    public final void o(String str) {
        this.f9233d.remove(str);
    }

    public final void p(String str) {
        this.h = str;
    }

    public final void q(String str) {
        this.m = str;
    }

    public final void r(String str) {
        this.n = str;
    }

    public final void s(String str) {
        this.f9235f.add(str);
    }

    @Deprecated
    public final void t(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.s = str;
        }
    }

    @Deprecated
    public final void u(int i2) {
        this.j = i2;
    }

    @Deprecated
    public final void v(int i2) {
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            this.r = i2;
        }
    }

    public final void y(String str, String str2) {
        this.f9234e.putString(str, str2);
    }
}
