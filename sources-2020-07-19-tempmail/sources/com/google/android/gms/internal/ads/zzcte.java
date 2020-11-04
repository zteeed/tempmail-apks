package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcte implements zzcqw<zzccd, zzaox, zzcsd> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7484a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcbc f7485b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public zzang f7486c;

    public zzcte(Context context, zzcbc zzcbc) {
        this.f7484a = context;
        this.f7485b = zzcbc;
    }

    public final /* synthetic */ Object a(zzdkw zzdkw, zzdkk zzdkk, zzcqv zzcqv) throws zzdlg, zzctw {
        if (zzdkw.f8161a.f8149a.g.contains(Integer.toString(6))) {
            zzcck P = zzcck.P(this.f7486c);
            if (zzdkw.f8161a.f8149a.g.contains(Integer.toString(P.A()))) {
                zzccp b2 = this.f7485b.b(new zzbpr(zzdkw, zzdkk, zzcqv.f7382a), new zzccw(P), new zzcel((zzanf) null, (zzana) null, this.f7486c));
                ((zzcsd) zzcqv.f7384c).A6(b2.g());
                return b2.h();
            }
            throw new zzctw(zzdls.f8180a, "No corresponding native ad listener");
        }
        throw new zzctw(zzdls.f8181b, "Unified must be used for RTB.");
    }

    public final void b(zzdkw zzdkw, zzdkk zzdkk, zzcqv<zzaox, zzcsd> zzcqv) throws zzdlg {
        try {
            ((zzaox) zzcqv.f7383b).H3(zzdkk.R);
            ((zzaox) zzcqv.f7383b).d6(zzdkk.L, zzdkk.s.toString(), zzdkw.f8161a.f8149a.f8166d, ObjectWrapper.b0(this.f7484a), new qo(this, zzcqv), (zzamx) zzcqv.f7384c);
        } catch (RemoteException e2) {
            throw new zzdlg(e2);
        }
    }
}
