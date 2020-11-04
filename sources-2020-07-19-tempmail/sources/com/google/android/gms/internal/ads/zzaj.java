package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaj<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f5733a;

    /* renamed from: b  reason: collision with root package name */
    public final zzn f5734b;

    /* renamed from: c  reason: collision with root package name */
    public final zzao f5735c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5736d;

    private zzaj(T t, zzn zzn) {
        this.f5736d = false;
        this.f5733a = t;
        this.f5734b = zzn;
        this.f5735c = null;
    }

    public static <T> zzaj<T> a(T t, zzn zzn) {
        return new zzaj<>(t, zzn);
    }

    public static <T> zzaj<T> b(zzao zzao) {
        return new zzaj<>(zzao);
    }

    private zzaj(zzao zzao) {
        this.f5736d = false;
        this.f5733a = null;
        this.f5734b = null;
        this.f5735c = zzao;
    }
}
