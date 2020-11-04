package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzi extends zzegb<zzdzi, zza> implements zzehn {
    private static volatile zzehy<zzdzi> zzel;
    /* access modifiers changed from: private */
    public static final zzdzi zzhsh;
    private int zzhrx;
    private zzdzm zzhsf;
    private zzeax zzhsg;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzi, zza> implements zzehn {
        private zza() {
            super(zzdzi.zzhsh);
        }

        public final zza w(zzdzm zzdzm) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzi) this.f8567c).N(zzdzm);
            return this;
        }

        public final zza x(zzeax zzeax) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzi) this.f8567c).P(zzeax);
            return this;
        }

        public final zza y(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdzi) this.f8567c).H(i);
            return this;
        }

        /* synthetic */ zza(i30 i30) {
            this();
        }
    }

    static {
        zzdzi zzdzi = new zzdzi();
        zzhsh = zzdzi;
        zzegb.x(zzdzi.class, zzdzi);
    }

    private zzdzi() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    /* access modifiers changed from: private */
    public final void N(zzdzm zzdzm) {
        zzdzm.getClass();
        this.zzhsf = zzdzm;
    }

    /* access modifiers changed from: private */
    public final void P(zzeax zzeax) {
        zzeax.getClass();
        this.zzhsg = zzeax;
    }

    public static zza S() {
        return (zza) zzhsh.A();
    }

    public static zzdzi U(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzi) zzegb.m(zzhsh, zzeer, zzefo);
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzdzm Q() {
        zzdzm zzdzm = this.zzhsf;
        return zzdzm == null ? zzdzm.R() : zzdzm;
    }

    public final zzeax R() {
        zzeax zzeax = this.zzhsg;
        return zzeax == null ? zzeax.R() : zzeax;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (i30.f4014a[i - 1]) {
            case 1:
                return new zzdzi();
            case 2:
                return new zza((i30) null);
            case 3:
                return zzegb.u(zzhsh, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhrx", "zzhsf", "zzhsg"});
            case 4:
                return zzhsh;
            case 5:
                zzehy<zzdzi> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzi.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsh);
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
