package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeax;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class b30 extends zzdwm<zzebb, zzeax> {
    b30(zzdyw zzdyw, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void b(zzehl zzehl) throws GeneralSecurityException {
        zzebb zzebb = (zzebb) zzehl;
        if (zzebb.G() >= 16) {
            zzdyw.j(zzebb.H());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ Object c(zzehl zzehl) throws GeneralSecurityException {
        zzebb zzebb = (zzebb) zzehl;
        zzeax.zza Q = zzeax.Q();
        Q.y(0);
        Q.x(zzebb.H());
        Q.w(zzeer.U(zzedu.c(zzebb.G())));
        return (zzeax) ((zzegb) Q.O());
    }

    public final /* synthetic */ zzehl d(zzeer zzeer) throws zzegl {
        return zzebb.M(zzeer, zzefo.b());
    }
}
