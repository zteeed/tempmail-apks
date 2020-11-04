package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebv extends zzegb<zzebv, zza> implements zzehn {
    private static volatile zzehy<zzebv> zzel;
    /* access modifiers changed from: private */
    public static final zzebv zzhwb;
    private int zzhrx;
    private zzeby zzhwa;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebv, zza> implements zzehn {
        private zza() {
            super(zzebv.zzhwb);
        }

        public final zza w(zzeby zzeby) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebv) this.f8567c).M(zzeby);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebv) this.f8567c).H(0);
            return this;
        }

        /* synthetic */ zza(n40 n40) {
            this();
        }
    }

    static {
        zzebv zzebv = new zzebv();
        zzhwb = zzebv;
        zzegb.x(zzebv.class, zzebv);
    }

    private zzebv() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void M(zzeby zzeby) {
        zzeby.getClass();
        this.zzhwa = zzeby;
    }

    public static zza P() {
        return (zza) zzhwb.A();
    }

    public static zzebv R(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzebv) zzegb.m(zzhwb, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeby N() {
        zzeby zzeby = this.zzhwa;
        return zzeby == null ? zzeby.I() : zzeby;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (n40.f4448a[i - 1]) {
            case 1:
                return new zzebv();
            case 2:
                return new zza((n40) null);
            case 3:
                return zzegb.u(zzhwb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhrx", "zzhwa"});
            case 4:
                return zzhwb;
            case 5:
                zzehy<zzebv> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebv.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhwb);
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
