package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazo {

    /* renamed from: a  reason: collision with root package name */
    public final String f6081a;

    /* renamed from: b  reason: collision with root package name */
    private final double f6082b;

    /* renamed from: c  reason: collision with root package name */
    private final double f6083c;

    /* renamed from: d  reason: collision with root package name */
    public final double f6084d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6085e;

    public zzazo(String str, double d2, double d3, double d4, int i) {
        this.f6081a = str;
        this.f6083c = d2;
        this.f6082b = d3;
        this.f6084d = d4;
        this.f6085e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazo)) {
            return false;
        }
        zzazo zzazo = (zzazo) obj;
        if (Objects.a(this.f6081a, zzazo.f6081a) && this.f6082b == zzazo.f6082b && this.f6083c == zzazo.f6083c && this.f6085e == zzazo.f6085e && Double.compare(this.f6084d, zzazo.f6084d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(this.f6081a, Double.valueOf(this.f6082b), Double.valueOf(this.f6083c), Double.valueOf(this.f6084d), Integer.valueOf(this.f6085e));
    }

    public final String toString() {
        Objects.ToStringHelper c2 = Objects.c(this);
        c2.a(AnalyticsConnectorReceiver.EVENT_NAME_KEY, this.f6081a);
        c2.a("minBound", Double.valueOf(this.f6083c));
        c2.a("maxBound", Double.valueOf(this.f6082b));
        c2.a("percent", Double.valueOf(this.f6084d));
        c2.a("count", Integer.valueOf(this.f6085e));
        return c2.toString();
    }
}
