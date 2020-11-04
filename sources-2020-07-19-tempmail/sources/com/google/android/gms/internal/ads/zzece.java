package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzece extends zzegb<zzece, zza> implements zzehn {
    private static volatile zzehy<zzece> zzel;
    /* access modifiers changed from: private */
    public static final zzece zzhwp;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8533c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzece, zza> implements zzehn {
        private zza() {
            super(zzece.zzhwp);
        }

        public final zza w(zzeer zzeer) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzece) this.f8567c).Q(zzeer);
            return this;
        }

        public final zza x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzece) this.f8567c).H(0);
            return this;
        }

        /* synthetic */ zza(r40 r40) {
            this();
        }
    }

    static {
        zzece zzece = new zzece();
        zzhwp = zzece;
        zzegb.x(zzece.class, zzece);
    }

    private zzece() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza N() {
        return (zza) zzhwp.A();
    }

    /* access modifiers changed from: private */
    public final void Q(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public static zzece R(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzece) zzegb.m(zzhwp, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer M() {
        return this.zzhry;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (r40.f4782a[i - 1]) {
            case 1:
                return new zzece();
            case 2:
                return new zza((r40) null);
            case 3:
                return zzegb.u(zzhwp, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhwp;
            case 5:
                zzehy<zzece> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzece.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhwp);
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
