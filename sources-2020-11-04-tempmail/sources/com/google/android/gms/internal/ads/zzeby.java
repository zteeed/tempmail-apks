package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeby extends zzegb<zzeby, zza> implements zzehn {
    private static volatile zzehy<zzeby> zzel;
    /* access modifiers changed from: private */
    public static final zzeby zzhwe;
    private String zzhwc = "";
    private zzebi zzhwd;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeby, zza> implements zzehn {
        private zza() {
            super(zzeby.zzhwe);
        }

        /* synthetic */ zza(o40 o40) {
            this();
        }
    }

    static {
        zzeby zzeby = new zzeby();
        zzhwe = zzeby;
        zzegb.x(zzeby.class, zzeby);
    }

    private zzeby() {
    }

    public static zzeby I() {
        return zzhwe;
    }

    public static zzeby M(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeby) zzegb.m(zzhwe, zzeer, zzefo);
    }

    public final String G() {
        return this.zzhwc;
    }

    public final zzebi H() {
        zzebi zzebi = this.zzhwd;
        return zzebi == null ? zzebi.I() : zzebi;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (o40.f4707a[i - 1]) {
            case 1:
                return new zzeby();
            case 2:
                return new zza((o40) null);
            case 3:
                return zzegb.u(zzhwe, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhwc", "zzhwd"});
            case 4:
                return zzhwe;
            case 5:
                zzehy<zzeby> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeby.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhwe);
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
