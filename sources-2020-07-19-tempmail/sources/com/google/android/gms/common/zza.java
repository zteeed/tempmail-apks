package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Parcelable.Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.E(parcel, C);
            } else if (v == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.o(parcel, C, PendingIntent.CREATOR);
            } else if (v != 4) {
                SafeParcelReader.K(parcel, C);
            } else {
                str = SafeParcelReader.p(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
