package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzgq extends zzegb<zzgq, zza> implements zzehn {
    /* access modifiers changed from: private */
    public static final zzgq zzaca;
    private static volatile zzehy<zzgq> zzel;
    private zzgr zzabx;
    private zzeer zzaby;
    private zzeer zzabz;
    private int zzdw;

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzgq, zza> implements zzehn {
        private zza() {
            super(zzgq.zzaca);
        }

        /* synthetic */ zza(na0 na0) {
            this();
        }
    }

    static {
        zzgq zzgq = new zzgq();
        zzaca = zzgq;
        zzegb.x(zzgq.class, zzgq);
    }

    private zzgq() {
        zzeer zzeer = zzeer.f8716c;
        this.zzaby = zzeer;
        this.zzabz = zzeer;
    }

    public static zzgq G(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzgq) zzegb.m(zzaca, zzeer, zzefo);
    }

    public final zzgr H() {
        zzgr zzgr = this.zzabx;
        return zzgr == null ? zzgr.Z() : zzgr;
    }

    public final zzeer I() {
        return this.zzaby;
    }

    public final zzeer L() {
        return this.zzabz;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (na0.f4647a[i - 1]) {
            case 1:
                return new zzgq();
            case 2:
                return new zza((na0) null);
            case 3:
                return zzegb.u(zzaca, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzabx", "zzaby", "zzabz"});
            case 4:
                return zzaca;
            case 5:
                zzehy<zzgq> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzgq.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzaca);
                            zzel = zzehy;
                        }
                    }
                }
                return zzehy;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
