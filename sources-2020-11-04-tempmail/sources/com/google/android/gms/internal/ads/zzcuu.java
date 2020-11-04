package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuu implements zzcqw<zzchj, zzdlm, zzcsc> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7750a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7751b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchm f7752c;

    public zzcuu(Context context, Executor executor, zzchm zzchm) {
        this.f7750a = context;
        this.f7751b = executor;
        this.f7752c = zzchm;
    }

    /* access modifiers changed from: private */
    public static void e(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsc> zzcqv) {
        try {
            ((zzdlm) zzcqv.f7566b).s(zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcqv.f7565a);
            zzbba.d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzchl d2 = this.f7752c.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzchk(new gp(zzcqv)));
        d2.a().p0(new zzbli((zzdlm) zzcqv.f7566b), this.f7751b);
        zzbtl b2 = d2.b();
        zzbsk c2 = d2.c();
        ((zzcsc) zzcqv.f7567c).f7(new hp(this, d2.i(), c2, b2, d2.l()));
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsc> zzcqv) throws zzdlg {
        if (!((zzdlm) zzcqv.f7566b).d()) {
            ((zzcsc) zzcqv.f7567c).g7(new fp(this, zzdkw, zzdkk, zzcqv));
            ((zzdlm) zzcqv.f7566b).n(this.f7750a, zzdkw.f8344a.f8332a.f8349d, (String) null, (zzatx) zzcqv.f7567c, zzdkk.s.toString());
            return;
        }
        e(zzdkw, zzdkk, zzcqv);
    }
}
