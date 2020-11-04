package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzbt {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zza extends zzfo<zza, C0090zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zza zzi;
        private static volatile zzhj<zza> zzj;
        private int zzc;
        private int zzd;
        private zzfx<zze> zze = zzfo.C();
        private zzfx<zzb> zzf = zzfo.C();
        private boolean zzg;
        private boolean zzh;

        /* renamed from: com.google.android.gms.internal.measurement.zzbt$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class C0090zza extends zzfo.zza<zza, C0090zza> implements zzgy {
            private C0090zza() {
                super(zza.zzi);
            }

            public final int C() {
                return ((zza) this.f9632c).M();
            }

            public final C0090zza D(int i, zzb.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).E(i, (zzb) ((zzfo) zza.q()));
                return this;
            }

            public final C0090zza E(int i, zze.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).F(i, (zze) ((zzfo) zza.q()));
                return this;
            }

            public final zze F(int i) {
                return ((zza) this.f9632c).D(i);
            }

            public final int H() {
                return ((zza) this.f9632c).P();
            }

            public final zzb I(int i) {
                return ((zza) this.f9632c).K(i);
            }

            /* synthetic */ C0090zza(c0 c0Var) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzi = zza;
            zzfo.u(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void E(int i, zzb zzb) {
            zzb.getClass();
            zzfx<zzb> zzfx = this.zzf;
            if (!zzfx.a()) {
                this.zzf = zzfo.p(zzfx);
            }
            this.zzf.set(i, zzb);
        }

        /* access modifiers changed from: private */
        public final void F(int i, zze zze2) {
            zze2.getClass();
            zzfx<zze> zzfx = this.zze;
            if (!zzfx.a()) {
                this.zze = zzfo.p(zzfx);
            }
            this.zze.set(i, zze2);
        }

        public final zze D(int i) {
            return this.zze.get(i);
        }

        public final boolean I() {
            return (this.zzc & 1) != 0;
        }

        public final int J() {
            return this.zzd;
        }

        public final zzb K(int i) {
            return this.zzf.get(i);
        }

        public final List<zze> L() {
            return this.zze;
        }

        public final int M() {
            return this.zze.size();
        }

        public final List<zzb> O() {
            return this.zzf;
        }

        public final int P() {
            return this.zzf.size();
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0090zza((c0) null);
                case 3:
                    return zzfo.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", zze.class, "zzf", zzb.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzhj<zza> zzhj = zzj;
                    if (zzhj == null) {
                        synchronized (zza.class) {
                            zzhj = zzj;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzi);
                                zzj = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zzb extends zzfo<zzb, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzb zzl;
        private static volatile zzhj<zzb> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzfx<zzc> zzf = zzfo.C();
        private boolean zzg;
        private zzd zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzb, zza> implements zzgy {
            private zza() {
                super(zzb.zzl);
            }

            public final zza C(int i, zzc zzc) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).E(i, zzc);
                return this;
            }

            public final zza D(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).H(str);
                return this;
            }

            public final zzc E(int i) {
                return ((zzb) this.f9632c).D(i);
            }

            public final String F() {
                return ((zzb) this.f9632c).K();
            }

            public final int H() {
                return ((zzb) this.f9632c).M();
            }

            /* synthetic */ zza(c0 c0Var) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzl = zzb;
            zzfo.u(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        public final void E(int i, zzc zzc2) {
            zzc2.getClass();
            zzfx<zzc> zzfx = this.zzf;
            if (!zzfx.a()) {
                this.zzf = zzfo.p(zzfx);
            }
            this.zzf.set(i, zzc2);
        }

        /* access modifiers changed from: private */
        public final void H(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static zza U() {
            return (zza) zzl.w();
        }

        public final zzc D(int i) {
            return this.zzf.get(i);
        }

        public final boolean I() {
            return (this.zzc & 1) != 0;
        }

        public final int J() {
            return this.zzd;
        }

        public final String K() {
            return this.zze;
        }

        public final List<zzc> L() {
            return this.zzf;
        }

        public final int M() {
            return this.zzf.size();
        }

        public final boolean O() {
            return (this.zzc & 8) != 0;
        }

        public final zzd P() {
            zzd zzd2 = this.zzh;
            return zzd2 == null ? zzd.O() : zzd2;
        }

        public final boolean Q() {
            return this.zzi;
        }

        public final boolean R() {
            return this.zzj;
        }

        public final boolean S() {
            return (this.zzc & 64) != 0;
        }

        public final boolean T() {
            return this.zzk;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((c0) null);
                case 3:
                    return zzfo.s(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzhj<zzb> zzhj = zzm;
                    if (zzhj == null) {
                        synchronized (zzb.class) {
                            zzhj = zzm;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzl);
                                zzm = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zzc extends zzfo<zzc, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzc zzh;
        private static volatile zzhj<zzc> zzi;
        private int zzc;
        private zzf zzd;
        private zzd zze;
        private boolean zzf;
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzc, zza> implements zzgy {
            private zza() {
                super(zzc.zzh);
            }

            public final zza C(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).E(str);
                return this;
            }

            /* synthetic */ zza(c0 c0Var) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzh = zzc2;
            zzfo.u(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* access modifiers changed from: private */
        public final void E(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        public static zzc O() {
            return zzh;
        }

        public final boolean F() {
            return (this.zzc & 1) != 0;
        }

        public final zzf G() {
            zzf zzf2 = this.zzd;
            return zzf2 == null ? zzf.L() : zzf2;
        }

        public final boolean H() {
            return (this.zzc & 2) != 0;
        }

        public final zzd I() {
            zzd zzd2 = this.zze;
            return zzd2 == null ? zzd.O() : zzd2;
        }

        public final boolean J() {
            return (this.zzc & 4) != 0;
        }

        public final boolean K() {
            return this.zzf;
        }

        public final boolean L() {
            return (this.zzc & 8) != 0;
        }

        public final String M() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((c0) null);
                case 3:
                    return zzfo.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzhj<zzc> zzhj = zzi;
                    if (zzhj == null) {
                        synchronized (zzc.class) {
                            zzhj = zzi;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzh);
                                zzi = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zzd extends zzfo<zzd, zzb> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzd zzi;
        private static volatile zzhj<zzd> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public enum zza implements zzfq {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9564b;

            private zza(int i) {
                this.f9564b = i;
            }

            public static zza f(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static zzfs g() {
                return d0.f9381a;
            }

            public final int a() {
                return this.f9564b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9564b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zzb extends zzfo.zza<zzd, zzb> implements zzgy {
            private zzb() {
                super(zzd.zzi);
            }

            /* synthetic */ zzb(c0 c0Var) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzi = zzd2;
            zzfo.u(zzd.class, zzd2);
        }

        private zzd() {
        }

        public static zzd O() {
            return zzi;
        }

        public final boolean D() {
            return (this.zzc & 1) != 0;
        }

        public final zza E() {
            zza f2 = zza.f(this.zzd);
            return f2 == null ? zza.UNKNOWN_COMPARISON_TYPE : f2;
        }

        public final boolean F() {
            return (this.zzc & 2) != 0;
        }

        public final boolean G() {
            return this.zze;
        }

        public final boolean H() {
            return (this.zzc & 4) != 0;
        }

        public final String I() {
            return this.zzf;
        }

        public final boolean J() {
            return (this.zzc & 8) != 0;
        }

        public final String K() {
            return this.zzg;
        }

        public final boolean L() {
            return (this.zzc & 16) != 0;
        }

        public final String M() {
            return this.zzh;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb((c0) null);
                case 3:
                    return zzfo.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", zza.g(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzhj<zzd> zzhj = zzj;
                    if (zzhj == null) {
                        synchronized (zzd.class) {
                            zzhj = zzj;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzi);
                                zzj = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zze extends zzfo<zze, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zze zzj;
        private static volatile zzhj<zze> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private zzc zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zze, zza> implements zzgy {
            private zza() {
                super(zze.zzj);
            }

            public final zza C(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).E(str);
                return this;
            }

            /* synthetic */ zza(c0 c0Var) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzj = zze2;
            zzfo.u(zze.class, zze2);
        }

        private zze() {
        }

        /* access modifiers changed from: private */
        public final void E(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static zza O() {
            return (zza) zzj.w();
        }

        public final boolean F() {
            return (this.zzc & 1) != 0;
        }

        public final int G() {
            return this.zzd;
        }

        public final String H() {
            return this.zze;
        }

        public final zzc I() {
            zzc zzc2 = this.zzf;
            return zzc2 == null ? zzc.O() : zzc2;
        }

        public final boolean J() {
            return this.zzg;
        }

        public final boolean K() {
            return this.zzh;
        }

        public final boolean L() {
            return (this.zzc & 32) != 0;
        }

        public final boolean M() {
            return this.zzi;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((c0) null);
                case 3:
                    return zzfo.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzhj<zze> zzhj = zzk;
                    if (zzhj == null) {
                        synchronized (zze.class) {
                            zzhj = zzk;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzj);
                                zzk = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zzf extends zzfo<zzf, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzf zzh;
        private static volatile zzhj<zzf> zzi;
        private int zzc;
        private int zzd;
        private String zze = "";
        private boolean zzf;
        private zzfx<String> zzg = zzfo.C();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzf, zza> implements zzgy {
            private zza() {
                super(zzf.zzh);
            }

            /* synthetic */ zza(c0 c0Var) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public enum zzb implements zzfq {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9569b;

            private zzb(int i) {
                this.f9569b = i;
            }

            public static zzb f(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static zzfs g() {
                return e0.f9386a;
            }

            public final int a() {
                return this.f9569b;
            }

            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9569b + " name=" + name() + '>';
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzh = zzf2;
            zzfo.u(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zzf L() {
            return zzh;
        }

        public final boolean D() {
            return (this.zzc & 1) != 0;
        }

        public final zzb E() {
            zzb f2 = zzb.f(this.zzd);
            return f2 == null ? zzb.UNKNOWN_MATCH_TYPE : f2;
        }

        public final boolean F() {
            return (this.zzc & 2) != 0;
        }

        public final String G() {
            return this.zze;
        }

        public final boolean H() {
            return (this.zzc & 4) != 0;
        }

        public final boolean I() {
            return this.zzf;
        }

        public final List<String> J() {
            return this.zzg;
        }

        public final int K() {
            return this.zzg.size();
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (c0.f9366a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((c0) null);
                case 3:
                    return zzfo.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", zzb.g(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzhj<zzf> zzhj = zzi;
                    if (zzhj == null) {
                        synchronized (zzf.class) {
                            zzhj = zzi;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzh);
                                zzi = zzhj;
                            }
                        }
                    }
                    return zzhj;
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
