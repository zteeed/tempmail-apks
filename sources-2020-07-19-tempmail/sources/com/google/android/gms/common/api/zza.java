package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}