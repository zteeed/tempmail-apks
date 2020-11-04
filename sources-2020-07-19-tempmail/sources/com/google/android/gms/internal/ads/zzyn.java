package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyn implements Parcelable.Creator<zzyo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                i = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzyo(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyo[i];
    }
}
