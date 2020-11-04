package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u6 implements zzduu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbbu f5035a;

    u6(zzbbu zzbbu) {
        this.f5035a = zzbbu;
    }

    public final void a(Throwable th) {
        this.f5035a.f6146b.set(-1);
    }

    public final void onSuccess(T t) {
        this.f5035a.f6146b.set(1);
    }
}
