package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahr implements Parcelable.Creator<zzaho> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 2) {
                strArr = SafeParcelReader.q(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                strArr2 = SafeParcelReader.q(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzaho(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaho[i];
    }
}
