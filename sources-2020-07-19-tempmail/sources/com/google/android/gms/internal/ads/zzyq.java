package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyq {

    /* renamed from: a  reason: collision with root package name */
    private final Date f9236a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9237b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f9238c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9239d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f9240e;

    /* renamed from: f  reason: collision with root package name */
    private final Location f9241f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> i;
    private final String j;
    private final String k;
    private final SearchAdRequest l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;
    private final AdInfo r;
    private final int s;
    private final String t;

    public zzyq(zzyp zzyp) {
        this(zzyp, (SearchAdRequest) null);
    }

    @Deprecated
    public final Date a() {
        return this.f9236a;
    }

    public final String b() {
        return this.f9237b;
    }

    public final Bundle c(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle d() {
        return this.o;
    }

    @Deprecated
    public final int e() {
        return this.f9239d;
    }

    public final Set<String> f() {
        return this.f9240e;
    }

    public final Location g() {
        return this.f9241f;
    }

    public final boolean h() {
        return this.g;
    }

    public final String i() {
        return this.t;
    }

    @Deprecated
    public final <T extends NetworkExtras> T j(Class<T> cls) {
        return (NetworkExtras) this.i.get(cls);
    }

    public final Bundle k(Class<? extends MediationExtrasReceiver> cls) {
        return this.h.getBundle(cls.getName());
    }

    public final String l() {
        return this.j;
    }

    @Deprecated
    public final boolean m() {
        return this.q;
    }

    public final boolean n(Context context) {
        RequestConfiguration c2 = zzyt.s().c();
        zzwg.a();
        String l2 = zzbaq.l(context);
        return this.n.contains(l2) || c2.getTestDeviceIds().contains(l2);
    }

    public final List<String> o() {
        return new ArrayList(this.f9238c);
    }

    public final String p() {
        return this.k;
    }

    public final SearchAdRequest q() {
        return this.l;
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> r() {
        return this.i;
    }

    public final Bundle s() {
        return this.h;
    }

    public final int t() {
        return this.m;
    }

    public final Set<String> u() {
        return this.p;
    }

    public final AdInfo v() {
        return this.r;
    }

    public final int w() {
        return this.s;
    }

    public zzyq(zzyp zzyp, SearchAdRequest searchAdRequest) {
        this.f9236a = zzyp.g;
        this.f9237b = zzyp.h;
        this.f9238c = zzyp.i;
        this.f9239d = zzyp.j;
        this.f9240e = Collections.unmodifiableSet(zzyp.f9230a);
        this.f9241f = zzyp.k;
        this.g = zzyp.l;
        this.h = zzyp.f9231b;
        this.i = Collections.unmodifiableMap(zzyp.f9232c);
        this.j = zzyp.m;
        this.k = zzyp.n;
        this.l = searchAdRequest;
        this.m = zzyp.o;
        this.n = Collections.unmodifiableSet(zzyp.f9233d);
        this.o = zzyp.f9234e;
        this.p = Collections.unmodifiableSet(zzyp.f9235f);
        this.q = zzyp.p;
        this.r = zzyp.q;
        this.s = zzyp.r;
        this.t = zzyp.s;
    }
}