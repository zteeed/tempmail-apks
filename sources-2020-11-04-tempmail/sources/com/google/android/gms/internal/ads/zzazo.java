package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazo {

    /* renamed from: a  reason: collision with root package name */
    public final String f6264a;

    /* renamed from: b  reason: collision with root package name */
    private final double f6265b;

    /* renamed from: c  reason: collision with root package name */
    private final double f6266c;

    /* renamed from: d  reason: collision with root package name */
    public final double f6267d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6268e;

    public zzazo(String str, double d2, double d3, double d4, int i) {
        this.f6264a = str;
        this.f6266c = d2;
        this.f6265b = d3;
        this.f6267d = d4;
        this.f6268e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazo)) {
            return false;
        }
        zzazo zzazo = (zzazo) obj;
        if (Objects.a(this.f6264a, zzazo.f6264a) && this.f6265b == zzazo.f6265b && this.f6266c == zzazo.f6266c && this.f6268e == zzazo.f6268e && Double.compare(this.f6267d, zzazo.f6267d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f6264a, Double.valueOf(this.f6265b), Double.valueOf(this.f6266c), Double.valueOf(this.f6267d), Integer.valueOf(this.f6268e));
    }

    public final String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a("name", this.f6264a);
        c2.a("minBound", Double.valueOf(this.f6266c));
        c2.a("maxBound", Double.valueOf(this.f6265b));
        c2.a("percent", Double.valueOf(this.f6267d));
        c2.a("count", Integer.valueOf(this.f6268e));
        return c2.toString();
    }
}
