package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzs implements Parcelable.Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 1) {
                SafeParcelReader.K(parcel, C);
            } else {
                i = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzr(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
