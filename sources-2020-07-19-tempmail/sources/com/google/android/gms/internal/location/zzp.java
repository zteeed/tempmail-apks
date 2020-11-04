package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzp implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                zzm = (zzm) SafeParcelReader.o(parcel, C, zzm.CREATOR);
            } else if (v == 3) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                iBinder2 = SafeParcelReader.D(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
