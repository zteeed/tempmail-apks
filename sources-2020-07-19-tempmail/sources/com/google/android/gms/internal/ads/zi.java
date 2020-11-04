package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zi implements zzduu<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5473a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzahc f5474b;

    zi(zzcgr zzcgr, String str, zzahc zzahc) {
        this.f5473a = str;
        this.f5474b = zzahc;
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfn) obj).n(this.f5473a, this.f5474b);
    }
}
