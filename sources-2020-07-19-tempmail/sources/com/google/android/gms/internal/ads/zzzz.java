package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzz implements Parcelable.Creator<zzzw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 15) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzzw(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzzw[i];
    }
}
