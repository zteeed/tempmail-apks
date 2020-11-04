package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvf {

    /* renamed from: a  reason: collision with root package name */
    public static final zzvf f9371a = new zzvf();

    @VisibleForTesting
    protected zzvf() {
    }

    public static zzatw a(Context context, zzyq zzyq, String str) {
        return new zzatw(b(context, zzyq), str);
    }

    public static zzve b(Context context, zzyq zzyq) {
        List list;
        Context context2;
        zzuw zzuw;
        String str;
        zzyq zzyq2 = zzyq;
        Date a2 = zzyq.a();
        long time = a2 != null ? a2.getTime() : -1;
        String b2 = zzyq.b();
        int e2 = zzyq.e();
        Set<String> f2 = zzyq.f();
        if (!f2.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(f2));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean n = zzyq2.n(context2);
        Location g = zzyq.g();
        Bundle k = zzyq2.k(AdMobAdapter.class);
        if (zzyq.v() != null) {
            zzuw = new zzuw(zzyq.v().getAdString(), zzwg.i().containsKey(zzyq.v().getQueryInfo()) ? zzwg.i().get(zzyq.v().getQueryInfo()) : "");
        } else {
            zzuw = null;
        }
        boolean h = zzyq.h();
        String l = zzyq.l();
        SearchAdRequest q = zzyq.q();
        zzzw zzzw = q != null ? new zzzw(q) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzwg.a();
            str = zzbaq.c(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean m = zzyq.m();
        RequestConfiguration c2 = zzyt.s().c();
        return new zzve(8, time, k, e2, list, n, Math.max(zzyq.t(), c2.getTagForChildDirectedTreatment()), h, l, zzzw, g, b2, zzyq.s(), zzyq.d(), Collections.unmodifiableList(new ArrayList(zzyq.u())), zzyq.p(), str, m, zzuw, Math.max(zzyq.w(), c2.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(new String[]{zzyq.i(), c2.getMaxAdContentRating()}), ag0.f3562b), zzyq.o());
    }

    static final /* synthetic */ int c(String str, String str2) {
        return RequestConfiguration.zzadk.indexOf(str) - RequestConfiguration.zzadk.indexOf(str2);
    }
}
