package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqi;
import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqm extends zzegb<zzdqm, zza> implements zzehn {
    private static volatile zzehy<zzdqm> zzel;
    /* access modifiers changed from: private */
    public static final zzdqm zzhiw;
    private int zzdw;
    private String zzdx = "";
    private int zzhit;
    private String zzhiu = "";
    private zzdqi zzhiv;

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdqm, zza> implements zzehn {
        private zza() {
            super(zzdqm.zzhiw);
        }

        public final zza w(zzdqi.zzb zzb) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdqm) this.f8567c).G((zzdqi) ((zzegb) zzb.O()));
            return this;
        }

        public final zza x(zzb zzb) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdqm) this.f8567c).H(zzb);
            return this;
        }

        public final zza y(String str) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            ((zzdqm) this.f8567c).Q(str);
            return this;
        }

        /* synthetic */ zza(yy yyVar) {
            this();
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
    public enum zzb implements zzegg {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f8316b;

        private zzb(int i) {
            this.f8316b = i;
        }

        public static zzb f(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static zzegi g() {
            return zy.f5507a;
        }

        public final int i() {
            return this.f8316b;
        }

        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8316b + " name=" + name() + '>';
        }
    }

    static {
        zzdqm zzdqm = new zzdqm();
        zzhiw = zzdqm;
        zzegb.x(zzdqm.class, zzdqm);
    }

    private zzdqm() {
    }

    /* access modifiers changed from: private */
    public final void G(zzdqi zzdqi) {
        zzdqi.getClass();
        this.zzhiv = zzdqi;
        this.zzdw |= 8;
    }

    /* access modifiers changed from: private */
    public final void H(zzb zzb2) {
        this.zzhit = zzb2.i();
        this.zzdw |= 1;
    }

    public static zza N() {
        return (zza) zzhiw.A();
    }

    /* access modifiers changed from: private */
    public final void Q(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzdx = str;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (yy.f5423a[i - 1]) {
            case 1:
                return new zzdqm();
            case 2:
                return new zza((yy) null);
            case 3:
                return zzegb.u(zzhiw, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzhit", zzb.g(), "zzdx", "zzhiu", "zzhiv"});
            case 4:
                return zzhiw;
            case 5:
                zzehy<zzdqm> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdqm.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhiw);
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
