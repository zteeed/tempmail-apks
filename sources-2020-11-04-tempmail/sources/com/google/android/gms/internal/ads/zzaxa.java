package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaxa implements Parcelable.Creator<zzawx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        String str = null;
        String str2 = null;
        zzvh zzvh = null;
        zzve zzve = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 2) {
                str2 = SafeParcelReader.p(parcel, C);
            } else if (v == 3) {
                zzvh = (zzvh) SafeParcelReader.o(parcel, C, zzvh.CREATOR);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                zzve = (zzve) SafeParcelReader.o(parcel, C, zzve.CREATOR);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzawx(str, str2, zzvh, zzve);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzawx[i];
    }
}
