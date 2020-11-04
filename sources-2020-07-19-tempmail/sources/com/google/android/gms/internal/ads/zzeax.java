package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeax extends zzegb<zzeax, zza> implements zzehn {
    private static volatile zzehy<zzeax> zzel;
    /* access modifiers changed from: private */
    public static final zzeax zzhuk;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;
    private zzebc zzhuj;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeax, zza> implements zzehn {
        private zza() {
            super(zzeax.zzhuk);
        }

        public final zza w(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeax) this.f8567c).V(zzeer);
            return this;
        }

        public final zza x(zzebc zzebc) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeax) this.f8567c).T(zzebc);
            return this;
        }

        public final zza y(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeax) this.f8567c).H(0);
            return this;
        }

        /* synthetic */ zza(c40 c40) {
            this();
        }
    }

    static {
        zzeax zzeax = new zzeax();
        zzhuk = zzeax;
        zzegb.x(zzeax.class, zzeax);
    }

    private zzeax() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza Q() {
        return (zza) zzhuk.A();
    }

    public static zzeax R() {
        return zzhuk;
    }

    /* access modifiers changed from: private */
    public final void T(zzebc zzebc) {
        zzebc.getClass();
        this.zzhuj = zzebc;
    }

    public static zzeax U(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeax) zzegb.m(zzhuk, zzeer, zzefo);
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

    public final zzebc P() {
        zzebc zzebc = this.zzhuj;
        return zzebc == null ? zzebc.I() : zzebc;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (c40.f3517a[i - 1]) {
            case 1:
                return new zzeax();
            case 2:
                return new zza((c40) null);
            case 3:
                return zzegb.u(zzhuk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhuj", "zzhry"});
            case 4:
                return zzhuk;
            case 5:
                zzehy<zzeax> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeax.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhuk);
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
