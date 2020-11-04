package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdmt implements Parcelable.Creator<zzdms> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            switch (SafeParcelReader.v(C)) {
                case 1:
                    i = SafeParcelReader.E(parcel, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.E(parcel, C);
                    break;
                case 3:
                    i3 = SafeParcelReader.E(parcel, C);
                    break;
                case 4:
                    i4 = SafeParcelReader.E(parcel, C);
                    break;
                case 5:
                    str = SafeParcelReader.p(parcel, C);
                    break;
                case 6:
                    i5 = SafeParcelReader.E(parcel, C);
                    break;
                case 7:
                    i6 = SafeParcelReader.E(parcel, C);
                    break;
                default:
                    SafeParcelReader.K(parcel, C);
                    break;
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzdms(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdms[i];
    }
}
