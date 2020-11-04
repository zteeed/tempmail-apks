package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebb extends zzegb<zzebb, zza> implements zzehn {
    private static volatile zzehy<zzebb> zzel;
    /* access modifiers changed from: private */
    public static final zzebb zzhul;
    private int zzhrx;
    private int zzhsb;
    private zzebc zzhuj;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebb, zza> implements zzehn {
        private zza() {
            super(zzebb.zzhul);
        }

        /* synthetic */ zza(e40 e40) {
            this();
        }
    }

    static {
        zzebb zzebb = new zzebb();
        zzhul = zzebb;
        zzegb.x(zzebb.class, zzebb);
    }

    private zzebb() {
    }

    public static zzebb I() {
        return zzhul;
    }

    public static zzebb M(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzebb) zzegb.m(zzhul, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhsb;
    }

    public final zzebc H() {
        zzebc zzebc = this.zzhuj;
        return zzebc == null ? zzebc.I() : zzebc;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (e40.f3863a[i - 1]) {
            case 1:
                return new zzebb();
            case 2:
                return new zza((e40) null);
            case 3:
                return zzegb.u(zzhul, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhuj", "zzhsb", "zzhrx"});
            case 4:
                return zzhul;
            case 5:
                zzehy<zzebb> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebb.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhul);
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
