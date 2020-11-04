package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmm implements zznn {

    /* renamed from: b  reason: collision with root package name */
    private final zznn[] f9060b;

    public zzmm(zznn[] zznnArr) {
        this.f9060b = zznnArr;
    }

    public final long a() {
        long j = Long.MAX_VALUE;
        for (zznn a2 : this.f9060b) {
            long a3 = a2.a();
            if (a3 != Long.MIN_VALUE) {
                j = Math.min(j, a3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean b(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a2 = a();
            if (a2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zznn zznn : this.f9060b) {
                if (zznn.a() == a2) {
                    z |= zznn.b(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
