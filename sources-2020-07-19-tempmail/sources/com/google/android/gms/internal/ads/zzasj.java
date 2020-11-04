package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasj implements Parcelable.Creator<zzash> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.o(parcel, C, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzash(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzash[i];
    }
}
