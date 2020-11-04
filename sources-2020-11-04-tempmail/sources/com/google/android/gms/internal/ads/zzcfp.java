package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzc;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfp {

    /* renamed from: a  reason: collision with root package name */
    private final zzdla f7166a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7167b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchw f7168c;

    public zzcfp(zzdla zzdla, Executor executor, zzchw zzchw) {
        this.f7166a = zzdla;
        this.f7167b = executor;
        this.f7168c = zzchw;
    }

    private final void e(zzbfn zzbfn) {
        zzbfn.c("/video", zzagm.m);
        zzbfn.c("/videoMeta", zzagm.n);
        zzbfn.c("/precache", new zzbex());
        zzbfn.c("/delayPageLoaded", zzagm.q);
        zzbfn.c("/instrument", zzagm.o);
        zzbfn.c("/log", zzagm.h);
        zzbfn.c("/videoClicked", zzagm.i);
        zzbfn.q().h(true);
        zzbfn.c("/click", zzagm.f5876d);
        if (this.f7166a.f8348c != null) {
            zzbfn.q().k(true);
            zzbfn.c("/open", new zzahg((zzc) null, (zzapt) null));
            return;
        }
        zzbfn.q().k(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(String str, String str2, Object obj) throws Exception {
        zzbfn a2 = this.f7168c.a(zzvh.B(), false);
        zzbbo e2 = zzbbo.e(a2);
        e(a2);
        if (this.f7166a.f8348c != null) {
            a2.X(zzbhg.d());
        } else {
            a2.X(zzbhg.c());
        }
        a2.q().b(new mi(this, a2, e2));
        a2.H(str, str2, (String) null);
        return e2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(JSONObject jSONObject, zzbfn zzbfn) throws Exception {
        zzbbo e2 = zzbbo.e(zzbfn);
        if (this.f7166a.f8348c != null) {
            zzbfn.X(zzbhg.d());
        } else {
            zzbfn.X(zzbhg.c());
        }
        zzbfn.q().b(new oi(this, zzbfn, e2));
        zzbfn.e0("google.afma.nativeAds.renderVideo", jSONObject);
        return e2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(zzbfn zzbfn, zzbbo zzbbo, boolean z) {
        if (z) {
            if (!(this.f7166a.f8347b == null || zzbfn.m() == null)) {
                zzbfn.m().j7(this.f7166a.f8347b);
            }
            zzbbo.g();
            return;
        }
        zzbbo.c(new zzctw(zzdls.f8363a, "Instream video Web View failed to load."));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(zzbfn zzbfn, zzbbo zzbbo, boolean z) {
        if (!(this.f7166a.f8347b == null || zzbfn.m() == null)) {
            zzbfn.m().j7(this.f7166a.f8347b);
        }
        zzbbo.g();
    }

    public final zzdvf<zzbfn> f(JSONObject jSONObject) {
        return zzdux.j(zzdux.j(zzdux.g(null), new ki(this), this.f7167b), new ji(this, jSONObject), this.f7167b);
    }

    public final zzdvf<zzbfn> g(String str, String str2) {
        return zzdux.j(zzdux.g(null), new li(this, str, str2), this.f7167b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf h(Object obj) throws Exception {
        zzbfn a2 = this.f7168c.a(zzvh.B(), false);
        zzbbo e2 = zzbbo.e(a2);
        e(a2);
        a2.q().c(new ni(e2));
        a2.loadUrl((String) zzwg.e().c(zzaav.v1));
        return e2;
    }
}
