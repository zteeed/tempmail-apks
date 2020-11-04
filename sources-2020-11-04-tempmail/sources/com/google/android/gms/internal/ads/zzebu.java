package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebu extends zzegb<zzebu, zza> implements zzehn {
    private static volatile zzehy<zzebu> zzel;
    /* access modifiers changed from: private */
    public static final zzebu zzhvz;
    private String zzhvy = "";

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebu, zza> implements zzehn {
        private zza() {
            super(zzebu.zzhvz);
        }

        /* synthetic */ zza(m40 m40) {
            this();
        }
    }

    static {
        zzebu zzebu = new zzebu();
        zzhvz = zzebu;
        zzegb.x(zzebu.class, zzebu);
    }

    private zzebu() {
    }

    public static zzebu H() {
        return zzhvz;
    }

    public static zzebu L(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzebu) zzegb.m(zzhvz, zzeer, zzefo);
    }

    public final String G() {
        return this.zzhvy;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (m40.f4528a[i - 1]) {
            case 1:
                return new zzebu();
            case 2:
                return new zza((m40) null);
            case 3:
                return zzegb.u(zzhvz, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhvy"});
            case 4:
                return zzhvz;
            case 5:
                zzehy<zzebu> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebu.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhvz);
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
