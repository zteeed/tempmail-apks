package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzof {

    /* renamed from: a  reason: collision with root package name */
    public final int f9114a;

    /* renamed from: b  reason: collision with root package name */
    private final zzod[] f9115b;

    /* renamed from: c  reason: collision with root package name */
    private int f9116c;

    public zzof(zzod... zzodArr) {
        this.f9115b = zzodArr;
        this.f9114a = zzodArr.length;
    }

    public final zzod a(int i) {
        return this.f9115b[i];
    }

    public final zzod[] b() {
        return (zzod[]) this.f9115b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzof.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9115b, ((zzof) obj).f9115b);
    }

    public final int hashCode() {
        if (this.f9116c == 0) {
            this.f9116c = Arrays.hashCode(this.f9115b) + 527;
        }
        return this.f9116c;
    }
}
