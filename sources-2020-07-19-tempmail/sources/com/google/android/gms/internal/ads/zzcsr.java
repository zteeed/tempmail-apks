package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsr implements zzcqw<zzbzj, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7468a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcae f7469b;

    public zzcsr(Context context, zzcae zzcae) {
        this.f7468a = context;
        this.f7469b = zzcae;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        go goVar = new go(zzdkk, (zzaox) zzcqv.f7383b, false);
        zzbzl a2 = this.f7469b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzbzk(goVar));
        goVar.b(a2.d());
        ((zzcsd) zzcqv.f7384c).A6(a2.g());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7383b).H3(zzdkk.R);
            ((zzaox) zzcqv.f7383b).g4(zzdkk.L, zzdkk.s.toString(), zzdkw.f8161a.f8149a.f8166d, ObjectWrapper.b0(this.f7468a), new jo(this, zzcqv), (zzamx) zzcqv.f7384c);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
