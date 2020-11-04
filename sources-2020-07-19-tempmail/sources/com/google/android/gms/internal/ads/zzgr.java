package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzgr extends zzegb<zzgr, zza> implements zzehn {
    /* access modifiers changed from: private */
    public static final zzgr zzacg;
    private static volatile zzehy<zzgr> zzel;
    private String zzacb = "";
    private String zzacc = "";
    private long zzacd;
    private long zzace;
    private long zzacf;
    private int zzdw;

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzgr, zza> implements zzehn {
        private zza() {
            super(zzgr.zzacg);
        }

        public final zza C(long j) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzgr) this.f8567c).U(j);
            return this;
        }

        public final zza w(String str) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzgr) this.f8567c).I(str);
            return this;
        }

        public final zza x(String str) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzgr) this.f8567c).L(str);
            return this;
        }

        public final zza y(long j) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzgr) this.f8567c).Q(j);
            return this;
        }

        public final zza z(long j) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzgr) this.f8567c).S(j);
            return this;
        }

        /* synthetic */ zza(oa0 oa0) {
            this();
        }
    }

    static {
        zzgr zzgr = new zzgr();
        zzacg = zzgr;
        zzegb.x(zzgr.class, zzgr);
    }

    private zzgr() {
    }

    /* access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzacb = str;
    }

    /* access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzacc = str;
    }

    /* access modifiers changed from: private */
    public final void Q(long j) {
        this.zzdw |= 4;
        this.zzacd = j;
    }

    /* access modifiers changed from: private */
    public final void S(long j) {
        this.zzdw |= 8;
        this.zzace = j;
    }

    /* access modifiers changed from: private */
    public final void U(long j) {
        this.zzdw |= 16;
        this.zzacf = j;
    }

    public static zza Y() {
        return (zza) zzacg.A();
    }

    public static zzgr Z() {
        return zzacg;
    }

    public static zzgr b0(zzeer zzeer) throws zzegl {
        return (zzgr) zzegb.l(zzacg, zzeer);
    }

    public final String R() {
        return this.zzacb;
    }

    public final String T() {
        return this.zzacc;
    }

    public final long V() {
        return this.zzacd;
    }

    public final long W() {
        return this.zzace;
    }

    public final long X() {
        return this.zzacf;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (oa0.f4540a[i - 1]) {
            case 1:
                return new zzgr();
            case 2:
                return new zza((oa0) null);
            case 3:
                return zzegb.u(zzacg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdw", "zzacb", "zzacc", "zzacd", "zzace", "zzacf"});
            case 4:
                return zzacg;
            case 5:
                zzehy<zzgr> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzgr.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzacg);
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
