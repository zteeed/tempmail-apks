package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzae implements Parcelable.Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Status status = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 1) {
                SafeParcelReader.K(parcel, C);
            } else {
                status = (Status) SafeParcelReader.o(parcel, C, Status.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
