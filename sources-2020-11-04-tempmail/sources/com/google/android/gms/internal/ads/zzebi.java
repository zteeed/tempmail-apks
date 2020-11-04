package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebi extends zzegb<zzebi, zza> implements zzehn {
    private static volatile zzehy<zzebi> zzel;
    /* access modifiers changed from: private */
    public static final zzebi zzhvg;
    private String zzhuo = "";
    private zzeer zzhup = zzeer.f8716c;
    private int zzhvf;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebi, zza> implements zzehn {
        private zza() {
            super(zzebi.zzhvg);
        }

        /* synthetic */ zza(h40 h40) {
            this();
        }
    }

    static {
        zzebi zzebi = new zzebi();
        zzhvg = zzebi;
        zzegb.x(zzebi.class, zzebi);
    }

    private zzebi() {
    }

    public static zzebi I() {
        return zzhvg;
    }

    public final String G() {
        return this.zzhuo;
    }

    public final zzeer H() {
        return this.zzhup;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (h40.f4118a[i - 1]) {
            case 1:
                return new zzebi();
            case 2:
                return new zza((h40) null);
            case 3:
                return zzegb.u(zzhvg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhuo", "zzhup", "zzhvf"});
            case 4:
                return zzhvg;
            case 5:
                zzehy<zzebi> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebi.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhvg);
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
