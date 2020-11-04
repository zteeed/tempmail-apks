package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzd extends zzegb<zzdzd, zza> implements zzehn {
    private static volatile zzehy<zzdzd> zzel;
    /* access modifiers changed from: private */
    public static final zzdzd zzhsa;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;
    private zzdzh zzhrz;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzd, zza> implements zzehn {
        private zza() {
            super(zzdzd.zzhsa);
        }

        public final zza w(zzdzh zzdzh) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzd) this.f8567c).T(zzdzh);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzd) this.f8567c).H(0);
            return this;
        }

        public final zza y(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzd) this.f8567c).U(zzeer);
            return this;
        }

        /* synthetic */ zza(f30 f30) {
            this();
        }
    }

    static {
        zzdzd zzdzd = new zzdzd();
        zzhsa = zzdzd;
        zzegb.x(zzdzd.class, zzdzd);
    }

    private zzdzd() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza Q() {
        return (zza) zzhsa.A();
    }

    public static zzdzd S(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzd) zzegb.m(zzhsa, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void T(zzdzh zzdzh) {
        zzdzh.getClass();
        this.zzhrz = zzdzh;
    }

    /* access modifiers changed from: private */
    public final void U(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer N() {
        return this.zzhry;
    }

    public final zzdzh P() {
        zzdzh zzdzh = this.zzhrz;
        return zzdzh == null ? zzdzh.H() : zzdzh;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (f30.f3758a[i - 1]) {
            case 1:
                return new zzdzd();
            case 2:
                return new zza((f30) null);
            case 3:
                return zzegb.u(zzhsa, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhrx", "zzhry", "zzhrz"});
            case 4:
                return zzhsa;
            case 5:
                zzehy<zzdzd> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzd.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsa);
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
