package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeat extends zzegb<zzeat, zza> implements zzehn {
    private static volatile zzehy<zzeat> zzel;
    /* access modifiers changed from: private */
    public static final zzeat zzhtu;
    private int zzhtr;
    private int zzhts;
    private zzeer zzhtt = zzeer.f8533c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeat, zza> implements zzehn {
        private zza() {
            super(zzeat.zzhtu);
        }

        /* synthetic */ zza(b40 b40) {
            this();
        }
    }

    static {
        zzeat zzeat = new zzeat();
        zzhtu = zzeat;
        zzegb.x(zzeat.class, zzeat);
    }

    private zzeat() {
    }

    public static zzeat L() {
        return zzhtu;
    }

    public final zzeau G() {
        zzeau f2 = zzeau.f(this.zzhtr);
        return f2 == null ? zzeau.UNRECOGNIZED : f2;
    }

    public final zzeav H() {
        zzeav f2 = zzeav.f(this.zzhts);
        return f2 == null ? zzeav.UNRECOGNIZED : f2;
    }

    public final zzeer I() {
        return this.zzhtt;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (b40.f3417a[i - 1]) {
            case 1:
                return new zzeat();
            case 2:
                return new zza((b40) null);
            case 3:
                return zzegb.u(zzhtu, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhtr", "zzhts", "zzhtt"});
            case 4:
                return zzhtu;
            case 5:
                zzehy<zzeat> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeat.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhtu);
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
