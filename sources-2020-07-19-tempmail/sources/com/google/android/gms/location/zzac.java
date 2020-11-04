package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzac implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        List<Location> list = LocationResult.f9858c;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 1) {
                SafeParcelReader.K(parcel, C);
            } else {
                list = SafeParcelReader.t(parcel, C, Location.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
