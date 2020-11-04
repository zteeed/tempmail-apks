package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmd implements zzela<zzalw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzalr> f6556a;

    private zzbmd(zzelj<zzalr> zzelj) {
        this.f6556a = zzelj;
    }

    public static zzbmd a(zzelj<zzalr> zzelj) {
        return new zzbmd(zzelj);
    }

    public final /* synthetic */ Object get() {
        zzalw b2 = this.f6556a.get().b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
