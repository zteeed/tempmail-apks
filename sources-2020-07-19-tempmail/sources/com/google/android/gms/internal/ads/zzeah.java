package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeah extends zzegb<zzeah, zza> implements zzehn {
    private static volatile zzehy<zzeah> zzel;
    /* access modifiers changed from: private */
    public static final zzeah zzhtf;
    private zzebi zzhte;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeah, zza> implements zzehn {
        private zza() {
            super(zzeah.zzhtf);
        }

        /* synthetic */ zza(w30 w30) {
            this();
        }
    }

    static {
        zzeah zzeah = new zzeah();
        zzhtf = zzeah;
        zzegb.x(zzeah.class, zzeah);
    }

    private zzeah() {
    }

    public static zzeah H() {
        return zzhtf;
    }

    public final zzebi G() {
        zzebi zzebi = this.zzhte;
        return zzebi == null ? zzebi.I() : zzebi;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (w30.f5180a[i - 1]) {
            case 1:
                return new zzeah();
            case 2:
                return new zza((w30) null);
            case 3:
                return zzegb.u(zzhtf, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhte"});
            case 4:
                return zzhtf;
            case 5:
                zzehy<zzeah> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeah.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhtf);
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
