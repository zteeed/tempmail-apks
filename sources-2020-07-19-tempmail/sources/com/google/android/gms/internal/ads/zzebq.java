package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebq extends zzegb<zzebq, zzb> implements zzehn {
    private static volatile zzehy<zzebq> zzel;
    /* access modifiers changed from: private */
    public static final zzebq zzhvu;
    private int zzhvm;
    private zzegm<zza> zzhvt = zzegb.E();

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb<zza, C0077zza> implements zzehn {
        private static volatile zzehy<zza> zzel;
        /* access modifiers changed from: private */
        public static final zza zzhvv;
        private String zzhuo = "";
        private int zzhvf;
        private int zzhvq;
        private int zzhvr;

        /* renamed from: com.google.android.gms.internal.ads.zzebq$zza$zza  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        public static final class C0077zza extends zzegb.zzb<zza, C0077zza> implements zzehn {
            private C0077zza() {
                super(zza.zzhvv);
            }

            public final C0077zza w(zzebg zzebg) {
                if (this.f8568d) {
                    r();
                    this.f8568d = false;
                }
                ((zza) this.f8567c).G(zzebg);
                return this;
            }

            public final C0077zza x(zzebz zzebz) {
                if (this.f8568d) {
                    r();
                    this.f8568d = false;
                }
                ((zza) this.f8567c).N(zzebz);
                return this;
            }

            public final C0077zza y(int i) {
                if (this.f8568d) {
                    r();
                    this.f8568d = false;
                }
                ((zza) this.f8567c).R(i);
                return this;
            }

            public final C0077zza z(String str) {
                if (this.f8568d) {
                    r();
                    this.f8568d = false;
                }
                ((zza) this.f8567c).S(str);
                return this;
            }

            /* synthetic */ C0077zza(k40 k40) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzhvv = zza;
            zzegb.x(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void G(zzebg zzebg) {
            this.zzhvq = zzebg.i();
        }

        /* access modifiers changed from: private */
        public final void N(zzebz zzebz) {
            this.zzhvf = zzebz.i();
        }

        public static C0077zza P() {
            return (C0077zza) zzhvv.A();
        }

        /* access modifiers changed from: private */
        public final void R(int i) {
            this.zzhvr = i;
        }

        /* access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zzhuo = str;
        }

        /* access modifiers changed from: protected */
        public final Object t(int i, Object obj, Object obj2) {
            switch (k40.f4178a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0077zza((k40) null);
                case 3:
                    return zzegb.u(zzhvv, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhuo", "zzhvq", "zzhvr", "zzhvf"});
                case 4:
                    return zzhvv;
                case 5:
                    zzehy<zza> zzehy = zzel;
                    if (zzehy == null) {
                        synchronized (zza.class) {
                            zzehy = zzel;
                            if (zzehy == null) {
                                zzehy = new zzegb.zza<>(zzhvv);
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
    public static final class zzb extends zzegb.zzb<zzebq, zzb> implements zzehn {
        private zzb() {
            super(zzebq.zzhvu);
        }

        public final zzb w(zza zza) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebq) this.f8567c).G(zza);
            return this;
        }

        public final zzb x(int i) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzebq) this.f8567c).N(i);
            return this;
        }

        /* synthetic */ zzb(k40 k40) {
            this();
        }
    }

    static {
        zzebq zzebq = new zzebq();
        zzhvu = zzebq;
        zzegb.x(zzebq.class, zzebq);
    }

    private zzebq() {
    }

    /* access modifiers changed from: private */
    public final void G(zza zza2) {
        zza2.getClass();
        if (!this.zzhvt.p()) {
            this.zzhvt = zzegb.s(this.zzhvt);
        }
        this.zzhvt.add(zza2);
    }

    public static zzb L() {
        return (zzb) zzhvu.A();
    }

    /* access modifiers changed from: private */
    public final void N(int i) {
        this.zzhvm = i;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (k40.f4178a[i - 1]) {
            case 1:
                return new zzebq();
            case 2:
                return new zzb((k40) null);
            case 3:
                return zzegb.u(zzhvu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhvm", "zzhvt", zza.class});
            case 4:
                return zzhvu;
            case 5:
                zzehy<zzebq> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebq.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhvu);
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
