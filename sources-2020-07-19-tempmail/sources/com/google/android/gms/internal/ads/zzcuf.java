package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcuf implements zzcqw<zzchj, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7549a;

    /* renamed from: b  reason: collision with root package name */
    private final zzchm f7550b;

    public zzcuf(Context context, zzchm zzchm) {
        this.f7549a = context;
        this.f7550b = zzchm;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        go goVar = new go(zzdkk, (zzaox) zzcqv.f7383b, true);
        zzchl d2 = this.f7550b.d(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzchk(goVar));
        goVar.b(d2.d());
        ((zzcsd) zzcqv.f7384c).A6(d2.n());
        return d2.k();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7383b).H3(zzdkk.R);
            if (zzdkw.f8161a.f8149a.n.f8143a == zzdks.f8152c) {
                ((zzaox) zzcqv.f7383b).C4(zzdkk.L, zzdkk.s.toString(), zzdkw.f8161a.f8149a.f8166d, ObjectWrapper.b0(this.f7549a), new wo(this, zzcqv), (zzamx) zzcqv.f7384c);
            } else {
                ((zzaox) zzcqv.f7383b).R1(zzdkk.L, zzdkk.s.toString(), zzdkw.f8161a.f8149a.f8166d, ObjectWrapper.b0(this.f7549a), new wo(this, zzcqv), (zzamx) zzcqv.f7384c);
            }
        } catch (RemoteException e2) {
            zzaxv.l("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}
