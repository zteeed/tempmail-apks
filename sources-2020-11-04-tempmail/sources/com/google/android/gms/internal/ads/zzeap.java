package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeap extends zzegb<zzeap, zza> implements zzehn {
    private static volatile zzehy<zzeap> zzel;
    /* access modifiers changed from: private */
    public static final zzeap zzhtn;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8716c;
    private zzeaq zzhtm;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeap, zza> implements zzehn {
        private zza() {
            super(zzeap.zzhtn);
        }

        public final zza w(zzeer zzeer) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzeap) this.f8750c).U(zzeer);
            return this;
        }

        public final zza x(zzeaq zzeaq) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzeap) this.f8750c).N(zzeaq);
            return this;
        }

        public final zza y(int i) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzeap) this.f8750c).H(0);
            return this;
        }

        /* synthetic */ zza(z30 z30) {
            this();
        }
    }

    static {
        zzeap zzeap = new zzeap();
        zzhtn = zzeap;
        zzegb.x(zzeap.class, zzeap);
    }

    private zzeap() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void N(zzeaq zzeaq) {
        zzeaq.getClass();
        this.zzhtm = zzeaq;
    }

    public static zza R() {
        return (zza) zzhtn.A();
    }

    public static zzeap T(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeap) zzegb.m(zzhtn, zzeer, zzefo);
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

    public final zzeaq Q() {
        zzeaq zzeaq = this.zzhtm;
        return zzeaq == null ? zzeaq.U() : zzeaq;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (z30.f5616a[i - 1]) {
            case 1:
                return new zzeap();
            case 2:
                return new zza((z30) null);
            case 3:
                return zzegb.u(zzhtn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhrx", "zzhtm", "zzhry"});
            case 4:
                return zzhtn;
            case 5:
                zzehy<zzeap> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeap.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhtn);
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
