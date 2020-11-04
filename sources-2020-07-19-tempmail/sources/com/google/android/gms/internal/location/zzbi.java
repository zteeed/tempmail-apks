package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbi implements Parcelable.Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    str = SafeParcelReader.p(parcel2, C);
                    break;
                case 2:
                    j = SafeParcelReader.G(parcel2, C);
                    break;
                case 3:
                    s = SafeParcelReader.I(parcel2, C);
                    break;
                case 4:
                    d2 = SafeParcelReader.y(parcel2, C);
                    break;
                case 5:
                    d3 = SafeParcelReader.y(parcel2, C);
                    break;
                case 6:
                    f2 = SafeParcelReader.A(parcel2, C);
                    break;
                case 7:
                    i = SafeParcelReader.E(parcel2, C);
                    break;
                case 8:
                    i2 = SafeParcelReader.E(parcel2, C);
                    break;
                case 9:
                    i3 = SafeParcelReader.E(parcel2, C);
                    break;
                default:
                    SafeParcelReader.K(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzbh(str, i, s, d2, d3, f2, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
