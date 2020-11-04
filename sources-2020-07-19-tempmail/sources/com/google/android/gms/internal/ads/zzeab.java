package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeab extends zzegb<zzeab, zza> implements zzehn {
    private static volatile zzehy<zzeab> zzel;
    /* access modifiers changed from: private */
    public static final zzeab zzhsv;
    private int zzhrx;
    private int zzhsb;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeab, zza> implements zzehn {
        private zza() {
            super(zzeab.zzhsv);
        }

        /* synthetic */ zza(t30 t30) {
            this();
        }
    }

    static {
        zzeab zzeab = new zzeab();
        zzhsv = zzeab;
        zzegb.x(zzeab.class, zzeab);
    }

    private zzeab() {
    }

    public static zzeab I(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeab) zzegb.m(zzhsv, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhsb;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (t30.f4949a[i - 1]) {
            case 1:
                return new zzeab();
            case 2:
                return new zza((t30) null);
            case 3:
                return zzegb.u(zzhsv, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhsb", "zzhrx"});
            case 4:
                return zzhsv;
            case 5:
                zzehy<zzeab> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeab.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsv);
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
