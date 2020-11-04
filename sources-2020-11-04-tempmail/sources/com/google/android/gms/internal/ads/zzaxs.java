package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxs implements zzrj {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6219a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final zzaxx f6220b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaxq f6221c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private final zzaxo f6222d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<zzaxg> f6223e = new HashSet<>();
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<zzaxp> f6224f = new HashSet<>();

    public zzaxs(String str, zzaxx zzaxx) {
        this.f6222d = new zzaxo(str, zzaxx);
        this.f6220b = zzaxx;
        this.f6221c = new zzaxq();
    }

    public final void a(boolean z) {
        long a2 = zzq.zzld().a();
        if (z) {
            if (a2 - this.f6220b.o() > ((Long) zzwg.e().c(zzaav.r0)).longValue()) {
                this.f6222d.f6214d = -1;
                return;
            }
            this.f6222d.f6214d = this.f6220b.l();
            return;
        }
        this.f6220b.k(a2);
        this.f6220b.h(this.f6222d.f6214d);
    }

    public final Bundle b(Context context, zzaxn zzaxn) {
        HashSet hashSet = new HashSet();
        synchronized (this.f6219a) {
            hashSet.addAll(this.f6223e);
            this.f6223e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f6222d.c(context, this.f6221c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<zzaxp> it = this.f6224f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzaxg) it2.next()).a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzaxn.a(hashSet);
            return bundle;
        }
        zzaxp next = it.next();
        throw new NoSuchMethodError();
    }

    public final zzaxg c(Clock clock, String str) {
        return new zzaxg(clock, this, this.f6221c.a(), str);
    }

    public final void d(zzve zzve, long j) {
        synchronized (this.f6219a) {
            this.f6222d.a(zzve, j);
        }
    }

    public final void e(zzaxg zzaxg) {
        synchronized (this.f6219a) {
            this.f6223e.add(zzaxg);
        }
    }

    public final void f(HashSet<zzaxg> hashSet) {
        synchronized (this.f6219a) {
            this.f6223e.addAll(hashSet);
        }
    }

    public final void g() {
        synchronized (this.f6219a) {
            this.f6222d.d();
        }
    }

    public final void h() {
        synchronized (this.f6219a) {
            this.f6222d.e();
        }
    }
}
