package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zab implements Parcelable.Creator<zaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                intent = (Intent) SafeParcelReader.o(parcel, C, Intent.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zaa(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
