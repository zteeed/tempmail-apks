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
    private boolean f9887b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private long f9888c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private float f9889d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private long f9890e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private int f9891f;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @SafeParcelable.Constructor
    zzj(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) float f2, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) int i) {
        this.f9887b = z;
        this.f9888c = j;
        this.f9889d = f2;
        this.f9890e = j2;
        this.f9891f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f9887b == zzj.f9887b && this.f9888c == zzj.f9888c && Float.compare(this.f9889d, zzj.f9889d) == 0 && this.f9890e == zzj.f9890e && this.f9891f == zzj.f9891f;
    }

    public final int hashCode() {
        return Objects.b(Boolean.valueOf(this.f9887b), Long.valueOf(this.f9888c), Float.valueOf(this.f9889d), Long.valueOf(this.f9890e), Integer.valueOf(this.f9891f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f9887b);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f9888c);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f9889d);
        long j = this.f9890e;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f9891f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f9891f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f9887b);
        SafeParcelWriter.o(parcel, 2, this.f9888c);
        SafeParcelWriter.i(parcel, 3, this.f9889d);
        SafeParcelWriter.o(parcel, 4, this.f9890e);
        SafeParcelWriter.l(parcel, 5, this.f9891f);
        SafeParcelWriter.b(parcel, a2);
    }
}
