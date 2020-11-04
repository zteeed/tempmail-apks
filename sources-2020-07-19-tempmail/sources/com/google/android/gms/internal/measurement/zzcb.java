package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzcb {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zza extends zzfo<zza, C0092zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zza zzh;
        private static volatile zzhj<zza> zzi;
        private int zzc;
        private int zzd;
        private zzi zze;
        private zzi zzf;
        private boolean zzg;

        /* renamed from: com.google.android.gms.internal.measurement.zzcb$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class C0092zza extends zzfo.zza<zza, C0092zza> implements zzgy {
            private C0092zza() {
                super(zza.zzh);
            }

            public final C0092zza C(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).D(i);
                return this;
            }

            public final C0092zza D(zzi.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).H((zzi) ((zzfo) zza.q()));
                return this;
            }

            public final C0092zza E(zzi zzi) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).M(zzi);
                return this;
            }

            public final C0092zza F(boolean z) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).I(z);
                return this;
            }

            /* synthetic */ C0092zza(g0 g0Var) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzh = zza;
            zzfo.u(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void D(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* access modifiers changed from: private */
        public final void H(zzi zzi2) {
            zzi2.getClass();
            this.zze = zzi2;
            this.zzc |= 2;
        }

        /* access modifiers changed from: private */
        public final void I(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* access modifiers changed from: private */
        public final void M(zzi zzi2) {
            zzi2.getClass();
            this.zzf = zzi2;
            this.zzc |= 4;
        }

        public static C0092zza T() {
            return (C0092zza) zzh.w();
        }

        public final boolean J() {
            return (this.zzc & 1) != 0;
        }

        public final int K() {
            return this.zzd;
        }

        public final zzi O() {
            zzi zzi2 = this.zze;
            return zzi2 == null ? zzi.d0() : zzi2;
        }

        public final boolean P() {
            return (this.zzc & 4) != 0;
        }

        public final zzi Q() {
            zzi zzi2 = this.zzf;
            return zzi2 == null ? zzi.d0() : zzi2;
        }

        public final boolean R() {
            return (this.zzc & 8) != 0;
        }

        public final boolean S() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0092zza((g0) null);
                case 3:
                    return zzfo.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzhj<zza> zzhj = zzi;
                    if (zzhj == null) {
                        synchronized (zza.class) {
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
    public static final class zzb extends zzfo<zzb, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzb zzf;
        private static volatile zzhj<zzb> zzg;
        private int zzc;
        private int zzd;
        private long zze;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzb, zza> implements zzgy {
            private zza() {
                super(zzb.zzf);
            }

            public final zza C(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).D(i);
                return this;
            }

            public final zza D(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).E(j);
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zzf = zzb;
            zzfo.u(zzb.class, zzb);
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        public final void D(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* access modifiers changed from: private */
        public final void E(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        public static zza L() {
            return (zza) zzf.w();
        }

        public final boolean H() {
            return (this.zzc & 1) != 0;
        }

        public final int I() {
            return this.zzd;
        }

        public final boolean J() {
            return (this.zzc & 2) != 0;
        }

        public final long K() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzb> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzb.class) {
                            zzhj = zzg;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzf);
                                zzg = zzhj;
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
        public static final zzc zzi;
        private static volatile zzhj<zzc> zzj;
        private int zzc;
        private zzfx<zze> zzd = zzfo.C();
        private String zze = "";
        private long zzf;
        private long zzg;
        private int zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzc, zza> implements zzgy {
            private zza() {
                super(zzc.zzi);
            }

            public final zza C(int i, zze.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).F(i, (zze) ((zzfo) zza.q()));
                return this;
            }

            public final zza D(int i, zze zze) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).F(i, zze);
                return this;
            }

            public final zza E(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).G(j);
                return this;
            }

            public final zza F(zze.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).P((zze) ((zzfo) zza.q()));
                return this;
            }

            public final zza H(zze zze) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).P(zze);
                return this;
            }

            public final zza I(Iterable<? extends zze> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).Q(iterable);
                return this;
            }

            public final zza L(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).R(str);
                return this;
            }

            public final zze M(int i) {
                return ((zzc) this.f9632c).D(i);
            }

            public final List<zze> P() {
                return Collections.unmodifiableList(((zzc) this.f9632c).E());
            }

            public final int Q() {
                return ((zzc) this.f9632c).S();
            }

            public final zza R(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).T(i);
                return this;
            }

            public final zza S(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).U(j);
                return this;
            }

            public final zza T() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzc) this.f9632c).g0();
                return this;
            }

            public final String U() {
                return ((zzc) this.f9632c).W();
            }

            public final long V() {
                return ((zzc) this.f9632c).Y();
            }

            public final long W() {
                return ((zzc) this.f9632c).a0();
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzi = zzc2;
            zzfo.u(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* access modifiers changed from: private */
        public final void F(int i, zze zze2) {
            zze2.getClass();
            f0();
            this.zzd.set(i, zze2);
        }

        /* access modifiers changed from: private */
        public final void G(long j) {
            this.zzc |= 2;
            this.zzf = j;
        }

        /* access modifiers changed from: private */
        public final void P(zze zze2) {
            zze2.getClass();
            f0();
            this.zzd.add(zze2);
        }

        /* access modifiers changed from: private */
        public final void Q(Iterable<? extends zze> iterable) {
            f0();
            zzdw.h(iterable, this.zzd);
        }

        /* access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zze = str;
        }

        /* access modifiers changed from: private */
        public final void T(int i) {
            f0();
            this.zzd.remove(i);
        }

        /* access modifiers changed from: private */
        public final void U(long j) {
            this.zzc |= 4;
            this.zzg = j;
        }

        public static zza d0() {
            return (zza) zzi.w();
        }

        private final void f0() {
            zzfx<zze> zzfx = this.zzd;
            if (!zzfx.a()) {
                this.zzd = zzfo.p(zzfx);
            }
        }

        /* access modifiers changed from: private */
        public final void g0() {
            this.zzd = zzfo.C();
        }

        public final zze D(int i) {
            return this.zzd.get(i);
        }

        public final List<zze> E() {
            return this.zzd;
        }

        public final int S() {
            return this.zzd.size();
        }

        public final String W() {
            return this.zze;
        }

        public final boolean X() {
            return (this.zzc & 2) != 0;
        }

        public final long Y() {
            return this.zzf;
        }

        public final boolean Z() {
            return (this.zzc & 4) != 0;
        }

        public final long a0() {
            return this.zzg;
        }

        public final boolean b0() {
            return (this.zzc & 8) != 0;
        }

        public final int c0() {
            return this.zzh;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", zze.class, "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzhj<zzc> zzhj = zzj;
                    if (zzhj == null) {
                        synchronized (zzc.class) {
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
    public static final class zzd extends zzfo<zzd, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzd zzf;
        private static volatile zzhj<zzd> zzg;
        private int zzc;
        private String zzd = "";
        private long zze;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzd, zza> implements zzgy {
            private zza() {
                super(zzd.zzf);
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzf = zzd2;
            zzfo.u(zzd.class, zzd2);
        }

        private zzd() {
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzd> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzd.class) {
                            zzhj = zzg;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzf);
                                zzg = zzhj;
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
        private String zzd = "";
        private String zze = "";
        private long zzf;
        private float zzg;
        private double zzh;
        private zzfx<zze> zzi = zzfo.C();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zze, zza> implements zzgy {
            private zza() {
                super(zze.zzj);
            }

            public final zza C() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).i0();
                return this;
            }

            public final zza D(double d2) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).D(d2);
                return this;
            }

            public final zza E(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).E(j);
                return this;
            }

            public final zza F(zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).X((zze) ((zzfo) zza.q()));
                return this;
            }

            public final zza H(Iterable<? extends zze> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).L(iterable);
                return this;
            }

            public final zza I(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).M(str);
                return this;
            }

            public final zza L() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).j0();
                return this;
            }

            public final zza M(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).S(str);
                return this;
            }

            public final zza P() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).k0();
                return this;
            }

            public final int Q() {
                return ((zze) this.f9632c).f0();
            }

            public final zza R() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zze) this.f9632c).m0();
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
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
        public final void D(double d2) {
            this.zzc |= 16;
            this.zzh = d2;
        }

        /* access modifiers changed from: private */
        public final void E(long j) {
            this.zzc |= 4;
            this.zzf = j;
        }

        /* access modifiers changed from: private */
        public final void L(Iterable<? extends zze> iterable) {
            l0();
            zzdw.h(iterable, this.zzi);
        }

        /* access modifiers changed from: private */
        public final void M(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* access modifiers changed from: private */
        public final void X(zze zze2) {
            zze2.getClass();
            l0();
            this.zzi.add(zze2);
        }

        public static zza g0() {
            return (zza) zzj.w();
        }

        /* access modifiers changed from: private */
        public final void i0() {
            this.zzc &= -3;
            this.zze = zzj.zze;
        }

        /* access modifiers changed from: private */
        public final void j0() {
            this.zzc &= -5;
            this.zzf = 0;
        }

        /* access modifiers changed from: private */
        public final void k0() {
            this.zzc &= -17;
            this.zzh = 0.0d;
        }

        private final void l0() {
            zzfx<zze> zzfx = this.zzi;
            if (!zzfx.a()) {
                this.zzi = zzfo.p(zzfx);
            }
        }

        /* access modifiers changed from: private */
        public final void m0() {
            this.zzi = zzfo.C();
        }

        public final boolean O() {
            return (this.zzc & 1) != 0;
        }

        public final String P() {
            return this.zzd;
        }

        public final boolean U() {
            return (this.zzc & 2) != 0;
        }

        public final String V() {
            return this.zze;
        }

        public final boolean Y() {
            return (this.zzc & 4) != 0;
        }

        public final long Z() {
            return this.zzf;
        }

        public final boolean a0() {
            return (this.zzc & 8) != 0;
        }

        public final float b0() {
            return this.zzg;
        }

        public final boolean c0() {
            return (this.zzc & 16) != 0;
        }

        public final double d0() {
            return this.zzh;
        }

        public final List<zze> e0() {
            return this.zzi;
        }

        public final int f0() {
            return this.zzi.size();
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            Class<zze> cls = zze.class;
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
                case 4:
                    return zzj;
                case 5:
                    zzhj<zze> zzhj = zzk;
                    if (zzhj == null) {
                        synchronized (cls) {
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
        public static final zzf zzd;
        private static volatile zzhj<zzf> zze;
        private zzfx<zzg> zzc = zzfo.C();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzf, zza> implements zzgy {
            private zza() {
                super(zzf.zzd);
            }

            public final zza C(zzg.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzf) this.f9632c).G((zzg) ((zzfo) zza.q()));
                return this;
            }

            public final zzg D(int i) {
                return ((zzf) this.f9632c).D(0);
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzf zzf = new zzf();
            zzd = zzf;
            zzfo.u(zzf.class, zzf);
        }

        private zzf() {
        }

        /* access modifiers changed from: private */
        public final void G(zzg zzg) {
            zzg.getClass();
            zzfx<zzg> zzfx = this.zzc;
            if (!zzfx.a()) {
                this.zzc = zzfo.p(zzfx);
            }
            this.zzc.add(zzg);
        }

        public static zza H() {
            return (zza) zzd.w();
        }

        public final zzg D(int i) {
            return this.zzc.get(0);
        }

        public final List<zzg> E() {
            return this.zzc;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzg.class});
                case 4:
                    return zzd;
                case 5:
                    zzhj<zzf> zzhj = zze;
                    if (zzhj == null) {
                        synchronized (zzf.class) {
                            zzhj = zze;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzd);
                                zze = zzhj;
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
    public static final class zzg extends zzfo<zzg, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzg zzav;
        private static volatile zzhj<zzg> zzaw;
        private int zzaa;
        private String zzab = "";
        private String zzac = "";
        private boolean zzad;
        private zzfx<zza> zzae = zzfo.C();
        private String zzaf = "";
        private int zzag;
        private int zzah;
        private int zzai;
        private String zzaj = "";
        private long zzak;
        private long zzal;
        private String zzam = "";
        private String zzan = "";
        private int zzao;
        private String zzap = "";
        private zzh zzaq;
        private zzfv zzar = zzfo.y();
        private long zzas;
        private long zzat;
        private String zzau = "";
        private int zzc;
        private int zzd;
        private int zze;
        private zzfx<zzc> zzf = zzfo.C();
        private zzfx<zzk> zzg = zzfo.C();
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private String zzm = "";
        private String zzn = "";
        private String zzo = "";
        private String zzp = "";
        private int zzq;
        private String zzr = "";
        private String zzs = "";
        private String zzt = "";
        private long zzu;
        private long zzv;
        private String zzw = "";
        private boolean zzx;
        private String zzy = "";
        private long zzz;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzg, zza> implements zzgy {
            private zza() {
                super(zzg.zzav);
            }

            public final zza A0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).X1(str);
                return this;
            }

            public final zza B0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).b2(j);
                return this;
            }

            public final zza C(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).h1(1);
                return this;
            }

            public final zza C0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).e2(str);
                return this;
            }

            public final zza D(int i, zzc.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).E(i, (zzc) ((zzfo) zza.q()));
                return this;
            }

            public final String D0() {
                return ((zzg) this.f9632c).I2();
            }

            public final zza E(int i, zzk zzk) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).F(i, zzk);
                return this;
            }

            public final zza E0() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).U0();
                return this;
            }

            public final zza F(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).G(j);
                return this;
            }

            public final zza F0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).f2(j);
                return this;
            }

            public final zza G0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).i2(str);
                return this;
            }

            public final zza H(zzc.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).H((zzc) ((zzfo) zza.q()));
                return this;
            }

            public final zza H0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).l2(j);
                return this;
            }

            public final zza I(zzk.zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).T((zzk) ((zzfo) zza.q()));
                return this;
            }

            public final zza I0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).o2(str);
                return this;
            }

            public final String J0() {
                return ((zzg) this.f9632c).k0();
            }

            public final zza K0() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).V0();
                return this;
            }

            public final zza L(zzk zzk) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).T(zzk);
                return this;
            }

            public final zza L0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).q2(str);
                return this;
            }

            public final zza M(Iterable<? extends zzc> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).U(iterable);
                return this;
            }

            public final zza M0() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).W0();
                return this;
            }

            public final zza N0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).u2((String) null);
                return this;
            }

            public final zza O0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).w2(str);
                return this;
            }

            public final zza P(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).V(str);
                return this;
            }

            public final String P0() {
                return ((zzg) this.f9632c).M0();
            }

            public final zza Q(boolean z) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).W(z);
                return this;
            }

            public final zza Q0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).A2(str);
                return this;
            }

            public final List<zzc> R() {
                return Collections.unmodifiableList(((zzg) this.f9632c).X0());
            }

            public final int S() {
                return ((zzg) this.f9632c).g1();
            }

            public final zzc T(int i) {
                return ((zzg) this.f9632c).D(i);
            }

            public final zza U(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).A0(j);
                return this;
            }

            public final zza V(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).G0(str);
                return this;
            }

            public final zza W(boolean z) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).H0(z);
                return this;
            }

            public final zza X() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).Q0();
                return this;
            }

            public final zza Y(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).r1(i);
                return this;
            }

            public final zza Z(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).Y0(j);
                return this;
            }

            public final zza a0(Iterable<? extends zza> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).e1(iterable);
                return this;
            }

            public final zza b0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).f1(str);
                return this;
            }

            public final zza c0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).i1(j);
                return this;
            }

            public final zza d0(Iterable<? extends Integer> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).o1(iterable);
                return this;
            }

            public final zza e0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).p1(str);
                return this;
            }

            public final zzk f0(int i) {
                return ((zzg) this.f9632c).z0(i);
            }

            public final List<zzk> g0() {
                return Collections.unmodifiableList(((zzg) this.f9632c).q1());
            }

            public final int h0() {
                return ((zzg) this.f9632c).y1();
            }

            public final zza i0(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).z1(i);
                return this;
            }

            public final zza j0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).s1(j);
                return this;
            }

            public final zza k0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).x1(str);
                return this;
            }

            public final long l0() {
                return ((zzg) this.f9632c).Z1();
            }

            public final zza m0(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).G1(i);
                return this;
            }

            public final zza n0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).A1(j);
                return this;
            }

            public final zza o0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).F1(str);
                return this;
            }

            public final long p0() {
                return ((zzg) this.f9632c).k2();
            }

            public final zza q0(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).O1(i);
                return this;
            }

            public final zza r0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).H1(j);
                return this;
            }

            public final zza s0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).L1(str);
                return this;
            }

            public final zza t0() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).S0();
                return this;
            }

            public final zza u0(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).T1(i);
                return this;
            }

            public final zza v0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).P1(j);
                return this;
            }

            public final zza w0(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).S1(str);
                return this;
            }

            public final zza x0() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).T0();
                return this;
            }

            public final zza y0(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).a2(i);
                return this;
            }

            public final zza z0(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzg) this.f9632c).U1(j);
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzav = zzg2;
            zzfo.u(zzg.class, zzg2);
        }

        private zzg() {
        }

        /* access modifiers changed from: private */
        public final void A0(long j) {
            this.zzc |= 4;
            this.zzi = j;
        }

        /* access modifiers changed from: private */
        public final void A1(long j) {
            this.zzc |= 16384;
            this.zzu = j;
        }

        /* access modifiers changed from: private */
        public final void A2(String str) {
            str.getClass();
            this.zzd |= 64;
            this.zzau = str;
        }

        /* access modifiers changed from: private */
        public final void E(int i, zzc zzc2) {
            zzc2.getClass();
            P0();
            this.zzf.set(i, zzc2);
        }

        /* access modifiers changed from: private */
        public final void F(int i, zzk zzk2) {
            zzk2.getClass();
            R0();
            this.zzg.set(i, zzk2);
        }

        /* access modifiers changed from: private */
        public final void F1(String str) {
            str.getClass();
            this.zzc |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            this.zzs = str;
        }

        /* access modifiers changed from: private */
        public final void G(long j) {
            this.zzc |= 2;
            this.zzh = j;
        }

        /* access modifiers changed from: private */
        public final void G0(String str) {
            str.getClass();
            this.zzc |= 128;
            this.zzn = str;
        }

        /* access modifiers changed from: private */
        public final void G1(int i) {
            this.zzc |= 1024;
            this.zzq = i;
        }

        /* access modifiers changed from: private */
        public final void H(zzc zzc2) {
            zzc2.getClass();
            P0();
            this.zzf.add(zzc2);
        }

        /* access modifiers changed from: private */
        public final void H0(boolean z) {
            this.zzc |= 8388608;
            this.zzad = z;
        }

        /* access modifiers changed from: private */
        public final void H1(long j) {
            this.zzc |= 32768;
            this.zzv = j;
        }

        /* access modifiers changed from: private */
        public final void L1(String str) {
            str.getClass();
            this.zzc |= 8192;
            this.zzt = str;
        }

        public static zza N0() {
            return (zza) zzav.w();
        }

        /* access modifiers changed from: private */
        public final void O1(int i) {
            this.zzc |= 1048576;
            this.zzaa = i;
        }

        private final void P0() {
            zzfx<zzc> zzfx = this.zzf;
            if (!zzfx.a()) {
                this.zzf = zzfo.p(zzfx);
            }
        }

        /* access modifiers changed from: private */
        public final void P1(long j) {
            this.zzc |= 524288;
            this.zzz = j;
        }

        /* access modifiers changed from: private */
        public final void Q0() {
            this.zzf = zzfo.C();
        }

        private final void R0() {
            zzfx<zzk> zzfx = this.zzg;
            if (!zzfx.a()) {
                this.zzg = zzfo.p(zzfx);
            }
        }

        /* access modifiers changed from: private */
        public final void S0() {
            this.zzc &= -17;
            this.zzk = 0;
        }

        /* access modifiers changed from: private */
        public final void S1(String str) {
            str.getClass();
            this.zzc |= 65536;
            this.zzw = str;
        }

        /* access modifiers changed from: private */
        public final void T(zzk zzk2) {
            zzk2.getClass();
            R0();
            this.zzg.add(zzk2);
        }

        /* access modifiers changed from: private */
        public final void T0() {
            this.zzc &= -33;
            this.zzl = 0;
        }

        /* access modifiers changed from: private */
        public final void T1(int i) {
            this.zzc |= 33554432;
            this.zzag = i;
        }

        /* access modifiers changed from: private */
        public final void U(Iterable<? extends zzc> iterable) {
            P0();
            zzdw.h(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        public final void U0() {
            this.zzc &= -2097153;
            this.zzab = zzav.zzab;
        }

        /* access modifiers changed from: private */
        public final void U1(long j) {
            this.zzc |= 536870912;
            this.zzak = j;
        }

        /* access modifiers changed from: private */
        public final void V(String str) {
            str.getClass();
            this.zzc |= 64;
            this.zzm = str;
        }

        /* access modifiers changed from: private */
        public final void V0() {
            this.zzae = zzfo.C();
        }

        /* access modifiers changed from: private */
        public final void W(boolean z) {
            this.zzc |= 131072;
            this.zzx = z;
        }

        /* access modifiers changed from: private */
        public final void W0() {
            this.zzc &= Integer.MAX_VALUE;
            this.zzam = zzav.zzam;
        }

        /* access modifiers changed from: private */
        public final void X1(String str) {
            str.getClass();
            this.zzc |= 262144;
            this.zzy = str;
        }

        /* access modifiers changed from: private */
        public final void Y0(long j) {
            this.zzc |= 8;
            this.zzj = j;
        }

        /* access modifiers changed from: private */
        public final void a2(int i) {
            this.zzd |= 2;
            this.zzao = i;
        }

        /* access modifiers changed from: private */
        public final void b2(long j) {
            this.zzc |= 1073741824;
            this.zzal = j;
        }

        /* access modifiers changed from: private */
        public final void e1(Iterable<? extends zza> iterable) {
            zzfx<zza> zzfx = this.zzae;
            if (!zzfx.a()) {
                this.zzae = zzfo.p(zzfx);
            }
            zzdw.h(iterable, this.zzae);
        }

        /* access modifiers changed from: private */
        public final void e2(String str) {
            str.getClass();
            this.zzc |= 2097152;
            this.zzab = str;
        }

        /* access modifiers changed from: private */
        public final void f1(String str) {
            str.getClass();
            this.zzc |= 256;
            this.zzo = str;
        }

        /* access modifiers changed from: private */
        public final void f2(long j) {
            this.zzd |= 16;
            this.zzas = j;
        }

        /* access modifiers changed from: private */
        public final void h1(int i) {
            this.zzc |= 1;
            this.zze = i;
        }

        /* access modifiers changed from: private */
        public final void i1(long j) {
            this.zzc |= 16;
            this.zzk = j;
        }

        /* access modifiers changed from: private */
        public final void i2(String str) {
            str.getClass();
            this.zzc |= 4194304;
            this.zzac = str;
        }

        /* access modifiers changed from: private */
        public final void l2(long j) {
            this.zzd |= 32;
            this.zzat = j;
        }

        /* access modifiers changed from: private */
        public final void o1(Iterable<? extends Integer> iterable) {
            zzfv zzfv = this.zzar;
            if (!zzfv.a()) {
                int size = zzfv.size();
                this.zzar = zzfv.g(size == 0 ? 10 : size << 1);
            }
            zzdw.h(iterable, this.zzar);
        }

        /* access modifiers changed from: private */
        public final void o2(String str) {
            str.getClass();
            this.zzc |= 16777216;
            this.zzaf = str;
        }

        /* access modifiers changed from: private */
        public final void p1(String str) {
            str.getClass();
            this.zzc |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.zzp = str;
        }

        /* access modifiers changed from: private */
        public final void q2(String str) {
            str.getClass();
            this.zzc |= 268435456;
            this.zzaj = str;
        }

        /* access modifiers changed from: private */
        public final void r1(int i) {
            P0();
            this.zzf.remove(i);
        }

        /* access modifiers changed from: private */
        public final void s1(long j) {
            this.zzc |= 32;
            this.zzl = j;
        }

        /* access modifiers changed from: private */
        public final void u2(String str) {
            str.getClass();
            this.zzc |= Integer.MIN_VALUE;
            this.zzam = str;
        }

        /* access modifiers changed from: private */
        public final void w2(String str) {
            str.getClass();
            this.zzd |= 4;
            this.zzap = str;
        }

        /* access modifiers changed from: private */
        public final void x1(String str) {
            str.getClass();
            this.zzc |= 2048;
            this.zzr = str;
        }

        /* access modifiers changed from: private */
        public final void z1(int i) {
            R0();
            this.zzg.remove(i);
        }

        public final String B2() {
            return this.zzm;
        }

        public final String C2() {
            return this.zzn;
        }

        public final zzc D(int i) {
            return this.zzf.get(i);
        }

        public final String D2() {
            return this.zzo;
        }

        public final String E2() {
            return this.zzp;
        }

        public final boolean F2() {
            return (this.zzc & 1024) != 0;
        }

        public final int G2() {
            return this.zzq;
        }

        public final String H2() {
            return this.zzr;
        }

        public final int I0() {
            return this.zzao;
        }

        public final String I2() {
            return this.zzs;
        }

        public final String J0() {
            return this.zzap;
        }

        public final String J2() {
            return this.zzt;
        }

        public final boolean K0() {
            return (this.zzd & 16) != 0;
        }

        public final boolean K2() {
            return (this.zzc & 16384) != 0;
        }

        public final long L0() {
            return this.zzas;
        }

        public final String M0() {
            return this.zzau;
        }

        public final boolean M1() {
            return (this.zzc & 2) != 0;
        }

        public final long N1() {
            return this.zzh;
        }

        public final boolean X() {
            return (this.zzc & 1) != 0;
        }

        public final List<zzc> X0() {
            return this.zzf;
        }

        public final long Y() {
            return this.zzu;
        }

        public final boolean Y1() {
            return (this.zzc & 4) != 0;
        }

        public final boolean Z() {
            return (this.zzc & 32768) != 0;
        }

        public final long Z1() {
            return this.zzi;
        }

        public final long a0() {
            return this.zzv;
        }

        public final String b0() {
            return this.zzw;
        }

        public final boolean c0() {
            return (this.zzc & 131072) != 0;
        }

        public final boolean d0() {
            return this.zzx;
        }

        public final String e0() {
            return this.zzy;
        }

        public final boolean f0() {
            return (this.zzc & 524288) != 0;
        }

        public final long g0() {
            return this.zzz;
        }

        public final int g1() {
            return this.zzf.size();
        }

        public final boolean h0() {
            return (this.zzc & 1048576) != 0;
        }

        public final int i0() {
            return this.zzaa;
        }

        public final String j0() {
            return this.zzab;
        }

        public final boolean j2() {
            return (this.zzc & 8) != 0;
        }

        public final String k0() {
            return this.zzac;
        }

        public final long k2() {
            return this.zzj;
        }

        public final boolean l0() {
            return (this.zzc & 8388608) != 0;
        }

        public final boolean m0() {
            return this.zzad;
        }

        public final List<zza> n0() {
            return this.zzae;
        }

        public final String o0() {
            return this.zzaf;
        }

        public final boolean p0() {
            return (this.zzc & 33554432) != 0;
        }

        public final int q0() {
            return this.zzag;
        }

        public final List<zzk> q1() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzav, "\u0001+\u0000\u0002\u00012+\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", zzk.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", zza.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau"});
                case 4:
                    return zzav;
                case 5:
                    zzhj<zzg> zzhj = zzaw;
                    if (zzhj == null) {
                        synchronized (zzg.class) {
                            zzhj = zzaw;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzav);
                                zzaw = zzhj;
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

        public final String r0() {
            return this.zzaj;
        }

        public final boolean r2() {
            return (this.zzc & 16) != 0;
        }

        public final boolean s0() {
            return (this.zzc & 536870912) != 0;
        }

        public final long s2() {
            return this.zzk;
        }

        public final long t0() {
            return this.zzak;
        }

        public final boolean u0() {
            return (this.zzc & 1073741824) != 0;
        }

        public final long v0() {
            return this.zzal;
        }

        public final String w0() {
            return this.zzam;
        }

        public final boolean x0() {
            return (this.zzd & 2) != 0;
        }

        public final boolean x2() {
            return (this.zzc & 32) != 0;
        }

        public final int y0() {
            return this.zze;
        }

        public final int y1() {
            return this.zzg.size();
        }

        public final long y2() {
            return this.zzl;
        }

        public final zzk z0(int i) {
            return this.zzg.get(i);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zzh extends zzfo<zzh, zzb> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzh zzf;
        private static volatile zzhj<zzh> zzg;
        private int zzc;
        private int zzd = 1;
        private zzfx<zzd> zze = zzfo.C();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public enum zza implements zzfq {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f9573b;

            private zza(int i) {
                this.f9573b = i;
            }

            public static zza f(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static zzfs g() {
                return h0.f9406a;
            }

            public final int a() {
                return this.f9573b;
            }

            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9573b + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zzb extends zzfo.zza<zzh, zzb> implements zzgy {
            private zzb() {
                super(zzh.zzf);
            }

            /* synthetic */ zzb(g0 g0Var) {
                this();
            }
        }

        static {
            zzh zzh = new zzh();
            zzf = zzh;
            zzfo.u(zzh.class, zzh);
        }

        private zzh() {
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb((g0) null);
                case 3:
                    return zzfo.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", zza.g(), "zze", zzd.class});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzh> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzh.class) {
                            zzhj = zzg;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzf);
                                zzg = zzhj;
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
    public static final class zzi extends zzfo<zzi, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzi zzg;
        private static volatile zzhj<zzi> zzh;
        private zzfu zzc = zzfo.z();
        private zzfu zzd = zzfo.z();
        private zzfx<zzb> zze = zzfo.C();
        private zzfx<zzj> zzf = zzfo.C();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzi, zza> implements zzgy {
            private zza() {
                super(zzi.zzg);
            }

            public final zza C() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).f0();
                return this;
            }

            public final zza D(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).U(i);
                return this;
            }

            public final zza E(Iterable<? extends Long> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).I(iterable);
                return this;
            }

            public final zza F() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).g0();
                return this;
            }

            public final zza H(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).Y(i);
                return this;
            }

            public final zza I(Iterable<? extends Long> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).P(iterable);
                return this;
            }

            public final zza L(Iterable<? extends zzb> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).S(iterable);
                return this;
            }

            public final zza M(Iterable<? extends zzj> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzi) this.f9632c).W(iterable);
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zzg = zzi;
            zzfo.u(zzi.class, zzi);
        }

        private zzi() {
        }

        /* access modifiers changed from: private */
        public final void I(Iterable<? extends Long> iterable) {
            zzfu zzfu = this.zzc;
            if (!zzfu.a()) {
                this.zzc = zzfo.o(zzfu);
            }
            zzdw.h(iterable, this.zzc);
        }

        /* access modifiers changed from: private */
        public final void P(Iterable<? extends Long> iterable) {
            zzfu zzfu = this.zzd;
            if (!zzfu.a()) {
                this.zzd = zzfo.o(zzfu);
            }
            zzdw.h(iterable, this.zzd);
        }

        /* access modifiers changed from: private */
        public final void S(Iterable<? extends zzb> iterable) {
            h0();
            zzdw.h(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        public final void U(int i) {
            h0();
            this.zze.remove(i);
        }

        /* access modifiers changed from: private */
        public final void W(Iterable<? extends zzj> iterable) {
            i0();
            zzdw.h(iterable, this.zzf);
        }

        /* access modifiers changed from: private */
        public final void Y(int i) {
            i0();
            this.zzf.remove(i);
        }

        public static zza c0() {
            return (zza) zzg.w();
        }

        public static zzi d0() {
            return zzg;
        }

        /* access modifiers changed from: private */
        public final void f0() {
            this.zzc = zzfo.z();
        }

        /* access modifiers changed from: private */
        public final void g0() {
            this.zzd = zzfo.z();
        }

        private final void h0() {
            zzfx<zzb> zzfx = this.zze;
            if (!zzfx.a()) {
                this.zze = zzfo.p(zzfx);
            }
        }

        private final void i0() {
            zzfx<zzj> zzfx = this.zzf;
            if (!zzfx.a()) {
                this.zzf = zzfo.p(zzfx);
            }
        }

        public final zzb D(int i) {
            return this.zze.get(i);
        }

        public final List<Long> E() {
            return this.zzc;
        }

        public final int J() {
            return this.zzc.size();
        }

        public final zzj K(int i) {
            return this.zzf.get(i);
        }

        public final List<Long> Q() {
            return this.zzd;
        }

        public final int T() {
            return this.zzd.size();
        }

        public final List<zzb> X() {
            return this.zze;
        }

        public final int Z() {
            return this.zze.size();
        }

        public final List<zzj> a0() {
            return this.zzf;
        }

        public final int b0() {
            return this.zzf.size();
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", zzb.class, "zzf", zzj.class});
                case 4:
                    return zzg;
                case 5:
                    zzhj<zzi> zzhj = zzh;
                    if (zzhj == null) {
                        synchronized (zzi.class) {
                            zzhj = zzh;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzg);
                                zzh = zzhj;
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
    public static final class zzj extends zzfo<zzj, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzj zzf;
        private static volatile zzhj<zzj> zzg;
        private int zzc;
        private int zzd;
        private zzfu zze = zzfo.z();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzj, zza> implements zzgy {
            private zza() {
                super(zzj.zzf);
            }

            public final zza C(int i) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzj) this.f9632c).J(i);
                return this;
            }

            public final zza D(Iterable<? extends Long> iterable) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzj) this.f9632c).G(iterable);
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzj zzj = new zzj();
            zzf = zzj;
            zzfo.u(zzj.class, zzj);
        }

        private zzj() {
        }

        /* access modifiers changed from: private */
        public final void G(Iterable<? extends Long> iterable) {
            zzfu zzfu = this.zze;
            if (!zzfu.a()) {
                this.zze = zzfo.o(zzfu);
            }
            zzdw.h(iterable, this.zze);
        }

        /* access modifiers changed from: private */
        public final void J(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        public static zza M() {
            return (zza) zzf.w();
        }

        public final long D(int i) {
            return this.zze.g(i);
        }

        public final boolean H() {
            return (this.zzc & 1) != 0;
        }

        public final int I() {
            return this.zzd;
        }

        public final List<Long> K() {
            return this.zze;
        }

        public final int L() {
            return this.zze.size();
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzj> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzj.class) {
                            zzhj = zzg;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzf);
                                zzg = zzhj;
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
    public static final class zzk extends zzfo<zzk, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzk zzj;
        private static volatile zzhj<zzk> zzk;
        private int zzc;
        private long zzd;
        private String zze = "";
        private String zzf = "";
        private long zzg;
        private float zzh;
        private double zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzk, zza> implements zzgy {
            private zza() {
                super(zzk.zzj);
            }

            public final zza C() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).c0();
                return this;
            }

            public final zza D(double d2) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).D(d2);
                return this;
            }

            public final zza E(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).E(j);
                return this;
            }

            public final zza F(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).J(str);
                return this;
            }

            public final zza H() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).d0();
                return this;
            }

            public final zza I(long j) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).M(j);
                return this;
            }

            public final zza L(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).R(str);
                return this;
            }

            public final zza M() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzk) this.f9632c).e0();
                return this;
            }

            /* synthetic */ zza(g0 g0Var) {
                this();
            }
        }

        static {
            zzk zzk2 = new zzk();
            zzj = zzk2;
            zzfo.u(zzk.class, zzk2);
        }

        private zzk() {
        }

        /* access modifiers changed from: private */
        public final void D(double d2) {
            this.zzc |= 32;
            this.zzi = d2;
        }

        /* access modifiers changed from: private */
        public final void E(long j) {
            this.zzc |= 1;
            this.zzd = j;
        }

        /* access modifiers changed from: private */
        public final void J(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* access modifiers changed from: private */
        public final void M(long j) {
            this.zzc |= 8;
            this.zzg = j;
        }

        /* access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzc |= 4;
            this.zzf = str;
        }

        public static zza a0() {
            return (zza) zzj.w();
        }

        /* access modifiers changed from: private */
        public final void c0() {
            this.zzc &= -5;
            this.zzf = zzj.zzf;
        }

        /* access modifiers changed from: private */
        public final void d0() {
            this.zzc &= -9;
            this.zzg = 0;
        }

        /* access modifiers changed from: private */
        public final void e0() {
            this.zzc &= -33;
            this.zzi = 0.0d;
        }

        public final boolean K() {
            return (this.zzc & 1) != 0;
        }

        public final long L() {
            return this.zzd;
        }

        public final String S() {
            return this.zze;
        }

        public final boolean U() {
            return (this.zzc & 4) != 0;
        }

        public final String V() {
            return this.zzf;
        }

        public final boolean W() {
            return (this.zzc & 8) != 0;
        }

        public final long X() {
            return this.zzg;
        }

        public final boolean Y() {
            return (this.zzc & 32) != 0;
        }

        public final double Z() {
            return this.zzi;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (g0.f9401a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((g0) null);
                case 3:
                    return zzfo.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzhj<zzk> zzhj = zzk;
                    if (zzhj == null) {
                        synchronized (zzk.class) {
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
}
