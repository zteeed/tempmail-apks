package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeam extends zzegb<zzeam, zza> implements zzehn {
    private static volatile zzehy<zzeam> zzel;
    /* access modifiers changed from: private */
    public static final zzeam zzhtl;
    private zzeat zzhti;
    private zzeah zzhtj;
    private int zzhtk;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeam, zza> implements zzehn {
        private zza() {
            super(zzeam.zzhtl);
        }

        /* synthetic */ zza(y30 y30) {
            this();
        }
    }

    static {
        zzeam zzeam = new zzeam();
        zzhtl = zzeam;
        zzegb.x(zzeam.class, zzeam);
    }

    private zzeam() {
    }

    public static zzeam L() {
        return zzhtl;
    }

    public final zzeat G() {
        zzeat zzeat = this.zzhti;
        return zzeat == null ? zzeat.L() : zzeat;
    }

    public final zzeah H() {
        zzeah zzeah = this.zzhtj;
        return zzeah == null ? zzeah.H() : zzeah;
    }

    public final zzeag I() {
        zzeag f2 = zzeag.f(this.zzhtk);
        return f2 == null ? zzeag.UNRECOGNIZED : f2;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (y30.f5531a[i - 1]) {
            case 1:
                return new zzeam();
            case 2:
                return new zza((y30) null);
            case 3:
                return zzegb.u(zzhtl, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhti", "zzhtj", "zzhtk"});
            case 4:
                return zzhtl;
            case 5:
                zzehy<zzeam> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeam.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhtl);
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
