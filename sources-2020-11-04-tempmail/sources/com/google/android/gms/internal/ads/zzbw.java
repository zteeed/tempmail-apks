package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzbw {

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zza extends zzegb<zza, C0070zza> implements zzehn {
        /* access modifiers changed from: private */
        public static final zza zzek;
        private static volatile zzehy<zza> zzel;
        private int zzdw;
        private String zzdx = "";
        private long zzdy;
        private String zzdz = "";
        private String zzea = "";
        private String zzeb = "";
        private long zzec;
        private long zzed;
        private String zzee = "";
        private long zzef;
        private String zzeg = "";
        private String zzeh = "";
        private zzegm<zzb> zzei = zzegb.E();
        private int zzej;

        /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
        public static final class C0070zza extends zzegb.zzb<zza, C0070zza> implements zzehn {
            private C0070zza() {
                super(zza.zzek);
            }

            public final C0070zza C(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).U(str);
                return this;
            }

            public final C0070zza D(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).V(str);
                return this;
            }

            public final C0070zza E(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).W(str);
                return this;
            }

            public final C0070zza w(zzc zzc) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).L(zzc);
                return this;
            }

            public final C0070zza x(long j) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).P(j);
                return this;
            }

            public final C0070zza y(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).S(str);
                return this;
            }

            public final C0070zza z(String str) {
                if (this.f8751d) {
                    r();
                    this.f8751d = false;
                }
                ((zza) this.f8750c).T(str);
                return this;
            }

            /* synthetic */ C0070zza(je jeVar) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
        public static final class zzb extends zzegb<zzb, C0071zza> implements zzehn {
            private static volatile zzehy<zzb> zzel;
            /* access modifiers changed from: private */
            public static final zzb zzeo;
            private int zzdw;
            private String zzem = "";
            private String zzen = "";

            /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zzb$zza  reason: collision with other inner class name */
            /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
            public static final class C0071zza extends zzegb.zzb<zzb, C0071zza> implements zzehn {
                private C0071zza() {
                    super(zzb.zzeo);
                }

                /* synthetic */ C0071zza(je jeVar) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzeo = zzb;
                zzegb.x(zzb.class, zzb);
            }

            private zzb() {
            }

            /* access modifiers changed from: protected */
            public final Object t(int i, Object obj, Object obj2) {
                switch (je.f4319a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0071zza((je) null);
                    case 3:
                        return zzegb.u(zzeo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdw", "zzem", "zzen"});
                    case 4:
                        return zzeo;
                    case 5:
                        zzehy<zzb> zzehy = zzel;
                        if (zzehy == null) {
                            synchronized (zzb.class) {
                                zzehy = zzel;
                                if (zzehy == null) {
                                    zzehy = new zzegb.zza<>(zzeo);
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
        public enum zzc implements zzegg {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);
            

            /* renamed from: b  reason: collision with root package name */
            private final int f6843b;

            private zzc(int i) {
                this.f6843b = i;
            }

            public static zzc f(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ENABLED;
                }
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static zzegi g() {
                return eg.f3908a;
            }

            public final int i() {
                return this.f6843b;
            }

            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6843b + " name=" + name() + '>';
            }
        }

        static {
            zza zza = new zza();
            zzek = zza;
            zzegb.x(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void L(zzc zzc2) {
            this.zzej = zzc2.i();
            this.zzdw |= 2048;
        }

        /* access modifiers changed from: private */
        public final void P(long j) {
            this.zzdw |= 2;
            this.zzdy = j;
        }

        /* access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzdx = str;
        }

        /* access modifiers changed from: private */
        public final void T(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzdz = str;
        }

        /* access modifiers changed from: private */
        public final void U(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzea = str;
        }

        /* access modifiers changed from: private */
        public final void V(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzeb = str;
        }

        /* access modifiers changed from: private */
        public final void W(String str) {
            str.getClass();
            this.zzdw |= 1024;
            this.zzeh = str;
        }

        public static C0070zza X() {
            return (C0070zza) zzek.A();
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (je.f4319a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0070zza((je) null);
                case 3:
                    return zzegb.u(zzek, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", "zzeg", "zzeh", "zzei", zzb.class, "zzej", zzc.g()});
                case 4:
                    return zzek;
                case 5:
                    zzehy<zza> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zza.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzek);
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
