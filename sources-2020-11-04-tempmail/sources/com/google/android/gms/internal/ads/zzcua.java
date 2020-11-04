package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcua implements zzcqw<zzchj, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7726a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7727b;

    /* renamed from: c  reason: collision with root package name */
    private final zzchm f7728c;

    public zzcua(Context context, Executor executor, zzchm zzchm) {
        this.f7726a = context;
        this.f7727b = executor;
        this.f7728c = zzchm;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzchl d2 = this.f7728c.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzchk(new uo(zzcqv)));
        d2.a().p0(new zzbli((zzdlm) zzcqv.f7566b), this.f7727b);
        ((zzcsd) zzcqv.f7567c).f7(d2.m());
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        try {
            zzdla zzdla = zzdkw.f8344a.f8332a;
            if (zzdla.n.f8326a == zzdks.f8335c) {
                ((zzdlm) zzcqv.f7566b).u(this.f7726a, zzdla.f8349d, zzdkk.s.toString(), (zzamx) zzcqv.f7567c);
            } else {
                ((zzdlm) zzcqv.f7566b).t(this.f7726a, zzdla.f8349d, zzdkk.s.toString(), (zzamx) zzcqv.f7567c);
            }
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcqv.f7565a);
            zzbba.d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }
}
