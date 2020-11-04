package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private final zzev f9475a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f9476b;

    private q1(int i) {
        byte[] bArr = new byte[i];
        this.f9476b = bArr;
        this.f9475a = zzev.f(bArr);
    }

    public final zzeg a() {
        this.f9475a.N();
        return new s1(this.f9476b);
    }

    public final zzev b() {
        return this.f9475a;
    }

    /* synthetic */ q1(int i, k1 k1Var) {
        this(i);
    }
}
