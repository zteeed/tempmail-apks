package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebc extends zzegb<zzebc, zza> implements zzehn {
    private static volatile zzehy<zzebc> zzel;
    /* access modifiers changed from: private */
    public static final zzebc zzhun;
    private int zzhsd;
    private int zzhum;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebc, zza> implements zzehn {
        private zza() {
            super(zzebc.zzhun);
        }

        /* synthetic */ zza(f40 f40) {
            this();
        }
    }

    static {
        zzebc zzebc = new zzebc();
        zzhun = zzebc;
        zzegb.x(zzebc.class, zzebc);
    }

    private zzebc() {
    }

    public static zzebc I() {
        return zzhun;
    }

    public final int G() {
        return this.zzhsd;
    }

    public final zzeav H() {
        zzeav f2 = zzeav.f(this.zzhum);
        return f2 == null ? zzeav.UNRECOGNIZED : f2;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (f40.f3944a[i - 1]) {
            case 1:
                return new zzebc();
            case 2:
                return new zza((f40) null);
            case 3:
                return zzegb.u(zzhun, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhum", "zzhsd"});
            case 4:
                return zzhun;
            case 5:
                zzehy<zzebc> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebc.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhun);
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
