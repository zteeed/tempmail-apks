package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzh extends zzegb<zzdzh, zza> implements zzehn {
    private static volatile zzehy<zzdzh> zzel;
    /* access modifiers changed from: private */
    public static final zzdzh zzhse;
    private int zzhsd;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzh, zza> implements zzehn {
        private zza() {
            super(zzdzh.zzhse);
        }

        /* synthetic */ zza(h30 h30) {
            this();
        }
    }

    static {
        zzdzh zzdzh = new zzdzh();
        zzhse = zzdzh;
        zzegb.x(zzdzh.class, zzdzh);
    }

    private zzdzh() {
    }

    public static zzdzh H() {
        return zzhse;
    }

    public final int G() {
        return this.zzhsd;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (h30.f4116a[i - 1]) {
            case 1:
                return new zzdzh();
            case 2:
                return new zza((h30) null);
            case 3:
                return zzegb.u(zzhse, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhsd"});
            case 4:
                return zzhse;
            case 5:
                zzehy<zzdzh> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzh.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhse);
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
