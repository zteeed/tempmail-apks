package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzm extends zzegb<zzdzm, zza> implements zzehn {
    private static volatile zzehy<zzdzm> zzel;
    /* access modifiers changed from: private */
    public static final zzdzm zzhsm;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;
    private zzdzq zzhsl;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzm, zza> implements zzehn {
        private zza() {
            super(zzdzm.zzhsm);
        }

        public final zza w(zzdzq zzdzq) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzm) this.f8567c).T(zzdzq);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzm) this.f8567c).H(0);
            return this;
        }

        public final zza y(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzm) this.f8567c).V(zzeer);
            return this;
        }

        /* synthetic */ zza(k30 k30) {
            this();
        }
    }

    static {
        zzdzm zzdzm = new zzdzm();
        zzhsm = zzdzm;
        zzegb.x(zzdzm.class, zzdzm);
    }

    private zzdzm() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza Q() {
        return (zza) zzhsm.A();
    }

    public static zzdzm R() {
        return zzhsm;
    }

    /* access modifiers changed from: private */
    public final void T(zzdzq zzdzq) {
        zzdzq.getClass();
        this.zzhsl = zzdzq;
    }

    public static zzdzm U(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzm) zzegb.m(zzhsm, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void V(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer N() {
        return this.zzhry;
    }

    public final zzdzq P() {
        zzdzq zzdzq = this.zzhsl;
        return zzdzq == null ? zzdzq.H() : zzdzq;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (k30.f4176a[i - 1]) {
            case 1:
                return new zzdzm();
            case 2:
                return new zza((k30) null);
            case 3:
                return zzegb.u(zzhsm, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhsl", "zzhry"});
            case 4:
                return zzhsm;
            case 5:
                zzehy<zzdzm> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzm.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsm);
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
