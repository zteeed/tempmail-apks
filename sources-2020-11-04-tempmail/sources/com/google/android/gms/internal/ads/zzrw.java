package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrw {

    /* renamed from: a  reason: collision with root package name */
    final long f9257a;

    /* renamed from: b  reason: collision with root package name */
    final String f9258b;

    /* renamed from: c  reason: collision with root package name */
    final int f9259c;

    zzrw(long j, String str, int i) {
        this.f9257a = j;
        this.f9258b = str;
        this.f9259c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzrw)) {
            zzrw zzrw = (zzrw) obj;
            if (zzrw.f9257a == this.f9257a && zzrw.f9259c == this.f9259c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f9257a;
    }
}
