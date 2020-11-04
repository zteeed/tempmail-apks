package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeaq extends zzegb<zzeaq, zza> implements zzehn {
    private static volatile zzehy<zzeaq> zzel;
    /* access modifiers changed from: private */
    public static final zzeaq zzhtq;
    private int zzhrx;
    private zzeam zzhtg;
    private zzeer zzhto;
    private zzeer zzhtp;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzeaq, zza> implements zzehn {
        private zza() {
            super(zzeaq.zzhtq);
        }

        public final zza w(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeaq) this.f8567c).X(zzeer);
            return this;
        }

        public final zza x(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeaq) this.f8567c).Y(zzeer);
            return this;
        }

        public final zza y(zzeam zzeam) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeaq) this.f8567c).R(zzeam);
            return this;
        }

        public final zza z(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzeaq) this.f8567c).H(0);
            return this;
        }

        /* synthetic */ zza(a40 a40) {
            this();
        }
    }

    static {
        zzeaq zzeaq = new zzeaq();
        zzhtq = zzeaq;
        zzegb.x(zzeaq.class, zzeaq);
    }

    private zzeaq() {
        zzeer zzeer = zzeer.f8533c;
        this.zzhto = zzeer;
        this.zzhtp = zzeer;
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void R(zzeam zzeam) {
        zzeam.getClass();
        this.zzhtg = zzeam;
    }

    public static zza T() {
        return (zza) zzhtq.A();
    }

    public static zzeaq U() {
        return zzhtq;
    }

    public static zzeaq W(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzeaq) zzegb.m(zzhtq, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void X(zzeer zzeer) {
        zzeer.getClass();
        this.zzhto = zzeer;
    }

    /* access modifiers changed from: private */
    public final void Y(zzeer zzeer) {
        zzeer.getClass();
        this.zzhtp = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeam N() {
        zzeam zzeam = this.zzhtg;
        return zzeam == null ? zzeam.L() : zzeam;
    }

    public final zzeer P() {
        return this.zzhto;
    }

    public final zzeer Q() {
        return this.zzhtp;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (a40.f3339a[i - 1]) {
            case 1:
                return new zzeaq();
            case 2:
                return new zza((a40) null);
            case 3:
                return zzegb.u(zzhtq, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhrx", "zzhtg", "zzhto", "zzhtp"});
            case 4:
                return zzhtq;
            case 5:
                zzehy<zzeaq> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzeaq.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhtq);
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
