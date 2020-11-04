package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzcmi extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final int f7421b;

    public zzcmi(int i) {
        this.f7421b = i;
    }

    public static zzuy b(Throwable th) {
        if (th instanceof zzcmi) {
            return ((zzcmi) th).a();
        }
        if (!(th instanceof zzazh)) {
            return zzdlq.a(zzdls.f8363a, (String) null);
        }
        zzazh zzazh = (zzazh) th;
        return new zzuy(zzazh.a(), zzdsi.d(zzazh.getMessage()), "com.google.android.gms.ads");
    }

    public final zzuy a() {
        if (getMessage() == null) {
            return zzdlq.a(this.f7421b, (String) null);
        }
        return zzdlq.a(this.f7421b, getMessage());
    }

    public zzcmi(int i, String str) {
        super(str);
        this.f7421b = i;
    }

    public zzcmi(int i, String str, Throwable th) {
        super(str, th);
        this.f7421b = i;
    }
}
