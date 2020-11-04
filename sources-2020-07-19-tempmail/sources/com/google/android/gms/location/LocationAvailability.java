package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzaa();
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private int f9848b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private int f9849c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private long f9850d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private int f9851e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private zzaj[] f9852f;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 5) zzaj[] zzajArr) {
        this.f9851e = i;
        this.f9848b = i2;
        this.f9849c = i3;
        this.f9850d = j;
        this.f9852f = zzajArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f9848b == locationAvailability.f9848b && this.f9849c == locationAvailability.f9849c && this.f9850d == locationAvailability.f9850d && this.f9851e == locationAvailability.f9851e && Arrays.equals(this.f9852f, locationAvailability.f9852f);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f9851e), Integer.valueOf(this.f9848b), Integer.valueOf(this.f9849c), Long.valueOf(this.f9850d), this.f9852f);
    }

    public final String toString() {
        boolean u = u();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(u);
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return this.f9851e < 1000;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f9848b);
        SafeParcelWriter.l(parcel, 2, this.f9849c);
        SafeParcelWriter.o(parcel, 3, this.f9850d);
        SafeParcelWriter.l(parcel, 4, this.f9851e);
        SafeParcelWriter.w(parcel, 5, this.f9852f, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
