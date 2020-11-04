package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cj implements zzduu<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3747a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Map f3748b;

    cj(zzcgr zzcgr, String str, Map map) {
        this.f3747a = str;
        this.f3748b = map;
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbfn) obj).z(this.f3747a, this.f3748b);
    }
}
