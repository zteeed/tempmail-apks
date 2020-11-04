package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeal extends zzegb<zzeal, zza> implements zzehn {
    private static volatile zzehy<zzeal> zzel;
    /* access modifiers changed from: private */
    public static final zzeal zzhth;
    private zzeam zzhtg;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeal, zza> implements zzehn {
        private zza() {
            super(zzeal.zzhth);
        }

        /* synthetic */ zza(x30 x30) {
            this();
        }
    }

    static {
        zzeal zzeal = new zzeal();
        zzhth = zzeal;
        zzegb.x(zzeal.class, zzeal);
    }

    private zzeal() {
    }

    public static zzeal I(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeal) zzegb.m(zzhth, zzeer, zzefo);
    }

    public final zzeam G() {
        zzeam zzeam = this.zzhtg;
        return zzeam == null ? zzeam.L() : zzeam;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (x30.f5461a[i - 1]) {
            case 1:
                return new zzeal();
            case 2:
                return new zza((x30) null);
            case 3:
                return zzegb.u(zzhth, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhtg"});
            case 4:
                return zzhth;
            case 5:
                zzehy<zzeal> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeal.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhth);
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
