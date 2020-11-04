package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zao implements Parcelable.Creator<zal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        ArrayList<zam> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                arrayList = SafeParcelReader.t(parcel, C, zam.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zal(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
