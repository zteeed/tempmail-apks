package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebn extends zzegb<zzebn, zza> implements zzehn {
    private static volatile zzehy<zzebn> zzel;
    /* access modifiers changed from: private */
    public static final zzebn zzhvo;
    private int zzhvm;
    private zzegm<zzb> zzhvn = zzegb.E();

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzebn, zza> implements zzehn {
        private zza() {
            super(zzebn.zzhvo);
        }

        /* synthetic */ zza(j40 j40) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzb extends zzegb<zzb, zza> implements zzehn {
        private static volatile zzehy<zzb> zzel;
        /* access modifiers changed from: private */
        public static final zzb zzhvs;
        private int zzhvf;
        private zzebf zzhvp;
        private int zzhvq;
        private int zzhvr;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzb, zza> implements zzehn {
            private zza() {
                super(zzb.zzhvs);
            }

            /* synthetic */ zza(j40 j40) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzhvs = zzb;
            zzegb.x(zzb.class, zzb);
        }

        private zzb() {
        }

        public final zzebg G() {
            zzebg f2 = zzebg.f(this.zzhvq);
            return f2 == null ? zzebg.UNRECOGNIZED : f2;
        }

        public final zzebz H() {
            zzebz f2 = zzebz.f(this.zzhvf);
            return f2 == null ? zzebz.UNRECOGNIZED : f2;
        }

        public final boolean I() {
            return this.zzhvp != null;
        }

        public final zzebf L() {
            zzebf zzebf = this.zzhvp;
            return zzebf == null ? zzebf.S() : zzebf;
        }

        public final int M() {
            return this.zzhvr;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (j40.f4100a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((j40) null);
                case 3:
                    return zzegb.u(zzhvs, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhvp", "zzhvq", "zzhvr", "zzhvf"});
                case 4:
                    return zzhvs;
                case 5:
                    zzehy<zzb> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzb.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzhvs);
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

    static {
        zzebn zzebn = new zzebn();
        zzhvo = zzebn;
        zzegb.x(zzebn.class, zzebn);
    }

    private zzebn() {
    }

    public static zzebn M(byte[] bArr, zzefo zzefo) throws zzegl {
        return (zzebn) zzegb.q(zzhvo, bArr, zzefo);
    }

    public final int G() {
        return this.zzhvm;
    }

    public final List<zzb> H() {
        return this.zzhvn;
    }

    public final int I() {
        return this.zzhvn.size();
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (j40.f4100a[i - 1]) {
            case 1:
                return new zzebn();
            case 2:
                return new zza((j40) null);
            case 3:
                return zzegb.u(zzhvo, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhvm", "zzhvn", zzb.class});
            case 4:
                return zzhvo;
            case 5:
                zzehy<zzebn> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebn.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhvo);
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
