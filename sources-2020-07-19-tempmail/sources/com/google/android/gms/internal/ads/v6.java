package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v6 implements zzduu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbr f5105a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbp f5106b;

    v6(zzbbu zzbbu, zzbbr zzbbr, zzbbp zzbbp) {
        this.f5105a = zzbbr;
        this.f5106b = zzbbp;
    }

    public final void a(Throwable th) {
        this.f5106b.run();
    }

    public final void onSuccess(T t) {
        this.f5105a.a(t);
    }
}
