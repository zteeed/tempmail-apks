package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdrg implements Parcelable.Creator<zzdrd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 3) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 4) {
                str2 = SafeParcelReader.p(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.K(parcel, C);
            } else {
                i3 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzdrd(i, i2, i3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdrd[i];
    }
}
