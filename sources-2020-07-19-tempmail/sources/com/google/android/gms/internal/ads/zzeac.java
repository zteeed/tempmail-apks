package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeac extends zzegb<zzeac, zza> implements zzehn {
    private static volatile zzehy<zzeac> zzel;
    /* access modifiers changed from: private */
    public static final zzeac zzhsw;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeac, zza> implements zzehn {
        private zza() {
            super(zzeac.zzhsw);
        }

        public final zza w(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeac) this.f8567c).H(0);
            return this;
        }

        public final zza x(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeac) this.f8567c).R(zzeer);
            return this;
        }

        /* synthetic */ zza(u30 u30) {
            this();
        }
    }

    static {
        zzeac zzeac = new zzeac();
        zzhsw = zzeac;
        zzegb.x(zzeac.class, zzeac);
    }

    private zzeac() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza N() {
        return (zza) zzhsw.A();
    }

    public static zzeac Q(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeac) zzegb.m(zzhsw, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void R(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer M() {
        return this.zzhry;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (u30.f5033a[i - 1]) {
            case 1:
                return new zzeac();
            case 2:
                return new zza((u30) null);
            case 3:
                return zzegb.u(zzhsw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhsw;
            case 5:
                zzehy<zzeac> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeac.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsw);
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
