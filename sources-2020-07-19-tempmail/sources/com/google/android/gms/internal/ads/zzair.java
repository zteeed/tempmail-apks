package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzair implements Parcelable.Creator<zzaio> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 3) {
                i3 = SafeParcelReader.E(parcel, C);
            } else if (v != 1000) {
                SafeParcelReader.K(parcel, C);
            } else {
                i = SafeParcelReader.E(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzaio(i, i2, str, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaio[i];
    }
}
