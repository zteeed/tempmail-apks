package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzq extends zzegb<zzdzq, zza> implements zzehn {
    private static volatile zzehy<zzdzq> zzel;
    /* access modifiers changed from: private */
    public static final zzdzq zzhsp;
    private int zzhso;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzq, zza> implements zzehn {
        private zza() {
            super(zzdzq.zzhsp);
        }

        /* synthetic */ zza(m30 m30) {
            this();
        }
    }

    static {
        zzdzq zzdzq = new zzdzq();
        zzhsp = zzdzq;
        zzegb.x(zzdzq.class, zzdzq);
    }

    private zzdzq() {
    }

    public static zzdzq H() {
        return zzhsp;
    }

    public final int G() {
        return this.zzhso;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (m30.f4343a[i - 1]) {
            case 1:
                return new zzdzq();
            case 2:
                return new zza((m30) null);
            case 3:
                return zzegb.u(zzhsp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhso"});
            case 4:
                return zzhsp;
            case 5:
                zzehy<zzdzq> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzq.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsp);
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
