package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzl extends zzegb<zzdzl, zza> implements zzehn {
    private static volatile zzehy<zzdzl> zzel;
    /* access modifiers changed from: private */
    public static final zzdzl zzhsk;
    private zzdzp zzhsi;
    private zzebb zzhsj;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzl, zza> implements zzehn {
        private zza() {
            super(zzdzl.zzhsk);
        }

        /* synthetic */ zza(j30 j30) {
            this();
        }
    }

    static {
        zzdzl zzdzl = new zzdzl();
        zzhsk = zzdzl;
        zzegb.x(zzdzl.class, zzdzl);
    }

    private zzdzl() {
    }

    public static zzdzl L(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzl) zzegb.m(zzhsk, zzeer, zzefo);
    }

    public final zzdzp G() {
        zzdzp zzdzp = this.zzhsi;
        return zzdzp == null ? zzdzp.I() : zzdzp;
    }

    public final zzebb H() {
        zzebb zzebb = this.zzhsj;
        return zzebb == null ? zzebb.I() : zzebb;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (j30.f4279a[i - 1]) {
            case 1:
                return new zzdzl();
            case 2:
                return new zza((j30) null);
            case 3:
                return zzegb.u(zzhsk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhsi", "zzhsj"});
            case 4:
                return zzhsk;
            case 5:
                zzehy<zzdzl> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzl.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsk);
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
