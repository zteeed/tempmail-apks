package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwu<P> {

    /* renamed from: a  reason: collision with root package name */
    private final P f8616a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8617b;

    /* renamed from: c  reason: collision with root package name */
    private final zzebg f8618c;

    /* renamed from: d  reason: collision with root package name */
    private final zzebz f8619d;

    zzdwu(P p, byte[] bArr, zzebg zzebg, zzebz zzebz, int i) {
        this.f8616a = p;
        this.f8617b = Arrays.copyOf(bArr, bArr.length);
        this.f8618c = zzebg;
        this.f8619d = zzebz;
    }

    public final P a() {
        return this.f8616a;
    }

    public final zzebg b() {
        return this.f8618c;
    }

    public final zzebz c() {
        return this.f8619d;
    }

    public final byte[] d() {
        byte[] bArr = this.f8617b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
