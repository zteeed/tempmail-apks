package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzt extends zzegb<zzdzt, zza> implements zzehn {
    private static volatile zzehy<zzdzt> zzel;
    /* access modifiers changed from: private */
    public static final zzdzt zzhsr;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;
    private zzdzx zzhsq;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzt, zza> implements zzehn {
        private zza() {
            super(zzdzt.zzhsr);
        }

        public final zza w(zzdzx zzdzx) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzt) this.f8567c).N(zzdzx);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzt) this.f8567c).H(0);
            return this;
        }

        public final zza y(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzt) this.f8567c).U(zzeer);
            return this;
        }

        /* synthetic */ zza(n30 n30) {
            this();
        }
    }

    static {
        zzdzt zzdzt = new zzdzt();
        zzhsr = zzdzt;
        zzegb.x(zzdzt.class, zzdzt);
    }

    private zzdzt() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void N(zzdzx zzdzx) {
        zzdzx.getClass();
        this.zzhsq = zzdzx;
    }

    public static zza R() {
        return (zza) zzhsr.A();
    }

    public static zzdzt T(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzt) zzegb.m(zzhsr, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void U(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer P() {
        return this.zzhry;
    }

    public final zzdzx Q() {
        zzdzx zzdzx = this.zzhsq;
        return zzdzx == null ? zzdzx.H() : zzdzx;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (n30.f4445a[i - 1]) {
            case 1:
                return new zzdzt();
            case 2:
                return new zza((n30) null);
            case 3:
                return zzegb.u(zzhsr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhsq", "zzhry"});
            case 4:
                return zzhsr;
            case 5:
                zzehy<zzdzt> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzt.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsr);
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
