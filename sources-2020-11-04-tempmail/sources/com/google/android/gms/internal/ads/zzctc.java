package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctc implements zzcqw<zzccd, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7660a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcbc f7661b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7662c;

    public zzctc(Context context, zzcbc zzcbc, Executor executor) {
        this.f7660a = context;
        this.f7661b = zzcbc;
        this.f7662c = executor;
    }

    private static boolean c(zzdkw zzdkw, int i) {
        return zzdkw.f8344a.f8332a.g.contains(Integer.toString(i));
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzcck zzcck;
        zzana w = ((zzdlm) zzcqv.f7566b).w();
        zzanf x = ((zzdlm) zzcqv.f7566b).x();
        zzang z = ((zzdlm) zzcqv.f7566b).z();
        if (z != null && c(zzdkw, 6)) {
            zzcck = zzcck.P(z);
        } else if (w != null && c(zzdkw, 6)) {
            zzcck = zzcck.N(w);
        } else if (w != null && c(zzdkw, 2)) {
            zzcck = zzcck.r(w);
        } else if (x != null && c(zzdkw, 6)) {
            zzcck = zzcck.O(x);
        } else if (x == null || !c(zzdkw, 1)) {
            throw new zzctw(zzdls.f8363a, "No native ad mappers");
        } else {
            zzcck = zzcck.s(x);
        }
        if (zzdkw.f8344a.f8332a.g.contains(Integer.toString(zzcck.A()))) {
            zzccp b2 = this.f7661b.b(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzccw(zzcck), new zzcel(x, w, z));
            ((zzcsd) zzcqv.f7567c).f7(b2.f());
            b2.a().p0(new zzbli((zzdlm) zzcqv.f7566b), this.f7662c);
            return b2.h();
        }
        throw new zzctw(zzdls.f8363a, "No corresponding native ad listener");
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        zzdla zzdla = zzdkw.f8344a.f8332a;
        ((zzdlm) zzcqv.f7566b).p(this.f7660a, zzdkw.f8344a.f8332a.f8349d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7567c, zzdla.i, zzdla.g);
    }
}
