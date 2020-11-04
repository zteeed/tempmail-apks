package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzof {

    /* renamed from: a  reason: collision with root package name */
    public final int f8931a;

    /* renamed from: b  reason: collision with root package name */
    private final zzod[] f8932b;

    /* renamed from: c  reason: collision with root package name */
    private int f8933c;

    public zzof(zzod... zzodArr) {
        this.f8932b = zzodArr;
        this.f8931a = zzodArr.length;
    }

    public final zzod a(int i) {
        return this.f8932b[i];
    }

    public final zzod[] b() {
        return (zzod[]) this.f8932b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzof.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8932b, ((zzof) obj).f8932b);
    }

    public final int hashCode() {
        if (this.f8933c == 0) {
            this.f8933c = Arrays.hashCode(this.f8932b) + 527;
        }
        return this.f8933c;
    }
}
