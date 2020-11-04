package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzty {

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb<zza, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zza zzbyt;
        private static volatile zzehy<zza> zzel;
        private int zzbyi;
        private int zzbyj = 1000;
        private zzd zzbyk;
        private zze zzbyl;
        private zzegm<zzc> zzbym = zzegb.E();
        private zzf zzbyn;
        private zzp zzbyo;
        private zzn zzbyp;
        private zzk zzbyq;
        private zzl zzbyr;
        private zzegm<zzv> zzbys = zzegb.E();
        private int zzdw;

        /* renamed from: com.google.android.gms.internal.ads.zzty$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum C0085zza implements zzegg {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9310b;

            private C0085zza(int i) {
                this.f9310b = i;
            }

            public static C0085zza f(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    default:
                        return null;
                }
            }

            public static zzegi g() {
                return pf0.f4822a;
            }

            public final int i() {
                return this.f9310b;
            }

            public final String toString() {
                return "<" + C0085zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9310b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zza, zzb> implements zzehn {
            private zzb() {
                super(zza.zzbyt);
            }

            public final zzb w(zze.zza zza) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).L((zze) ((zzegb) zza.O()));
                return this;
            }

            public final zzb x(C0085zza zza) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).G(zza);
                return this;
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzbyt = zza;
            zzegb.x(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void G(C0085zza zza) {
            this.zzbyi = zza.i();
            this.zzdw |= 1;
        }

        /* access modifiers changed from: private */
        public final void L(zze zze) {
            zze.getClass();
            this.zzbyl = zze;
            this.zzdw |= 8;
        }

        public static zza N() {
            return zzbyt;
        }

        public final zze M() {
            zze zze = this.zzbyl;
            return zze == null ? zze.I() : zze;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzbyt, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdw", "zzbyi", C0085zza.g(), "zzbyj", zzui.g(), "zzbyk", "zzbyl", "zzbym", zzc.class, "zzbyn", "zzbyo", "zzbyp", "zzbyq", "zzbyr", "zzbys", zzv.class});
                case 4:
                    return zzbyt;
                case 5:
                    zzehy<zza> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zza.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzbyt);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzaa extends zzegb<zzaa, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzaa zzcgd;
        private static volatile zzehy<zzaa> zzel;
        private int zzcce = 1000;
        private zzx zzcfp;
        private zzt zzcfq;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzaa, zza> implements zzehn {
            private zza() {
                super(zzaa.zzcgd);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzaa zzaa = new zzaa();
            zzcgd = zzaa;
            zzegb.x(zzaa.class, zzaa);
        }

        private zzaa() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp", "zzcfq"});
                case 4:
                    return zzcgd;
                case 5:
                    zzehy<zzaa> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzaa.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgd);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzab extends zzegb<zzab, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzab zzcgf;
        private static volatile zzehy<zzab> zzel;
        private int zzcce = 1000;
        private int zzcff;
        private int zzcfg;
        private zzx zzcfp;
        private int zzcgb;
        private long zzcge;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzab, zza> implements zzehn {
            private zza() {
                super(zzab.zzcgf);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzab zzab = new zzab();
            zzcgf = zzab;
            zzegb.x(zzab.class, zzab);
        }

        private zzab() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgf, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp", "zzcff", "zzcfg", "zzcgb", "zzcge"});
                case 4:
                    return zzcgf;
                case 5:
                    zzehy<zzab> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzab.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgf);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzac extends zzegb<zzac, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzac zzcgg;
        private static volatile zzehy<zzac> zzel;
        private int zzcce = 1000;
        private zzx zzcfp;
        private zzt zzcfq;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzac, zza> implements zzehn {
            private zza() {
                super(zzac.zzcgg);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzac zzac = new zzac();
            zzcgg = zzac;
            zzegb.x(zzac.class, zzac);
        }

        private zzac() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp", "zzcfq"});
                case 4:
                    return zzcgg;
                case 5:
                    zzehy<zzac> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzac.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgg);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzad extends zzegb<zzad, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzad zzcgh;
        private static volatile zzehy<zzad> zzel;
        private int zzcce = 1000;
        private zzx zzcfp;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzad, zza> implements zzehn {
            private zza() {
                super(zzad.zzcgh);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzad zzad = new zzad();
            zzcgh = zzad;
            zzegb.x(zzad.class, zzad);
        }

        private zzad() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzad();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp"});
                case 4:
                    return zzcgh;
                case 5:
                    zzehy<zzad> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzad.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgh);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzae extends zzegb<zzae, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzae zzcgk;
        private static volatile zzehy<zzae> zzel;
        private boolean zzcgi;
        private int zzcgj;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzae, zza> implements zzehn {
            private zza() {
                super(zzae.zzcgk);
            }

            public final zza w(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzae) this.f8750c).I(i);
                return this;
            }

            public final boolean x() {
                return ((zzae) this.f8750c).L();
            }

            public final zza y(boolean z) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzae) this.f8750c).P(z);
                return this;
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzae zzae = new zzae();
            zzcgk = zzae;
            zzegb.x(zzae.class, zzae);
        }

        private zzae() {
        }

        /* access modifiers changed from: private */
        public final void I(int i) {
            this.zzdw |= 2;
            this.zzcgj = i;
        }

        public static zza M() {
            return (zza) zzcgk.A();
        }

        /* access modifiers changed from: private */
        public final void P(boolean z) {
            this.zzdw |= 1;
            this.zzcgi = z;
        }

        public final boolean L() {
            return this.zzcgi;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzae();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcgi", "zzcgj"});
                case 4:
                    return zzcgk;
                case 5:
                    zzehy<zzae> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzae.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgk);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzb extends zzegb<zzb, zzc> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzb zzbyv;
        private static volatile zzehy<zzb> zzel;
        private zzegm<zza> zzbyu = zzegb.E();

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb<zza, C0086zza> implements zzehn {
            /* access modifiers changed from: private */
            public static final zza zzbyz;
            private static volatile zzehy<zza> zzel;
            private int zzbyw;
            private zzd zzbyx;
            private zze zzbyy;
            private int zzdw;

            /* renamed from: com.google.android.gms.internal.ads.zzty$zzb$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0086zza extends zzegb.zzb<zza, C0086zza> implements zzehn {
                private C0086zza() {
                    super(zza.zzbyz);
                }

                public final C0086zza w(C0087zzb zzb) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).N(zzb);
                    return this;
                }

                public final C0086zza x(zzd.zza zza) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).L((zzd) ((zzegb) zza.O()));
                    return this;
                }

                public final C0086zza y(zze.zza zza) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).M((zze) ((zzegb) zza.O()));
                    return this;
                }

                /* synthetic */ C0086zza(of0 of0) {
                    this();
                }
            }

            static {
                zza zza = new zza();
                zzbyz = zza;
                zzegb.x(zza.class, zza);
            }

            private zza() {
            }

            /* access modifiers changed from: private */
            public final void L(zzd zzd) {
                zzd.getClass();
                this.zzbyx = zzd;
                this.zzdw |= 2;
            }

            /* access modifiers changed from: private */
            public final void M(zze zze) {
                zze.getClass();
                this.zzbyy = zze;
                this.zzdw |= 4;
            }

            /* access modifiers changed from: private */
            public final void N(C0087zzb zzb) {
                this.zzbyw = zzb.i();
                this.zzdw |= 1;
            }

            public static C0086zza P() {
                return (C0086zza) zzbyz.A();
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (of0.f4738a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0086zza((of0) null);
                    case 3:
                        return zzegb.u(zzbyz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzbyw", C0087zzb.g(), "zzbyx", "zzbyy"});
                    case 4:
                        return zzbyz;
                    case 5:
                        zzehy<zza> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zza.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzbyz);
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

        /* renamed from: com.google.android.gms.internal.ads.zzty$zzb$zzb  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum C0087zzb implements zzegg {
            UNSPECIFIED(0),
            IN_MEMORY(1);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9314b;

            private C0087zzb(int i) {
                this.f9314b = i;
            }

            public static C0087zzb f(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzegi g() {
                return qf0.f4914a;
            }

            public final int i() {
                return this.f9314b;
            }

            public final String toString() {
                return "<" + C0087zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9314b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzc extends zzegb.zzb<zzb, zzc> implements zzehn {
            private zzc() {
                super(zzb.zzbyv);
            }

            public final zzc w(zza.C0086zza zza) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).G((zza) ((zzegb) zza.O()));
                return this;
            }

            /* synthetic */ zzc(of0 of0) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzd extends zzegb<zzd, zza> implements zzehn {
            /* access modifiers changed from: private */
            public static final zzd zzbzf;
            private static volatile zzehy<zzd> zzel;
            private boolean zzbzd;
            private int zzbze;
            private int zzdw;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zzd, zza> implements zzehn {
                private zza() {
                    super(zzd.zzbzf);
                }

                public final zza w(int i) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzd) this.f8750c).I(i);
                    return this;
                }

                public final zza x(boolean z) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzd) this.f8750c).N(z);
                    return this;
                }

                /* synthetic */ zza(of0 of0) {
                    this();
                }
            }

            static {
                zzd zzd = new zzd();
                zzbzf = zzd;
                zzegb.x(zzd.class, zzd);
            }

            private zzd() {
            }

            /* access modifiers changed from: private */
            public final void I(int i) {
                this.zzdw |= 2;
                this.zzbze = i;
            }

            public static zza L() {
                return (zza) zzbzf.A();
            }

            /* access modifiers changed from: private */
            public final void N(boolean z) {
                this.zzdw |= 1;
                this.zzbzd = z;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (of0.f4738a[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza((of0) null);
                    case 3:
                        return zzegb.u(zzbzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdw", "zzbzd", "zzbze"});
                    case 4:
                        return zzbzf;
                    case 5:
                        zzehy<zzd> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzd.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzbzf);
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

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zze extends zzegb<zze, zza> implements zzehn {
            /* access modifiers changed from: private */
            public static final zze zzbzi;
            private static volatile zzehy<zze> zzel;
            private int zzbze;
            private boolean zzbzg;
            private boolean zzbzh;
            private int zzdw;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zze, zza> implements zzehn {
                private zza() {
                    super(zze.zzbzi);
                }

                public final zza w(int i) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zze) this.f8750c).L(i);
                    return this;
                }

                public final zza x(boolean z) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zze) this.f8750c).P(z);
                    return this;
                }

                public final zza y(boolean z) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zze) this.f8750c).Q(z);
                    return this;
                }

                /* synthetic */ zza(of0 of0) {
                    this();
                }
            }

            static {
                zze zze = new zze();
                zzbzi = zze;
                zzegb.x(zze.class, zze);
            }

            private zze() {
            }

            /* access modifiers changed from: private */
            public final void L(int i) {
                this.zzdw |= 4;
                this.zzbze = i;
            }

            public static zza M() {
                return (zza) zzbzi.A();
            }

            /* access modifiers changed from: private */
            public final void P(boolean z) {
                this.zzdw |= 1;
                this.zzbzg = z;
            }

            /* access modifiers changed from: private */
            public final void Q(boolean z) {
                this.zzdw |= 2;
                this.zzbzh = z;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (of0.f4738a[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza((of0) null);
                    case 3:
                        return zzegb.u(zzbzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdw", "zzbzg", "zzbzh", "zzbze"});
                    case 4:
                        return zzbzi;
                    case 5:
                        zzehy<zze> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zze.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzbzi);
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
            zzb zzb = new zzb();
            zzbyv = zzb;
            zzegb.x(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        public final void G(zza zza2) {
            zza2.getClass();
            if (!this.zzbyu.p()) {
                this.zzbyu = zzegb.s(this.zzbyu);
            }
            this.zzbyu.add(zza2);
        }

        public static zzc I() {
            return (zzc) zzbyv.A();
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zzc((of0) null);
                case 3:
                    return zzegb.u(zzbyv, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbyu", zza.class});
                case 4:
                    return zzbyv;
                case 5:
                    zzehy<zzb> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzb.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzbyv);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzc extends zzegb<zzc, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzc zzbzx;
        private static volatile zzehy<zzc> zzel;
        private int zzbzv;
        private zzr zzbzw;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zza implements zzegg {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9319b;

            private zza(int i) {
                this.f9319b = i;
            }

            public static zza f(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzegi g() {
                return rf0.f5008a;
            }

            public final int i() {
                return this.f9319b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9319b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zzc, zzb> implements zzehn {
            private zzb() {
                super(zzc.zzbzx);
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        static {
            zzc zzc = new zzc();
            zzbzx = zzc;
            zzegb.x(zzc.class, zzc);
        }

        private zzc() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzbzx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzbzv", zza.g(), "zzbzw"});
                case 4:
                    return zzbzx;
                case 5:
                    zzehy<zzc> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzc.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzbzx);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzd extends zzegb<zzd, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzd zzcab;
        private static volatile zzehy<zzd> zzel;
        private String zzbzy = "";
        private zzegm<zzc> zzbzz = zzegb.E();
        private int zzcaa;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzd, zza> implements zzehn {
            private zza() {
                super(zzd.zzcab);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzd zzd = new zzd();
            zzcab = zzd;
            zzegb.x(zzd.class, zzd);
        }

        private zzd() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcab, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdw", "zzbzy", "zzbzz", zzc.class, "zzcaa", zzui.g()});
                case 4:
                    return zzcab;
                case 5:
                    zzehy<zzd> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzd.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcab);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zze extends zzegb<zze, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zze zzcah;
        private static volatile zzehy<zze> zzel;
        private String zzcac = "";
        private zzegm<zzc> zzcad = zzegb.E();
        private int zzcae = 1000;
        private int zzcaf = 1000;
        private int zzcag = 1000;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zze, zza> implements zzehn {
            private zza() {
                super(zze.zzcah);
            }

            public final zza w(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zze) this.f8750c).H(str);
                return this;
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zze zze = new zze();
            zzcah = zze;
            zzegb.x(zze.class, zze);
        }

        private zze() {
        }

        /* access modifiers changed from: private */
        public final void H(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcac = str;
        }

        public static zze I() {
            return zzcah;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcah, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdw", "zzcac", "zzcad", zzc.class, "zzcae", zzui.g(), "zzcaf", zzui.g(), "zzcag", zzui.g()});
                case 4:
                    return zzcah;
                case 5:
                    zzehy<zze> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zze.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcah);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzf extends zzegb<zzf, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzf zzcao;
        private static volatile zzehy<zzf> zzel;
        private int zzcai;
        private zzt zzcaj;
        private zzt zzcak;
        private zzt zzcal;
        private zzegm<zzt> zzcam = zzegb.E();
        private int zzcan;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzf, zza> implements zzehn {
            private zza() {
                super(zzf.zzcao);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzf zzf = new zzf();
            zzcao = zzf;
            zzegb.x(zzf.class, zzf);
        }

        private zzf() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcao, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdw", "zzcai", "zzcaj", "zzcak", "zzcal", "zzcam", zzt.class, "zzcan"});
                case 4:
                    return zzcao;
                case 5:
                    zzehy<zzf> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzf.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcao);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzg extends zzegb<zzg, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzg zzcax;
        private static volatile zzehy<zzg> zzel;
        private String zzcap = "";
        private zzt zzcaq;
        private int zzcar;
        private zzu zzcas;
        private int zzcat;
        private int zzcau = 1000;
        private int zzcav = 1000;
        private int zzcaw = 1000;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzg, zza> implements zzehn {
            private zza() {
                super(zzg.zzcax);
            }

            public final zza w(zzu zzu) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzg) this.f8750c).I(zzu);
                return this;
            }

            public final zza x(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzg) this.f8750c).L(str);
                return this;
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzg zzg = new zzg();
            zzcax = zzg;
            zzegb.x(zzg.class, zzg);
        }

        private zzg() {
        }

        /* access modifiers changed from: private */
        public final void I(zzu zzu) {
            zzu.getClass();
            this.zzcas = zzu;
            this.zzdw |= 8;
        }

        /* access modifiers changed from: private */
        public final void L(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcap = str;
        }

        public static zzg M() {
            return zzcax;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcax, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdw", "zzcap", "zzcaq", "zzcar", "zzcas", "zzcat", "zzcau", zzui.g(), "zzcav", zzui.g(), "zzcaw", zzui.g()});
                case 4:
                    return zzcax;
                case 5:
                    zzehy<zzg> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzg.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcax);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzh extends zzegb<zzh, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzh zzcbc;
        private static volatile zzehy<zzh> zzel;
        private int zzcay;
        private zzu zzcaz;
        private String zzcba = "";
        private String zzcbb = "";
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zza implements zzegg {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9324b;

            private zza(int i) {
                this.f9324b = i;
            }

            public static zza f(int i) {
                if (i == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i == 1) {
                    return IOS;
                }
                if (i != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzegi g() {
                return sf0.f5094a;
            }

            public final int i() {
                return this.f9324b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9324b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zzh, zzb> implements zzehn {
            private zzb() {
                super(zzh.zzcbc);
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        static {
            zzh zzh = new zzh();
            zzcbc = zzh;
            zzegb.x(zzh.class, zzh);
        }

        private zzh() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzcbc, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdw", "zzcay", zza.g(), "zzcaz", "zzcba", "zzcbb"});
                case 4:
                    return zzcbc;
                case 5:
                    zzehy<zzh> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzh.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcbc);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzi extends zzegb<zzi, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzi zzcby;
        private static volatile zzehy<zzi> zzel;
        private int zzcbl;
        private String zzcbm = "";
        private int zzcbn;
        private int zzcbo = 1000;
        private zzu zzcbp;
        private zzegj zzcbq = zzegb.D();
        private zzg zzcbr;
        private zzh zzcbs;
        private zzm zzcbt;
        private zza zzcbu;
        private zzo zzcbv;
        private zzae zzcbw;
        private zzb zzcbx;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzi, zza> implements zzehn {
            private zza() {
                super(zzi.zzcby);
            }

            public final zza C(zzo zzo) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).V(zzo);
                return this;
            }

            public final zza D(Iterable<? extends Long> iterable) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).W(iterable);
                return this;
            }

            public final zza E(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).X(str);
                return this;
            }

            public final String F() {
                return ((zzi) this.f8750c).Y();
            }

            public final zzg H() {
                return ((zzi) this.f8750c).a0();
            }

            public final zza I() {
                return ((zzi) this.f8750c).b0();
            }

            public final zza L() {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).Z();
                return this;
            }

            public final zza w(zza.zzb zzb) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).G((zza) ((zzegb) zzb.O()));
                return this;
            }

            public final zza x(zzg.zza zza) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).L((zzg) ((zzegb) zza.O()));
                return this;
            }

            public final zza y(zzae zzae) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).H(zzae);
                return this;
            }

            public final zza z(zzb zzb) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzi) this.f8750c).I(zzb);
                return this;
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zzcby = zzi;
            zzegb.x(zzi.class, zzi);
        }

        private zzi() {
        }

        /* access modifiers changed from: private */
        public final void G(zza zza2) {
            zza2.getClass();
            this.zzcbu = zza2;
            this.zzdw |= 256;
        }

        /* access modifiers changed from: private */
        public final void H(zzae zzae) {
            zzae.getClass();
            this.zzcbw = zzae;
            this.zzdw |= 1024;
        }

        /* access modifiers changed from: private */
        public final void I(zzb zzb) {
            zzb.getClass();
            this.zzcbx = zzb;
            this.zzdw |= 2048;
        }

        /* access modifiers changed from: private */
        public final void L(zzg zzg) {
            zzg.getClass();
            this.zzcbr = zzg;
            this.zzdw |= 32;
        }

        /* access modifiers changed from: private */
        public final void V(zzo zzo) {
            zzo.getClass();
            this.zzcbv = zzo;
            this.zzdw |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* access modifiers changed from: private */
        public final void W(Iterable<? extends Long> iterable) {
            if (!this.zzcbq.p()) {
                zzegj zzegj = this.zzcbq;
                int size = zzegj.size();
                this.zzcbq = zzegj.T(size == 0 ? 10 : size << 1);
            }
            zzeeh.a(iterable, this.zzcbq);
        }

        /* access modifiers changed from: private */
        public final void X(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzcbm = str;
        }

        /* access modifiers changed from: private */
        public final void Z() {
            this.zzcbq = zzegb.D();
        }

        public static zza c0() {
            return (zza) zzcby.A();
        }

        public final String Y() {
            return this.zzcbm;
        }

        public final zzg a0() {
            zzg zzg = this.zzcbr;
            return zzg == null ? zzg.M() : zzg;
        }

        public final zza b0() {
            zza zza2 = this.zzcbu;
            return zza2 == null ? zza.N() : zza2;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcby, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdw", "zzcbl", "zzcbm", "zzcbn", "zzcbo", zzui.g(), "zzcbp", "zzcbq", "zzcbr", "zzcbs", "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx"});
                case 4:
                    return zzcby;
                case 5:
                    zzehy<zzi> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzi.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcby);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzj extends zzegb<zzj, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzj zzccd;
        private static volatile zzehy<zzj> zzel;
        private String zzcbz = "";
        private int zzcca;
        private zzegh zzccb = zzegb.C();
        private zzt zzccc;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzj, zza> implements zzehn {
            private zza() {
                super(zzj.zzccd);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzj zzj = new zzj();
            zzccd = zzj;
            zzegb.x(zzj.class, zzj);
        }

        private zzj() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzccd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdw", "zzcbz", "zzcca", zzui.g(), "zzccb", "zzccc"});
                case 4:
                    return zzccd;
                case 5:
                    zzehy<zzj> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzj.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzccd);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzk extends zzegb<zzk, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzk zzccf;
        private static volatile zzehy<zzk> zzel;
        private zzegh zzccb = zzegb.C();
        private int zzcce;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzk, zza> implements zzehn {
            private zza() {
                super(zzk.zzccf);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzccf = zzk;
            zzegb.x(zzk.class, zzk);
        }

        private zzk() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzccf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdw", "zzcce", zzui.g(), "zzccb"});
                case 4:
                    return zzccf;
                case 5:
                    zzehy<zzk> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzk.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzccf);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzl extends zzegb<zzl, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzl zzcci;
        private static volatile zzehy<zzl> zzel;
        private zzt zzccc;
        private int zzcce;
        private zzj zzccg;
        private zzegm<zzs> zzcch = zzegb.E();
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzl, zza> implements zzehn {
            private zza() {
                super(zzl.zzcci);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzl zzl = new zzl();
            zzcci = zzl;
            zzegb.x(zzl.class, zzl);
        }

        private zzl() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcci, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdw", "zzccg", "zzcch", zzs.class, "zzcce", zzui.g(), "zzccc"});
                case 4:
                    return zzcci;
                case 5:
                    zzehy<zzl> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzl.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcci);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzm extends zzegb<zzm, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzm zzcck;
        private static volatile zzehy<zzm> zzel;
        private int zzbzv;
        private int zzccj;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zza implements zzegg {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9329b;

            private zza(int i) {
                this.f9329b = i;
            }

            public static zza f(int i) {
                if (i == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TWO_G;
                }
                if (i == 2) {
                    return THREE_G;
                }
                if (i != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzegi g() {
                return uf0.f5249a;
            }

            public final int i() {
                return this.f9329b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9329b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zzm, zzb> implements zzehn {
            private zzb() {
                super(zzm.zzcck);
            }

            public final zzb w(zza zza) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzm) this.f8750c).G(zza);
                return this;
            }

            public final zzb x(zzc zzc) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzm) this.f8750c).H(zzc);
                return this;
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zzc implements zzegg {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9334b;

            private zzc(int i) {
                this.f9334b = i;
            }

            public static zzc f(int i) {
                if (i == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CELL;
                }
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzegi g() {
                return vf0.f5326a;
            }

            public final int i() {
                return this.f9334b;
            }

            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9334b + " name=" + name() + '>';
            }
        }

        static {
            zzm zzm = new zzm();
            zzcck = zzm;
            zzegb.x(zzm.class, zzm);
        }

        private zzm() {
        }

        /* access modifiers changed from: private */
        public final void G(zza zza2) {
            this.zzccj = zza2.i();
            this.zzdw |= 2;
        }

        /* access modifiers changed from: private */
        public final void H(zzc zzc2) {
            this.zzbzv = zzc2.i();
            this.zzdw |= 1;
        }

        public static zzb M() {
            return (zzb) zzcck.A();
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzcck, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdw", "zzbzv", zzc.g(), "zzccj", zza.g()});
                case 4:
                    return zzcck;
                case 5:
                    zzehy<zzm> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzm.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcck);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzn extends zzegb<zzn, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzn zzccw;
        private static volatile zzehy<zzn> zzel;
        private int zzccu;
        private zzt zzccv;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzn, zza> implements zzehn {
            private zza() {
                super(zzn.zzccw);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzn zzn = new zzn();
            zzccw = zzn;
            zzegb.x(zzn.class, zzn);
        }

        private zzn() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzccw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzccu", zzui.g(), "zzccv"});
                case 4:
                    return zzccw;
                case 5:
                    zzehy<zzn> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzn.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzccw);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzo extends zzegb<zzo, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzo zzcdc;
        private static volatile zzehy<zzo> zzel;
        private zzegm<zza> zzbyu = zzegb.E();
        private int zzccx;
        private int zzccy;
        private long zzccz;
        private String zzcda = "";
        private long zzcdb;
        private int zzdw;
        private String zzdx = "";

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb<zza, C0088zza> implements zzehn {
            private static final zzegk<Integer, zzc.zza> zzcdi = new wf0();
            /* access modifiers changed from: private */
            public static final zza zzcdq;
            private static volatile zzehy<zza> zzel;
            private long zzcdd;
            private int zzcde;
            private long zzcdf;
            private long zzcdg;
            private zzegh zzcdh = zzegb.C();
            private zzm zzcdj;
            private int zzcdk;
            private int zzcdl;
            private int zzcdm;
            private int zzcdn;
            private int zzcdo;
            private int zzcdp;
            private int zzdw;

            /* renamed from: com.google.android.gms.internal.ads.zzty$zzo$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0088zza extends zzegb.zzb<zza, C0088zza> implements zzehn {
                private C0088zza() {
                    super(zza.zzcdq);
                }

                public final C0088zza C(long j) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).g0(j);
                    return this;
                }

                public final C0088zza D(long j) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).h0(j);
                    return this;
                }

                public final C0088zza E(zzui zzui) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).T(zzui);
                    return this;
                }

                public final C0088zza F(Iterable<? extends zzc.zza> iterable) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).d0(iterable);
                    return this;
                }

                public final C0088zza H(zzui zzui) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).W(zzui);
                    return this;
                }

                public final C0088zza I(zzui zzui) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).Z(zzui);
                    return this;
                }

                public final C0088zza L(zzui zzui) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).c0(zzui);
                    return this;
                }

                public final C0088zza M(zzui zzui) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).f0(zzui);
                    return this;
                }

                public final C0088zza w(zzm zzm) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).I(zzm);
                    return this;
                }

                public final C0088zza x(zzc zzc) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).S(zzc);
                    return this;
                }

                public final C0088zza y(int i) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).a0(i);
                    return this;
                }

                public final C0088zza z(long j) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zza) this.f8750c).H(j);
                    return this;
                }

                /* synthetic */ C0088zza(of0 of0) {
                    this();
                }
            }

            static {
                zza zza = new zza();
                zzcdq = zza;
                zzegb.x(zza.class, zza);
            }

            private zza() {
            }

            /* access modifiers changed from: private */
            public final void H(long j) {
                this.zzdw |= 1;
                this.zzcdd = j;
            }

            /* access modifiers changed from: private */
            public final void I(zzm zzm) {
                zzm.getClass();
                this.zzcdj = zzm;
                this.zzdw |= 16;
            }

            /* access modifiers changed from: private */
            public final void S(zzc zzc) {
                this.zzcdp = zzc.i();
                this.zzdw |= 1024;
            }

            /* access modifiers changed from: private */
            public final void T(zzui zzui) {
                this.zzcde = zzui.i();
                this.zzdw |= 2;
            }

            /* access modifiers changed from: private */
            public final void W(zzui zzui) {
                this.zzcdk = zzui.i();
                this.zzdw |= 32;
            }

            /* access modifiers changed from: private */
            public final void Z(zzui zzui) {
                this.zzcdl = zzui.i();
                this.zzdw |= 64;
            }

            /* access modifiers changed from: private */
            public final void a0(int i) {
                this.zzdw |= 256;
                this.zzcdn = i;
            }

            /* access modifiers changed from: private */
            public final void c0(zzui zzui) {
                this.zzcdm = zzui.i();
                this.zzdw |= 128;
            }

            /* access modifiers changed from: private */
            public final void d0(Iterable<? extends zzc.zza> iterable) {
                if (!this.zzcdh.p()) {
                    this.zzcdh = zzegb.r(this.zzcdh);
                }
                for (zzc.zza i : iterable) {
                    this.zzcdh.L(i.i());
                }
            }

            /* access modifiers changed from: private */
            public final void f0(zzui zzui) {
                this.zzcdo = zzui.i();
                this.zzdw |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }

            /* access modifiers changed from: private */
            public final void g0(long j) {
                this.zzdw |= 4;
                this.zzcdf = j;
            }

            /* access modifiers changed from: private */
            public final void h0(long j) {
                this.zzdw |= 8;
                this.zzcdg = j;
            }

            public static zza i0(byte[] bArr) throws zzegl {
                return (zza) zzegb.o(zzcdq, bArr);
            }

            public static C0088zza k0() {
                return (C0088zza) zzcdq.A();
            }

            public final long G() {
                return this.zzcdd;
            }

            public final zzui j0() {
                zzui f2 = zzui.f(this.zzcde);
                return f2 == null ? zzui.ENUM_FALSE : f2;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (of0.f4738a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0088zza((of0) null);
                    case 3:
                        return zzegb.u(zzcdq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdw", "zzcdd", "zzcde", zzui.g(), "zzcdf", "zzcdg", "zzcdh", zzc.zza.g(), "zzcdj", "zzcdk", zzui.g(), "zzcdl", zzui.g(), "zzcdm", zzui.g(), "zzcdn", "zzcdo", zzui.g(), "zzcdp", zzc.g()});
                    case 4:
                        return zzcdq;
                    case 5:
                        zzehy<zza> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zza.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzcdq);
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

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zzo, zzb> implements zzehn {
            private zzb() {
                super(zzo.zzcdc);
            }

            public final zzb C(Iterable<? extends zza> iterable) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).Q(iterable);
                return this;
            }

            public final zzb D(long j) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).U(j);
                return this;
            }

            public final zzb E(long j) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).V(j);
                return this;
            }

            public final zzb w(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).W(str);
                return this;
            }

            public final zzb x(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).R(str);
                return this;
            }

            public final zzb y(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).S(i);
                return this;
            }

            public final zzb z(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzo) this.f8750c).T(i);
                return this;
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zzc implements zzegg {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9339b;

            private zzc(int i2) {
                this.f9339b = i2;
            }

            public static zzc f(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CONNECTING;
                }
                if (i2 == 2) {
                    return CONNECTED;
                }
                if (i2 == 3) {
                    return DISCONNECTING;
                }
                if (i2 == 4) {
                    return DISCONNECTED;
                }
                if (i2 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzegi g() {
                return xf0.f5491a;
            }

            public final int i() {
                return this.f9339b;
            }

            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9339b + " name=" + name() + '>';
            }
        }

        static {
            zzo zzo = new zzo();
            zzcdc = zzo;
            zzegb.x(zzo.class, zzo);
        }

        private zzo() {
        }

        /* access modifiers changed from: private */
        public final void Q(Iterable<? extends zza> iterable) {
            if (!this.zzbyu.p()) {
                this.zzbyu = zzegb.s(this.zzbyu);
            }
            zzeeh.a(iterable, this.zzbyu);
        }

        /* access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzcda = str;
        }

        /* access modifiers changed from: private */
        public final void S(int i) {
            this.zzdw |= 1;
            this.zzccx = i;
        }

        /* access modifiers changed from: private */
        public final void T(int i) {
            this.zzdw |= 2;
            this.zzccy = i;
        }

        /* access modifiers changed from: private */
        public final void U(long j) {
            this.zzdw |= 4;
            this.zzccz = j;
        }

        /* access modifiers changed from: private */
        public final void V(long j) {
            this.zzdw |= 32;
            this.zzcdb = j;
        }

        /* access modifiers changed from: private */
        public final void W(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzdx = str;
        }

        public static zzb X() {
            return (zzb) zzcdc.A();
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzcdc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdw", "zzbyu", zza.class, "zzccx", "zzccy", "zzccz", "zzdx", "zzcda", "zzcdb"});
                case 4:
                    return zzcdc;
                case 5:
                    zzehy<zzo> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzo.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcdc);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzp extends zzegb<zzp, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzp zzcej;
        private static volatile zzehy<zzp> zzel;
        private int zzcdy = 1000;
        private int zzcdz = 1000;
        private int zzcea;
        private int zzceb;
        private int zzcec;
        private int zzced;
        private int zzcee;
        private int zzcef;
        private int zzceg;
        private int zzceh;
        private zzq zzcei;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzp, zza> implements zzehn {
            private zza() {
                super(zzp.zzcej);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzp zzp = new zzp();
            zzcej = zzp;
            zzegb.x(zzp.class, zzp);
        }

        private zzp() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcej, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdw", "zzcdy", zzui.g(), "zzcdz", zzui.g(), "zzcea", "zzceb", "zzcec", "zzced", "zzcee", "zzcef", "zzceg", "zzceh", "zzcei"});
                case 4:
                    return zzcej;
                case 5:
                    zzehy<zzp> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzp.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcej);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzq extends zzegb<zzq, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzq zzcem;
        private static volatile zzehy<zzq> zzel;
        private int zzcek;
        private int zzcel;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzq, zza> implements zzehn {
            private zza() {
                super(zzq.zzcem);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzq zzq = new zzq();
            zzcem = zzq;
            zzegb.x(zzq.class, zzq);
        }

        private zzq() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcem, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcek", "zzcel"});
                case 4:
                    return zzcem;
                case 5:
                    zzehy<zzq> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzq.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcem);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzr extends zzegb<zzr, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzr zzcep;
        private static volatile zzehy<zzr> zzel;
        private int zzcen;
        private int zzceo;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzr, zza> implements zzehn {
            private zza() {
                super(zzr.zzcep);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzr zzr = new zzr();
            zzcep = zzr;
            zzegb.x(zzr.class, zzr);
        }

        private zzr() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcep, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcen", "zzceo"});
                case 4:
                    return zzcep;
                case 5:
                    zzehy<zzr> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzr.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcep);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzs extends zzegb<zzs, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzs zzceq;
        private static volatile zzehy<zzs> zzel;
        private String zzcbz = "";
        private int zzcca;
        private zzt zzccc;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzs, zza> implements zzehn {
            private zza() {
                super(zzs.zzceq);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzs zzs = new zzs();
            zzceq = zzs;
            zzegb.x(zzs.class, zzs);
        }

        private zzs() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzceq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcbz", "zzcca", zzui.g(), "zzccc"});
                case 4:
                    return zzceq;
                case 5:
                    zzehy<zzs> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzs.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzceq);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzt extends zzegb<zzt, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzt zzcet;
        private static volatile zzehy<zzt> zzel;
        private int zzcer;
        private int zzces;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzt, zza> implements zzehn {
            private zza() {
                super(zzt.zzcet);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzt zzt = new zzt();
            zzcet = zzt;
            zzegb.x(zzt.class, zzt);
        }

        private zzt() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcet, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcer", "zzces"});
                case 4:
                    return zzcet;
                case 5:
                    zzehy<zzt> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzt.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcet);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzu extends zzegb<zzu, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzu zzcex;
        private static volatile zzehy<zzu> zzel;
        private int zzceu;
        private int zzcev;
        private int zzcew;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzu, zza> implements zzehn {
            private zza() {
                super(zzu.zzcex);
            }

            public final zza w(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzu) this.f8750c).L(i);
                return this;
            }

            public final zza x(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzu) this.f8750c).M(i);
                return this;
            }

            public final zza y(int i) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzu) this.f8750c).N(i);
                return this;
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzu zzu = new zzu();
            zzcex = zzu;
            zzegb.x(zzu.class, zzu);
        }

        private zzu() {
        }

        /* access modifiers changed from: private */
        public final void L(int i) {
            this.zzdw |= 1;
            this.zzceu = i;
        }

        /* access modifiers changed from: private */
        public final void M(int i) {
            this.zzdw |= 2;
            this.zzcev = i;
        }

        /* access modifiers changed from: private */
        public final void N(int i) {
            this.zzdw |= 4;
            this.zzcew = i;
        }

        public static zza P() {
            return (zza) zzcex.A();
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcex, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdw", "zzceu", "zzcev", "zzcew"});
                case 4:
                    return zzcex;
                case 5:
                    zzehy<zzu> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzu.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcex);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzv extends zzegb<zzv, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzv zzcfo;
        private static volatile zzehy<zzv> zzel;
        private zzz zzcey;
        private zzab zzcez;
        private zzac zzcfa;
        private zzad zzcfb;
        private zzw zzcfc;
        private zzaa zzcfd;
        private zzy zzcfe;
        private int zzcff;
        private int zzcfg;
        private zzt zzcfh;
        private int zzcfi;
        private int zzcfj;
        private int zzcfk;
        private int zzcfl;
        private int zzcfm;
        private long zzcfn;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzv, zza> implements zzehn {
            private zza() {
                super(zzv.zzcfo);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzv zzv = new zzv();
            zzcfo = zzv;
            zzegb.x(zzv.class, zzv);
        }

        private zzv() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcfo, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdw", "zzcey", "zzcez", "zzcfa", "zzcfb", "zzcfc", "zzcfd", "zzcfe", "zzcff", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn"});
                case 4:
                    return zzcfo;
                case 5:
                    zzehy<zzv> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzv.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcfo);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzw extends zzegb<zzw, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzw zzcfr;
        private static volatile zzehy<zzw> zzel;
        private int zzcce = 1000;
        private zzx zzcfp;
        private zzt zzcfq;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzw, zza> implements zzehn {
            private zza() {
                super(zzw.zzcfr);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzw zzw = new zzw();
            zzcfr = zzw;
            zzegb.x(zzw.class, zzw);
        }

        private zzw() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcfr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp", "zzcfq"});
                case 4:
                    return zzcfr;
                case 5:
                    zzehy<zzw> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzw.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcfr);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzx extends zzegb<zzx, zzb> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzx zzcft;
        private static volatile zzehy<zzx> zzel;
        private int zzcfs;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zza implements zzegg {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9344b;

            private zza(int i) {
                this.f9344b = i;
            }

            public static zza f(int i) {
                if (i == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzegi g() {
                return yf0.f5571a;
            }

            public final int i() {
                return this.f9344b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9344b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzb extends zzegb.zzb<zzx, zzb> implements zzehn {
            private zzb() {
                super(zzx.zzcft);
            }

            /* synthetic */ zzb(of0 of0) {
                this();
            }
        }

        static {
            zzx zzx = new zzx();
            zzcft = zzx;
            zzegb.x(zzx.class, zzx);
        }

        private zzx() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zzb((of0) null);
                case 3:
                    return zzegb.u(zzcft, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdw", "zzcfs", zza.g()});
                case 4:
                    return zzcft;
                case 5:
                    zzehy<zzx> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzx.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcft);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzy extends zzegb<zzy, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzy zzcga;
        private static volatile zzehy<zzy> zzel;
        private int zzcce = 1000;
        private zzx zzcfp;
        private zzt zzcfq;
        private zzu zzcfz;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzy, zza> implements zzehn {
            private zza() {
                super(zzy.zzcga);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzy zzy = new zzy();
            zzcga = zzy;
            zzegb.x(zzy.class, zzy);
        }

        private zzy() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcga, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzcfz", "zzcce", zzui.g(), "zzcfp", "zzcfq"});
                case 4:
                    return zzcga;
                case 5:
                    zzehy<zzy> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzy.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcga);
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

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzz extends zzegb<zzz, zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zzz zzcgc;
        private static volatile zzehy<zzz> zzel;
        private int zzcce = 1000;
        private int zzcff;
        private int zzcfg;
        private zzx zzcfp;
        private int zzcgb;
        private int zzdw;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzz, zza> implements zzehn {
            private zza() {
                super(zzz.zzcgc);
            }

            /* synthetic */ zza(of0 of0) {
                this();
            }
        }

        static {
            zzz zzz = new zzz();
            zzcgc = zzz;
            zzegb.x(zzz.class, zzz);
        }

        private zzz() {
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (of0.f4738a[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zza((of0) null);
                case 3:
                    return zzegb.u(zzcgc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdw", "zzcce", zzui.g(), "zzcfp", "zzcff", "zzcfg", "zzcgb"});
                case 4:
                    return zzcgc;
                case 5:
                    zzehy<zzz> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzz.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzcgc);
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
