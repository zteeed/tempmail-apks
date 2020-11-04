package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuu implements zzcqw<zzchj, zzdlm, zzcsc> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7567a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7568b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchm f7569c;

    public zzcuu(Context context, Executor executor, zzchm zzchm) {
        this.f7567a = context;
        this.f7568b = executor;
        this.f7569c = zzchm;
    }

    /* access modifiers changed from: private */
    public static void e(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsc> zzcqv) {
        try {
            ((zzdlm) zzcqv.f7383b).s(zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcqv.f7382a);
            zzbba.d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzchl d2 = this.f7569c.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzchk(new gp(zzcqv)));
        d2.a().p0(new zzbli((zzdlm) zzcqv.f7383b), this.f7568b);
        zzbtl b2 = d2.b();
        zzbsk c2 = d2.c();
        ((zzcsc) zzcqv.f7384c).A6(new hp(this, d2.i(), c2, b2, d2.l()));
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsc> zzcqv) throws zzdlg {
        if (!((zzdlm) zzcqv.f7383b).d()) {
            ((zzcsc) zzcqv.f7384c).B6(new fp(this, zzdkw, zzdkk, zzcqv));
            ((zzdlm) zzcqv.f7383b).n(this.f7567a, zzdkw.f8161a.f8149a.f8166d, (String) null, (zzatx) zzcqv.f7384c, zzdkk.s.toString());
            return;
        }
        e(zzdkw, zzdkk, zzcqv);
    }
}
