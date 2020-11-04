package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ob implements zzcxw {

    /* renamed from: a  reason: collision with root package name */
    private zzbrx f4541a;

    /* renamed from: b  reason: collision with root package name */
    private zzcym f4542b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f4543c;

    private ob(zzbiz zzbiz) {
        this.f4543c = zzbiz;
    }

    public final /* synthetic */ zzcxw a(zzcym zzcym) {
        zzelg.a(zzcym);
        this.f4542b = zzcym;
        return this;
    }

    @Deprecated
    public final /* synthetic */ zzcxw b(zzbxa zzbxa) {
        zzelg.a(zzbxa);
        return this;
    }

    public final /* synthetic */ zzcxw c(zzbrx zzbrx) {
        zzelg.a(zzbrx);
        this.f4541a = zzbrx;
        return this;
    }

    public final zzcxx d() {
        zzelg.c(this.f4541a, zzbrx.class);
        zzelg.c(this.f4542b, zzcym.class);
        return new nb(this.f4543c, this.f4542b, new zzbqf(), new zzcll(), this.f4541a, new zzdmb(), (zzdir) null, (zzdhv) null, (ra) null);
    }
}
