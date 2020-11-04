package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzejv {

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb<zza, zzb> implements zzehn {
        private static volatile zzehy<zza> zzel;
        /* access modifiers changed from: private */
        public static final zza zzilm;
        private int zzdw;
        private int zzilf;
        private C0077zza zzilg;
        private zzeer zzilh;
        private zzeer zzili;
        private boolean zzilj;
        private boolean zzilk;
        private byte zzill = 2;

        /* renamed from: com.google.android.gms.internal.ads.zzejv$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class C0077zza extends zzegb<C0077zza, C0078zza> implements zzehn {
            private static volatile zzehy<C0077zza> zzel;
            /* access modifiers changed from: private */
            public static final C0077zza zzilr;
            private int zzdw;
            private String zziln = "";
            private String zzilo = "";
            private String zzilp = "";
            private int zzilq;

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zza$zza$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0078zza extends zzegb.zzb<C0077zza, C0078zza> implements zzehn {
                private C0078zza() {
                    super(C0077zza.zzilr);
                }

                /* synthetic */ C0078zza(k90 k90) {
                    this();
                }
            }

            static {
                C0077zza zza = new C0077zza();
                zzilr = zza;
                zzegb.x(C0077zza.class, zza);
            }

            private C0077zza() {
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new C0077zza();
                    case 2:
                        return new C0078zza((k90) null);
                    case 3:
                        return zzegb.u(zzilr, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zzdw", "zziln", "zzilo", "zzilp", "zzilq"});
                    case 4:
                        return zzilr;
                    case 5:
                        zzehy<C0077zza> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (C0077zza.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzilr);
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
        public static final class zzb extends zzegb.zzb<zza, zzb> implements zzehn {
            private zzb() {
                super(zza.zzilm);
            }

            /* synthetic */ zzb(k90 k90) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public enum zzc implements zzegg {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f8795b;

            private zzc(int i) {
                this.f8795b = i;
            }

            public static zzc f(int i) {
                if (i == 0) {
                    return SAFE;
                }
                if (i == 1) {
                    return DANGEROUS;
                }
                if (i == 2) {
                    return UNKNOWN;
                }
                if (i == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (i != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            public static zzegi g() {
                return l90.f4463a;
            }

            public final int i() {
                return this.f8795b;
            }

            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8795b + " name=" + name() + '>';
            }
        }

        static {
            zza zza = new zza();
            zzilm = zza;
            zzegb.x(zza.class, zza);
        }

        private zza() {
            zzeer zzeer = zzeer.f8716c;
            this.zzilh = zzeer;
            this.zzili = zzeer;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (k90.f4373a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb((k90) null);
                case 3:
                    return zzegb.u(zzilm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzdw", "zzilf", zzc.g(), "zzilg", "zzilh", "zzili", "zzilj", "zzilk"});
                case 4:
                    return zzilm;
                case 5:
                    zzehy<zza> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zza.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzilm);
                                zzel = zzehy;
                            }
                        }
                    }
                    return zzehy;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzb extends zzegb<zzb, zza> implements zzehn {
        private static volatile zzehy<zzb> zzel;
        /* access modifiers changed from: private */
        public static final zzb zzimn;
        private int zzbzv;
        private int zzdw;
        private zzeer zzilh = zzeer.f8716c;
        private byte zzill = 2;
        private String zzilo = "";
        private int zzily;
        private String zzilz = "";
        private String zzima = "";
        private C0079zzb zzimb;
        private zzegm<zzh> zzimc = zzegb.E();
        private String zzimd = "";
        private zzf zzime;
        private boolean zzimf;
        private zzegm<String> zzimg = zzegb.E();
        private String zzimh = "";
        private boolean zzimi;
        private boolean zzimj;
        private zzi zzimk;
        private zzegm<String> zziml = zzegb.E();
        private zzegm<String> zzimm = zzegb.E();

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zza extends zzegb.zzb<zzb, zza> implements zzehn {
            private zza() {
                super(zzb.zzimn);
            }

            public final zza C(zzh zzh) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).W(zzh);
                return this;
            }

            public final zza D(zzi zzi) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).X(zzi);
                return this;
            }

            public final List<zzh> E() {
                return Collections.unmodifiableList(((zzb) this.f8750c).a0());
            }

            public final String F() {
                return ((zzb) this.f8750c).b0();
            }

            public final zza H() {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).c0();
                return this;
            }

            public final zza I(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).H(str);
                return this;
            }

            public final zza L(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).h0(str);
                return this;
            }

            public final zza M(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).g0(str);
                return this;
            }

            public final zza P(Iterable<String> iterable) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).i0(iterable);
                return this;
            }

            public final zza Q(Iterable<String> iterable) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).j0(iterable);
                return this;
            }

            public final String w() {
                return ((zzb) this.f8750c).G();
            }

            public final zza x(C0079zzb zzb) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).T(zzb);
                return this;
            }

            public final zza y(zzf zzf) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).U(zzf);
                return this;
            }

            public final zza z(zzg zzg) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zzb) this.f8750c).V(zzg);
                return this;
            }

            /* synthetic */ zza(k90 k90) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzb  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class C0079zzb extends zzegb<C0079zzb, zza> implements zzehn {
            private static volatile zzehy<C0079zzb> zzel;
            /* access modifiers changed from: private */
            public static final C0079zzb zzimp;
            private int zzdw;
            private String zzimo = "";

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzb$zza */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<C0079zzb, zza> implements zzehn {
                private zza() {
                    super(C0079zzb.zzimp);
                }

                public final zza w(String str) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((C0079zzb) this.f8750c).L(str);
                    return this;
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            static {
                C0079zzb zzb = new C0079zzb();
                zzimp = zzb;
                zzegb.x(C0079zzb.class, zzb);
            }

            private C0079zzb() {
            }

            public static zza H() {
                return (zza) zzimp.A();
            }

            /* access modifiers changed from: private */
            public final void L(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzimo = str;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new C0079zzb();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzimp, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzimo"});
                    case 4:
                        return zzimp;
                    case 5:
                        zzehy<C0079zzb> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (C0079zzb.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzimp);
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
        public static final class zzc extends zzegb<zzc, zza> implements zzehn {
            private static volatile zzehy<zzc> zzel;
            /* access modifiers changed from: private */
            public static final zzc zzimr;
            private int zzdw;
            private zzeer zzhup;
            private byte zzill = 2;
            private zzeer zzimq;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zzc, zza> implements zzehn {
                private zza() {
                    super(zzc.zzimr);
                }

                public final zza w(zzeer zzeer) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzc) this.f8750c).I(zzeer);
                    return this;
                }

                public final zza x(zzeer zzeer) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzc) this.f8750c).H(zzeer);
                    return this;
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            static {
                zzc zzc = new zzc();
                zzimr = zzc;
                zzegb.x(zzc.class, zzc);
            }

            private zzc() {
                zzeer zzeer = zzeer.f8716c;
                this.zzimq = zzeer;
                this.zzhup = zzeer;
            }

            /* access modifiers changed from: private */
            public final void H(zzeer zzeer) {
                zzeer.getClass();
                this.zzdw |= 2;
                this.zzhup = zzeer;
            }

            /* access modifiers changed from: private */
            public final void I(zzeer zzeer) {
                zzeer.getClass();
                this.zzdw |= 1;
                this.zzimq = zzeer;
            }

            public static zza M() {
                return (zza) zzimr.A();
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                int i2 = 1;
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzimr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdw", "zzimq", "zzhup"});
                    case 4:
                        return zzimr;
                    case 5:
                        zzehy<zzc> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzc.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzimr);
                                    zzel = zzehy;
                                }
                            }
                        }
                        return zzehy;
                    case 6:
                        return Byte.valueOf(this.zzill);
                    case 7:
                        if (obj == null) {
                            i2 = 0;
                        }
                        this.zzill = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzd extends zzegb<zzd, zza> implements zzehn {
            private static volatile zzehy<zzd> zzel;
            /* access modifiers changed from: private */
            public static final zzd zzimx;
            private int zzdw;
            private byte zzill = 2;
            private C0080zzb zzims;
            private zzegm<zzc> zzimt = zzegb.E();
            private zzeer zzimu;
            private zzeer zzimv;
            private int zzimw;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zzd, zza> implements zzehn {
                private zza() {
                    super(zzd.zzimx);
                }

                public final zza w(zzc zzc) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzd) this.f8750c).H(zzc);
                    return this;
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzd$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0080zzb extends zzegb<C0080zzb, zza> implements zzehn {
                private static volatile zzehy<C0080zzb> zzel;
                /* access modifiers changed from: private */
                public static final C0080zzb zzinb;
                private int zzdw;
                private zzeer zzimy;
                private zzeer zzimz;
                private zzeer zzina;

                /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzd$zzb$zza */
                /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
                public static final class zza extends zzegb.zzb<C0080zzb, zza> implements zzehn {
                    private zza() {
                        super(C0080zzb.zzinb);
                    }

                    /* synthetic */ zza(k90 k90) {
                        this();
                    }
                }

                static {
                    C0080zzb zzb = new C0080zzb();
                    zzinb = zzb;
                    zzegb.x(C0080zzb.class, zzb);
                }

                private C0080zzb() {
                    zzeer zzeer = zzeer.f8716c;
                    this.zzimy = zzeer;
                    this.zzimz = zzeer;
                    this.zzina = zzeer;
                }

                /* access modifiers changed from: protected */
                public final Object t(int i, Object obj, Object obj2) {
                    switch (k90.f4373a[i - 1]) {
                        case 1:
                            return new C0080zzb();
                        case 2:
                            return new zza((k90) null);
                        case 3:
                            return zzegb.u(zzinb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzimy", "zzimz", "zzina"});
                        case 4:
                            return zzinb;
                        case 5:
                            zzehy<C0080zzb> zzehy = zzel;
                            if (zzehy == null) {
                                synchronized (C0080zzb.class) {
                                    zzehy = zzel;
                                    if (zzehy == null) {
                                        zzehy = new zzegb.zza<>(zzinb);
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
                zzd zzd = new zzd();
                zzimx = zzd;
                zzegb.x(zzd.class, zzd);
            }

            private zzd() {
                zzeer zzeer = zzeer.f8716c;
                this.zzimu = zzeer;
                this.zzimv = zzeer;
            }

            /* access modifiers changed from: private */
            public final void H(zzc zzc) {
                zzc.getClass();
                if (!this.zzimt.p()) {
                    this.zzimt = zzegb.s(this.zzimt);
                }
                this.zzimt.add(zzc);
            }

            public static zza I() {
                return (zza) zzimx.A();
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                int i2 = 1;
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzimx, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdw", "zzims", "zzimt", zzc.class, "zzimu", "zzimv", "zzimw"});
                    case 4:
                        return zzimx;
                    case 5:
                        zzehy<zzd> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzd.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzimx);
                                    zzel = zzehy;
                                }
                            }
                        }
                        return zzehy;
                    case 6:
                        return Byte.valueOf(this.zzill);
                    case 7:
                        if (obj == null) {
                            i2 = 0;
                        }
                        this.zzill = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zze extends zzegb<zze, zza> implements zzehn {
            private static volatile zzehy<zze> zzel;
            /* access modifiers changed from: private */
            public static final zze zzine;
            private int zzdw;
            private byte zzill = 2;
            private zzegm<zzc> zzimt = zzegb.E();
            private zzeer zzimu;
            private zzeer zzimv;
            private int zzimw;
            private C0081zzb zzinc;
            private zzeer zzind;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zze, zza> implements zzehn {
                private zza() {
                    super(zze.zzine);
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zze$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0081zzb extends zzegb<C0081zzb, zza> implements zzehn {
                private static volatile zzehy<C0081zzb> zzel;
                /* access modifiers changed from: private */
                public static final C0081zzb zzinh;
                private int zzdw;
                private zzeer zzina;
                private int zzinf;
                private zzeer zzing;

                /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zze$zzb$zza */
                /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
                public static final class zza extends zzegb.zzb<C0081zzb, zza> implements zzehn {
                    private zza() {
                        super(C0081zzb.zzinh);
                    }

                    /* synthetic */ zza(k90 k90) {
                        this();
                    }
                }

                static {
                    C0081zzb zzb = new C0081zzb();
                    zzinh = zzb;
                    zzegb.x(C0081zzb.class, zzb);
                }

                private C0081zzb() {
                    zzeer zzeer = zzeer.f8716c;
                    this.zzing = zzeer;
                    this.zzina = zzeer;
                }

                /* access modifiers changed from: protected */
                public final Object t(int i, Object obj, Object obj2) {
                    switch (k90.f4373a[i - 1]) {
                        case 1:
                            return new C0081zzb();
                        case 2:
                            return new zza((k90) null);
                        case 3:
                            return zzegb.u(zzinh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzinf", "zzing", "zzina"});
                        case 4:
                            return zzinh;
                        case 5:
                            zzehy<C0081zzb> zzehy = zzel;
                            if (zzehy == null) {
                                synchronized (C0081zzb.class) {
                                    zzehy = zzel;
                                    if (zzehy == null) {
                                        zzehy = new zzegb.zza<>(zzinh);
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
                zze zze = new zze();
                zzine = zze;
                zzegb.x(zze.class, zze);
            }

            private zze() {
                zzeer zzeer = zzeer.f8716c;
                this.zzimu = zzeer;
                this.zzimv = zzeer;
                this.zzind = zzeer;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                int i2 = 1;
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzine, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdw", "zzinc", "zzimt", zzc.class, "zzimu", "zzimv", "zzimw", "zzind"});
                    case 4:
                        return zzine;
                    case 5:
                        zzehy<zze> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zze.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzine);
                                    zzel = zzehy;
                                }
                            }
                        }
                        return zzehy;
                    case 6:
                        return Byte.valueOf(this.zzill);
                    case 7:
                        if (obj == null) {
                            i2 = 0;
                        }
                        this.zzill = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzf extends zzegb<zzf, zza> implements zzehn {
            private static volatile zzehy<zzf> zzel;
            /* access modifiers changed from: private */
            public static final zzf zzink;
            private int zzbzv;
            private int zzdw;
            private String zzini = "";
            private zzeer zzinj = zzeer.f8716c;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zzf, zza> implements zzehn {
                private zza() {
                    super(zzf.zzink);
                }

                public final zza w(C0082zzb zzb) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzf) this.f8750c).N(zzb);
                    return this;
                }

                public final zza x(zzeer zzeer) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzf) this.f8750c).M(zzeer);
                    return this;
                }

                public final zza y(String str) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzf) this.f8750c).G(str);
                    return this;
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzf$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public enum C0082zzb implements zzegg {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                

                /* renamed from: b  reason: collision with root package name */
                private final int f8799b;

                private C0082zzb(int i) {
                    this.f8799b = i;
                }

                public static C0082zzb f(int i) {
                    if (i == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                public static zzegi g() {
                    return m90.f4551a;
                }

                public final int i() {
                    return this.f8799b;
                }

                public final String toString() {
                    return "<" + C0082zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8799b + " name=" + name() + '>';
                }
            }

            static {
                zzf zzf = new zzf();
                zzink = zzf;
                zzegb.x(zzf.class, zzf);
            }

            private zzf() {
            }

            /* access modifiers changed from: private */
            public final void G(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zzini = str;
            }

            /* access modifiers changed from: private */
            public final void M(zzeer zzeer) {
                zzeer.getClass();
                this.zzdw |= 4;
                this.zzinj = zzeer;
            }

            /* access modifiers changed from: private */
            public final void N(C0082zzb zzb) {
                this.zzbzv = zzb.i();
                this.zzdw |= 1;
            }

            public static zza P() {
                return (zza) zzink.A();
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzink, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzbzv", C0082zzb.g(), "zzini", "zzinj"});
                    case 4:
                        return zzink;
                    case 5:
                        zzehy<zzf> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzf.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzink);
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
        public enum zzg implements zzegg {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f8804b;

            private zzg(int i) {
                this.f8804b = i;
            }

            public static zzg f(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzegi g() {
                return n90.f4645a;
            }

            public final int i() {
                return this.f8804b;
            }

            public final String toString() {
                return "<" + zzg.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8804b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzh extends zzegb<zzh, C0083zzb> implements zzehn {
            private static volatile zzehy<zzh> zzel;
            /* access modifiers changed from: private */
            public static final zzh zziom;
            private int zzdw;
            private byte zzill = 2;
            private String zzilo = "";
            private int zzioe;
            private zzd zziof;
            private zze zziog;
            private int zzioh;
            private zzegh zzioi = zzegb.C();
            private String zzioj = "";
            private int zziok;
            private zzegm<String> zziol = zzegb.E();

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public enum zza implements zzegg {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                

                /* renamed from: b  reason: collision with root package name */
                private final int f8809b;

                private zza(int i) {
                    this.f8809b = i;
                }

                public static zza f(int i) {
                    if (i == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (i == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (i == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                public static zzegi g() {
                    return o90.f4721a;
                }

                public final int i() {
                    return this.f8809b;
                }

                public final String toString() {
                    return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8809b + " name=" + name() + '>';
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzejv$zzb$zzh$zzb  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class C0083zzb extends zzegb.zzb<zzh, C0083zzb> implements zzehn {
                private C0083zzb() {
                    super(zzh.zziom);
                }

                public final C0083zzb C(String str) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzh) this.f8750c).W(str);
                    return this;
                }

                public final C0083zzb w(zzd zzd) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzh) this.f8750c).L(zzd);
                    return this;
                }

                public final C0083zzb x(zza zza) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzh) this.f8750c).M(zza);
                    return this;
                }

                public final C0083zzb y(int i) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzh) this.f8750c).H(i);
                    return this;
                }

                public final C0083zzb z(String str) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzh) this.f8750c).I(str);
                    return this;
                }

                /* synthetic */ C0083zzb(k90 k90) {
                    this();
                }
            }

            static {
                zzh zzh = new zzh();
                zziom = zzh;
                zzegb.x(zzh.class, zzh);
            }

            private zzh() {
            }

            /* access modifiers changed from: private */
            public final void H(int i) {
                this.zzdw |= 1;
                this.zzioe = i;
            }

            /* access modifiers changed from: private */
            public final void I(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zzilo = str;
            }

            /* access modifiers changed from: private */
            public final void L(zzd zzd) {
                zzd.getClass();
                this.zziof = zzd;
                this.zzdw |= 4;
            }

            /* access modifiers changed from: private */
            public final void M(zza zza2) {
                this.zziok = zza2.i();
                this.zzdw |= 64;
            }

            public static C0083zzb U() {
                return (C0083zzb) zziom.A();
            }

            /* access modifiers changed from: private */
            public final void W(String str) {
                str.getClass();
                if (!this.zziol.p()) {
                    this.zziol = zzegb.s(this.zziol);
                }
                this.zziol.add(str);
            }

            public final String G() {
                return this.zzilo;
            }

            public final int T() {
                return this.zziol.size();
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                int i2 = 1;
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0083zzb((k90) null);
                    case 3:
                        return zzegb.u(zziom, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdw", "zzioe", "zzilo", "zziof", "zziog", "zzioh", "zzioi", "zzioj", "zziok", zza.g(), "zziol"});
                    case 4:
                        return zziom;
                    case 5:
                        zzehy<zzh> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzh.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zziom);
                                    zzel = zzehy;
                                }
                            }
                        }
                        return zzehy;
                    case 6:
                        return Byte.valueOf(this.zzill);
                    case 7:
                        if (obj == null) {
                            i2 = 0;
                        }
                        this.zzill = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class zzi extends zzegb<zzi, zza> implements zzehn {
            private static volatile zzehy<zzi> zzel;
            /* access modifiers changed from: private */
            public static final zzi zzioq;
            private int zzdw;
            private String zzion = "";
            private long zzioo;
            private boolean zziop;

            /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
            public static final class zza extends zzegb.zzb<zzi, zza> implements zzehn {
                private zza() {
                    super(zzi.zzioq);
                }

                public final zza w(boolean z) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzi) this.f8750c).N(z);
                    return this;
                }

                public final zza x(long j) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzi) this.f8750c).P(j);
                    return this;
                }

                public final zza y(String str) {
                    if (this.f8751d) {
                        r();
                        this.f8751d = false;
                    }
                    ((zzi) this.f8750c).Q(str);
                    return this;
                }

                /* synthetic */ zza(k90 k90) {
                    this();
                }
            }

            static {
                zzi zzi = new zzi();
                zzioq = zzi;
                zzegb.x(zzi.class, zzi);
            }

            private zzi() {
            }

            public static zza L() {
                return (zza) zzioq.A();
            }

            /* access modifiers changed from: private */
            public final void N(boolean z) {
                this.zzdw |= 4;
                this.zziop = z;
            }

            /* access modifiers changed from: private */
            public final void P(long j) {
                this.zzdw |= 2;
                this.zzioo = j;
            }

            /* access modifiers changed from: private */
            public final void Q(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzion = str;
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (k90.f4373a[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza((k90) null);
                    case 3:
                        return zzegb.u(zzioq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdw", "zzion", "zzioo", "zziop"});
                    case 4:
                        return zzioq;
                    case 5:
                        zzehy<zzi> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzi.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzioq);
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
            zzimn = zzb;
            zzegb.x(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        public final void H(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzilo = str;
        }

        /* access modifiers changed from: private */
        public final void T(C0079zzb zzb) {
            zzb.getClass();
            this.zzimb = zzb;
            this.zzdw |= 32;
        }

        /* access modifiers changed from: private */
        public final void U(zzf zzf2) {
            zzf2.getClass();
            this.zzime = zzf2;
            this.zzdw |= 128;
        }

        /* access modifiers changed from: private */
        public final void V(zzg zzg2) {
            this.zzbzv = zzg2.i();
            this.zzdw |= 1;
        }

        /* access modifiers changed from: private */
        public final void W(zzh zzh2) {
            zzh2.getClass();
            if (!this.zzimc.p()) {
                this.zzimc = zzegb.s(this.zzimc);
            }
            this.zzimc.add(zzh2);
        }

        /* access modifiers changed from: private */
        public final void X(zzi zzi2) {
            zzi2.getClass();
            this.zzimk = zzi2;
            this.zzdw |= 8192;
        }

        /* access modifiers changed from: private */
        public final void c0() {
            this.zzdw &= -65;
            this.zzimd = zzimn.zzimd;
        }

        public static zza d0() {
            return (zza) zzimn.A();
        }

        /* access modifiers changed from: private */
        public final void g0(String str) {
            str.getClass();
            this.zzdw |= 64;
            this.zzimd = str;
        }

        /* access modifiers changed from: private */
        public final void h0(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzilz = str;
        }

        /* access modifiers changed from: private */
        public final void i0(Iterable<String> iterable) {
            if (!this.zziml.p()) {
                this.zziml = zzegb.s(this.zziml);
            }
            zzeeh.a(iterable, this.zziml);
        }

        /* access modifiers changed from: private */
        public final void j0(Iterable<String> iterable) {
            if (!this.zzimm.p()) {
                this.zzimm = zzegb.s(this.zzimm);
            }
            zzeeh.a(iterable, this.zzimm);
        }

        public final String G() {
            return this.zzilo;
        }

        public final List<zzh> a0() {
            return this.zzimc;
        }

        public final String b0() {
            return this.zzimd;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            int i2 = 1;
            switch (k90.f4373a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((k90) null);
                case 3:
                    return zzegb.u(zzimn, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdw", "zzilo", "zzilz", "zzima", "zzimc", zzh.class, "zzimf", "zzimg", "zzimh", "zzimi", "zzimj", "zzbzv", zzg.g(), "zzily", zza.zzc.g(), "zzimb", "zzimd", "zzime", "zzilh", "zzimk", "zziml", "zzimm"});
                case 4:
                    return zzimn;
                case 5:
                    zzehy<zzb> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zzb.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzimn);
                                zzel = zzehy;
                            }
                        }
                    }
                    return zzehy;
                case 6:
                    return Byte.valueOf(this.zzill);
                case 7:
                    if (obj == null) {
                        i2 = 0;
                    }
                    this.zzill = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
