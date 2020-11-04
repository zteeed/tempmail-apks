package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzl implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                str = SafeParcelReader.p(parcel, C);
            } else if (v == 2) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v == 3) {
                z = SafeParcelReader.w(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                z2 = SafeParcelReader.w(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzk(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
