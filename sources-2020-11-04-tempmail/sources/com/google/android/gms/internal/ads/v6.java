package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v6 implements zzduu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbr f5288a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbp f5289b;

    v6(zzbbu zzbbu, zzbbr zzbbr, zzbbp zzbbp) {
        this.f5288a = zzbbr;
        this.f5289b = zzbbp;
    }

    public final void a(Throwable th) {
        this.f5289b.run();
    }

    public final void onSuccess(T t) {
        this.f5288a.a(t);
    }
}
