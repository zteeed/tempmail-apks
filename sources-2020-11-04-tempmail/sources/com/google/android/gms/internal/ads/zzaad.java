package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaad implements Parcelable.Creator<zzaaa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 2) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v == 3) {
                z2 = SafeParcelReader.w(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                z3 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzaaa(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaaa[i];
    }
}
