package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zao implements Parcelable.Creator<SignInButtonConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 3) {
                i3 = SafeParcelReader.E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.s(parcel, C, Scope.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new SignInButtonConfig(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }
}
