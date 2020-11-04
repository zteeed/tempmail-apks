package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

public final class zaj implements Parcelable.Creator<zam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.o(parcel, C, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
