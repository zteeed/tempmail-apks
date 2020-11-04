package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, C, LocationRequest.CREATOR);
            } else if (v == 2) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v == 3) {
                z2 = SafeParcelReader.w(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.K(parcel, C);
            } else {
                zzae = (zzae) SafeParcelReader.o(parcel, C, zzae.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
