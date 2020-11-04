package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzby {

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zza extends zzegb<zza, C0072zza> implements zzehn {
        private static volatile zzehy<zza> zzel;
        /* access modifiers changed from: private */
        public static final zza zzex;
        private int zzdw;
        private zzb zzev;
        private zzc zzew;

        /* renamed from: com.google.android.gms.internal.ads.zzby$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
        public static final class C0072zza extends zzegb.zzb<zza, C0072zza> implements zzehn {
            private C0072zza() {
                super(zza.zzex);
            }

            /* synthetic */ C0072zza(og ogVar) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzex = zza;
            zzegb.x(zza.class, zza);
        }

        private zza() {
        }

        public final boolean G() {
            return (this.zzdw & 2) != 0;
        }

        public final zzc H() {
            zzc zzc = this.zzew;
            return zzc == null ? zzc.H() : zzc;
        }

        public final boolean L() {
            return (this.zzdw & 1) != 0;
        }

        public final zzb M() {
            zzb zzb = this.zzev;
            return zzb == null ? zzb.H() : zzb;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (og.f4739a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0072zza((og) null);
                case 3:
                    return zzegb.u(zzex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzev", "zzew"});
                case 4:
                    return zzex;
                case 5:
                    zzehy<zza> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zza.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzex);
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

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zzb extends zzegb<zzb, zza> implements zzehn {
        private static volatile zzehy<zzb> zzel;
        /* access modifiers changed from: private */
        public static final zzb zzez;
        private int zzdw;
        private int zzey = 2;

        /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzb, zza> implements zzehn {
            private zza() {
                super(zzb.zzez);
            }

            /* synthetic */ zza(og ogVar) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzez = zzb;
            zzegb.x(zzb.class, zzb);
        }

        private zzb() {
        }

        public static zzb H() {
            return zzez;
        }

        public final zzcb G() {
            zzcb f2 = zzcb.f(this.zzey);
            return f2 == null ? zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD : f2;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (og.f4739a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((og) null);
                case 3:
                    return zzegb.u(zzez, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdw", "zzey", zzcb.g()});
                case 4:
                    return zzez;
                case 5:
                    zzehy<zzb> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzb.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzez);
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

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zzc extends zzegb<zzc, zza> implements zzehn {
        private static volatile zzehy<zzc> zzel;
        /* access modifiers changed from: private */
        public static final zzc zzfm;
        private int zzdw;
        private String zzfg = "";
        private String zzfh = "";
        private String zzfi = "";
        private String zzfj = "";
        private String zzfk = "";
        private String zzfl = "";

        /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzc, zza> implements zzehn {
            private zza() {
                super(zzc.zzfm);
            }

            /* synthetic */ zza(og ogVar) {
                this();
            }
        }

        static {
            zzc zzc = new zzc();
            zzfm = zzc;
            zzegb.x(zzc.class, zzc);
        }

        private zzc() {
        }

        public static zzc H() {
            return zzfm;
        }

        public final String G() {
            return this.zzfg;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (og.f4739a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((og) null);
                case 3:
                    return zzegb.u(zzfm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdw", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl"});
                case 4:
                    return zzfm;
                case 5:
                    zzehy<zzc> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzc.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzfm);
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
}
