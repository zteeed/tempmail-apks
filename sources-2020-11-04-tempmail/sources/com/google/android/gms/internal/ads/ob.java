package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ob implements zzcxw {

    /* renamed from: a  reason: collision with root package name */
    private zzbrx f4724a;

    /* renamed from: b  reason: collision with root package name */
    private zzcym f4725b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f4726c;

    private ob(zzbiz zzbiz) {
        this.f4726c = zzbiz;
    }

    public final /* synthetic */ zzcxw a(zzcym zzcym) {
        zzelg.a(zzcym);
        this.f4725b = zzcym;
        return this;
    }

    @Deprecated
    public final /* synthetic */ zzcxw b(zzbxa zzbxa) {
        zzelg.a(zzbxa);
        return this;
    }

    public final /* synthetic */ zzcxw c(zzbrx zzbrx) {
        zzelg.a(zzbrx);
        this.f4724a = zzbrx;
        return this;
    }

    public final zzcxx d() {
        zzelg.c(this.f4724a, zzbrx.class);
        zzelg.c(this.f4725b, zzcym.class);
        return new nb(this.f4726c, this.f4725b, new zzbqf(), new zzcll(), this.f4724a, new zzdmb(), (zzdir) null, (zzdhv) null, (ra) null);
    }
}
