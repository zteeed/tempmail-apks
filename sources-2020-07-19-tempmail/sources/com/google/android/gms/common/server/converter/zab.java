package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zab implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.o(parcel, C, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
