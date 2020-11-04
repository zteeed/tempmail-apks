package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzarj implements Parcelable.Creator<zzark> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                iBinder = SafeParcelReader.D(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                iBinder2 = SafeParcelReader.D(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzark(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzark[i];
    }
}
