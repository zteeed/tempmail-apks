package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Parcelable.Creator<ActivityTransitionEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        long j = 0;
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
                j = SafeParcelReader.G(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ActivityTransitionEvent(i, i2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionEvent[i];
    }
}
