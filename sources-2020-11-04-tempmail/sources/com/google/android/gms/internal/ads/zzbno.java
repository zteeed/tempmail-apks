package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbno implements zzela<zzbnc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6606a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<gc> f6607b;

    public zzbno(zzbnj zzbnj, zzelj<gc> zzelj) {
        this.f6606a = zzbnj;
        this.f6607b = zzelj;
    }

    public static zzbnc a(zzbnj zzbnj, Object obj) {
        gc gcVar = (gc) obj;
        zzelg.b(gcVar, "Cannot return null from a non-@Nullable @Provides method");
        return gcVar;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6606a, this.f6607b.get());
    }
}
