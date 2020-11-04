package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zap implements Parcelable.Creator<SafeParcelResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Parcel parcel2 = null;
        zak zak = null;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                parcel2 = SafeParcelReader.m(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                zak = (zak) SafeParcelReader.o(parcel, C, zak.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new SafeParcelResponse(i, parcel2, zak);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
