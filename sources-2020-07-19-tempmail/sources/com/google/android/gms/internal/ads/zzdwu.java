package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwu<P> {

    /* renamed from: a  reason: collision with root package name */
    private final P f8433a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8434b;

    /* renamed from: c  reason: collision with root package name */
    private final zzebg f8435c;

    /* renamed from: d  reason: collision with root package name */
    private final zzebz f8436d;

    zzdwu(P p, byte[] bArr, zzebg zzebg, zzebz zzebz, int i) {
        this.f8433a = p;
        this.f8434b = Arrays.copyOf(bArr, bArr.length);
        this.f8435c = zzebg;
        this.f8436d = zzebz;
    }

    public final P a() {
        return this.f8433a;
    }

    public final zzebg b() {
        return this.f8435c;
    }

    public final zzebz c() {
        return this.f8436d;
    }

    public final byte[] d() {
        byte[] bArr = this.f8434b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
