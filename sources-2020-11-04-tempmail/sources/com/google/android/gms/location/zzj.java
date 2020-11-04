package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private boolean f10073b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private long f10074c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private float f10075d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private long f10076e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private int f10077f;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) float f2, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) int i) {
        this.f10073b = z;
        this.f10074c = j;
        this.f10075d = f2;
        this.f10076e = j2;
        this.f10077f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f10073b == zzj.f10073b && this.f10074c == zzj.f10074c && Float.compare(this.f10075d, zzj.f10075d) == 0 && this.f10076e == zzj.f10076e && this.f10077f == zzj.f10077f;
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f10073b), Long.valueOf(this.f10074c), Float.valueOf(this.f10075d), Long.valueOf(this.f10076e), Integer.valueOf(this.f10077f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f10073b);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f10074c);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f10075d);
        long j = this.f10076e;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f10077f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f10077f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f10073b);
        SafeParcelWriter.o(parcel, 2, this.f10074c);
        SafeParcelWriter.i(parcel, 3, this.f10075d);
        SafeParcelWriter.o(parcel, 4, this.f10076e);
        SafeParcelWriter.l(parcel, 5, this.f10077f);
        SafeParcelWriter.b(parcel, a2);
    }
}
