package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbkb {

    /* renamed from: a  reason: collision with root package name */
    private zza f6473a;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    public static abstract class zza {
        public abstract zzbfa a();

        public abstract zzbcl b();

        public abstract zztr c();

        public abstract zzavt d();

        public abstract zzaqp e();

        public abstract zzame f();

        public abstract zzabv g();
    }

    public zzbkb(zza zza2) {
        this.f6473a = zza2;
    }

    public final zzavt a() {
        return this.f6473a.d();
    }

    public final zzaqp b() {
        return this.f6473a.e();
    }

    public final zzame c() {
        return this.f6473a.f();
    }

    public final zzabv d() {
        return this.f6473a.g();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavo] */
    public final com.google.android.gms.ads.internal.zza e() {
        zza zza2 = this.f6473a;
        return new com.google.android.gms.ads.internal.zza(zza2.a(), zza2.b(), new zzavo(zza2.d()), zza2.c(), zza2.e(), zza2.g());
    }
}
