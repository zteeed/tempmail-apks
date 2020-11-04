package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrp implements zzcqw<zzbnc, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7415a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbny f7416b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f7417c;

    public zzcrp(Context context, zzbny zzbny) {
        this.f7415a = context;
        this.f7416b = zzbny;
    }

    static final /* synthetic */ zzyi d(zzcqv zzcqv) throws zzdlg {
        try {
            return ((zzaox) zzcqv.f7383b).getVideoController();
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbnf a2 = this.f7416b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzbnj(this.f7417c, (zzbfn) null, new sn(zzcqv), zzdkk.r.get(0)));
        a2.j().C0(this.f7417c);
        ((zzcsd) zzcqv.f7384c).A6(a2.g());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7383b).H3(zzdkk.R);
            ((zzaox) zzcqv.f7383b).P4(zzdkk.L, zzdkk.s.toString(), zzdkw.f8161a.f8149a.f8166d, ObjectWrapper.b0(this.f7415a), new tn(this, zzcqv), (zzamx) zzcqv.f7384c, zzdkw.f8161a.f8149a.f8167e);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
