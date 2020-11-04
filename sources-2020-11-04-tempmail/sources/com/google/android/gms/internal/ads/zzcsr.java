package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsr implements zzcqw<zzbzj, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7651a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcae f7652b;

    public zzcsr(Context context, zzcae zzcae) {
        this.f7651a = context;
        this.f7652b = zzcae;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        go goVar = new go(zzdkk, (zzaox) zzcqv.f7566b, false);
        zzbzl a2 = this.f7652b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzbzk(goVar));
        goVar.b(a2.d());
        ((zzcsd) zzcqv.f7567c).f7(a2.g());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7566b).V3(zzdkk.R);
            ((zzaox) zzcqv.f7566b).A4(zzdkk.L, zzdkk.s.toString(), zzdkw.f8344a.f8332a.f8349d, ObjectWrapper.h0(this.f7651a), new jo(this, zzcqv), (zzamx) zzcqv.f7567c);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
