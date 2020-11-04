package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class aj implements zzduu<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3566a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzahc f3567b;

    aj(zzcgr zzcgr, String str, zzahc zzahc) {
        this.f3566a = str;
        this.f3567b = zzahc;
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfn) obj).c(this.f3566a, this.f3567b);
    }
}
