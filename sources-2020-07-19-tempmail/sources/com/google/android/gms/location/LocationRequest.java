package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tempmail.s.m;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzab();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private int f9853b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private long f9854c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private long f9855d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private boolean f9856e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private long f9857f;
    @SafeParcelable.Field
    private int g;
    @SafeParcelable.Field
    private float h;
    @SafeParcelable.Field
    private long i;

    public LocationRequest() {
        this.f9853b = 102;
        this.f9854c = 3600000;
        this.f9855d = 600000;
        this.f9856e = false;
        this.f9857f = Long.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = 0.0f;
        this.i = 0;
    }

    @SafeParcelable.Constructor
    LocationRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) long j3, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) float f2, @SafeParcelable.Param(id = 8) long j4) {
        this.f9853b = i2;
        this.f9854c = j;
        this.f9855d = j2;
        this.f9856e = z;
        this.f9857f = j3;
        this.g = i3;
        this.h = f2;
        this.i = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f9853b == locationRequest.f9853b && this.f9854c == locationRequest.f9854c && this.f9855d == locationRequest.f9855d && this.f9856e == locationRequest.f9856e && this.f9857f == locationRequest.f9857f && this.g == locationRequest.g && this.h == locationRequest.h && u() == locationRequest.u();
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f9853b), Long.valueOf(this.f9854c), Float.valueOf(this.h), Long.valueOf(this.i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i2 = this.f9853b;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f9853b != 105) {
            sb.append(" requested=");
            sb.append(this.f9854c);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f9855d);
        sb.append("ms");
        if (this.i > this.f9854c) {
            sb.append(" maxWait=");
            sb.append(this.i);
            sb.append("ms");
        }
        if (this.h > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.h);
            sb.append(m.f12494f);
        }
        long j = this.f9857f;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.g != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.g);
        }
        sb.append(']');
        return sb.toString();
    }

    public final long u() {
        long j = this.i;
        long j2 = this.f9854c;
        return j < j2 ? j2 : j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9853b);
        SafeParcelWriter.o(parcel, 2, this.f9854c);
        SafeParcelWriter.o(parcel, 3, this.f9855d);
        SafeParcelWriter.c(parcel, 4, this.f9856e);
        SafeParcelWriter.o(parcel, 5, this.f9857f);
        SafeParcelWriter.l(parcel, 6, this.g);
        SafeParcelWriter.i(parcel, 7, this.h);
        SafeParcelWriter.o(parcel, 8, this.i);
        SafeParcelWriter.b(parcel, a2);
    }
}
