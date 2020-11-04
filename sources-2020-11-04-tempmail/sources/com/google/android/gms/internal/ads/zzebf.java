package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzebf extends zzegb<zzebf, zzb> implements zzehn {
    private static volatile zzehy<zzebf> zzel;
    /* access modifiers changed from: private */
    public static final zzebf zzhur;
    private String zzhuo = "";
    private zzeer zzhup = zzeer.f8716c;
    private int zzhuq;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public enum zza implements zzegg {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f8654b;

        private zza(int i2) {
            this.f8654b = i2;
        }

        public static zza f(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int i() {
            if (this != UNRECOGNIZED) {
                return this.f8654b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(i());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zzb extends zzegb.zzb<zzebf, zzb> implements zzehn {
        private zzb() {
            super(zzebf.zzhur);
        }

        public final zzb w(zzeer zzeer) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzebf) this.f8750c).M(zzeer);
            return this;
        }

        public final zzb x(zza zza) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzebf) this.f8750c).G(zza);
            return this;
        }

        public final zzb y(String str) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzebf) this.f8750c).U(str);
            return this;
        }

        /* synthetic */ zzb(g40 g40) {
            this();
        }
    }

    static {
        zzebf zzebf = new zzebf();
        zzhur = zzebf;
        zzegb.x(zzebf.class, zzebf);
    }

    private zzebf() {
    }

    /* access modifiers changed from: private */
    public final void G(zza zza2) {
        this.zzhuq = zza2.i();
    }

    /* access modifiers changed from: private */
    public final void M(zzeer zzeer) {
        zzeer.getClass();
        this.zzhup = zzeer;
    }

    public static zzb R() {
        return (zzb) zzhur.A();
    }

    public static zzebf S() {
        return zzhur;
    }

    /* access modifiers changed from: private */
    public final void U(String str) {
        str.getClass();
        this.zzhuo = str;
    }

    public final String N() {
        return this.zzhuo;
    }

    public final zzeer P() {
        return this.zzhup;
    }

    public final zza Q() {
        zza f2 = zza.f(this.zzhuq);
        return f2 == null ? zza.UNRECOGNIZED : f2;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (g40.f4031a[i - 1]) {
            case 1:
                return new zzebf();
            case 2:
                return new zzb((g40) null);
            case 3:
                return zzegb.u(zzhur, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhuo", "zzhup", "zzhuq"});
            case 4:
                return zzhur;
            case 5:
                zzehy<zzebf> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzebf.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhur);
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
