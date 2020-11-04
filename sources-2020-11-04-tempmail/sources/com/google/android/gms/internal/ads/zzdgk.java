package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgk implements zzela<String> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdgd f8210a;

    public zzdgk(zzdgd zzdgd) {
        this.f8210a = zzdgd;
    }

    public final /* synthetic */ Object get() {
        String g = this.f8210a.g();
        zzelg.b(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
