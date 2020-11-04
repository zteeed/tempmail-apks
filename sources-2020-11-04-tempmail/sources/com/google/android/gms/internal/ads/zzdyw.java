package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdyw extends zzdwj<zzeax> {
    public zzdyw() {
        super(zzeax.class, new z20(zzdwp.class));
    }

    /* access modifiers changed from: private */
    public static void j(zzebc zzebc) throws GeneralSecurityException {
        if (zzebc.G() >= 10) {
            int i = a30.f3520a[zzebc.H().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zzebc.G() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzebc.G() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzebc.G() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzebb, zzeax> g() {
        return new b30(this, zzebb.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzeax zzeax = (zzeax) zzehl;
        zzedv.b(zzeax.G(), 0);
        if (zzeax.N().size() >= 16) {
            j(zzeax.P());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzeax.U(zzeer, zzefo.b());
    }
}
