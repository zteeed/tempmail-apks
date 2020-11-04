package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcrp implements zzcqw<zzbnc, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7598a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbny f7599b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public View f7600c;

    public zzcrp(Context context, zzbny zzbny) {
        this.f7598a = context;
        this.f7599b = zzbny;
    }

    static final /* synthetic */ zzyi d(zzcqv zzcqv) throws zzdlg {
        try {
            return ((zzaox) zzcqv.f7566b).getVideoController();
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        zzbnf a2 = this.f7599b.a(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzbnj(this.f7600c, (zzbfn) null, new sn(zzcqv), zzdkk.r.get(0)));
        a2.j().C0(this.f7600c);
        ((zzcsd) zzcqv.f7567c).f7(a2.g());
        return a2.i();
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7566b).V3(zzdkk.R);
            ((zzaox) zzcqv.f7566b).j5(zzdkk.L, zzdkk.s.toString(), zzdkw.f8344a.f8332a.f8349d, ObjectWrapper.h0(this.f7598a), new tn(this, zzcqv), (zzamx) zzcqv.f7567c, zzdkw.f8344a.f8332a.f8350e);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
