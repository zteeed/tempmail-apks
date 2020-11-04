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
    private int f10034b;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private int f10035c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private long f10036d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private int f10037e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private zzaj[] f10038f;

    @SafeParcelable.Constructor
    LocationAvailability(@SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 5) zzaj[] zzajArr) {
        this.f10037e = i;
        this.f10034b = i2;
        this.f10035c = i3;
        this.f10036d = j;
        this.f10038f = zzajArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f10034b == locationAvailability.f10034b && this.f10035c == locationAvailability.f10035c && this.f10036d == locationAvailability.f10036d && this.f10037e == locationAvailability.f10037e && Arrays.equals(this.f10038f, locationAvailability.f10038f);
        }
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f10037e), Integer.valueOf(this.f10034b), Integer.valueOf(this.f10035c), Long.valueOf(this.f10036d), this.f10038f);
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
        return this.f10037e < 1000;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f10034b);
        SafeParcelWriter.l(parcel, 2, this.f10035c);
        SafeParcelWriter.o(parcel, 3, this.f10036d);
        SafeParcelWriter.l(parcel, 4, this.f10037e);
        SafeParcelWriter.w(parcel, 5, this.f10038f, i, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
