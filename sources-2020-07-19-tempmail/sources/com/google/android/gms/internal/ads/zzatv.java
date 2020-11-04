package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzatv implements Parcelable.Creator<zzatw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        zzve zzve = null;
        String str = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 2) {
                zzve = (zzve) SafeParcelReader.o(parcel, C, zzve.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzatw(zzve, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzatw[i];
    }
}
