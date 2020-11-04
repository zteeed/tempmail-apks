package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbxa {

    /* renamed from: a  reason: collision with root package name */
    private final Set<zzbyg<zzuu>> f6849a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<zzbyg<zzbsl>> f6850b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<zzbyg<zzbtd>> f6851c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<zzbyg<zzbuf>> f6852d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<zzbyg<zzbua>> f6853e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<zzbyg<zzbsq>> f6854f;
    private final Set<zzbyg<zzbsz>> g;
    private final Set<zzbyg<AdMetadataListener>> h;
    private final Set<zzbyg<AppEventListener>> i;
    private final Set<zzbyg<zzbup>> j;
    private final zzdim k;
    private zzbso l;
    private zzcts m;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static class zza {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Set<zzbyg<zzuu>> f6855a = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Set<zzbyg<zzbsl>> f6856b = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Set<zzbyg<zzbtd>> f6857c = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Set<zzbyg<zzbuf>> f6858d = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Set<zzbyg<zzbua>> f6859e = new HashSet();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Set<zzbyg<zzbsq>> f6860f = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbyg<AdMetadataListener>> g = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbyg<AppEventListener>> h = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbyg<zzbsz>> i = new HashSet();
        /* access modifiers changed from: private */
        public Set<zzbyg<zzbup>> j = new HashSet();
        /* access modifiers changed from: private */
        public zzdim k;

        public final zza a(AppEventListener appEventListener, Executor executor) {
            this.h.add(new zzbyg(appEventListener, executor));
            return this;
        }

        public final zza b(AdMetadataListener adMetadataListener, Executor executor) {
            this.g.add(new zzbyg(adMetadataListener, executor));
            return this;
        }

        public final zza c(zzbsl zzbsl, Executor executor) {
            this.f6856b.add(new zzbyg(zzbsl, executor));
            return this;
        }

        public final zza d(zzbsq zzbsq, Executor executor) {
            this.f6860f.add(new zzbyg(zzbsq, executor));
            return this;
        }

        public final zza e(zzbsz zzbsz, Executor executor) {
            this.i.add(new zzbyg(zzbsz, executor));
            return this;
        }

        public final zza f(zzbtd zzbtd, Executor executor) {
            this.f6857c.add(new zzbyg(zzbtd, executor));
            return this;
        }

        public final zza g(zzbua zzbua, Executor executor) {
            this.f6859e.add(new zzbyg(zzbua, executor));
            return this;
        }

        public final zza h(zzbuf zzbuf, Executor executor) {
            this.f6858d.add(new zzbyg(zzbuf, executor));
            return this;
        }

        public final zza i(zzbup zzbup, Executor executor) {
            this.j.add(new zzbyg(zzbup, executor));
            return this;
        }

        public final zza j(zzdim zzdim) {
            this.k = zzdim;
            return this;
        }

        public final zza k(zzuu zzuu, Executor executor) {
            this.f6855a.add(new zzbyg(zzuu, executor));
            return this;
        }

        public final zza l(zzxe zzxe, Executor executor) {
            if (this.h != null) {
                zzcxa zzcxa = new zzcxa();
                zzcxa.b(zzxe);
                this.h.add(new zzbyg(zzcxa, executor));
            }
            return this;
        }

        public final zzbxa n() {
            return new zzbxa(this);
        }
    }

    private zzbxa(zza zza2) {
        this.f6849a = zza2.f6855a;
        this.f6851c = zza2.f6857c;
        this.f6852d = zza2.f6858d;
        this.f6850b = zza2.f6856b;
        this.f6853e = zza2.f6859e;
        this.f6854f = zza2.f6860f;
        this.g = zza2.i;
        this.h = zza2.g;
        this.i = zza2.h;
        this.j = zza2.j;
        this.k = zza2.k;
    }

    public final zzcts a(Clock clock, zzctu zzctu) {
        if (this.m == null) {
            this.m = new zzcts(clock, zzctu);
        }
        return this.m;
    }

    public final Set<zzbyg<zzbsl>> b() {
        return this.f6850b;
    }

    public final Set<zzbyg<zzbua>> c() {
        return this.f6853e;
    }

    public final Set<zzbyg<zzbsq>> d() {
        return this.f6854f;
    }

    public final Set<zzbyg<zzbsz>> e() {
        return this.g;
    }

    public final Set<zzbyg<AdMetadataListener>> f() {
        return this.h;
    }

    public final Set<zzbyg<AppEventListener>> g() {
        return this.i;
    }

    public final Set<zzbyg<zzuu>> h() {
        return this.f6849a;
    }

    public final Set<zzbyg<zzbtd>> i() {
        return this.f6851c;
    }

    public final Set<zzbyg<zzbuf>> j() {
        return this.f6852d;
    }

    public final Set<zzbyg<zzbup>> k() {
        return this.j;
    }

    public final zzdim l() {
        return this.k;
    }

    public final zzbso m(Set<zzbyg<zzbsq>> set) {
        if (this.l == null) {
            this.l = new zzbso(set);
        }
        return this.l;
    }
}
