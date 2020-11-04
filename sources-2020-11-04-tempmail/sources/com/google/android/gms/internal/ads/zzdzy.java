package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdzy extends zzegb<zzdzy, zza> implements zzehn {
    private static volatile zzehy<zzdzy> zzel;
    /* access modifiers changed from: private */
    public static final zzdzy zzhsu;
    private int zzhrx;
    private zzeer zzhry = zzeer.f8716c;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static final class zza extends zzegb.zzb<zzdzy, zza> implements zzehn {
        private zza() {
            super(zzdzy.zzhsu);
        }

        public final zza w(int i) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzdzy) this.f8750c).H(0);
            return this;
        }

        public final zza x(zzeer zzeer) {
            if (this.f8751d) {
                r();
                this.f8751d = false;
            }
            ((zzdzy) this.f8750c).R(zzeer);
            return this;
        }

        /* synthetic */ zza(q30 q30) {
            this();
        }
    }

    static {
        zzdzy zzdzy = new zzdzy();
        zzhsu = zzdzy;
        zzegb.x(zzdzy.class, zzdzy);
    }

    private zzdzy() {
    }

    /* access modifiers changed from: private */
    public final void H(int i) {
        this.zzhrx = i;
    }

    public static zza N() {
        return (zza) zzhsu.A();
    }

    public static zzdzy Q(zzeer zzeer, zzefo zzefo) throws zzegl {
        return (zzdzy) zzegb.m(zzhsu, zzeer, zzefo);
    }

    /* access modifiers changed from: private */
    public final void R(zzeer zzeer) {
        zzeer.getClass();
        this.zzhry = zzeer;
    }

    public final int G() {
        return this.zzhrx;
    }

    public final zzeer M() {
        return this.zzhry;
    }

    /* access modifiers changed from: protected */
    public final Object t(int i, Object obj, Object obj2) {
        switch (q30.f4865a[i - 1]) {
            case 1:
                return new zzdzy();
            case 2:
                return new zza((q30) null);
            case 3:
                return zzegb.u(zzhsu, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhrx", "zzhry"});
            case 4:
                return zzhsu;
            case 5:
                zzehy<zzdzy> zzehy = zzel;
                if (zzehy == null) {
                    synchronized (zzdzy.class) {
                        zzehy = zzel;
                        if (zzehy == null) {
                            zzehy = new zzegb.zza<>(zzhsu);
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
