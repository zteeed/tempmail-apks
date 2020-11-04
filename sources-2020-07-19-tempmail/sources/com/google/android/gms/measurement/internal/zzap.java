package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzap implements Parcelable.Creator<zzan> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            if (SafeParcelReader.v(C) != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                bundle = SafeParcelReader.f(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzan(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzan[i];
    }
}
