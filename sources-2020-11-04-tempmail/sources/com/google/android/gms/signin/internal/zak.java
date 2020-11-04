package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zak implements Parcelable.Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.o(parcel, C, ConnectionResult.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) SafeParcelReader.o(parcel, C, ResolveAccountResponse.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zaj(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
