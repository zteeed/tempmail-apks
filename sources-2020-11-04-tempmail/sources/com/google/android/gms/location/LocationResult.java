package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzac();

    /* renamed from: c  reason: collision with root package name */
    static final List<Location> f10044c = Collections.emptyList();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final List<Location> f10045b;

    @SafeParcelable.Constructor
    LocationResult(@SafeParcelable.Param(id = 1) List<Location> list) {
        this.f10045b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f10045b.size() != this.f10045b.size()) {
            return false;
        }
        Iterator<Location> it = this.f10045b.iterator();
        for (Location time : locationResult.f10045b) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f10045b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10045b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final List<Location> u() {
        return this.f10045b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.x(parcel, 1, u(), false);
        SafeParcelWriter.b(parcel, a2);
    }
}
