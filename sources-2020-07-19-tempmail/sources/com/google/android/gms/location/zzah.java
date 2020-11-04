package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzah implements Parcelable.Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                status = (Status) SafeParcelReader.o(parcel, C, Status.CREATOR);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.o(parcel, C, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
