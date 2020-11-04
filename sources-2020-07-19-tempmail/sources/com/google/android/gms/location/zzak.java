package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzak implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 3) {
                j = SafeParcelReader.G(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                j2 = SafeParcelReader.G(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzaj(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
