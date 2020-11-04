package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

public final class zac implements Parcelable.Creator<StringToIntConverter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        ArrayList<StringToIntConverter.zaa> arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList = SafeParcelReader.t(parcel, C, StringToIntConverter.zaa.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
