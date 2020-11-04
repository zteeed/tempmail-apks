package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzg implements Parcelable.Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 1) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList = SafeParcelReader.t(parcel, C, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
