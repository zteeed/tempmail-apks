package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class aj implements zzduu<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3383a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzahc f3384b;

    aj(zzcgr zzcgr, String str, zzahc zzahc) {
        this.f3383a = str;
        this.f3384b = zzahc;
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfn) obj).c(this.f3383a, this.f3384b);
    }
}
