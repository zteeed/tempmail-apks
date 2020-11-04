package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqy implements Parcelable.Creator<zzdqv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int L = SafeParcelReader.L(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < L) {
            int C = SafeParcelReader.C(parcel);
            int v = SafeParcelReader.v(C);
            if (v == 1) {
                i = SafeParcelReader.E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.K(parcel, C);
            } else {
                bArr = SafeParcelReader.g(parcel, C);
            }
        }
        SafeParcelReader.u(parcel, L);
        return new zzdqv(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdqv[i];
    }
}
