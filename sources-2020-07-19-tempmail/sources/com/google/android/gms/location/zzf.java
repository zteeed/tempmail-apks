package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzf implements Parcelable.Creator<ActivityTransitionRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        ArrayList<ActivityTransition> arrayList = null;
        String str = null;
        ArrayList<ClientIdentity> arrayList2 = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                arrayList = SafeParcelReader.t(parcel, C, ActivityTransition.CREATOR);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList2 = SafeParcelReader.t(parcel, C, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ActivityTransitionRequest(arrayList, str, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
