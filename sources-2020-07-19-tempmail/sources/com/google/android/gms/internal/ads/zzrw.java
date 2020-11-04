package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrw {

    /* renamed from: a  reason: collision with root package name */
    final long f9074a;

    /* renamed from: b  reason: collision with root package name */
    final String f9075b;

    /* renamed from: c  reason: collision with root package name */
    final int f9076c;

    zzrw(long j, String str, int i) {
        this.f9074a = j;
        this.f9075b = str;
        this.f9076c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzrw)) {
            zzrw zzrw = (zzrw) obj;
            if (zzrw.f9074a == this.f9074a && zzrw.f9076c == this.f9076c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f9074a;
    }
}
