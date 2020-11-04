package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zu<R> implements zzdnk {

    /* renamed from: a  reason: collision with root package name */
    public final zzdin<R> f5677a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdiq f5678b;

    /* renamed from: c  reason: collision with root package name */
    public final zzve f5679c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5680d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f5681e;

    /* renamed from: f  reason: collision with root package name */
    public final zzvo f5682f;
    @Nullable
    private final zzdmv g;

    public zu(zzdin<R> zzdin, zzdiq zzdiq, zzve zzve, String str, Executor executor, zzvo zzvo, @Nullable zzdmv zzdmv) {
        this.f5677a = zzdin;
        this.f5678b = zzdiq;
        this.f5679c = zzve;
        this.f5680d = str;
        this.f5681e = executor;
        this.f5682f = zzvo;
        this.g = zzdmv;
    }

    public final Executor a() {
        return this.f5681e;
    }

    @Nullable
    public final zzdmv b() {
        return this.g;
    }

    public final zzdnk c() {
        return new zu(this.f5677a, this.f5678b, this.f5679c, this.f5680d, this.f5681e, this.f5682f, this.g);
    }
}
