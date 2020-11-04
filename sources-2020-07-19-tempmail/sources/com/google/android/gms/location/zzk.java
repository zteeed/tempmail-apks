package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzk implements Parcelable.Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int L = SafeParcelReader.L(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                z = SafeParcelReader.w(parcel2, C);
            } else if (v == 2) {
                j = SafeParcelReader.G(parcel2, C);
            } else if (v == 3) {
                f2 = SafeParcelReader.A(parcel2, C);
            } else if (v == 4) {
                j2 = SafeParcelReader.G(parcel2, C);
            } else if (v != 5) {
                SafeParcelReader.K(parcel2, C);
            } else {
                i = SafeParcelReader.E(parcel2, C);
            }
        }
        SafeParcelReader.u(parcel2, L);
        return new zzj(z, j, f2, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
