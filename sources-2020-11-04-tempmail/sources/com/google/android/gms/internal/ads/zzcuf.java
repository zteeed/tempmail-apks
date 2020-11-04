package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuf implements zzcqw<zzchj, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7732a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchm f7733b;

    public zzcuf(Context context, zzchm zzchm) {
        this.f7732a = context;
        this.f7733b = zzchm;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        go goVar = new go(zzdkk, (zzaox) zzcqv.f7566b, true);
        zzchl d2 = this.f7733b.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzchk(goVar));
        goVar.b(d2.d());
        ((zzcsd) zzcqv.f7567c).f7(d2.n());
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7566b).V3(zzdkk.R);
            if (zzdkw.f8344a.f8332a.n.f8326a == zzdks.f8335c) {
                ((zzaox) zzcqv.f7566b).W4(zzdkk.L, zzdkk.s.toString(), zzdkw.f8344a.f8332a.f8349d, ObjectWrapper.h0(this.f7732a), new wo(this, zzcqv), (zzamx) zzcqv.f7567c);
            } else {
                ((zzaox) zzcqv.f7566b).a2(zzdkk.L, zzdkk.s.toString(), zzdkw.f8344a.f8332a.f8349d, ObjectWrapper.h0(this.f7732a), new wo(this, zzcqv), (zzamx) zzcqv.f7567c);
            }
        } catch (RemoteException e2) {
            zzaxv.l("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}
