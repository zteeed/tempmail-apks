package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zae implements Parcelable.Creator<WebImage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                uri = (Uri) SafeParcelReader.o(parcel, C, Uri.CREATOR);
            } else if (v == 3) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                i3 = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new WebImage(i, uri, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
