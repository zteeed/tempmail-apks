package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b4 implements zzduu<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdvf f3416a;

    b4(zzavi zzavi, zzdvf zzdvf) {
        this.f3416a = zzdvf;
    }

    public final void a(Throwable th) {
        zzavi.n.remove(this.f3416a);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        zzavi.n.remove(this.f3416a);
    }
}
