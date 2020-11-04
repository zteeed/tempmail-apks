package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzi;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class z10 extends zzdwm<zzdzl, zzdzi> {
    z10(zzdxh zzdxh, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void b(zzehl zzehl) throws GeneralSecurityException {
        zzdzl zzdzl = (zzdzl) zzehl;
        new zzdxi().g().b(zzdzl.G());
        new zzdyw().g().b(zzdzl.H());
        zzedv.a(zzdzl.G().G());
    }

    public final /* synthetic */ Object c(zzehl zzehl) throws GeneralSecurityException {
        zzdzl zzdzl = (zzdzl) zzehl;
        zzdzi.zza S = zzdzi.S();
        S.w(new zzdxi().g().c(zzdzl.G()));
        S.x(new zzdyw().g().c(zzdzl.H()));
        S.y(0);
        return (zzdzi) ((zzegb) S.O());
    }

    public final /* synthetic */ zzehl d(zzeer zzeer) throws zzegl {
        return zzdzl.L(zzeer, zzefo.b());
    }
}
