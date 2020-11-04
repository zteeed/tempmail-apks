package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzab implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i = SafeParcelReader.E(parcel2, C);
                    break;
                case 2:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 3:
                    j2 = SafeParcelReader.G(parcel2, C);
                    break;
                case 4:
                    z = SafeParcelReader.w(parcel2, C);
                    break;
                case 5:
                    j3 = SafeParcelReader.G(parcel2, C);
                    break;
                case 6:
                    i2 = SafeParcelReader.E(parcel2, C);
                    break;
                case 7:
                    f2 = SafeParcelReader.A(parcel2, C);
                    break;
                case 8:
                    j4 = SafeParcelReader.G(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new LocationRequest(i, j, j2, z, j3, i2, f2, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
