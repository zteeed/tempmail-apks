package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h {

    /* renamed from: a  reason: collision with root package name */
    final String f10212a;

    /* renamed from: b  reason: collision with root package name */
    final String f10213b;

    /* renamed from: c  reason: collision with root package name */
    final long f10214c;

    /* renamed from: d  reason: collision with root package name */
    final long f10215d;

    /* renamed from: e  reason: collision with root package name */
    final long f10216e;

    /* renamed from: f  reason: collision with root package name */
    final long f10217f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    h(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        Preconditions.g(str);
        Preconditions.g(str2);
        boolean z = true;
        Preconditions.a(j7 >= 0);
        Preconditions.a(j8 >= 0);
        Preconditions.a(j9 >= 0);
        Preconditions.a(j10 < 0 ? false : z);
        this.f10212a = str;
        this.f10213b = str2;
        this.f10214c = j7;
        this.f10215d = j8;
        this.f10216e = j9;
        this.f10217f = j5;
        this.g = j10;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* access modifiers changed from: package-private */
    public final h a(long j2) {
        return new h(this.f10212a, this.f10213b, this.f10214c, this.f10215d, this.f10216e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final h b(long j2, long j3) {
        return new h(this.f10212a, this.f10213b, this.f10214c, this.f10215d, this.f10216e, this.f10217f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final h c(Long l, Long l2, Boolean bool) {
        return new h(this.f10212a, this.f10213b, this.f10214c, this.f10215d, this.f10216e, this.f10217f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    h(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0, 0, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }
}
