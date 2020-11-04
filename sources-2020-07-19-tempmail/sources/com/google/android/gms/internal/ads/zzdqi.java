package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqi extends zzegb<zzdqi, zzb> implements zzehn {
    private static volatile zzehy<zzdqi> zzel;
    private static final zzegk<Integer, zza> zzhil = new vy();
    /* access modifiers changed from: private */
    public static final zzdqi zzhip;
    private int zzdw;
    private zzegh zzhik = zzegb.C();
    private String zzhim = "";
    private String zzhin = "";
    private String zzhio = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public enum zza implements zzegg {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f8312b;

        private zza(int i) {
            this.f8312b = i;
        }

        public static zza f(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static zzegi g() {
            return xy.f5334a;
        }

        public final int i() {
            return this.f8312b;
        }

        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8312b + " name=" + name() + '>';
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zzb extends zzegb.zzb<zzdqi, zzb> implements zzehn {
        private zzb() {
            super(zzdqi.zzhip);
        }

        public final zzb w(zza zza) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdqi) this.f8567c).G(zza);
            return this;
        }

        public final zzb x(String str) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdqi) this.f8567c).N(str);
            return this;
        }

        /* synthetic */ zzb(vy vyVar) {
            this();
        }
    }

    static {
        zzdqi zzdqi = new zzdqi();
        zzhip = zzdqi;
        zzegb.x(zzdqi.class, zzdqi);
    }

    private zzdqi() {
    }

    /* access modifiers changed from: private */
    public final void G(zza zza2) {
        zza2.getClass();
        if (!this.zzhik.p()) {
            this.zzhik = zzegb.r(this.zzhik);
        }
        this.zzhik.L(zza2.i());
    }

    public static zzb L() {
        return (zzb) zzhip.A();
    }

    /* access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzhim = str;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (wy.f5265a[i - 1]) {
            case 1:
                return new zzdqi();
            case 2:
                return new zzb((vy) null);
            case 3:
                return zzegb.u(zzhip, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdw", "zzhik", zza.g(), "zzhim", "zzhin", "zzhio"});
            case 4:
                return zzhip;
            case 5:
                zzehy<zzdqi> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdqi.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhip);
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
