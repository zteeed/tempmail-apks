package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zai implements Parcelable.Creator<zah> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) SafeParcelReader.o(parcel, C, ResolveAccountRequest.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zah(i, resolveAccountRequest);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zah[i];
    }
}
