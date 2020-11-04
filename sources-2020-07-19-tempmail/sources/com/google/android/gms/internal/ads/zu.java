package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zu<R> implements zzdnk {

    /* renamed from: a  reason: collision with root package name */
    public final zzdin<R> f5494a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdiq f5495b;

    /* renamed from: c  reason: collision with root package name */
    public final zzve f5496c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5497d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f5498e;

    /* renamed from: f  reason: collision with root package name */
    public final zzvo f5499f;
    @Nullable
    private final zzdmv g;

    public zu(zzdin<R> zzdin, zzdiq zzdiq, zzve zzve, String str, Executor executor, zzvo zzvo, @Nullable zzdmv zzdmv) {
        this.f5494a = zzdin;
        this.f5495b = zzdiq;
        this.f5496c = zzve;
        this.f5497d = str;
        this.f5498e = executor;
        this.f5499f = zzvo;
        this.g = zzdmv;
    }

    public final Executor a() {
        return this.f5498e;
    }

    @Nullable
    public final zzdmv b() {
        return this.g;
    }

    public final zzdnk c() {
        return new zu(this.f5494a, this.f5495b, this.f5496c, this.f5497d, this.f5498e, this.f5499f, this.g);
    }
}
