package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzfo;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
public final class zzby {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
    public static final class zza extends zzfo<zza, C0091zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zza zzh;
        private static volatile zzhj<zza> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.zzby$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class C0091zza extends zzfo.zza<zza, C0091zza> implements zzgy {
            private C0091zza() {
                super(zza.zzh);
            }

            public final C0091zza C(String str) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zza) this.f9632c).F(str);
                return this;
            }

            public final String D() {
                return ((zza) this.f9632c).D();
            }

            public final boolean E() {
                return ((zza) this.f9632c).G();
            }

            public final boolean F() {
                return ((zza) this.f9632c).H();
            }

            public final boolean H() {
                return ((zza) this.f9632c).I();
            }

            public final int I() {
                return ((zza) this.f9632c).J();
            }

            /* synthetic */ C0091zza(f0 f0Var) {
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
        public final void F(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public final String D() {
            return this.zzd;
        }

        public final boolean G() {
            return this.zze;
        }

        public final boolean H() {
            return this.zzf;
        }

        public final boolean I() {
            return (this.zzc & 8) != 0;
        }

        public final int J() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (f0.f9394a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0091zza((f0) null);
                case 3:
                    return zzfo.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
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
        public static final zzb zzl;
        private static volatile zzhj<zzb> zzm;
        private int zzc;
        private long zzd;
        private String zze = "";
        private int zzf;
        private zzfx<zzc> zzg = zzfo.C();
        private zzfx<zza> zzh = zzfo.C();
        private zzfx<zzbt.zza> zzi = zzfo.C();
        private String zzj = "";
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzb, zza> implements zzgy {
            private zza() {
                super(zzb.zzl);
            }

            public final int C() {
                return ((zzb) this.f9632c).M();
            }

            public final zza D(int i) {
                return ((zzb) this.f9632c).D(i);
            }

            public final zza E(int i, zza.C0091zza zza) {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).E(i, (zza) ((zzfo) zza.q()));
                return this;
            }

            public final List<zzbt.zza> F() {
                return Collections.unmodifiableList(((zzb) this.f9632c).O());
            }

            public final zza H() {
                if (this.f9633d) {
                    x();
                    this.f9633d = false;
                }
                ((zzb) this.f9632c).T();
                return this;
            }

            /* synthetic */ zza(f0 f0Var) {
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
        public final void E(int i, zza zza2) {
            zza2.getClass();
            zzfx<zza> zzfx = this.zzh;
            if (!zzfx.a()) {
                this.zzh = zzfo.p(zzfx);
            }
            this.zzh.set(i, zza2);
        }

        public static zza Q() {
            return (zza) zzl.w();
        }

        public static zzb R() {
            return zzl;
        }

        /* access modifiers changed from: private */
        public final void T() {
            this.zzi = zzfo.C();
        }

        public final zza D(int i) {
            return this.zzh.get(i);
        }

        public final boolean H() {
            return (this.zzc & 1) != 0;
        }

        public final long I() {
            return this.zzd;
        }

        public final boolean J() {
            return (this.zzc & 2) != 0;
        }

        public final String K() {
            return this.zze;
        }

        public final List<zzc> L() {
            return this.zzg;
        }

        public final int M() {
            return this.zzh.size();
        }

        public final List<zzbt.zza> O() {
            return this.zzi;
        }

        public final boolean P() {
            return this.zzk;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (f0.f9394a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((f0) null);
                case 3:
                    return zzfo.s(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzc.class, "zzh", zza.class, "zzi", zzbt.zza.class, "zzj", "zzk"});
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
        public static final zzc zzf;
        private static volatile zzhj<zzc> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
        public static final class zza extends zzfo.zza<zzc, zza> implements zzgy {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(f0 f0Var) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzf = zzc2;
            zzfo.u(zzc.class, zzc2);
        }

        private zzc() {
        }

        public final String D() {
            return this.zzd;
        }

        public final String E() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object r(int i, Object obj, Object obj2) {
            switch (f0.f9394a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((f0) null);
                case 3:
                    return zzfo.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzc> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzc.class) {
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
}
