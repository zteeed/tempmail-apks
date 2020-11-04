package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzabx<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f5564a;

    /* renamed from: b  reason: collision with root package name */
    private final T f5565b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5566c;

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected zzabx(java.lang.String r1, T r2, java.lang.Integer r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f5564a = r1
            r0.f5565b = r2
            r0.f5566c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabx.<init>(java.lang.String, java.lang.Object, int):void");
    }

    public static zzabx<Double> b(String str, double d2) {
        return new zzabx<>(str, Double.valueOf(d2), r.f4763c);
    }

    public static zzabx<Long> c(String str, long j) {
        return new zzabx<>(str, Long.valueOf(j), r.f4762b);
    }

    public static zzabx<Boolean> d(String str, boolean z) {
        return new zzabx<>(str, Boolean.valueOf(z), r.f4761a);
    }

    public static zzabx<String> e(String str, String str2) {
        return new zzabx<>(str, str2, r.f4764d);
    }

    public T a() {
        zzacz b2 = zzacy.b();
        if (b2 != null) {
            int i = q.f4669a[this.f5566c - 1];
            if (i == 1) {
                return b2.b(this.f5564a, ((Boolean) this.f5565b).booleanValue());
            }
            if (i == 2) {
                return b2.a(this.f5564a, ((Long) this.f5565b).longValue());
            }
            if (i == 3) {
                return b2.d(this.f5564a, ((Double) this.f5565b).doubleValue());
            }
            if (i == 4) {
                return b2.c(this.f5564a, (String) this.f5565b);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
