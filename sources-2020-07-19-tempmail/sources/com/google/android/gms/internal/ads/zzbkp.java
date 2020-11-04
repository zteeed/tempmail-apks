package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbkp implements zzela<zzbbe> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f6309a;

    public zzbkp(zzelj<String> zzelj) {
        this.f6309a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzbbe zzbbe = new zzbbe(this.f6309a.get());
        zzelg.b(zzbbe, "Cannot return null from a non-@Nullable @Provides method");
        return zzbbe;
    }
}
