package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzbbg implements Parcelable.Creator<zzbbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 2) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 3) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 4) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 5) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v != 6) {
                SafeParcelReader.K(parcel, C);
            } else {
                z2 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzbbd(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbbd[i];
    }
}
