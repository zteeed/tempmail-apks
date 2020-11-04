package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaj<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f5916a;

    /* renamed from: b  reason: collision with root package name */
    public final zzn f5917b;

    /* renamed from: c  reason: collision with root package name */
    public final zzao f5918c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5919d;

    private zzaj(T t, zzn zzn) {
        this.f5919d = false;
        this.f5916a = t;
        this.f5917b = zzn;
        this.f5918c = null;
    }

    public static <T> zzaj<T> a(T t, zzn zzn) {
        return new zzaj<>(t, zzn);
    }

    public static <T> zzaj<T> b(zzao zzao) {
        return new zzaj<>(zzao);
    }

    private zzaj(zzao zzao) {
        this.f5919d = false;
        this.f5916a = null;
        this.f5917b = null;
        this.f5918c = zzao;
    }
}
