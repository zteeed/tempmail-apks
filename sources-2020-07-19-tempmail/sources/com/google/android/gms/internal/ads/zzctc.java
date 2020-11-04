package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzctc implements zzcqw<zzccd, zzdlm, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7477a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcbc f7478b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f7479c;

    public zzctc(Context context, zzcbc zzcbc, Executor executor) {
        this.f7477a = context;
        this.f7478b = zzcbc;
        this.f7479c = executor;
    }

    private static boolean c(zzdkw zzdkw, int i) {
        return zzdkw.f8161a.f8149a.g.contains(Integer.toString(i));
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzcck zzcck;
        zzana w = ((zzdlm) zzcqv.f7383b).w();
        zzanf x = ((zzdlm) zzcqv.f7383b).x();
        zzang z = ((zzdlm) zzcqv.f7383b).z();
        if (z != null && c(zzdkw, 6)) {
            zzcck = zzcck.P(z);
        } else if (w != null && c(zzdkw, 6)) {
            zzcck = zzcck.N(w);
        } else if (w != null && c(zzdkw, 2)) {
            zzcck = zzcck.r(w);
        } else if (x != null && c(zzdkw, 6)) {
            zzcck = zzcck.O(x);
        } else if (x == null || !c(zzdkw, 1)) {
            throw new zzctw(zzdls.f8180a, "No native ad mappers");
        } else {
            zzcck = zzcck.s(x);
        }
        if (zzdkw.f8161a.f8149a.g.contains(Integer.toString(zzcck.A()))) {
            zzccp b2 = this.f7478b.b(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzccw(zzcck), new zzcel(x, w, z));
            ((zzcsd) zzcqv.f7384c).A6(b2.f());
            b2.a().p0(new zzbli((zzdlm) zzcqv.f7383b), this.f7479c);
            return b2.h();
        }
        throw new zzctw(zzdls.f8180a, "No corresponding native ad listener");
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzdlm, zzcsd> zzcqv) throws zzdlg {
        zzdla zzdla = zzdkw.f8161a.f8149a;
        ((zzdlm) zzcqv.f7383b).p(this.f7477a, zzdkw.f8161a.f8149a.f8166d, zzdkk.s.toString(), zzazy.a(zzdkk.p), (zzamx) zzcqv.f7384c, zzdla.i, zzdla.g);
    }
}
