package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqw implements Parcelable.Creator<zzdqt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        String str2 = null;
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
                str2 = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzdqt(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdqt[i];
    }
}
