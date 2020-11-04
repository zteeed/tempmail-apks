package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcte implements zzcqw<zzccd, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7667a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcbc f7668b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public zzang f7669c;

    public zzcte(Context context, zzcbc zzcbc) {
        this.f7667a = context;
        this.f7668b = zzcbc;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        if (zzdkw.f8344a.f8332a.g.contains(Integer.toString(6))) {
            zzcck P = zzcck.P(this.f7669c);
            if (zzdkw.f8344a.f8332a.g.contains(Integer.toString(P.A()))) {
                zzccp b2 = this.f7668b.b(new zzbpr(zzdkw, zzdkk, zzcqv.f7565a), new zzccw(P), new zzcel((zzanf) null, (zzana) null, this.f7669c));
                ((zzcsd) zzcqv.f7567c).f7(b2.g());
                return b2.h();
            }
            throw new zzctw(zzdls.f8363a, "No corresponding native ad listener");
        }
        throw new zzctw(zzdls.f8364b, "Unified must be used for RTB.");
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7566b).V3(zzdkk.R);
            ((zzaox) zzcqv.f7566b).E6(zzdkk.L, zzdkk.s.toString(), zzdkw.f8344a.f8332a.f8349d, ObjectWrapper.h0(this.f7667a), new qo(this, zzcqv), (zzamx) zzcqv.f7567c);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
