package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Parcelable.Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                str2 = SafeParcelReader.p(parcel, C);
            } else if (v == 2) {
                str3 = SafeParcelReader.p(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
