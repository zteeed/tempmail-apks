package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebr extends zzegb<zzebr, zza> implements zzehn {
    private static volatile zzehy<zzebr> zzel;
    /* access modifiers changed from: private */
    public static final zzebr zzhvx;
    private int zzhrx;
    private zzebu zzhvw;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebr, zza> implements zzehn {
        private zza() {
            super(zzebr.zzhvx);
        }

        public final zza w(zzebu zzebu) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebr) this.f8567c).M(zzebu);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebr) this.f8567c).H(0);
            return this;
        }

        /* synthetic */ zza(l40 l40) {
            this();
        }
    }

    static {
        zzebr zzebr = new zzebr();
        zzhvx = zzebr;
        zzegb.x(zzebr.class, zzebr);
    }

    private zzebr() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void M(zzebu zzebu) {
        zzebu.getClass();
        this.zzhvw = zzebu;
    }

    public static zza P() {
        return (zza) zzhvx.A();
    }

    public static zzebr R(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzebr) zzegb.m(zzhvx, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzebu N() {
        zzebu zzebu = this.zzhvw;
        return zzebu == null ? zzebu.H() : zzebu;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (l40.f4260a[i - 1]) {
            case 1:
                return new zzebr();
            case 2:
                return new zza((l40) null);
            case 3:
                return zzegb.u(zzhvx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhrx", "zzhvw"});
            case 4:
                return zzhvx;
            case 5:
                zzehy<zzebr> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebr.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhvx);
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
