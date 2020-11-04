package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzp extends zzegb<zzdzp, zza> implements zzehn {
    private static volatile zzehy<zzdzp> zzel;
    /* access modifiers changed from: private */
    public static final zzdzp zzhsn;
    private int zzhsb;
    private zzdzq zzhsl;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzp, zza> implements zzehn {
        private zza() {
            super(zzdzp.zzhsn);
        }

        /* synthetic */ zza(l30 l30) {
            this();
        }
    }

    static {
        zzdzp zzdzp = new zzdzp();
        zzhsn = zzdzp;
        zzegb.x(zzdzp.class, zzdzp);
    }

    private zzdzp() {
    }

    public static zzdzp I() {
        return zzhsn;
    }

    public static zzdzp M(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzp) zzegb.m(zzhsn, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhsb;
    }

    public final zzdzq H() {
        zzdzq zzdzq = this.zzhsl;
        return zzdzq == null ? zzdzq.H() : zzdzq;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (l30.f4441a[i - 1]) {
            case 1:
                return new zzdzp();
            case 2:
                return new zza((l30) null);
            case 3:
                return zzegb.u(zzhsn, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhsl", "zzhsb"});
            case 4:
                return zzhsn;
            case 5:
                zzehy<zzdzp> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzp.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsn);
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
