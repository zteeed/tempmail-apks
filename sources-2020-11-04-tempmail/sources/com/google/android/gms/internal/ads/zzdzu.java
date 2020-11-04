package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzu extends zzegb<zzdzu, zza> implements zzehn {
    private static volatile zzehy<zzdzu> zzel;
    /* access modifiers changed from: private */
    public static final zzdzu zzhss;
    private int zzhsb;
    private zzdzx zzhsq;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzu, zza> implements zzehn {
        private zza() {
            super(zzdzu.zzhss);
        }

        /* synthetic */ zza(o30 o30) {
            this();
        }
    }

    static {
        zzdzu zzdzu = new zzdzu();
        zzhss = zzdzu;
        zzegb.x(zzdzu.class, zzdzu);
    }

    private zzdzu() {
    }

    public static zzdzu L(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzu) zzegb.m(zzhss, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhsb;
    }

    public final zzdzx H() {
        zzdzx zzdzx = this.zzhsq;
        return zzdzx == null ? zzdzx.H() : zzdzx;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (o30.f4705a[i - 1]) {
            case 1:
                return new zzdzu();
            case 2:
                return new zza((o30) null);
            case 3:
                return zzegb.u(zzhss, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhsq", "zzhsb"});
            case 4:
                return zzhss;
            case 5:
                zzehy<zzdzu> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzu.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhss);
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
